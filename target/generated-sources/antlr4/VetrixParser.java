// Generated from Vetrix.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VetrixParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VECTOR=1, SUMMED_VECTORS=2, STICK=3, L_BR=4, R_BR=5, L_C_BR=6, R_C_BR=7, 
		NUMBER=8, WS=9, ID=10, COMMA=11, SEMICOLON=12, VECTOR_TYPE=13, PRINT=14, 
		PLUS=15, EQUALS=16, MINUS=17, MULT=18;
	public static final int
		RULE_calculateVectors = 0, RULE_arythmVectors = 1, RULE_number = 2, RULE_vector = 3;
	public static final String[] ruleNames = {
		"calculateVectors", "arythmVectors", "number", "vector"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'|'", "'['", "']'", "'('", "')'", null, null, null, 
		"','", "';'", "'Vector'", "'print'", "'+'", "'='", "'-'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VECTOR", "SUMMED_VECTORS", "STICK", "L_BR", "R_BR", "L_C_BR", "R_C_BR", 
		"NUMBER", "WS", "ID", "COMMA", "SEMICOLON", "VECTOR_TYPE", "PRINT", "PLUS", 
		"EQUALS", "MINUS", "MULT"
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
	public String getGrammarFileName() { return "Vetrix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VetrixParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CalculateVectorsContext extends ParserRuleContext {
		public List<Double> values;
		public ArythmVectorsContext exp;
		public ArythmVectorsContext arythmVectors() {
			return getRuleContext(ArythmVectorsContext.class,0);
		}
		public CalculateVectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculateVectors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterCalculateVectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitCalculateVectors(this);
		}
	}

	public final CalculateVectorsContext calculateVectors() throws RecognitionException {
		CalculateVectorsContext _localctx = new CalculateVectorsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calculateVectors);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((CalculateVectorsContext)_localctx).exp = arythmVectors();
			((CalculateVectorsContext)_localctx).values =  ((CalculateVectorsContext)_localctx).exp.values;
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

	public static class ArythmVectorsContext extends ParserRuleContext {
		public List<Double> values;
		public VectorContext sum1;
		public VectorContext sum2;
		public NumberContext sum3;
		public NumberContext sum5;
		public VectorContext sum6;
		public List<VectorContext> vector() {
			return getRuleContexts(VectorContext.class);
		}
		public VectorContext vector(int i) {
			return getRuleContext(VectorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(VetrixParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(VetrixParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(VetrixParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(VetrixParser.MINUS, i);
		}
		public List<TerminalNode> MULT() { return getTokens(VetrixParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(VetrixParser.MULT, i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ArythmVectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arythmVectors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterArythmVectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitArythmVectors(this);
		}
	}

	public final ArythmVectorsContext arythmVectors() throws RecognitionException {
		ArythmVectorsContext _localctx = new ArythmVectorsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_arythmVectors);
		int _la;
		try {
			setState(42);
			switch (_input.LA(1)) {
			case VECTOR:
			case STICK:
			case L_C_BR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(11);
				((ArythmVectorsContext)_localctx).sum1 = vector();

				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(29);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(13);
						match(PLUS);
						setState(14);
						((ArythmVectorsContext)_localctx).sum2 = vector();

						         	List<Double> vector1 = ((ArythmVectorsContext)_localctx).sum1.values;
						         	List<Double> vector2 = ((ArythmVectorsContext)_localctx).sum2.values;
						         	List<Double> summary = new ArrayList<Double>();
						         	for(int i = 0; i < vector2.size(); i++){
						         		summary.add(vector1.get(i) + vector2.get(i));
						         	}
						         	((ArythmVectorsContext)_localctx).values =  summary;
						         
						}
						break;
					case 2:
						{
						setState(17);
						match(MINUS);
						setState(18);
						((ArythmVectorsContext)_localctx).sum2 = vector();

						         	List<Double> vector1 = ((ArythmVectorsContext)_localctx).sum1.values;
						         	List<Double> vector2 = ((ArythmVectorsContext)_localctx).sum2.values;
						         	List<Double> subtraction = new ArrayList<Double>();
						         	for(int i = 0; i < vector2.size(); i++){
						         		subtraction.add(vector1.get(i) - vector2.get(i));
						         	}
						         	((ArythmVectorsContext)_localctx).values =  subtraction;
						         
						}
						break;
					case 3:
						{
						setState(21);
						match(MULT);
						setState(22);
						((ArythmVectorsContext)_localctx).sum2 = vector();

						         	List<Double> vector1 = ((ArythmVectorsContext)_localctx).sum1.values;
						         	List<Double> vector2 = ((ArythmVectorsContext)_localctx).sum2.values;
						         	List<Double> summary = new ArrayList<Double>();
						         	for(int i = 0; i < vector2.size(); i++){
						         		summary.add(vector1.get(i) * vector2.get(i));
						         	}
						         	((ArythmVectorsContext)_localctx).values =  summary;
						         
						}
						break;
					case 4:
						{
						setState(25);
						match(MULT);
						setState(26);
						((ArythmVectorsContext)_localctx).sum3 = number();

						         	List<Double> vector1 = ((ArythmVectorsContext)_localctx).sum1.values;
						         	Double number = ((ArythmVectorsContext)_localctx).sum3.value;
						         	//if(vector1.size() != vector2.size()){ throw new EmptyStackException(); }
						         	List<Double> multiplication = new ArrayList<Double>();
						         	for(int i = 0; i < vector1.size(); i++){
						         		multiplication.add(vector1.get(i) * number);
						         	}
						         	((ArythmVectorsContext)_localctx).values =  multiplication;
						         
						}
						break;
					}
					}
					setState(31); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT))) != 0) );
				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(33);
				((ArythmVectorsContext)_localctx).sum5 = number();
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					match(MULT);
					setState(35);
					((ArythmVectorsContext)_localctx).sum6 = vector();

					         		Double number = ((ArythmVectorsContext)_localctx).sum5.value;
						         	List<Double> vector1 = ((ArythmVectorsContext)_localctx).sum6.values;
						         	//if(vector1.size() != vector2.size()){ throw new EmptyStackException(); }
						         	List<Double> multiplication = new ArrayList<Double>();
						         	for(int i = 0; i < vector1.size(); i++){
						         		multiplication.add(vector1.get(i) * number);
						         	}
						         	((ArythmVectorsContext)_localctx).values =  multiplication;
					         	
					}
					}
					setState(40); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MULT );
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumberContext extends ParserRuleContext {
		public Double value;
		public Token input;
		public TerminalNode NUMBER() { return getToken(VetrixParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((NumberContext)_localctx).input = match(NUMBER);

					String input = (((NumberContext)_localctx).input!=null?((NumberContext)_localctx).input.getText():null);
					((NumberContext)_localctx).value =  Double.parseDouble(input);
				
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

	public static class VectorContext extends ParserRuleContext {
		public List<Double> values;
		public Token input1;
		public Token input2;
		public ArythmVectorsContext exp1;
		public ArythmVectorsContext exp2;
		public TerminalNode VECTOR() { return getToken(VetrixParser.VECTOR, 0); }
		public List<TerminalNode> STICK() { return getTokens(VetrixParser.STICK); }
		public TerminalNode STICK(int i) {
			return getToken(VetrixParser.STICK, i);
		}
		public TerminalNode L_C_BR() { return getToken(VetrixParser.L_C_BR, 0); }
		public TerminalNode R_C_BR() { return getToken(VetrixParser.R_C_BR, 0); }
		public ArythmVectorsContext arythmVectors() {
			return getRuleContext(ArythmVectorsContext.class,0);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vector);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				((VectorContext)_localctx).input1 = match(VECTOR);

						String input = (((VectorContext)_localctx).input1!=null?((VectorContext)_localctx).input1.getText():null);
						input = input.substring(1, input.length() - 1);
						String[] numbers = input.split(",");
						List<Double> list = new ArrayList<Double>();
						for(int i = 0; i < numbers.length; i++){
							list.add(Double.parseDouble(numbers[i]));
						}
						((VectorContext)_localctx).values =  list;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(STICK);
				setState(50);
				((VectorContext)_localctx).input2 = match(VECTOR);
				setState(51);
				match(STICK);

						String input = (((VectorContext)_localctx).input2!=null?((VectorContext)_localctx).input2.getText():null);
						input = input.substring(1, input.length() - 1);
						String[] numbers = input.split(",");
						List<Double> list = new ArrayList<Double>();
						for(int i = 0; i < numbers.length; i++){
							list.add(Math.abs(Double.parseDouble(numbers[i])));
						}
						((VectorContext)_localctx).values =  list;
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(L_C_BR);
				setState(54);
				((VectorContext)_localctx).exp1 = arythmVectors();
				setState(55);
				match(R_C_BR);
				((VectorContext)_localctx).values =  ((VectorContext)_localctx).exp1.values;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(STICK);
				setState(59);
				match(L_C_BR);
				setState(60);
				((VectorContext)_localctx).exp2 = arythmVectors();
				setState(61);
				match(R_C_BR);
				setState(62);
				match(STICK);

						List<Double> vector = ((VectorContext)_localctx).exp2.values;
						List<Double> moduledValues = new ArrayList<Double>();
						for(int i = 0; i < vector.size(); i++){
							moduledValues.add(Math.abs(vector.get(i)));
						} 
						((VectorContext)_localctx).values =  moduledValues;
					
				}
				break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3 \n\3\r\3\16\3!\3\3\3\3\3\3\3\3\3"+
		"\3\6\3)\n\3\r\3\16\3*\5\3-\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5\3\5\2\2\6\2\4\6"+
		"\b\2\2J\2\n\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\bC\3\2\2\2\n\13\5\4\3\2\13\f"+
		"\b\2\1\2\f\3\3\2\2\2\r\16\5\b\5\2\16\37\b\3\1\2\17\20\7\21\2\2\20\21\5"+
		"\b\5\2\21\22\b\3\1\2\22 \3\2\2\2\23\24\7\23\2\2\24\25\5\b\5\2\25\26\b"+
		"\3\1\2\26 \3\2\2\2\27\30\7\24\2\2\30\31\5\b\5\2\31\32\b\3\1\2\32 \3\2"+
		"\2\2\33\34\7\24\2\2\34\35\5\6\4\2\35\36\b\3\1\2\36 \3\2\2\2\37\17\3\2"+
		"\2\2\37\23\3\2\2\2\37\27\3\2\2\2\37\33\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!"+
		"\"\3\2\2\2\"-\3\2\2\2#(\5\6\4\2$%\7\24\2\2%&\5\b\5\2&\'\b\3\1\2\')\3\2"+
		"\2\2($\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,\r\3\2\2\2,#\3"+
		"\2\2\2-\5\3\2\2\2./\7\n\2\2/\60\b\4\1\2\60\7\3\2\2\2\61\62\7\3\2\2\62"+
		"D\b\5\1\2\63\64\7\5\2\2\64\65\7\3\2\2\65\66\7\5\2\2\66D\b\5\1\2\678\7"+
		"\b\2\289\5\4\3\29:\7\t\2\2:;\b\5\1\2;D\3\2\2\2<=\7\5\2\2=>\7\b\2\2>?\5"+
		"\4\3\2?@\7\t\2\2@A\7\5\2\2AB\b\5\1\2BD\3\2\2\2C\61\3\2\2\2C\63\3\2\2\2"+
		"C\67\3\2\2\2C<\3\2\2\2D\t\3\2\2\2\7\37!*,C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}