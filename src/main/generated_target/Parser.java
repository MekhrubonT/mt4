import result_tree.ResultTree;
import result_tree.RuleResultTree;
import result_tree.TerminalResultTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Parser {
    public static final String DOLLAR = "$";
    public static final String EPS = "";
    private static final ResultTree[] EMPTY_RESULT_TREE_ARRAY = new ResultTree[0];

    private final InputGrammar inputGrammar;
    private final Lexer stream;
    private final Map<String, SerializableParseTree> parserRules;
    private final Map<String, SerializableParseTree> lexerRules;
    private final Map<String, Set<String>> first;
    private final Map<String, Set<String>> follow;

    public Parser(Lexer stream, InputGrammar inputGrammar) {
        this.stream = stream;
        this.inputGrammar = inputGrammar;
        this.parserRules = inputGrammar.getParserRules();
        this.lexerRules = inputGrammar.getLexerRules();
        first = inputGrammar.getFirst();
        follow = inputGrammar.getFollow();
    }

    public ResultTree parse() throws Exception {
        return start("main");
    }


    // first.get(currentRule).contains(nextToken()) == true
    private ResultTree start(String currentRule) throws Exception {
        String token = stream.currentToken();
        SerializableParseTree parseTree = parserRules.get(currentRule);

        SerializableParseTree chosenSubRule = chooseRule(parseTree, token);
        List<ResultTree> resultChildren = new ArrayList<>();
        for (int i = 0; i < chosenSubRule.getChildCount(); i++) {
            SerializableParseTree child = chosenSubRule.getChild(i);
            String text = child.getText();
            if (lexerRules.containsKey(text)) {
                if (text.equals(token)) {
                    resultChildren.add(new TerminalResultTree(stream.tokenValue));
                    stream.nextToken();
                } else {
                    throw new RuntimeException("Input mismatched: expected " + token + ", found " + text);
                }
            } else {
                if (first.get(text).contains(token)) {
                    resultChildren.add(start(text));
                } else if (!first.containsKey(EPS)) {
                    throw new RuntimeException("Input missmatched: expected " + token);
                } else {
                    resultChildren.add(new RuleResultTree(token, EMPTY_RESULT_TREE_ARRAY));
                }
            }
        }
        return new RuleResultTree(currentRule, resultChildren.toArray(EMPTY_RESULT_TREE_ARRAY));
    }

    private SerializableParseTree chooseRule(SerializableParseTree parseTree, String nextToken) {
        for (int i = 0; i < parseTree.getChildCount(); i++) {
            SerializableParseTree child = parseTree.getChild(i);
            if (child.isRuleHelper() && child.getChildCount() > 0) {
                SerializableParseTree firstRule = child.getChild(0);
                String text = firstRule.getText();

                if (lexerRules.containsKey(text)) {
                    if (text.equals(nextToken)) {
                        return child;
                    }
                } else if (first.get(text).contains(nextToken) || (first.get(text).contains(EPS) && follow.get(text).contains(nextToken))) {
                    return child;
                }
            }
        }
        throw new RuntimeException("No corresponding rule for token: " + nextToken);
    }
}
