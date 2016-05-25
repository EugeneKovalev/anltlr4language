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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PRINT_EXP=7, CONDITION=8, 
		COND_SYMBOL=9, VAR_NUMBER=10, VAR_VECTOR=11, VECTOR=12, NUMBER_TYPE=13, 
		VECTOR_TYPE=14, PRINT=15, STICK=16, L_BR=17, R_BR=18, L_C_BR=19, R_C_BR=20, 
		L_T_BR=21, R_T_BR=22, L_U_BR=23, R_U_BR=24, NUMBER=25, WS=26, ID=27, COMMA=28, 
		SEMICOLON=29, PLUS=30, EQUALS=31, MINUS=32, MULT=33, IF=34, WHILE=35, 
		NL=36, BULLSHIT=37, BITCHES=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "PRINT_EXP", "CONDITION", 
		"COND_SYMBOL", "VAR_NUMBER", "VAR_VECTOR", "VECTOR", "NUMBER_TYPE", "VECTOR_TYPE", 
		"PRINT", "STICK", "L_BR", "R_BR", "L_C_BR", "R_C_BR", "L_T_BR", "R_T_BR", 
		"L_U_BR", "R_U_BR", "NUMBER", "WS", "ID", "COMMA", "SEMICOLON", "PLUS", 
		"EQUALS", "MINUS", "MULT", "IF", "WHILE", "NL", "BULLSHIT", "BITCHES"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'=='", "'Function -'", "':'", "'Start:'", "'Return:'", "'.'", null, 
		null, null, null, null, null, "'Number'", "'Vector'", "'print'", "'|'", 
		"'['", "']'", "'('", "')'", "'<'", "'>'", "'{'", "'}'", null, null, null, 
		"','", "';'", "'+'", "'='", "'-'", "'*'", "'if'", "'while'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "PRINT_EXP", "CONDITION", "COND_SYMBOL", 
		"VAR_NUMBER", "VAR_VECTOR", "VECTOR", "NUMBER_TYPE", "VECTOR_TYPE", "PRINT", 
		"STICK", "L_BR", "R_BR", "L_C_BR", "R_C_BR", "L_T_BR", "R_T_BR", "L_U_BR", 
		"R_U_BR", "NUMBER", "WS", "ID", "COMMA", "SEMICOLON", "PLUS", "EQUALS", 
		"MINUS", "MULT", "IF", "WHILE", "NL", "BULLSHIT", "BITCHES"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u0155\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\6\r\u0091\n\r\r\r\16\r\u0092\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\5\32\u00bf"+
		"\n\32\3\32\6\32\u00c2\n\32\r\32\16\32\u00c3\3\32\3\32\6\32\u00c8\n\32"+
		"\r\32\16\32\u00c9\5\32\u00cc\n\32\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u00d4"+
		"\n\34\f\34\16\34\u00d7\13\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\2\2"+
		"(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(\3\2\6\4\2>>@@\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62"+
		";C\\aac|\u015b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5R\3\2\2"+
		"\2\7]\3\2\2\2\t_\3\2\2\2\13f\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2\21u\3\2\2"+
		"\2\23~\3\2\2\2\25\u0080\3\2\2\2\27\u0086\3\2\2\2\31\u008c\3\2\2\2\33\u0097"+
		"\3\2\2\2\35\u009e\3\2\2\2\37\u00a5\3\2\2\2!\u00ab\3\2\2\2#\u00ad\3\2\2"+
		"\2%\u00af\3\2\2\2\'\u00b1\3\2\2\2)\u00b3\3\2\2\2+\u00b5\3\2\2\2-\u00b7"+
		"\3\2\2\2/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63\u00be\3\2\2\2\65\u00cd\3\2"+
		"\2\2\67\u00d1\3\2\2\29\u00d8\3\2\2\2;\u00da\3\2\2\2=\u00dc\3\2\2\2?\u00de"+
		"\3\2\2\2A\u00e0\3\2\2\2C\u00e2\3\2\2\2E\u00e4\3\2\2\2G\u00e7\3\2\2\2I"+
		"\u00ed\3\2\2\2K\u00ef\3\2\2\2M\u0113\3\2\2\2OP\7?\2\2PQ\7?\2\2Q\4\3\2"+
		"\2\2RS\7H\2\2ST\7w\2\2TU\7p\2\2UV\7e\2\2VW\7v\2\2WX\7k\2\2XY\7q\2\2YZ"+
		"\7p\2\2Z[\7\"\2\2[\\\7/\2\2\\\6\3\2\2\2]^\7<\2\2^\b\3\2\2\2_`\7U\2\2`"+
		"a\7v\2\2ab\7c\2\2bc\7t\2\2cd\7v\2\2de\7<\2\2e\n\3\2\2\2fg\7T\2\2gh\7g"+
		"\2\2hi\7v\2\2ij\7w\2\2jk\7t\2\2kl\7p\2\2lm\7<\2\2m\f\3\2\2\2no\7\60\2"+
		"\2o\16\3\2\2\2pq\5\37\20\2qr\5\'\24\2rs\5\67\34\2st\5)\25\2t\20\3\2\2"+
		"\2uv\5\'\24\2vw\5\63\32\2wx\5\23\n\2xy\5\63\32\2yz\5)\25\2z\22\3\2\2\2"+
		"{\177\t\2\2\2|}\7?\2\2}\177\7?\2\2~{\3\2\2\2~|\3\2\2\2\177\24\3\2\2\2"+
		"\u0080\u0081\5+\26\2\u0081\u0082\5\33\16\2\u0082\u0083\5\65\33\2\u0083"+
		"\u0084\5\67\34\2\u0084\u0085\5-\27\2\u0085\26\3\2\2\2\u0086\u0087\5+\26"+
		"\2\u0087\u0088\5\35\17\2\u0088\u0089\5\65\33\2\u0089\u008a\5\67\34\2\u008a"+
		"\u008b\5-\27\2\u008b\30\3\2\2\2\u008c\u0090\5#\22\2\u008d\u008e\5\63\32"+
		"\2\u008e\u008f\59\35\2\u008f\u0091\3\2\2\2\u0090\u008d\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\5\63\32\2\u0095\u0096\5%\23\2\u0096\32\3\2\2\2\u0097\u0098\7P\2"+
		"\2\u0098\u0099\7w\2\2\u0099\u009a\7o\2\2\u009a\u009b\7d\2\2\u009b\u009c"+
		"\7g\2\2\u009c\u009d\7t\2\2\u009d\34\3\2\2\2\u009e\u009f\7X\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7q\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa \3\2\2\2\u00ab"+
		"\u00ac\7~\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7]\2\2\u00ae$\3\2\2\2\u00af"+
		"\u00b0\7_\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7*\2\2\u00b2(\3\2\2\2\u00b3\u00b4"+
		"\7+\2\2\u00b4*\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7"+
		"@\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7}\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7"+
		"\177\2\2\u00bc\62\3\2\2\2\u00bd\u00bf\7/\2\2\u00be\u00bd\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2\4\62;\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00cb\3\2\2\2\u00c5\u00c7\7\60\2\2\u00c6\u00c8\4\62;\2\u00c7\u00c6\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\64\3\2\2"+
		"\2\u00cd\u00ce\t\3\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\33\2\2\u00d0"+
		"\66\3\2\2\2\u00d1\u00d5\t\4\2\2\u00d2\u00d4\t\5\2\2\u00d3\u00d2\3\2\2"+
		"\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d68"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9:\3\2\2\2\u00da\u00db"+
		"\7=\2\2\u00db<\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd>\3\2\2\2\u00de\u00df\7"+
		"?\2\2\u00df@\3\2\2\2\u00e0\u00e1\7/\2\2\u00e1B\3\2\2\2\u00e2\u00e3\7,"+
		"\2\2\u00e3D\3\2\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7h\2\2\u00e6F\3\2\2"+
		"\2\u00e7\u00e8\7y\2\2\u00e8\u00e9\7j\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb"+
		"\7n\2\2\u00eb\u00ec\7g\2\2\u00ecH\3\2\2\2\u00ed\u00ee\7\f\2\2\u00eeJ\3"+
		"\2\2\2\u00ef\u00f0\5E#\2\u00f0\u00f1\5\21\t\2\u00f1\u00f2\7}\2\2\u00f2"+
		"\u00f3\7x\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7\63\2"+
		"\2\u00f6\u00f7\7\62\2\2\u00f7\u00f8\7?\2\2\u00f8\u00f9\7]\2\2\u00f9\u00fa"+
		"\7\63\2\2\u00fa\u00fb\7.\2\2\u00fb\u00fc\7\64\2\2\u00fc\u00fd\7.\2\2\u00fd"+
		"\u00fe\7\65\2\2\u00fe\u00ff\7.\2\2\u00ff\u0100\7\66\2\2\u0100\u0101\7"+
		".\2\2\u0101\u0102\7\67\2\2\u0102\u0103\7_\2\2\u0103\u0104\7\"\2\2\u0104"+
		"\u0105\7x\2\2\u0105\u0106\7c\2\2\u0106\u0107\7t\2\2\u0107\u0108\7\63\2"+
		"\2\u0108\u0109\7\62\2\2\u0109\u010a\7?\2\2\u010a\u010b\7x\2\2\u010b\u010c"+
		"\7c\2\2\u010c\u010d\7t\2\2\u010d\u010e\7\63\2\2\u010e\u010f\7\62\2\2\u010f"+
		"\u0110\7,\2\2\u0110\u0111\7\66\2\2\u0111\u0112\7\177\2\2\u0112L\3\2\2"+
		"\2\u0113\u0114\5G$\2\u0114\u0115\7*\2\2\u0115\u0116\7k\2\2\u0116\u0117"+
		"\7?\2\2\u0117\u0118\7\62\2\2\u0118\u0119\7=\2\2\u0119\u011a\7\"\2\2\u011a"+
		"\u011b\7k\2\2\u011b\u011c\7>\2\2\u011c\u011d\7\63\2\2\u011d\u011e\7\62"+
		"\2\2\u011e\u011f\7=\2\2\u011f\u0120\7\"\2\2\u0120\u0121\7k\2\2\u0121\u0122"+
		"\7-\2\2\u0122\u0123\7-\2\2\u0123\u0124\7+\2\2\u0124\u0125\7}\2\2\u0125"+
		"\u0126\7x\2\2\u0126\u0127\7c\2\2\u0127\u0128\7t\2\2\u0128\u0129\7\63\2"+
		"\2\u0129\u012a\7\62\2\2\u012a\u012b\7?\2\2\u012b\u012c\7]\2\2\u012c\u012d"+
		"\7\63\2\2\u012d\u012e\7.\2\2\u012e\u012f\7\64\2\2\u012f\u0130\7.\2\2\u0130"+
		"\u0131\7\65\2\2\u0131\u0132\7.\2\2\u0132\u0133\7\66\2\2\u0133\u0134\7"+
		".\2\2\u0134\u0135\7\67\2\2\u0135\u0136\7_\2\2\u0136\u0137\7\"\2\2\u0137"+
		"\u0138\7x\2\2\u0138\u0139\7c\2\2\u0139\u013a\7t\2\2\u013a\u013b\79\2\2"+
		"\u013b\u013c\79\2\2\u013c\u013d\79\2\2\u013d\u013e\7?\2\2\u013e\u013f"+
		"\7x\2\2\u013f\u0140\7c\2\2\u0140\u0141\7t\2\2\u0141\u0142\7\63\2\2\u0142"+
		"\u0143\7\62\2\2\u0143\u0144\7,\2\2\u0144\u0145\7\67\2\2\u0145\u0146\7"+
		"\"\2\2\u0146\u0147\7x\2\2\u0147\u0148\7c\2\2\u0148\u0149\7t\2\2\u0149"+
		"\u014a\7\63\2\2\u014a\u014b\7\62\2\2\u014b\u014c\7?\2\2\u014c\u014d\7"+
		"x\2\2\u014d\u014e\7c\2\2\u014e\u014f\7t\2\2\u014f\u0150\7\63\2\2\u0150"+
		"\u0151\7\62\2\2\u0151\u0152\7,\2\2\u0152\u0153\7\66\2\2\u0153\u0154\7"+
		"\177\2\2\u0154N\3\2\2\2\n\2~\u0092\u00be\u00c3\u00c9\u00cb\u00d5\3\2\3"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}