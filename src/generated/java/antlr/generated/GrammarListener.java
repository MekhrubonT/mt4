// Generated from Grammar.g4 by ANTLR 4.5.3
package antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#input_grammar}.
	 * @param ctx the parse tree
	 */
	void enterInput_grammar(GrammarParser.Input_grammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#input_grammar}.
	 * @param ctx the parse tree
	 */
	void exitInput_grammar(GrammarParser.Input_grammarContext ctx);
	/**
     * Enter a parse tree produced by {@link GrammarParser#header}.
     * @param ctx the parse tree
     */
    void enterHeader(GrammarParser.HeaderContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#header}.
     *
     * @param ctx the parse tree
     */
    void exitHeader(GrammarParser.HeaderContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#codes}.
     *
     * @param ctx the parse tree
     */
    void enterCodes(GrammarParser.CodesContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#codes}.
     *
     * @param ctx the parse tree
     */
    void exitCodes(GrammarParser.CodesContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#rule_name}.
     * @param ctx the parse tree
	 */
	void enterRule_name(GrammarParser.Rule_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rule_name}.
	 * @param ctx the parse tree
	 */
	void exitRule_name(GrammarParser.Rule_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lexer_rule}.
	 * @param ctx the parse tree
	 */
	void enterLexer_rule(GrammarParser.Lexer_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lexer_rule}.
	 * @param ctx the parse tree
	 */
	void exitLexer_rule(GrammarParser.Lexer_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(GrammarParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(GrammarParser.RegexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(GrammarParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(GrammarParser.UnitContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#regexText}.
     *
     * @param ctx the parse tree
     */
    void enterRegexText(GrammarParser.RegexTextContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#regexText}.
     *
     * @param ctx the parse tree
     */
    void exitRegexText(GrammarParser.RegexTextContext ctx);

    /**
	 * Enter a parse tree produced by {@link GrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(GrammarParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(GrammarParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rule_helper}.
	 * @param ctx the parse tree
	 */
	void enterRule_helper(GrammarParser.Rule_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rule_helper}.
	 * @param ctx the parse tree
     */
    void exitRule_helper(GrammarParser.Rule_helperContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#code_block}.
     *
     * @param ctx the parse tree
     */
    void enterCode_block(GrammarParser.Code_blockContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#code_block}.
     *
     * @param ctx the parse tree
     */
    void exitCode_block(GrammarParser.Code_blockContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#code}.
     *
     * @param ctx the parse tree
     */
    void enterCode(GrammarParser.CodeContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#code}.
     *
     * @param ctx the parse tree
     */
    void exitCode(GrammarParser.CodeContext ctx);

    /**
	 * Enter a parse tree produced by {@link GrammarParser#parse_rule}.
	 * @param ctx the parse tree
	 */
	void enterParse_rule(GrammarParser.Parse_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parse_rule}.
	 * @param ctx the parse tree
	 */
	void exitParse_rule(GrammarParser.Parse_ruleContext ctx);
}