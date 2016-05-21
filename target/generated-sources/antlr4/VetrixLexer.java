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
		PRINT_EXP=1, VECTOR=2, SUMMED_VECTORS=3, PROGRAM=4, START=5, END=6, STICK=7, 
		L_BR=8, R_BR=9, L_C_BR=10, R_C_BR=11, NUMBER=12, WS=13, ID=14, COMMA=15, 
		SEMICOLON=16, VECTOR_TYPE=17, PRINT=18, PLUS=19, EQUALS=20, MINUS=21, 
		MULT=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRINT_EXP", "VECTOR", "SUMMED_VECTORS", "PROGRAM", "START", "END", "STICK", 
		"L_BR", "R_BR", "L_C_BR", "R_C_BR", "NUMBER", "WS", "ID", "COMMA", "SEMICOLON", 
		"VECTOR_TYPE", "PRINT", "PLUS", "EQUALS", "MINUS", "MULT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'start;'", "'end;'", "'|'", "'['", "']'", 
		"'('", "')'", null, null, null, "','", "';'", "'Vector'", "'print'", "'+'", 
		"'='", "'-'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRINT_EXP", "VECTOR", "SUMMED_VECTORS", "PROGRAM", "START", "END", 
		"STICK", "L_BR", "R_BR", "L_C_BR", "R_C_BR", "NUMBER", "WS", "ID", "COMMA", 
		"SEMICOLON", "VECTOR_TYPE", "PRINT", "PLUS", "EQUALS", "MINUS", "MULT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\6\39\n\3\r\3\16\3:\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\6\5F\n\5\r\5\16\5G\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\5\rc\n\r"+
		"\3\r\6\rf\n\r\r\r\16\rg\3\r\3\r\6\rl\n\r\r\r\16\rm\5\rp\n\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\7\17x\n\17\f\17\16\17{\13\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30\3\2\6\2\2\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\u009b\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2"+
		"\5\64\3\2\2\2\7?\3\2\2\2\tC\3\2\2\2\13K\3\2\2\2\rR\3\2\2\2\17W\3\2\2\2"+
		"\21Y\3\2\2\2\23[\3\2\2\2\25]\3\2\2\2\27_\3\2\2\2\31b\3\2\2\2\33q\3\2\2"+
		"\2\35u\3\2\2\2\37|\3\2\2\2!~\3\2\2\2#\u0080\3\2\2\2%\u0087\3\2\2\2\'\u008d"+
		"\3\2\2\2)\u008f\3\2\2\2+\u0091\3\2\2\2-\u0093\3\2\2\2/\60\5%\23\2\60\61"+
		"\5\25\13\2\61\62\5\35\17\2\62\63\5\27\f\2\63\4\3\2\2\2\648\5\21\t\2\65"+
		"\66\5\31\r\2\66\67\5\37\20\2\679\3\2\2\28\65\3\2\2\29:\3\2\2\2:8\3\2\2"+
		"\2:;\3\2\2\2;<\3\2\2\2<=\5\31\r\2=>\5\23\n\2>\6\3\2\2\2?@\5\5\3\2@A\5"+
		"\'\24\2AB\5\5\3\2B\b\3\2\2\2CE\5\13\6\2DF\t\2\2\2ED\3\2\2\2FG\3\2\2\2"+
		"GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\5\r\7\2J\n\3\2\2\2KL\7u\2\2LM\7v\2\2"+
		"MN\7c\2\2NO\7t\2\2OP\7v\2\2PQ\7=\2\2Q\f\3\2\2\2RS\7g\2\2ST\7p\2\2TU\7"+
		"f\2\2UV\7=\2\2V\16\3\2\2\2WX\7~\2\2X\20\3\2\2\2YZ\7]\2\2Z\22\3\2\2\2["+
		"\\\7_\2\2\\\24\3\2\2\2]^\7*\2\2^\26\3\2\2\2_`\7+\2\2`\30\3\2\2\2ac\7/"+
		"\2\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\4\62;\2ed\3\2\2\2fg\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2ho\3\2\2\2ik\7\60\2\2jl\4\62;\2kj\3\2\2\2lm\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2np\3\2\2\2oi\3\2\2\2op\3\2\2\2p\32\3\2\2\2qr\t\3\2\2r"+
		"s\3\2\2\2st\b\16\2\2t\34\3\2\2\2uy\t\4\2\2vx\t\5\2\2wv\3\2\2\2x{\3\2\2"+
		"\2yw\3\2\2\2yz\3\2\2\2z\36\3\2\2\2{y\3\2\2\2|}\7.\2\2} \3\2\2\2~\177\7"+
		"=\2\2\177\"\3\2\2\2\u0080\u0081\7X\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7e\2\2\u0083\u0084\7v\2\2\u0084\u0085\7q\2\2\u0085\u0086\7t\2\2\u0086"+
		"$\3\2\2\2\u0087\u0088\7r\2\2\u0088\u0089\7t\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c&\3\2\2\2\u008d\u008e\7-\2\2\u008e"+
		"(\3\2\2\2\u008f\u0090\7?\2\2\u0090*\3\2\2\2\u0091\u0092\7/\2\2\u0092,"+
		"\3\2\2\2\u0093\u0094\7,\2\2\u0094.\3\2\2\2\n\2:Gbgmoy\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}