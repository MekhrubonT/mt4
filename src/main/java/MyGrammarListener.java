import antlr.generated.GrammarBaseListener;
import antlr.generated.GrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyGrammarListener extends GrammarBaseListener {
    Map<String, SerializableParseTree> parserRules = new HashMap<>();
    Map<String, SerializableParseTree> lexerRules = new LinkedHashMap<>();
    String header = "";
    String member = "";

    private int id = 0;
    Map<String, SerializableParseTree> lexerRulesCodeBlocks = new HashMap<>();

    int requireId() {
        return ++id;
    }

    private void add(String name, ParseTree ctx, Map<String, SerializableParseTree> cur, Map<String, SerializableParseTree> oth) {
        if (cur.put(name, new SerializableParseTree(ctx, this)) != null) {
            throw new RuntimeException("Two or more rules with same name");
        }
        if (oth.containsKey(name)) {
            throw new RuntimeException("Parser and lexer rules with same name");
        }
    }

    @Override
    public void exitHeader(GrammarParser.HeaderContext ctx) {
        if (ctx.children != null) {
            header = ctx.text().getText();
        }
    }

    @Override
    public void exitCodes(GrammarParser.CodesContext ctx) {
        if (ctx.children != null) {
            member = ctx.text().getText();
        }
    }

    @Override
    public void exitParse_rule(GrammarParser.Parse_ruleContext ctx) {
        add(ctx.rule_name().getText(), ctx, parserRules, lexerRules);
    }

    @Override
    public void exitLexer_rule(GrammarParser.Lexer_ruleContext ctx) {
        add(ctx.rule_name().getText(), ctx.regexp(), lexerRules, parserRules);
        if (ctx.code_block() != null)
            lexerRulesCodeBlocks.put(ctx.rule_name().getText(), new SerializableParseTree(ctx.code_block(), this));
    }

    public int getId() {
        return id;
    }
}
