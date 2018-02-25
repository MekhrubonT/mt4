import result_tree.ResultTree;
import result_tree.RuleResultTree;
import result_tree.TerminalResultTree;

import java.util.*;
import java.util.function.Consumer;

public class Parser {
    private static final String EPS = "";
    private static final ResultTree[] EMPTY_RESULT_TREE_ARRAY = new ResultTree[0];
    public static final Object[] EMPTY_ARGS = new Object[0];

    private final Lexer stream;
    private final Map<String, SerializableParseTree> parserRules;
    private final Map<String, SerializableParseTree> lexerRules;
    private final Map<String, Set<String>> first;
    private final Map<String, Set<String>> follow;
    protected final List<Consumer<Object[]>> codeBlocks;

    public Parser(Lexer stream, InputGrammar inputGrammar) {
        this.stream = stream;
        this.parserRules = inputGrammar.getParserRules();
        this.lexerRules = inputGrammar.getLexerRules();
        codeBlocks = new ArrayList<>();
        codeBlocks.add(x -> {
            throw new RuntimeException("Shouldn't call number 0");
        });
        first = inputGrammar.getFirst();
        follow = inputGrammar.getFollow();
    }

    private Object[] args = EMPTY_ARGS;
    private Object returnValue = null;

    protected void setResult(String result) {
        this.returnValue = result;
    }

    protected Object getResult() {
        return returnValue;
    }

    protected void prepareArguments(Object... args) {
        this.args = args;
    }


    private Object[] getArgs() {
        Object[] buf = args;
        args = EMPTY_ARGS;
        return buf;
    }

    public ResultTree parse() {
        return start("main", getArgs());
    }


    // first.get(currentRule).contains(nextToken()) == true
    private ResultTree start(String currentRule, Object... args) {
        if (lexerRules.containsKey(currentRule)) {
            if (currentRule.equals(stream.getCurrentToken())) {
                TerminalResultTree result = new TerminalResultTree(stream.getTokenValue());
                setResult(stream.getTokenValue());
                if (lexerRules.get(currentRule).getCodeBlocksCount() != 0) {
                    Arrays.stream(lexerRules.get(currentRule).getChildren()).filter(SerializableParseTree::isCodeBlock)
                            .map(SerializableParseTree::getCodeBlockId).forEach(id -> codeBlocks.get(id).accept(args));
                }
                stream.nextToken();
                return result;
            } else {
                throw new RuntimeException("Input mismatched: expected " + currentRule + ", found " + stream.getCurrentToken());
            }
        }

        SerializableParseTree parseTree = parserRules.get(currentRule);
        SerializableParseTree chosenSubRule = chooseRule(parseTree, stream.getCurrentToken());
        List<ResultTree> resultChildren = new ArrayList<>();
        for (int i = 0; i < chosenSubRule.getChildCount(); i++) {
            SerializableParseTree child = chosenSubRule.getChild(i);
            if (child.isCodeBlock()) {
                codeBlocks.get(child.getCodeBlockId()).accept(args);
                continue;
            }
            String text = child.getText();
            if (first.get(text).contains(stream.getCurrentToken())) {
                resultChildren.add(start(text, getArgs()));
            } else if (!first.get(text).contains(EPS)) {
                throw new RuntimeException("Input rule " + text + ": found " + stream.getCurrentToken());
            } else {
                resultChildren.add(new RuleResultTree(text, EMPTY_RESULT_TREE_ARRAY));
            }
        }
        return new RuleResultTree(currentRule, resultChildren.toArray(EMPTY_RESULT_TREE_ARRAY));
    }

    private SerializableParseTree chooseRule(SerializableParseTree parseTree, String nextToken) {
        String currentRule = parseTree.getChild(0).getText();
        for (int i = 0; i < parseTree.getChildCount(); i++) {
            SerializableParseTree child = parseTree.getChild(i);
            if (child.isRuleHelper()) {
                if (child.getChildCount() > child.getCodeBlocksCount()) {

                    SerializableParseTree firstRule = Arrays.stream(child.getChildren()).filter(x -> !x.isCodeBlock()).findFirst().get();
                    String text = firstRule.getText();
                    if (first.get(text) == null || follow.get(text) == null) {
                        int a = 5;
                    }
                    if (first.get(text).contains(nextToken) || (first.get(text).contains(EPS) && follow.get(text).contains(nextToken))) {
                        return child;
                    }
                } else if (first.get(currentRule).contains(EPS) && follow.get(currentRule).contains(nextToken)) {
                    return child;
                }
            }
        }
        throw new RuntimeException("No corresponding rule for token: " + nextToken);
    }
}
