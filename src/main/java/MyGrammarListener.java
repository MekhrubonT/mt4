import antlr.generated.GrammarBaseListener;
import antlr.generated.GrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyGrammarListener extends GrammarBaseListener {
    Map<String, SerializableParseTree> parserRules = new HashMap<>();
    Map<String, SerializableParseTree> lexerRules = new LinkedHashMap<>();

    private void add(String name, ParseTree ctx, Map<String, SerializableParseTree> cur, Map<String, SerializableParseTree> oth) {
        if (cur.put(name, new SerializableParseTree(ctx)) != null) {
            throw new RuntimeException("Two or more rules with same name");
        }
        if (oth.containsKey(name)) {
            throw new RuntimeException("Parser and lexer rules with same name");
        }
    }

    @Override
    public void exitParse_rule(GrammarParser.Parse_ruleContext ctx) {
        add(ctx.rule_name().getText(), ctx, parserRules, lexerRules);
    }

    @Override
    public void exitLexer_rule(GrammarParser.Lexer_ruleContext ctx) {
        add(ctx.rule_name().getText(), ctx.regexp(), lexerRules, parserRules);
    }
}
