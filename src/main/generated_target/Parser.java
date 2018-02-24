import result_tree.ResultTree;
import result_tree.RuleResultTree;
import result_tree.TerminalResultTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Parser {
    private static final String EPS = "";
    private static final ResultTree[] EMPTY_RESULT_TREE_ARRAY = new ResultTree[0];

    private final Lexer stream;
    private final Map<String, SerializableParseTree> parserRules;
    private final Map<String, SerializableParseTree> lexerRules;
    private final Map<String, Set<String>> first;
    private final Map<String, Set<String>> follow;

    public Parser(Lexer stream, InputGrammar inputGrammar) {
        this.stream = stream;
        this.parserRules = inputGrammar.getParserRules();
        this.lexerRules = inputGrammar.getLexerRules();
        first = inputGrammar.getFirst();
        follow = inputGrammar.getFollow();
    }

    public ResultTree parse() {
        return start("main");
    }


    // first.get(currentRule).contains(nextToken()) == true
    private ResultTree start(String currentRule) {
        SerializableParseTree parseTree = parserRules.get(currentRule);
        SerializableParseTree chosenSubRule = chooseRule(parseTree, stream.getCurrentToken());
        List<ResultTree> resultChildren = new ArrayList<>();
        for (int i = 0; i < chosenSubRule.getChildCount(); i++) {
            SerializableParseTree child = chosenSubRule.getChild(i);
            String text = child.getText();
            if (lexerRules.containsKey(text)) {
                if (text.equals(stream.getCurrentToken())) {
                    resultChildren.add(new TerminalResultTree(stream.getTokenValue()));
                    stream.nextToken();
                } else {
                    throw new RuntimeException("Input mismatched: expected " + text + ", found " + stream.getCurrentToken());
                }
            } else {
                if (first.get(text).contains(stream.getCurrentToken())) {
                    resultChildren.add(start(text));
                } else if (!first.get(text).contains(EPS)) {
                    throw new RuntimeException("Input rule " + text + ": found " + stream.getCurrentToken());
                } else {
                    resultChildren.add(new RuleResultTree(text, EMPTY_RESULT_TREE_ARRAY));
                }
            }
        }
        return new RuleResultTree(currentRule, resultChildren.toArray(EMPTY_RESULT_TREE_ARRAY));
    }

    private SerializableParseTree chooseRule(SerializableParseTree parseTree, String nextToken) {
        String currentRule = parseTree.getChild(0).getText();
        for (int i = 0; i < parseTree.getChildCount(); i++) {
            SerializableParseTree child = parseTree.getChild(i);
            if (child.isRuleHelper()) {
                if (child.getChildCount() > 0) {
                    SerializableParseTree firstRule = child.getChild(0);
                    String text = firstRule.getText();

                    if (lexerRules.containsKey(text)) {
                        if (text.equals(nextToken)) {
                            return child;
                        }
                    } else if (first.get(text).contains(nextToken) || (first.get(text).contains(EPS) && follow.get(text).contains(nextToken))) {
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
