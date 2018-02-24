// Generated from Grammar.g4 by ANTLR 4.5.3
package antlr.generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, LETTER = 7, DIGIT = 8, PLUS = 9,
            FACTOR = 10, QWE = 11, COMMA = 12, COLON = 13, SEMICOLON = 14, OR = 15, WS = 16;
    public static final int
            RULE_input_grammar = 0, RULE_rule_name = 1, RULE_lexer_rule = 2, RULE_regexp = 3,
            RULE_unit = 4, RULE_text = 5, RULE_rule_helper = 6, RULE_parse_rule = 7;
    public static final String[] ruleNames = {
            "input_grammar", "rule_name", "lexer_rule", "regexp", "unit", "text",
            "rule_helper", "parse_rule"
    };

	private static final String[] _LITERAL_NAMES = {
            null, "'->'", "'''", "'('", "')'", "'{'", "'}'", null, null, "'+'", "'*'",
            null, "','", "':'", "';'", "'|'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, "LETTER", "DIGIT", "PLUS", "FACTOR",
            "QWE", "COMMA", "COLON", "SEMICOLON", "OR", "WS"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Input_grammarContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<Lexer_ruleContext> lexer_rule() {
			return getRuleContexts(Lexer_ruleContext.class);
		}
		public Lexer_ruleContext lexer_rule(int i) {
			return getRuleContext(Lexer_ruleContext.class,i);
		}
		public List<Parse_ruleContext> parse_rule() {
			return getRuleContexts(Parse_ruleContext.class);
		}
		public Parse_ruleContext parse_rule(int i) {
			return getRuleContext(Parse_ruleContext.class,i);
		}
		public Input_grammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_grammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInput_grammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInput_grammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInput_grammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_grammarContext input_grammar() throws RecognitionException {
		Input_grammarContext _localctx = new Input_grammarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input_grammar);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(17);
                _errHandler.sync(this);
                _alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
                        setState(16);
                        lexer_rule();
                    }
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
                setState(19);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
                setState(22);
                _errHandler.sync(this);
                _la = _input.LA(1);
			do {
				{
				{
                    setState(21);
                    parse_rule();
                }
				}
                setState(24);
                _errHandler.sync(this);
                _la = _input.LA(1);
			} while ( _la==LETTER );
                setState(26);
                match(EOF);
            }
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rule_nameContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(GrammarParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(GrammarParser.LETTER, i);
		}
		public Rule_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_nameContext rule_name() throws RecognitionException {
		Rule_nameContext _localctx = new Rule_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(29);
                _errHandler.sync(this);
                _alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
                        setState(28);
                        match(LETTER);
                    }
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
                setState(31);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lexer_ruleContext extends ParserRuleContext {
		public Rule_nameContext rule_name() {
			return getRuleContext(Rule_nameContext.class,0);
		}
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}

        public TerminalNode SEMICOLON() {
            return getToken(GrammarParser.SEMICOLON, 0);
        }

        public List<TerminalNode> WS() {
            return getTokens(GrammarParser.WS);
        }

        public TerminalNode WS(int i) {
			return getToken(GrammarParser.WS, i);
		}
		public Lexer_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexer_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLexer_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLexer_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLexer_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lexer_ruleContext lexer_rule() throws RecognitionException {
		Lexer_ruleContext _localctx = new Lexer_ruleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lexer_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(33);
                rule_name();
                setState(37);
                _errHandler.sync(this);
                _la = _input.LA(1);
			while (_la==WS) {
				{
				{
                    setState(34);
                    match(WS);
                }
				}
                setState(39);
                _errHandler.sync(this);
                _la = _input.LA(1);
			}
                setState(40);
                match(T__0);
                setState(44);
                _errHandler.sync(this);
                _la = _input.LA(1);
			while (_la==WS) {
				{
				{
                    setState(41);
                    match(WS);
                }
				}
                setState(46);
                _errHandler.sync(this);
                _la = _input.LA(1);
			}
                setState(47);
                match(T__1);
                setState(48);
                regexp();
                setState(49);
                match(T__1);
                setState(50);
                match(SEMICOLON);
                setState(54);
                _errHandler.sync(this);
                _la = _input.LA(1);
			while (_la==WS) {
				{
				{
                    setState(51);
                    match(WS);
                }
				}
                setState(56);
                _errHandler.sync(this);
                _la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegexpContext extends ParserRuleContext {
		public List<UnitContext> unit() {
			return getRuleContexts(UnitContext.class);
		}
		public UnitContext unit(int i) {
			return getRuleContext(UnitContext.class,i);
		}
		public RegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRegexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRegexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexpContext regexp() throws RecognitionException {
		RegexpContext _localctx = new RegexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_regexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(60);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LETTER) | (1L << DIGIT) | (1L << PLUS) | (1L << FACTOR) | (1L << QWE) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON))) != 0)) {
                    {
                        {
                    setState(57);
                    unit();
                        }
				}
                    setState(62);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
			}
                setState(72);
                _errHandler.sync(this);
                _la = _input.LA(1);
			while (_la==OR) {
				{
				{
                    setState(63);
                    match(OR);
                    setState(67);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LETTER) | (1L << DIGIT) | (1L << PLUS) | (1L << FACTOR) | (1L << QWE) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON))) != 0)) {
                        {
                            {
                        setState(64);
                        unit();
                            }
					}
                        setState(69);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
				}
				}
				}
                setState(74);
                _errHandler.sync(this);
                _la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(80);
                switch (_input.LA(1)) {
                    case LETTER:
			case DIGIT:
			case PLUS:
			case FACTOR:
			case QWE:
                    case COMMA:
                    case COLON:
                    case SEMICOLON: {
                        setState(75);
                        text();
                    }
				break;
                    case T__2: {
                        setState(76);
                        match(T__2);
                        setState(77);
                        regexp();
                        setState(78);
                        match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(GrammarParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(GrammarParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(GrammarParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(GrammarParser.PLUS, i);
		}
		public List<TerminalNode> FACTOR() { return getTokens(GrammarParser.FACTOR); }
		public TerminalNode FACTOR(int i) {
			return getToken(GrammarParser.FACTOR, i);
		}
		public List<TerminalNode> QWE() { return getTokens(GrammarParser.QWE); }
		public TerminalNode QWE(int i) {
			return getToken(GrammarParser.QWE, i);
		}

        public List<TerminalNode> COMMA() {
            return getTokens(GrammarParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GrammarParser.COMMA, i);
        }

        public List<TerminalNode> COLON() {
            return getTokens(GrammarParser.COLON);
        }

        public TerminalNode COLON(int i) {
            return getToken(GrammarParser.COLON, i);
        }

        public List<TerminalNode> SEMICOLON() {
            return getTokens(GrammarParser.SEMICOLON);
        }

        public TerminalNode SEMICOLON(int i) {
            return getToken(GrammarParser.SEMICOLON, i);
        }

        public TextContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(83);
                _errHandler.sync(this);
                _alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
                        setState(82);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER) | (1L << DIGIT) | (1L << PLUS) | (1L << FACTOR) | (1L << QWE) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
                setState(85);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rule_helperContext extends ParserRuleContext {
		public List<Rule_nameContext> rule_name() {
			return getRuleContexts(Rule_nameContext.class);
		}
		public Rule_nameContext rule_name(int i) {
			return getRuleContext(Rule_nameContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarParser.WS, i);
		}
		public Rule_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_helper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRule_helper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRule_helper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRule_helper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_helperContext rule_helper() throws RecognitionException {
		Rule_helperContext _localctx = new Rule_helperContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rule_helper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
                setState(96);
                _errHandler.sync(this);
                _la = _input.LA(1);
			while (_la==LETTER) {
                {
                    {
                        setState(87);
                        rule_name();
                        setState(91);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == WS) {
                            {
                                {
                                    setState(88);
                                    match(WS);
                                }
                            }
                            setState(93);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }
                setState(98);
                _errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parse_ruleContext extends ParserRuleContext {
		public Rule_nameContext rule_name() {
			return getRuleContext(Rule_nameContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarParser.WS, i);
		}
		public List<Rule_helperContext> rule_helper() {
			return getRuleContexts(Rule_helperContext.class);
		}
		public Rule_helperContext rule_helper(int i) {
			return getRuleContext(Rule_helperContext.class,i);
		}
		public Parse_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParse_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParse_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParse_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parse_ruleContext parse_rule() throws RecognitionException {
		Parse_ruleContext _localctx = new Parse_ruleContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_parse_rule);
        int _la;
        try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(99);
                rule_name();
                setState(103);
                _errHandler.sync(this);
                _la = _input.LA(1);
			while (_la==WS) {
				{
				{
                    setState(100);
                    match(WS);
                }
				}
                setState(105);
                _errHandler.sync(this);
                _la = _input.LA(1);
			}
                setState(106);
                match(T__4);
                setState(110);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if ( _alt==1 ) {
					{
					{
                        setState(107);
                        match(WS);
                    }
					} 
				}
                    setState(112);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
                }
                setState(123);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LETTER || _la == SEMICOLON) {
                    {
                        {
                    setState(113);
                    rule_helper();
                    setState(114);
                    match(SEMICOLON);
                    setState(118);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if ( _alt==1 ) {
						{
						{
                            setState(115);
                            match(WS);
                        }
						} 
					}
                        setState(120);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                    }
                        }
				}
                    setState(125);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
			}
                setState(129);
                _errHandler.sync(this);
                _la = _input.LA(1);
			while (_la==WS) {
				{
				{
                    setState(126);
                    match(WS);
                }
				}
                setState(131);
                _errHandler.sync(this);
                _la = _input.LA(1);
			}
                setState(132);
                match(T__5);
                setState(136);
                _errHandler.sync(this);
                _la = _input.LA(1);
			while (_la==WS) {
				{
				{
                    setState(133);
                    match(WS);
                }
				}
                setState(138);
                _errHandler.sync(this);
                _la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\u008e\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n" +
                    "\2\r\2\16\2\25\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\3\3\6\3 \n\3\r\3\16" +
                    "\3!\3\4\3\4\7\4&\n\4\f\4\16\4)\13\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4" +
                    "\3\4\3\4\3\4\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\5\7\5=\n\5\f\5\16\5@" +
                    "\13\5\3\5\3\5\7\5D\n\5\f\5\16\5G\13\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6" +
                    "\3\6\3\6\3\6\5\6S\n\6\3\7\6\7V\n\7\r\7\16\7W\3\b\3\b\7\b\\\n\b\f\b\16" +
                    "\b_\13\b\7\ba\n\b\f\b\16\bd\13\b\3\t\3\t\7\th\n\t\f\t\16\tk\13\t\3\t\3" +
                    "\t\7\to\n\t\f\t\16\tr\13\t\3\t\3\t\3\t\7\tw\n\t\f\t\16\tz\13\t\7\t|\n" +
                    "\t\f\t\16\t\177\13\t\3\t\7\t\u0082\n\t\f\t\16\t\u0085\13\t\3\t\3\t\7\t" +
                    "\u0089\n\t\f\t\16\t\u008c\13\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2\t\20" +
                    "\u0098\2\23\3\2\2\2\4\37\3\2\2\2\6#\3\2\2\2\b>\3\2\2\2\nR\3\2\2\2\fU\3" +
                    "\2\2\2\16b\3\2\2\2\20e\3\2\2\2\22\24\5\6\4\2\23\22\3\2\2\2\24\25\3\2\2" +
                    "\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\31\5\20\t\2\30\27\3\2" +
                    "\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\7\2" +
                    "\2\3\35\3\3\2\2\2\36 \7\t\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3" +
                    "\2\2\2\"\5\3\2\2\2#\'\5\4\3\2$&\7\22\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2" +
                    "\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*.\7\3\2\2+-\7\22\2\2,+\3\2\2\2-\60" +
                    "\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\4\2\2\62" +
                    "\63\5\b\5\2\63\64\7\4\2\2\648\7\20\2\2\65\67\7\22\2\2\66\65\3\2\2\2\67" +
                    ":\3\2\2\28\66\3\2\2\289\3\2\2\29\7\3\2\2\2:8\3\2\2\2;=\5\n\6\2<;\3\2\2" +
                    "\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?J\3\2\2\2@>\3\2\2\2AE\7\21\2\2BD\5\n" +
                    "\6\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2HA\3\2" +
                    "\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LJ\3\2\2\2MS\5\f\7\2NO\7" +
                    "\5\2\2OP\5\b\5\2PQ\7\6\2\2QS\3\2\2\2RM\3\2\2\2RN\3\2\2\2S\13\3\2\2\2T" +
                    "V\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2\2Y]\5\4\3\2" +
                    "Z\\\7\22\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2" +
                    "\2\2`Y\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\17\3\2\2\2db\3\2\2\2ei\5" +
                    "\4\3\2fh\7\22\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki" +
                    "\3\2\2\2lp\7\7\2\2mo\7\22\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2" +
                    "q}\3\2\2\2rp\3\2\2\2st\5\16\b\2tx\7\20\2\2uw\7\22\2\2vu\3\2\2\2wz\3\2" +
                    "\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{s\3\2\2\2|\177\3\2\2\2}{" +
                    "\3\2\2\2}~\3\2\2\2~\u0083\3\2\2\2\177}\3\2\2\2\u0080\u0082\7\22\2\2\u0081" +
                    "\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2" +
                    "\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008a\7\b\2\2\u0087" +
                    "\u0089\7\22\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3" +
                    "\2\2\2\u008a\u008b\3\2\2\2\u008b\21\3\2\2\2\u008c\u008a\3\2\2\2\25\25" +
                    "\32!\'.8>EJRW]bipx}\u0083\u008a";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}