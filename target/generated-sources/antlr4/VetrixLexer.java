// Generated from Vetrix.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VetrixLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PRINT_EXP=2, CONDITION=3, COND_SYMBOL=4, VAR_NUMBER=5, VAR_VECTOR=6, 
		VECTOR=7, NUMBER_TYPE=8, VECTOR_TYPE=9, PRINT=10, STICK=11, L_BR=12, R_BR=13, 
		L_C_BR=14, R_C_BR=15, L_T_BR=16, R_T_BR=17, L_U_BR=18, R_U_BR=19, NUMBER=20, 
		WS=21, ID=22, COMMA=23, SEMICOLON=24, PLUS=25, EQUALS=26, MINUS=27, MULT=28, 
		IF=29, WHILE=30, BULLSHIT=31, BITCHES=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "PRINT_EXP", "CONDITION", "COND_SYMBOL", "VAR_NUMBER", "VAR_VECTOR", 
		"VECTOR", "NUMBER_TYPE", "VECTOR_TYPE", "PRINT", "STICK", "L_BR", "R_BR", 
		"L_C_BR", "R_C_BR", "L_T_BR", "R_T_BR", "L_U_BR", "R_U_BR", "NUMBER", 
		"WS", "ID", "COMMA", "SEMICOLON", "PLUS", "EQUALS", "MINUS", "MULT", "IF", 
		"WHILE", "BULLSHIT", "BITCHES"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'=='", null, null, null, null, null, null, "'Number'", "'Vector'", 
		"'print'", "'|'", "'['", "']'", "'('", "')'", "'<'", "'>'", "'{'", "'}'", 
		null, null, null, "','", "';'", "'+'", "'='", "'-'", "'*'", "'if'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "PRINT_EXP", "CONDITION", "COND_SYMBOL", "VAR_NUMBER", "VAR_VECTOR", 
		"VECTOR", "NUMBER_TYPE", "VECTOR_TYPE", "PRINT", "STICK", "L_BR", "R_BR", 
		"L_C_BR", "R_C_BR", "L_T_BR", "R_T_BR", "L_U_BR", "R_U_BR", "NUMBER", 
		"WS", "ID", "COMMA", "SEMICOLON", "PLUS", "EQUALS", "MINUS", "MULT", "IF", 
		"WHILE", "BULLSHIT", "BITCHES"
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


	public VetrixLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Vetrix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u0129\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\5\5U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\6\bg\n\b\r\b\16\bh\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\5\25\u0095\n\25\3\25\6\25\u0098\n\25\r\25\16\25\u0099\3\25\3\25"+
		"\6\25\u009e\n\25\r\25\16\25\u009f\5\25\u00a2\n\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\7\27\u00aa\n\27\f\27\16\27\u00ad\13\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\6\4\2>"+
		">@@\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\u012f\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5F\3\2\2\2\7K\3\2\2\2\tT\3\2\2\2\13"+
		"V\3\2\2\2\r\\\3\2\2\2\17b\3\2\2\2\21m\3\2\2\2\23t\3\2\2\2\25{\3\2\2\2"+
		"\27\u0081\3\2\2\2\31\u0083\3\2\2\2\33\u0085\3\2\2\2\35\u0087\3\2\2\2\37"+
		"\u0089\3\2\2\2!\u008b\3\2\2\2#\u008d\3\2\2\2%\u008f\3\2\2\2\'\u0091\3"+
		"\2\2\2)\u0094\3\2\2\2+\u00a3\3\2\2\2-\u00a7\3\2\2\2/\u00ae\3\2\2\2\61"+
		"\u00b0\3\2\2\2\63\u00b2\3\2\2\2\65\u00b4\3\2\2\2\67\u00b6\3\2\2\29\u00b8"+
		"\3\2\2\2;\u00ba\3\2\2\2=\u00bd\3\2\2\2?\u00c3\3\2\2\2A\u00e7\3\2\2\2C"+
		"D\7?\2\2DE\7?\2\2E\4\3\2\2\2FG\5\25\13\2GH\5\35\17\2HI\5-\27\2IJ\5\37"+
		"\20\2J\6\3\2\2\2KL\5\35\17\2LM\5)\25\2MN\5\t\5\2NO\5)\25\2OP\5\37\20\2"+
		"P\b\3\2\2\2QU\t\2\2\2RS\7?\2\2SU\7?\2\2TQ\3\2\2\2TR\3\2\2\2U\n\3\2\2\2"+
		"VW\5!\21\2WX\5\21\t\2XY\5+\26\2YZ\5-\27\2Z[\5#\22\2[\f\3\2\2\2\\]\5!\21"+
		"\2]^\5\23\n\2^_\5+\26\2_`\5-\27\2`a\5#\22\2a\16\3\2\2\2bf\5\31\r\2cd\5"+
		")\25\2de\5/\30\2eg\3\2\2\2fc\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3"+
		"\2\2\2jk\5)\25\2kl\5\33\16\2l\20\3\2\2\2mn\7P\2\2no\7w\2\2op\7o\2\2pq"+
		"\7d\2\2qr\7g\2\2rs\7t\2\2s\22\3\2\2\2tu\7X\2\2uv\7g\2\2vw\7e\2\2wx\7v"+
		"\2\2xy\7q\2\2yz\7t\2\2z\24\3\2\2\2{|\7r\2\2|}\7t\2\2}~\7k\2\2~\177\7p"+
		"\2\2\177\u0080\7v\2\2\u0080\26\3\2\2\2\u0081\u0082\7~\2\2\u0082\30\3\2"+
		"\2\2\u0083\u0084\7]\2\2\u0084\32\3\2\2\2\u0085\u0086\7_\2\2\u0086\34\3"+
		"\2\2\2\u0087\u0088\7*\2\2\u0088\36\3\2\2\2\u0089\u008a\7+\2\2\u008a \3"+
		"\2\2\2\u008b\u008c\7>\2\2\u008c\"\3\2\2\2\u008d\u008e\7@\2\2\u008e$\3"+
		"\2\2\2\u008f\u0090\7}\2\2\u0090&\3\2\2\2\u0091\u0092\7\177\2\2\u0092("+
		"\3\2\2\2\u0093\u0095\7/\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0098\4\62;\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a1\3\2\2\2\u009b"+
		"\u009d\7\60\2\2\u009c\u009e\4\62;\2\u009d\u009c\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009b\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2*\3\2\2\2\u00a3\u00a4\t\3\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\26\2\2\u00a6,\3\2\2\2\u00a7\u00ab\t"+
		"\4\2\2\u00a8\u00aa\t\5\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac.\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ae\u00af\7.\2\2\u00af\60\3\2\2\2\u00b0\u00b1\7=\2\2\u00b1\62\3\2\2"+
		"\2\u00b2\u00b3\7-\2\2\u00b3\64\3\2\2\2\u00b4\u00b5\7?\2\2\u00b5\66\3\2"+
		"\2\2\u00b6\u00b7\7/\2\2\u00b78\3\2\2\2\u00b8\u00b9\7,\2\2\u00b9:\3\2\2"+
		"\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7h\2\2\u00bc<\3\2\2\2\u00bd\u00be\7"+
		"y\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2>\3\2\2\2\u00c3\u00c4\5;\36\2\u00c4\u00c5\5\7\4\2\u00c5\u00c6"+
		"\7}\2\2\u00c6\u00c7\7x\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7t\2\2\u00c9"+
		"\u00ca\7\63\2\2\u00ca\u00cb\7\62\2\2\u00cb\u00cc\7?\2\2\u00cc\u00cd\7"+
		"]\2\2\u00cd\u00ce\7\63\2\2\u00ce\u00cf\7.\2\2\u00cf\u00d0\7\64\2\2\u00d0"+
		"\u00d1\7.\2\2\u00d1\u00d2\7\65\2\2\u00d2\u00d3\7.\2\2\u00d3\u00d4\7\66"+
		"\2\2\u00d4\u00d5\7.\2\2\u00d5\u00d6\7\67\2\2\u00d6\u00d7\7_\2\2\u00d7"+
		"\u00d8\7\"\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7t\2"+
		"\2\u00db\u00dc\7\63\2\2\u00dc\u00dd\7\62\2\2\u00dd\u00de\7?\2\2\u00de"+
		"\u00df\7x\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7\63\2"+
		"\2\u00e2\u00e3\7\62\2\2\u00e3\u00e4\7,\2\2\u00e4\u00e5\7\66\2\2\u00e5"+
		"\u00e6\7\177\2\2\u00e6@\3\2\2\2\u00e7\u00e8\5=\37\2\u00e8\u00e9\7*\2\2"+
		"\u00e9\u00ea\7k\2\2\u00ea\u00eb\7?\2\2\u00eb\u00ec\7\62\2\2\u00ec\u00ed"+
		"\7=\2\2\u00ed\u00ee\7\"\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7>\2\2\u00f0"+
		"\u00f1\7\63\2\2\u00f1\u00f2\7\62\2\2\u00f2\u00f3\7=\2\2\u00f3\u00f4\7"+
		"\"\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7-\2\2\u00f6\u00f7\7-\2\2\u00f7"+
		"\u00f8\7+\2\2\u00f8\u00f9\7}\2\2\u00f9\u00fa\7x\2\2\u00fa\u00fb\7c\2\2"+
		"\u00fb\u00fc\7t\2\2\u00fc\u00fd\7\63\2\2\u00fd\u00fe\7\62\2\2\u00fe\u00ff"+
		"\7?\2\2\u00ff\u0100\7]\2\2\u0100\u0101\7\63\2\2\u0101\u0102\7.\2\2\u0102"+
		"\u0103\7\64\2\2\u0103\u0104\7.\2\2\u0104\u0105\7\65\2\2\u0105\u0106\7"+
		".\2\2\u0106\u0107\7\66\2\2\u0107\u0108\7.\2\2\u0108\u0109\7\67\2\2\u0109"+
		"\u010a\7_\2\2\u010a\u010b\7\"\2\2\u010b\u010c\7x\2\2\u010c\u010d\7c\2"+
		"\2\u010d\u010e\7t\2\2\u010e\u010f\79\2\2\u010f\u0110\79\2\2\u0110\u0111"+
		"\79\2\2\u0111\u0112\7?\2\2\u0112\u0113\7x\2\2\u0113\u0114\7c\2\2\u0114"+
		"\u0115\7t\2\2\u0115\u0116\7\63\2\2\u0116\u0117\7\62\2\2\u0117\u0118\7"+
		",\2\2\u0118\u0119\7\67\2\2\u0119\u011a\7\"\2\2\u011a\u011b\7x\2\2\u011b"+
		"\u011c\7c\2\2\u011c\u011d\7t\2\2\u011d\u011e\7\63\2\2\u011e\u011f\7\62"+
		"\2\2\u011f\u0120\7?\2\2\u0120\u0121\7x\2\2\u0121\u0122\7c\2\2\u0122\u0123"+
		"\7t\2\2\u0123\u0124\7\63\2\2\u0124\u0125\7\62\2\2\u0125\u0126\7,\2\2\u0126"+
		"\u0127\7\66\2\2\u0127\u0128\7\177\2\2\u0128B\3\2\2\2\n\2Th\u0094\u0099"+
		"\u009f\u00a1\u00ab\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}