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
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, LETTER = 23, DIGIT = 24,
            PLUS = 25, FACTOR = 26, QWE = 27, COMMA = 28, COLON = 29, SEMICOLON = 30, DOT = 31,
            OR = 32, WS = 33;
    public static final int
            RULE_input_grammar = 0, RULE_header = 1, RULE_codes = 2, RULE_rule_name = 3,
            RULE_lexer_rule = 4, RULE_regexp = 5, RULE_unit = 6, RULE_regexText = 7,
            RULE_text = 8, RULE_rule_helper = 9, RULE_code_block = 10, RULE_code = 11,
            RULE_parse_rule = 12;
    public static final String[] ruleNames = {
            "input_grammar", "header", "codes", "rule_name", "lexer_rule", "regexp",
            "unit", "regexText", "text", "rule_helper", "code_block", "code", "parse_rule"
    };

	private static final String[] _LITERAL_NAMES = {
            null, "'parser'", "'header'", "'{'", "'}'", "'member'", "'_'", "'->'",
            "'''", "'('", "')'", "'\"'", "'='", "'<'", "'>'", "'!'", "'^'", "'?'",
            "'-'", "'&'", "'$'", "'['", "']'", null, null, "'+'", "'*'", null, "','",
            "':'", "';'", "'.'", "'|'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, "LETTER",
            "DIGIT", "PLUS", "FACTOR", "QWE", "COMMA", "COLON", "SEMICOLON", "DOT",
            "OR", "WS"
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
        public HeaderContext header() {
            return getRuleContext(HeaderContext.class, 0);
        }

        public CodesContext codes() {
            return getRuleContext(CodesContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(GrammarParser.EOF, 0);
        }

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
                setState(26);
                header();
                setState(27);
                codes();
                setState(29);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
				case 1:
					{
					{
                        setState(28);
                        lexer_rule();
                    }
                    }
					break;
				default:
					throw new NoViableAltException(this);
				}
                    setState(31);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                setState(34);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
				{
                    setState(33);
                    parse_rule();
                }
                    }
                    setState(36);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
			} while ( _la==LETTER );
                setState(38);
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

    public static class HeaderContext extends ParserRuleContext {
        public TextContext text() {
            return getRuleContext(TextContext.class, 0);
        }

        public List<TerminalNode> WS() {
            return getTokens(GrammarParser.WS);
        }

        public TerminalNode WS(int i) {
            return getToken(GrammarParser.WS, i);
        }

        public HeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_header;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterHeader(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitHeader(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitHeader(this);
            else return visitor.visitChildren(this);
        }
    }

    public final HeaderContext header() throws RecognitionException {
        HeaderContext _localctx = new HeaderContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_header);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(64);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                    case 1: {
                        setState(43);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == WS) {
                            {
                                {
                                    setState(40);
                                    match(WS);
                                }
                            }
                            setState(45);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(46);
                        match(T__0);
                        setState(47);
                        match(COLON);
                        setState(48);
                        match(T__1);
                        setState(52);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == WS) {
                            {
                                {
                                    setState(49);
                                    match(WS);
                                }
                            }
                            setState(54);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(55);
                        match(T__2);
                        setState(56);
                        text();
                        setState(57);
                        match(T__3);
                        setState(61);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(58);
                                        match(WS);
                                    }
                                }
                            }
                            setState(63);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
                        }
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CodesContext extends ParserRuleContext {
        public TextContext text() {
            return getRuleContext(TextContext.class, 0);
        }

        public List<TerminalNode> WS() {
            return getTokens(GrammarParser.WS);
        }

        public TerminalNode WS(int i) {
            return getToken(GrammarParser.WS, i);
        }

        public CodesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_codes;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterCodes(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitCodes(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitCodes(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CodesContext codes() throws RecognitionException {
        CodesContext _localctx = new CodesContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_codes);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(90);
                _la = _input.LA(1);
                if (_la == T__0 || _la == WS) {
                    {
                        setState(69);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == WS) {
                            {
                                {
                                    setState(66);
                                    match(WS);
                                }
                            }
                            setState(71);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(72);
                        match(T__0);
                        setState(73);
                        match(COLON);
                        setState(74);
                        match(T__4);
                        setState(78);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == WS) {
                            {
                                {
                                    setState(75);
                                    match(WS);
                                }
                            }
                            setState(80);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(81);
                        match(T__2);
                        setState(82);
                        text();
                        setState(83);
                        match(T__3);
                        setState(87);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == WS) {
                            {
                                {
                                    setState(84);
                                    match(WS);
                                }
                            }
                            setState(89);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
        enterRule(_localctx, 6, RULE_rule_name);
        int _la;
        try {
            int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(92);
                match(LETTER);
                setState(96);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(93);
                                _la = _input.LA(1);
                                if (!(_la == T__5 || _la == LETTER)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    consume();
                                }
                            }
                        }
                    }
                    setState(98);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
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

        public Code_blockContext code_block() {
            return getRuleContext(Code_blockContext.class, 0);
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
        enterRule(_localctx, 8, RULE_lexer_rule);
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
                while (_la == WS) {
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
                match(T__6);
                setState(110);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == WS) {
                    {
				{
                    setState(107);
                    match(WS);
                }
                    }
                    setState(112);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
			}
                setState(113);
                match(T__7);
                setState(114);
                regexp();
                setState(115);
                match(T__7);
                setState(116);
                match(SEMICOLON);
                setState(120);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(117);
                                match(WS);
                            }
                        }
                    }
                    setState(122);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
                }
                setState(124);
                _la = _input.LA(1);
                if (_la == T__2) {
                    {
                        setState(123);
                        code_block();
                    }
                }

                setState(129);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == WS) {
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
        enterRule(_localctx, 10, RULE_regexp);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(135);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(132);
                                unit();
                            }
                        }
                    }
                    setState(137);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                }
                setState(147);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OR) {
                    {
				{
                    setState(138);
                    match(OR);
                    setState(142);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(139);
                                    unit();
                                }
                            }
                        }
                        setState(144);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                    }
                }
				}
                    setState(149);
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
        public RegexTextContext regexText() {
            return getRuleContext(RegexTextContext.class, 0);
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
        enterRule(_localctx, 12, RULE_unit);
        try {
            enterOuterAlt(_localctx, 1);
			{
                setState(155);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                    case 1: {
                        setState(150);
                        regexText();
                    }
                    break;
                    case 2: {
                        setState(151);
                        match(T__8);
                        setState(152);
                        regexp();
                        setState(153);
                        match(T__9);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RegexTextContext extends ParserRuleContext {
        public List<TerminalNode> LETTER() {
            return getTokens(GrammarParser.LETTER);
        }

        public TerminalNode LETTER(int i) {
            return getToken(GrammarParser.LETTER, i);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(GrammarParser.DIGIT);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(GrammarParser.DIGIT, i);
        }

        public List<TerminalNode> PLUS() {
            return getTokens(GrammarParser.PLUS);
        }

        public TerminalNode PLUS(int i) {
            return getToken(GrammarParser.PLUS, i);
        }

        public List<TerminalNode> FACTOR() {
            return getTokens(GrammarParser.FACTOR);
        }

        public TerminalNode FACTOR(int i) {
            return getToken(GrammarParser.FACTOR, i);
        }

        public List<TerminalNode> QWE() {
            return getTokens(GrammarParser.QWE);
        }

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

        public List<TerminalNode> DOT() {
            return getTokens(GrammarParser.DOT);
        }

        public TerminalNode DOT(int i) {
            return getToken(GrammarParser.DOT, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(GrammarParser.WS);
        }

        public TerminalNode WS(int i) {
            return getToken(GrammarParser.WS, i);
        }

        public RegexTextContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_regexText;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterRegexText(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitRegexText(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitRegexText(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RegexTextContext regexText() throws RecognitionException {
        RegexTextContext _localctx = new RegexTextContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_regexText);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(158);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(157);
                                _la = _input.LA(1);
                                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << LETTER) | (1L << DIGIT) | (1L << PLUS) | (1L << FACTOR) | (1L << QWE) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << DOT) | (1L << WS))) != 0))) {
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
                    setState(160);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
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

        public List<TerminalNode> DOT() {
            return getTokens(GrammarParser.DOT);
        }

        public TerminalNode DOT(int i) {
            return getToken(GrammarParser.DOT, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(GrammarParser.WS);
        }

        public TerminalNode WS(int i) {
            return getToken(GrammarParser.WS, i);
        }

        public List<TextContext> text() {
            return getRuleContexts(TextContext.class);
        }

        public TextContext text(int i) {
            return getRuleContext(TextContext.class, i);
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
        enterRule(_localctx, 16, RULE_text);
        try {
            int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(191);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
				case 1:
					{
                        setState(191);
                        switch (_input.LA(1)) {
                            case LETTER: {
                                setState(162);
                                match(LETTER);
                            }
                            break;
                            case DIGIT: {
                                setState(163);
                                match(DIGIT);
                            }
                            break;
                            case PLUS: {
                                setState(164);
                                match(PLUS);
                            }
                            break;
                            case FACTOR: {
                                setState(165);
                                match(FACTOR);
                            }
                            break;
                            case QWE: {
                                setState(166);
                                match(QWE);
                            }
                            break;
                            case COMMA: {
                                setState(167);
                                match(COMMA);
                            }
                            break;
                            case COLON: {
                                setState(168);
                                match(COLON);
                            }
                            break;
                            case SEMICOLON: {
                                setState(169);
                                match(SEMICOLON);
                            }
                            break;
                            case DOT: {
                                setState(170);
                                match(DOT);
                            }
                            break;
                            case WS: {
                                setState(171);
                                match(WS);
                            }
                            break;
                            case T__8: {
                                setState(172);
                                match(T__8);
                            }
                            break;
                            case T__9: {
                                setState(173);
                                match(T__9);
                            }
                            break;
                            case T__2: {
                                setState(174);
                                match(T__2);
                                setState(175);
                                text();
                                setState(176);
                                match(T__3);
                            }
                            break;
                            case T__10: {
                                setState(178);
                                match(T__10);
                            }
                            break;
                            case T__11: {
                                setState(179);
                                match(T__11);
                            }
                            break;
                            case T__12: {
                                setState(180);
                                match(T__12);
                            }
                            break;
                            case T__13: {
                                setState(181);
                                match(T__13);
                            }
                            break;
                            case T__14: {
                                setState(182);
                                match(T__14);
                            }
                            break;
                            case T__15: {
                                setState(183);
                                match(T__15);
                            }
                            break;
                            case T__5: {
                                setState(184);
                                match(T__5);
                            }
                            break;
                            case T__16: {
                                setState(185);
                                match(T__16);
                            }
                            break;
                            case T__7: {
                                setState(186);
                                match(T__7);
                            }
                            break;
                            case T__17: {
                                setState(187);
                                match(T__17);
                            }
                            break;
                            case T__18: {
                                setState(188);
                                match(T__18);
                            }
                            break;
                            case T__20: {
                                setState(189);
                                match(T__20);
                            }
                            break;
                            case T__21: {
                                setState(190);
                                match(T__21);
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
					break;
				default:
					throw new NoViableAltException(this);
				}
                    setState(193);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
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

        public List<Code_blockContext> code_block() {
            return getRuleContexts(Code_blockContext.class);
        }

        public Code_blockContext code_block(int i) {
            return getRuleContext(Code_blockContext.class, i);
        }

        public List<TerminalNode> WS() {
            return getTokens(GrammarParser.WS);
        }

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
        enterRule(_localctx, 18, RULE_rule_helper);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(228);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LETTER) | (1L << WS))) != 0)) {
                    {
                        {
                            setState(198);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__2) {
                                {
                                    {
                                        setState(195);
                                        code_block();
                                    }
                                }
                                setState(200);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                            setState(204);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == WS) {
                                {
                                    {
                                        setState(201);
                                        match(WS);
                                    }
                                }
                                setState(206);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                            setState(207);
                            rule_name();
                            setState(211);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
                            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                if (_alt == 1) {
                                    {
                                        {
                                            setState(208);
                                            match(WS);
                                        }
                                    }
                                }
                                setState(213);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
                            }
                            setState(217);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                if (_alt == 1) {
                                    {
                                        {
                                            setState(214);
                                            code_block();
                                        }
                                    }
                                }
                                setState(219);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                            }
                            setState(223);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
                            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                if (_alt == 1) {
                                    {
                                        {
                                            setState(220);
                                            match(WS);
                                        }
                                    }
                                }
                                setState(225);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
                            }
                        }
                    }
                    setState(230);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Code_blockContext extends ParserRuleContext {
        public CodeContext code() {
            return getRuleContext(CodeContext.class, 0);
        }

        public Code_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_code_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterCode_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitCode_block(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitCode_block(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Code_blockContext code_block() throws RecognitionException {
        Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_code_block);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(231);
                match(T__2);
                setState(232);
                code();
                setState(233);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CodeContext extends ParserRuleContext {
        public List<TextContext> text() {
            return getRuleContexts(TextContext.class);
        }

        public TextContext text(int i) {
            return getRuleContext(TextContext.class, i);
        }

        public CodeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_code;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterCode(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitCode(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitCode(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CodeContext code() throws RecognitionException {
        CodeContext _localctx = new CodeContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_code);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(238);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << LETTER) | (1L << DIGIT) | (1L << PLUS) | (1L << FACTOR) | (1L << QWE) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << DOT) | (1L << WS))) != 0)) {
                    {
                        {
                            setState(235);
                            text();
                        }
                    }
                    setState(240);
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
        enterRule(_localctx, 24, RULE_parse_rule);
        int _la;
        try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
                setState(241);
                rule_name();
                setState(245);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == WS) {
                    {
				{
                    setState(242);
                    match(WS);
                }
                    }
                    setState(247);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
			}
                setState(248);
                match(T__2);
                setState(252);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                        setState(249);
                        match(WS);
                    }
                        }
				}
                    setState(254);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
                }
                setState(265);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 33, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(255);
                                rule_helper();
                                setState(256);
                                match(SEMICOLON);
                                setState(260);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
                                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                    if (_alt == 1) {
                                        {
                                            {
                                                setState(257);
                                                match(WS);
                                            }
                                        }
                                    }
                                    setState(262);
                                    _errHandler.sync(this);
                                    _alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
                                }
                            }
                        }
                    }
                    setState(267);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 33, _ctx);
                }
                setState(271);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == WS) {
                    {
				{
                    setState(268);
                    match(WS);
                }
                    }
                    setState(273);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
			}
                setState(274);
                match(T__3);
                setState(278);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == WS) {
                    {
				{
                    setState(275);
                    match(WS);
                }
                    }
                    setState(280);
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u011c\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\6\2 \n\2\r\2\16\2!\3\2\6\2%" +
                    "\n\2\r\2\16\2&\3\2\3\2\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\3\3\3\7\3" +
                    "\65\n\3\f\3\16\38\13\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\5\3C\n" +
                    "\3\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16\4R\13\4" +
                    "\3\4\3\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\5\4]\n\4\3\5\3\5\7\5a\n\5\f\5" +
                    "\16\5d\13\5\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\6\3\6\7\6o\n\6\f\6\16\6" +
                    "r\13\6\3\6\3\6\3\6\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\5\6\177\n\6\3\6" +
                    "\7\6\u0082\n\6\f\6\16\6\u0085\13\6\3\7\7\7\u0088\n\7\f\7\16\7\u008b\13" +
                    "\7\3\7\3\7\7\7\u008f\n\7\f\7\16\7\u0092\13\7\7\7\u0094\n\7\f\7\16\7\u0097" +
                    "\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\t\6\t\u00a1\n\t\r\t\16\t\u00a2" +
                    "\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3" +
                    "\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00c2\n\n\r\n\16\n" +
                    "\u00c3\3\13\7\13\u00c7\n\13\f\13\16\13\u00ca\13\13\3\13\7\13\u00cd\n\13" +
                    "\f\13\16\13\u00d0\13\13\3\13\3\13\7\13\u00d4\n\13\f\13\16\13\u00d7\13" +
                    "\13\3\13\7\13\u00da\n\13\f\13\16\13\u00dd\13\13\3\13\7\13\u00e0\n\13\f" +
                    "\13\16\13\u00e3\13\13\7\13\u00e5\n\13\f\13\16\13\u00e8\13\13\3\f\3\f\3" +
                    "\f\3\f\3\r\7\r\u00ef\n\r\f\r\16\r\u00f2\13\r\3\16\3\16\7\16\u00f6\n\16" +
                    "\f\16\16\16\u00f9\13\16\3\16\3\16\7\16\u00fd\n\16\f\16\16\16\u0100\13" +
                    "\16\3\16\3\16\3\16\7\16\u0105\n\16\f\16\16\16\u0108\13\16\7\16\u010a\n" +
                    "\16\f\16\16\16\u010d\13\16\3\16\7\16\u0110\n\16\f\16\16\16\u0113\13\16" +
                    "\3\16\3\16\7\16\u0117\n\16\f\16\16\16\u011a\13\16\3\16\2\2\17\2\4\6\b" +
                    "\n\f\16\20\22\24\26\30\32\2\4\4\2\b\b\31\31\6\2\5\6\b\b\13!##\u014a\2" +
                    "\34\3\2\2\2\4B\3\2\2\2\6\\\3\2\2\2\b^\3\2\2\2\ne\3\2\2\2\f\u0089\3\2\2" +
                    "\2\16\u009d\3\2\2\2\20\u00a0\3\2\2\2\22\u00c1\3\2\2\2\24\u00e6\3\2\2\2" +
                    "\26\u00e9\3\2\2\2\30\u00f0\3\2\2\2\32\u00f3\3\2\2\2\34\35\5\4\3\2\35\37" +
                    "\5\6\4\2\36 \5\n\6\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"" +
                    "$\3\2\2\2#%\5\32\16\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2" +
                    "\2\2()\7\2\2\3)\3\3\2\2\2*,\7#\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2" +
                    "\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\3\2\2\61\62\7\37\2\2\62\66\7\4\2\2" +
                    "\63\65\7#\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67" +
                    "9\3\2\2\28\66\3\2\2\29:\7\5\2\2:;\5\22\n\2;?\7\6\2\2<>\7#\2\2=<\3\2\2" +
                    "\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2B-\3\2\2\2BC\3\2\2" +
                    "\2C\5\3\2\2\2DF\7#\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2" +
                    "\2IG\3\2\2\2JK\7\3\2\2KL\7\37\2\2LP\7\7\2\2MO\7#\2\2NM\3\2\2\2OR\3\2\2" +
                    "\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\5\2\2TU\5\22\n\2UY\7\6" +
                    "\2\2VX\7#\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2" +
                    "\2\2\\G\3\2\2\2\\]\3\2\2\2]\7\3\2\2\2^b\7\31\2\2_a\t\2\2\2`_\3\2\2\2a" +
                    "d\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\t\3\2\2\2db\3\2\2\2ei\5\b\5\2fh\7#\2\2" +
                    "gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lp\7\t\2\2" +
                    "mo\7#\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2" +
                    "st\7\n\2\2tu\5\f\7\2uv\7\n\2\2vz\7 \2\2wy\7#\2\2xw\3\2\2\2y|\3\2\2\2z" +
                    "x\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}\177\5\26\f\2~}\3\2\2\2~\177\3" +
                    "\2\2\2\177\u0083\3\2\2\2\u0080\u0082\7#\2\2\u0081\u0080\3\2\2\2\u0082" +
                    "\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\13\3\2\2" +
                    "\2\u0085\u0083\3\2\2\2\u0086\u0088\5\16\b\2\u0087\u0086\3\2\2\2\u0088" +
                    "\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0095\3\2" +
                    "\2\2\u008b\u0089\3\2\2\2\u008c\u0090\7\"\2\2\u008d\u008f\5\16\b\2\u008e" +
                    "\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2" +
                    "\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u008c\3\2\2\2\u0094" +
                    "\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\r\3\2\2\2" +
                    "\u0097\u0095\3\2\2\2\u0098\u009e\5\20\t\2\u0099\u009a\7\13\2\2\u009a\u009b" +
                    "\5\f\7\2\u009b\u009c\7\f\2\2\u009c\u009e\3\2\2\2\u009d\u0098\3\2\2\2\u009d" +
                    "\u0099\3\2\2\2\u009e\17\3\2\2\2\u009f\u00a1\t\3\2\2\u00a0\u009f\3\2\2" +
                    "\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\21" +
                    "\3\2\2\2\u00a4\u00c2\7\31\2\2\u00a5\u00c2\7\32\2\2\u00a6\u00c2\7\33\2" +
                    "\2\u00a7\u00c2\7\34\2\2\u00a8\u00c2\7\35\2\2\u00a9\u00c2\7\36\2\2\u00aa" +
                    "\u00c2\7\37\2\2\u00ab\u00c2\7 \2\2\u00ac\u00c2\7!\2\2\u00ad\u00c2\7#\2" +
                    "\2\u00ae\u00c2\7\13\2\2\u00af\u00c2\7\f\2\2\u00b0\u00b1\7\5\2\2\u00b1" +
                    "\u00b2\5\22\n\2\u00b2\u00b3\7\6\2\2\u00b3\u00c2\3\2\2\2\u00b4\u00c2\7" +
                    "\r\2\2\u00b5\u00c2\7\16\2\2\u00b6\u00c2\7\17\2\2\u00b7\u00c2\7\20\2\2" +
                    "\u00b8\u00c2\7\21\2\2\u00b9\u00c2\7\22\2\2\u00ba\u00c2\7\b\2\2\u00bb\u00c2" +
                    "\7\23\2\2\u00bc\u00c2\7\n\2\2\u00bd\u00c2\7\24\2\2\u00be\u00c2\7\25\2" +
                    "\2\u00bf\u00c2\7\27\2\2\u00c0\u00c2\7\30\2\2\u00c1\u00a4\3\2\2\2\u00c1" +
                    "\u00a5\3\2\2\2\u00c1\u00a6\3\2\2\2\u00c1\u00a7\3\2\2\2\u00c1\u00a8\3\2" +
                    "\2\2\u00c1\u00a9\3\2\2\2\u00c1\u00aa\3\2\2\2\u00c1\u00ab\3\2\2\2\u00c1" +
                    "\u00ac\3\2\2\2\u00c1\u00ad\3\2\2\2\u00c1\u00ae\3\2\2\2\u00c1\u00af\3\2" +
                    "\2\2\u00c1\u00b0\3\2\2\2\u00c1\u00b4\3\2\2\2\u00c1\u00b5\3\2\2\2\u00c1" +
                    "\u00b6\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00b9\3\2" +
                    "\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1" +
                    "\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2" +
                    "\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4" +
                    "\23\3\2\2\2\u00c5\u00c7\5\26\f\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2" +
                    "\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ce\3\2\2\2\u00ca\u00c8" +
                    "\3\2\2\2\u00cb\u00cd\7#\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce" +
                    "\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2" +
                    "\2\2\u00d1\u00d5\5\b\5\2\u00d2\u00d4\7#\2\2\u00d3\u00d2\3\2\2\2\u00d4" +
                    "\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00db\3\2" +
                    "\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\5\26\f\2\u00d9\u00d8\3\2\2\2\u00da" +
                    "\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e1\3\2" +
                    "\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\7#\2\2\u00df\u00de\3\2\2\2\u00e0" +
                    "\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2" +
                    "\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00c8\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6" +
                    "\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\25\3\2\2\2\u00e8\u00e6\3\2\2" +
                    "\2\u00e9\u00ea\7\5\2\2\u00ea\u00eb\5\30\r\2\u00eb\u00ec\7\6\2\2\u00ec" +
                    "\27\3\2\2\2\u00ed\u00ef\5\22\n\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2" +
                    "\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\31\3\2\2\2\u00f2\u00f0" +
                    "\3\2\2\2\u00f3\u00f7\5\b\5\2\u00f4\u00f6\7#\2\2\u00f5\u00f4\3\2\2\2\u00f6" +
                    "\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2" +
                    "\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fe\7\5\2\2\u00fb\u00fd\7#\2\2\u00fc" +
                    "\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2" +
                    "\2\2\u00ff\u010b\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\5\24\13\2\u0102" +
                    "\u0106\7 \2\2\u0103\u0105\7#\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2" +
                    "\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106" +
                    "\3\2\2\2\u0109\u0101\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b" +
                    "\u010c\3\2\2\2\u010c\u0111\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\7#" +
                    "\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111" +
                    "\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0118\7\6" +
                    "\2\2\u0115\u0117\7#\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118" +
                    "\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\33\3\2\2\2\u011a\u0118\3\2\2" +
                    "\2&!&-\66?BGPY\\bipz~\u0083\u0089\u0090\u0095\u009d\u00a2\u00c1\u00c3" +
                    "\u00c8\u00ce\u00d5\u00db\u00e1\u00e6\u00f0\u00f7\u00fe\u0106\u010b\u0111" +
                    "\u0118";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}