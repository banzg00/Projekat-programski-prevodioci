// Generated from miniCSharp.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniCSharpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAMESPACE=1, CLASS=2, ACCESSOR=3, IF=4, ELSE=5, RETURN=6, TYPE=7, LPAREN=8, 
		RPAREN=9, LBRACKET=10, RBRACKET=11, SEMICOLON=12, ASSIGN=13, RELOP=14, 
		AROP=15, ID=16, LONG_NUMBER=17, INT_NUMBER=18, WHITESPACE=19, COMMENT=20, 
		ANY=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NAMESPACE", "CLASS", "ACCESSOR", "IF", "ELSE", "RETURN", "TYPE", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "SEMICOLON", "ASSIGN", "RELOP", "AROP", 
			"ID", "LONG_NUMBER", "INT_NUMBER", "WHITESPACE", "COMMENT", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'namespace'", "'class'", null, "'if'", "'else'", "'return'", null, 
			"'('", "')'", "'{'", "'}'", "';'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAMESPACE", "CLASS", "ACCESSOR", "IF", "ELSE", "RETURN", "TYPE", 
			"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "SEMICOLON", "ASSIGN", "RELOP", 
			"AROP", "ID", "LONG_NUMBER", "INT_NUMBER", "WHITESPACE", "COMMENT", "ANY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public miniCSharpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miniCSharp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4T\n\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0083\n\17"+
		"\3\20\3\20\3\21\3\21\7\21\u0089\n\21\f\21\16\21\u008c\13\21\3\22\5\22"+
		"\u008f\n\22\3\22\6\22\u0092\n\22\r\22\16\22\u0093\3\22\3\22\3\23\5\23"+
		"\u0099\n\23\3\23\6\23\u009c\n\23\r\23\16\23\u009d\3\24\6\24\u00a1\n\24"+
		"\r\24\16\24\u00a2\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00ab\n\25\f\25\16"+
		"\25\u00ae\13\25\3\25\3\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27\3\2\n\4\2>>@@\4\2--//\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2NNnn\5\2\13"+
		"\f\17\17\"\"\4\2\f\f\17\17\2\u00c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\3-\3\2\2\2\5\67\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13X\3\2\2"+
		"\2\r]\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2\23o\3\2\2\2\25q\3\2\2\2\27s\3\2"+
		"\2\2\31u\3\2\2\2\33w\3\2\2\2\35\u0082\3\2\2\2\37\u0084\3\2\2\2!\u0086"+
		"\3\2\2\2#\u008e\3\2\2\2%\u0098\3\2\2\2\'\u00a0\3\2\2\2)\u00a6\3\2\2\2"+
		"+\u00b1\3\2\2\2-.\7p\2\2./\7c\2\2/\60\7o\2\2\60\61\7g\2\2\61\62\7u\2\2"+
		"\62\63\7r\2\2\63\64\7c\2\2\64\65\7e\2\2\65\66\7g\2\2\66\4\3\2\2\2\678"+
		"\7e\2\289\7n\2\29:\7c\2\2:;\7u\2\2;<\7u\2\2<\6\3\2\2\2=>\7r\2\2>?\7w\2"+
		"\2?@\7d\2\2@A\7n\2\2AB\7k\2\2BT\7e\2\2CD\7r\2\2DE\7t\2\2EF\7k\2\2FG\7"+
		"x\2\2GH\7c\2\2HI\7v\2\2IT\7g\2\2JK\7r\2\2KL\7t\2\2LM\7q\2\2MN\7v\2\2N"+
		"O\7g\2\2OP\7e\2\2PQ\7v\2\2QR\7g\2\2RT\7f\2\2S=\3\2\2\2SC\3\2\2\2SJ\3\2"+
		"\2\2T\b\3\2\2\2UV\7k\2\2VW\7h\2\2W\n\3\2\2\2XY\7g\2\2YZ\7n\2\2Z[\7u\2"+
		"\2[\\\7g\2\2\\\f\3\2\2\2]^\7t\2\2^_\7g\2\2_`\7v\2\2`a\7w\2\2ab\7t\2\2"+
		"bc\7p\2\2c\16\3\2\2\2de\7k\2\2ef\7p\2\2fl\7v\2\2gh\7n\2\2hi\7q\2\2ij\7"+
		"p\2\2jl\7i\2\2kd\3\2\2\2kg\3\2\2\2l\20\3\2\2\2mn\7*\2\2n\22\3\2\2\2op"+
		"\7+\2\2p\24\3\2\2\2qr\7}\2\2r\26\3\2\2\2st\7\177\2\2t\30\3\2\2\2uv\7="+
		"\2\2v\32\3\2\2\2wx\7?\2\2x\34\3\2\2\2y\u0083\t\2\2\2z{\7?\2\2{\u0083\7"+
		"?\2\2|}\7>\2\2}\u0083\7?\2\2~\177\7@\2\2\177\u0083\7?\2\2\u0080\u0081"+
		"\7#\2\2\u0081\u0083\7?\2\2\u0082y\3\2\2\2\u0082z\3\2\2\2\u0082|\3\2\2"+
		"\2\u0082~\3\2\2\2\u0082\u0080\3\2\2\2\u0083\36\3\2\2\2\u0084\u0085\t\3"+
		"\2\2\u0085 \3\2\2\2\u0086\u008a\t\4\2\2\u0087\u0089\t\5\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\t\3\2\2\u008e\u008d\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u0092\t\6\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\t\7\2\2\u0096$\3\2\2\2\u0097\u0099\t\3\2\2"+
		"\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c"+
		"\t\6\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e&\3\2\2\2\u009f\u00a1\t\b\2\2\u00a0\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a5\b\24\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7"+
		"\u00a8\7\61\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ab\n\t\2\2\u00aa\u00a9\3"+
		"\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\b\25\2\2\u00b0*\3\2\2\2"+
		"\u00b1\u00b2\13\2\2\2\u00b2,\3\2\2\2\r\2Sk\u0082\u008a\u008e\u0093\u0098"+
		"\u009d\u00a2\u00ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}