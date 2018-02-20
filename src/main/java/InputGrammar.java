import antlr.generated.GrammarLexer;
import antlr.generated.GrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.*;
import java.util.function.BiFunction;
import java.util.regex.Pattern;

public class InputGrammar implements Serializable {
    public static final String DOLLAR = "$";
    public static final String EPS = "";

    private final Map<String, SerializableParseTree> lexerRules, parserRules;
    private final Map<String, Integer> lexerRulesInd, parserRulesInd;

    public Map<String, SerializableParseTree> getLexerRules() {
        return Collections.unmodifiableMap(lexerRules);
    }

    public Map<String, SerializableParseTree> getParserRules() {
        return Collections.unmodifiableMap(parserRules);
    }

    private final Map<String, Boolean> acceptsEps;

    private final Map<String, Set<String>> first, follow;

    public Map<String, Integer> getLexerRulesInd() {
        return Collections.unmodifiableMap(lexerRulesInd);
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

        lexerRulesInd = new HashMap<>();
        parserRulesInd = new HashMap<>();
        numerate(lexerRules, lexerRulesInd);
        numerate(parserRules, parserRulesInd);

        if (!parserRules.containsKey("main")) {
            throw new RuntimeException("Starting rule should be called main");
        }

        acceptsEps = new HashMap<>();
        lexerRules.forEach((key, value) -> {
            System.out.println(value.getText());
            acceptsEps.put(key, Pattern.matches(value.getText(), ""));
        });

        first = new HashMap<>();
        follow = new HashMap<>();
        parserRules.keySet().forEach(name -> {
            first.put(name, new HashSet<>());
            follow.put(name, new HashSet<>());
        });

        computeFirst();
        computeFollow();
    }

    private void numerate(Map<String, SerializableParseTree> parserRules, Map<String, Integer> parserRulesInd) {
        int ind = 0;
        for (String s : parserRules.keySet()) {
            parserRulesInd.put(s, ind);
            ind++;
        }
    }

    private void computeFirst() {
        repeatIfChanged((key, child) -> first.get(key).addAll(updateFirstWithSubRule(child)));
    }

    private void computeFollow() {
        follow.get("main").add(DOLLAR);
        repeatIfChanged((key, child) -> updateFollowWithSubRule(child));
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
        Set<String> firsts = new HashSet<>();
        boolean haveEps = true;
        for (int i = 0; haveEps && i < child.getChildCount(); i += 2) {
            SerializableParseTree lexerOrParserRule = child.getChild(i);
            String repeatSign = child.getChild(i + 1).getText();
            String ruleName = lexerOrParserRule.getText();

            if (lexerRules.containsKey(ruleName)) {
                firsts.add(ruleName);
                haveEps = acceptsEps.get(ruleName);
            } else {
                firsts.addAll(first.get(ruleName));
                haveEps = first.get(ruleName).contains(EPS);
            }

            haveEps = haveEps || !"+".equals(repeatSign);
        }
        if (haveEps) {
            firsts.add(EPS);
        }
        return firsts;
    }

    private boolean updateFollowWithSubRule(SerializableParseTree rule) {
        boolean changed = false;
        for (int i = 0; i < rule.getChildCount(); i += 2) {
            String key = rule.getChild(i).getText();
            if (!parserRules.containsKey(key)) {
                continue;
            }
            boolean haveEps = true;
            for (int k = i + 2; haveEps && k < rule.getChildCount(); k += 2) {
                SerializableParseTree relax = rule.getChild(k);
                String repeatSign = rule.getChild(k + 1).getText();
                String relaxText = relax.getText();

                if (lexerRules.containsKey(relaxText)) {
                    changed = changed || follow.get(key).add(relaxText);
                    haveEps = acceptsEps.get(relaxText);
                } else {
                    changed = changed || follow.get(key).addAll(first.get(relaxText));
                    haveEps = first.get(relaxText).contains(EPS);
                }
                haveEps = haveEps || !"+".equals(repeatSign);
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
