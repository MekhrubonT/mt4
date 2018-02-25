// Generated from Grammar.g4 by ANTLR 4.5.3
package antlr.generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
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
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

	public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
            "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
            "T__17", "T__18", "T__19", "T__20", "T__21", "LETTER", "DIGIT", "PLUS",
            "FACTOR", "QWE", "COMMA", "COLON", "SEMICOLON", "DOT", "OR", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u0097\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t" +
                    "\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21" +
                    "\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30" +
                    "\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37" +
                    "\3\37\3 \3 \3!\3!\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13" +
                    "\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61" +
                    "\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\5\4\2C\\c|\4\2\61\61^^\5\2" +
                    "\13\f\17\17\"\"\u0096\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2" +
                    "\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25" +
                    "\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2" +
                    "\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2" +
                    "\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3" +
                    "\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2" +
                    "\2\3E\3\2\2\2\5L\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\r^\3\2\2\2" +
                    "\17`\3\2\2\2\21c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31k\3\2\2" +
                    "\2\33m\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#u\3\2\2\2%w\3\2\2\2\'" +
                    "y\3\2\2\2){\3\2\2\2+}\3\2\2\2-\177\3\2\2\2/\u0081\3\2\2\2\61\u0083\3\2" +
                    "\2\2\63\u0085\3\2\2\2\65\u0087\3\2\2\2\67\u0089\3\2\2\29\u008b\3\2\2\2" +
                    ";\u008d\3\2\2\2=\u008f\3\2\2\2?\u0091\3\2\2\2A\u0093\3\2\2\2C\u0095\3" +
                    "\2\2\2EF\7r\2\2FG\7c\2\2GH\7t\2\2HI\7u\2\2IJ\7g\2\2JK\7t\2\2K\4\3\2\2" +
                    "\2LM\7j\2\2MN\7g\2\2NO\7c\2\2OP\7f\2\2PQ\7g\2\2QR\7t\2\2R\6\3\2\2\2ST" +
                    "\7}\2\2T\b\3\2\2\2UV\7\177\2\2V\n\3\2\2\2WX\7o\2\2XY\7g\2\2YZ\7o\2\2Z" +
                    "[\7d\2\2[\\\7g\2\2\\]\7t\2\2]\f\3\2\2\2^_\7a\2\2_\16\3\2\2\2`a\7/\2\2" +
                    "ab\7@\2\2b\20\3\2\2\2cd\7)\2\2d\22\3\2\2\2ef\7*\2\2f\24\3\2\2\2gh\7+\2" +
                    "\2h\26\3\2\2\2ij\7$\2\2j\30\3\2\2\2kl\7?\2\2l\32\3\2\2\2mn\7>\2\2n\34" +
                    "\3\2\2\2op\7@\2\2p\36\3\2\2\2qr\7#\2\2r \3\2\2\2st\7`\2\2t\"\3\2\2\2u" +
                    "v\7A\2\2v$\3\2\2\2wx\7/\2\2x&\3\2\2\2yz\7(\2\2z(\3\2\2\2{|\7&\2\2|*\3" +
                    "\2\2\2}~\7]\2\2~,\3\2\2\2\177\u0080\7_\2\2\u0080.\3\2\2\2\u0081\u0082" +
                    "\t\2\2\2\u0082\60\3\2\2\2\u0083\u0084\4\62;\2\u0084\62\3\2\2\2\u0085\u0086" +
                    "\7-\2\2\u0086\64\3\2\2\2\u0087\u0088\7,\2\2\u0088\66\3\2\2\2\u0089\u008a" +
                    "\t\3\2\2\u008a8\3\2\2\2\u008b\u008c\7.\2\2\u008c:\3\2\2\2\u008d\u008e" +
                    "\7<\2\2\u008e<\3\2\2\2\u008f\u0090\7=\2\2\u0090>\3\2\2\2\u0091\u0092\7" +
                    "\60\2\2\u0092@\3\2\2\2\u0093\u0094\7~\2\2\u0094B\3\2\2\2\u0095\u0096\t" +
                    "\4\2\2\u0096D\3\2\2\2\3\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}