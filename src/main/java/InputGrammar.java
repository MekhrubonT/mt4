import antlr.generated.GrammarLexer;
import antlr.generated.GrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public class InputGrammar implements Serializable {
    private static final long serialVersionUID = 6473407033512582688L;

    public static final String DOLLAR = "$";
    public static final String EPS = "";

    private final Map<String, SerializableParseTree> lexerRules, parserRules;
    private final Map<String, Set<String>> first, follow;

    public static InputGrammar getParser(String grammarPath) throws IOException {
        try {
            return (InputGrammar) GenerateParser.restoreObject(grammarPath);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Parser data is broken");
        }
    }


    public Map<String, SerializableParseTree> getLexerRules() {
        return Collections.unmodifiableMap(lexerRules);
    }

    public Map<String, SerializableParseTree> getParserRules() {
        return Collections.unmodifiableMap(parserRules);
    }

    public Map<String, Set<String>> getFollow() {
        return Collections.unmodifiableMap(follow);
    }

    public Map<String, Set<String>> getFirst() {
        return Collections.unmodifiableMap(first);
    }

    public InputGrammar(GrammarParser.Input_grammarContext input_grammarContext) {
        ParseTreeWalker walker = new ParseTreeWalker();
        MyGrammarListener grammarListener = new MyGrammarListener();
        walker.walk(grammarListener, input_grammarContext);

        lexerRules = grammarListener.lexerRules;
        parserRules = grammarListener.parserRules;

        if (!parserRules.containsKey("main")) {
            throw new RuntimeException("Starting rule should be called main");
        }

        first = new HashMap<>();
        follow = new HashMap<>();
        Consumer<Map<String, SerializableParseTree>> addRulesToFirstAndFollow = rules -> rules.keySet().forEach(name -> {
            first.put(name, new HashSet<>());
            follow.put(name, new HashSet<>());
        });

        addRulesToFirstAndFollow.accept(parserRules);
        addRulesToFirstAndFollow.accept(lexerRules);

        lexerRules.forEach((key, value) -> {
            System.out.println(value.getText());
            first.get(key).add(key);
            if (Pattern.matches(value.getText(), "")) {
                first.get(key).add(EPS);
            }
        });


        computeFirst();
        computeFollow();
    }

    private void computeFirst() {
        repeatIfChanged((key, child) -> first.get(key).addAll(updateFirstWithSubRule(child)));
    }

    private void computeFollow() {
        follow.get("main").add(DOLLAR);
        repeatIfChanged((key, child) -> updateFollowWithSubRule(child, key));
    }

    private void repeatIfChanged(BiFunction<String, SerializableParseTree, Boolean> hasChanged) {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (Map.Entry<String, SerializableParseTree> stringParseTreeEntry : parserRules.entrySet()) {
                String key = stringParseTreeEntry.getKey();
                SerializableParseTree tree = stringParseTreeEntry.getValue();
                int childCount = tree.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    SerializableParseTree child = tree.getChild(i);
                    if (child.isRuleHelper()) {
                        changed = changed || hasChanged.apply(key, child);
                    }
                }
            }
        }

    }

    private Set<String> updateFirstWithSubRule(SerializableParseTree child) {
        Set<String> firsts = new HashSet<>(Collections.singleton(EPS));
        boolean haveEps = true;
        for (int i = 0; haveEps && i < child.getChildCount(); i++) {
            SerializableParseTree lexerOrParserRule = child.getChild(i);
            String ruleName = lexerOrParserRule.getText();


            firsts.addAll(first.get(ruleName));
            haveEps = first.get(ruleName).contains(EPS);
        }
        if (!haveEps) {
            firsts.remove(EPS);
        }
        return firsts;
    }

    private boolean updateFollowWithSubRule(SerializableParseTree rule, String parentRule) {
        boolean changed = false;
        for (int i = 0; i < rule.getChildCount(); i++) {
            String key = rule.getChild(i).getText();
            if (!parserRules.containsKey(key)) {
                continue;
            }
            boolean haveEps = true;
            if (i + 1 < rule.getChildCount()) {
                SerializableParseTree relax = rule.getChild(i + 1);
                String relaxText = relax.getText();

                int oldSize = follow.get(key).size();
                follow.get(key).addAll(first.get(relaxText));
                if (first.get(relaxText).contains(EPS)) {
                    follow.get(key).remove(EPS);
                    follow.get(key).addAll(follow.get(relaxText));
                }
                changed = changed || follow.get(key).size() != oldSize;
            } else {
                changed = changed || follow.get(key).addAll(follow.get(parentRule));
            }
        }
        return changed;
    }

    static InputGrammar parseGrammar(InputStream inputStream) throws IOException {
        Lexer lexer = new GrammarLexer(CharStreams.fromStream(inputStream));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokenStream);
        GrammarParser.Input_grammarContext input_grammarContext = parser.input_grammar();

        return new InputGrammar(input_grammarContext);
    }
}
