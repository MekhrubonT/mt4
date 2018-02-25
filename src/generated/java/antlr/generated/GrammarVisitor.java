// Generated from Grammar.g4 by ANTLR 4.5.3
package antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#input_grammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_grammar(GrammarParser.Input_grammarContext ctx);
	/**
     * Visit a parse tree produced by {@link GrammarParser#header}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHeader(GrammarParser.HeaderContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#codes}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCodes(GrammarParser.CodesContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#rule_name}.
     * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_name(GrammarParser.Rule_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#lexer_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexer_rule(GrammarParser.Lexer_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#regexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp(GrammarParser.RegexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(GrammarParser.UnitContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#regexText}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRegexText(GrammarParser.RegexTextContext ctx);

    /**
	 * Visit a parse tree produced by {@link GrammarParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(GrammarParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rule_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_helper(GrammarParser.Rule_helperContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#code_block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCode_block(GrammarParser.Code_blockContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#code}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCode(GrammarParser.CodeContext ctx);

    /**
	 * Visit a parse tree produced by {@link GrammarParser#parse_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_rule(GrammarParser.Parse_ruleContext ctx);
}