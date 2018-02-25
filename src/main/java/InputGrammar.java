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
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InputGrammar implements Serializable {
    private static final long serialVersionUID = 6473407033512582688L;

    public static final String DOLLAR = "$DOL$";
    public static final String EPS = "";

    private final Map<String, SerializableParseTree> lexerRules, parserRules;
    private final Map<String, Set<String>> first, follow;
    private final String header;
    private final String member;

    private final String codeBlocksMethods;
    private final int codeBlocksAmount;

    public static InputGrammar getParser(String grammarPath) throws IOException {
        try {
            return (InputGrammar) GenerateParser.restoreObject(grammarPath);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Parser data is broken");
        }
    }

    public String getCodeBlocksMethods() {
        return codeBlocksMethods;
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

        codeBlocksAmount = grammarListener.getId();
        header = grammarListener.header;
        member = grammarListener.member;
        lexerRules = grammarListener.lexerRules;
        parserRules = grammarListener.parserRules;

        if (!parserRules.containsKey("main")) {
            throw new RuntimeException("Starting rule should be called main");
        }

        codeBlocksMethods = Stream.concat(parserRules.values().stream(), grammarListener.lexerRulesCodeBlocks.values().stream())
                .flatMap(this::retainCodeBlocks)
                .map(tree -> String.format("private void codeBlock%d(Object... args) {\n" +
                        "%s" +
                        "}\n", tree.getCodeBlockId(), tree.getChild(1).getText()))
                .collect(Collectors.joining("\n"));

        first = new HashMap<>();
        follow = new HashMap<>();
        Consumer<Map<String, SerializableParseTree>> addRulesToFirstAndFollow = rules -> rules.keySet().forEach(name -> {
            first.put(name, new HashSet<>());
            follow.put(name, new HashSet<>());
        });

        addRulesToFirstAndFollow.accept(parserRules);
        addRulesToFirstAndFollow.accept(lexerRules);

        lexerRules.forEach((key, value) -> {
            first.get(key).add(key);
            if (Pattern.matches(value.getText(), "")) {
                first.get(key).add(EPS);
            }
        });


        computeFirst();
        computeFollow();
    }

    private Stream<? extends SerializableParseTree> retainCodeBlocks(SerializableParseTree tree) {
        return tree.isCodeBlock() ? Stream.of(tree) : Arrays.stream(tree.getChildren()).flatMap(this::retainCodeBlocks);
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
            SerializableParseTree subRule = child.getChild(i);
            if (subRule.isCodeBlock()) {
                continue;
            }

            String ruleName = subRule.getText();
            if (first.get(ruleName) == null) {
                int x = 5;
            }
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
            if (rule.getChild(i).isCodeBlock()) {
                continue;
            }
            String key = rule.getChild(i).getText();
            if (!parserRules.containsKey(key)) {
                continue;
            }
            boolean haveEps = true;

            int j = i + 1;
            while (j < rule.getChildCount() && rule.getChild(j).isCodeBlock()) {
                j++;
            }
            if (j < rule.getChildCount()) {
                SerializableParseTree relax = rule.getChild(j);
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

    public String getHeader() {
        return header;
    }

    public String getMember() {
        return member;
    }

    public String addCodeBlocksMethods() {
        return IntStream.rangeClosed(1, codeBlocksAmount).boxed().map(id -> "\t\tcodeBlocks.add(this::codeBlock" + id + ");").collect(Collectors.joining("\n"));
    }
}
