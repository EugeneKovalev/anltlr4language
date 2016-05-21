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
		PRINT_EXP=1, VAR_NUMBER=2, VAR_VECTOR=3, VECTOR=4, NUMBER_TYPE=5, VECTOR_TYPE=6, 
		PRINT=7, STICK=8, L_BR=9, R_BR=10, L_C_BR=11, R_C_BR=12, L_T_BR=13, R_T_BR=14, 
		NUMBER=15, WS=16, ID=17, COMMA=18, SEMICOLON=19, PLUS=20, EQUALS=21, MINUS=22, 
		MULT=23;
	public static final int
		RULE_runProgram = 0, RULE_assign = 1, RULE_print = 2, RULE_calculateVectors = 3, 
		RULE_arythmVectors = 4, RULE_vector = 5, RULE_number = 6;
	public static final String[] ruleNames = {
		"runProgram", "assign", "print", "calculateVectors", "arythmVectors", 
		"vector", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'Number'", "'Vector'", "'print'", "'|'", 
		"'['", "']'", "'('", "')'", "'<'", "'>'", null, null, null, "','", "';'", 
		"'+'", "'='", "'-'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRINT_EXP", "VAR_NUMBER", "VAR_VECTOR", "VECTOR", "NUMBER_TYPE", 
		"VECTOR_TYPE", "PRINT", "STICK", "L_BR", "R_BR", "L_C_BR", "R_C_BR", "L_T_BR", 
		"R_T_BR", "NUMBER", "WS", "ID", "COMMA", "SEMICOLON", "PLUS", "EQUALS", 
		"MINUS", "MULT"
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


		java.util.Hashtable varMap = new java.util.Hashtable();

	public VetrixParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RunProgramContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<CalculateVectorsContext> calculateVectors() {
			return getRuleContexts(CalculateVectorsContext.class);
		}
		public CalculateVectorsContext calculateVectors(int i) {
			return getRuleContext(CalculateVectorsContext.class,i);
		}
		public List<ArythmVectorsContext> arythmVectors() {
			return getRuleContexts(ArythmVectorsContext.class);
		}
		public ArythmVectorsContext arythmVectors(int i) {
			return getRuleContext(ArythmVectorsContext.class,i);
		}
		public List<VectorContext> vector() {
			return getRuleContexts(VectorContext.class);
		}
		public VectorContext vector(int i) {
			return getRuleContext(VectorContext.class,i);
		}
		public RunProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterRunProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitRunProgram(this);
		}
	}

	public final RunProgramContext runProgram() throws RecognitionException {
		RunProgramContext _localctx = new RunProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_runProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_EXP) | (1L << VAR_NUMBER) | (1L << VAR_VECTOR) | (1L << VECTOR) | (1L << STICK) | (1L << L_C_BR) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				setState(20);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(14);
					assign();
					}
					break;
				case 2:
					{
					setState(15);
					number();
					}
					break;
				case 3:
					{
					setState(16);
					print();
					}
					break;
				case 4:
					{
					setState(17);
					calculateVectors();
					}
					break;
				case 5:
					{
					setState(18);
					arythmVectors();
					}
					break;
				case 6:
					{
					setState(19);
					vector();
					}
					break;
				}
				}
				setState(24);
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

	public static class AssignContext extends ParserRuleContext {
		public Double value;
		public Token var;
		public NumberContext num;
		public VectorContext vec;
		public TerminalNode EQUALS() { return getToken(VetrixParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(VetrixParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			((AssignContext)_localctx).var = match(ID);
			setState(26);
			match(EQUALS);
			setState(33);
			switch (_input.LA(1)) {
			case VAR_NUMBER:
			case NUMBER:
				{
				setState(27);
				((AssignContext)_localctx).num = number();

						varMap.put((((AssignContext)_localctx).var!=null?((AssignContext)_localctx).var.getText():null), ((AssignContext)_localctx).num.value);
					
				}
				break;
			case VAR_VECTOR:
			case VECTOR:
			case STICK:
			case L_C_BR:
				{
				setState(30);
				((AssignContext)_localctx).vec = vector();

						varMap.put((((AssignContext)_localctx).var!=null?((AssignContext)_localctx).var.getText():null), ((AssignContext)_localctx).vec.values);
					
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

	public static class PrintContext extends ParserRuleContext {
		public Token exp;
		public TerminalNode PRINT_EXP() { return getToken(VetrixParser.PRINT_EXP, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			((PrintContext)_localctx).exp = match(PRINT_EXP);

					String varName = (((PrintContext)_localctx).exp!=null?((PrintContext)_localctx).exp.getText():null).split("[\\(\\)]")[1];
					try{
						System.out.println((Double)varMap.get(varName));
						}
					catch(Exception ex){
						System.out.println((ArrayList)varMap.get(varName));
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
		enterRule(_localctx, 6, RULE_calculateVectors);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
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
		enterRule(_localctx, 8, RULE_arythmVectors);
		int _la;
		try {
			setState(72);
			switch (_input.LA(1)) {
			case VAR_VECTOR:
			case VECTOR:
			case STICK:
			case L_C_BR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(41);
				((ArythmVectorsContext)_localctx).sum1 = vector();

				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(43);
						match(PLUS);
						setState(44);
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
						setState(47);
						match(MINUS);
						setState(48);
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
						setState(51);
						match(MULT);
						setState(52);
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
						setState(55);
						match(MULT);
						setState(56);
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
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT))) != 0) );
				}
				}
				break;
			case VAR_NUMBER:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(63);
				((ArythmVectorsContext)_localctx).sum5 = number();
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64);
					match(MULT);
					setState(65);
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
					setState(70); 
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

	public static class VectorContext extends ParserRuleContext {
		public List<Double> values;
		public Token input1;
		public Token input2;
		public ArythmVectorsContext exp1;
		public ArythmVectorsContext exp2;
		public Token exp3;
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
		public TerminalNode VAR_VECTOR() { return getToken(VetrixParser.VAR_VECTOR, 0); }
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
		enterRule(_localctx, 10, RULE_vector);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
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
				setState(76);
				match(STICK);
				setState(77);
				((VectorContext)_localctx).input2 = match(VECTOR);
				setState(78);
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
				setState(80);
				match(L_C_BR);
				setState(81);
				((VectorContext)_localctx).exp1 = arythmVectors();
				setState(82);
				match(R_C_BR);
				((VectorContext)_localctx).values =  ((VectorContext)_localctx).exp1.values;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(STICK);
				setState(86);
				match(L_C_BR);
				setState(87);
				((VectorContext)_localctx).exp2 = arythmVectors();
				setState(88);
				match(R_C_BR);
				setState(89);
				match(STICK);

						List<Double> vector = ((VectorContext)_localctx).exp2.values;
						List<Double> moduledValues = new ArrayList<Double>();
						for(int i = 0; i < vector.size(); i++){
							moduledValues.add(Math.abs(vector.get(i)));
						} 
						((VectorContext)_localctx).values =  moduledValues;
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				((VectorContext)_localctx).exp3 = match(VAR_VECTOR);

						String varName = (((VectorContext)_localctx).exp3!=null?((VectorContext)_localctx).exp3.getText():null).split("<Vector")[1].trim();
						varName = varName.split(">")[0];
						((VectorContext)_localctx).values =  (ArrayList)varMap.get(varName);
					
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

	public static class NumberContext extends ParserRuleContext {
		public Double value;
		public Token input1;
		public Token input2;
		public TerminalNode NUMBER() { return getToken(VetrixParser.NUMBER, 0); }
		public TerminalNode VAR_NUMBER() { return getToken(VetrixParser.VAR_NUMBER, 0); }
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
		enterRule(_localctx, 12, RULE_number);
		try {
			setState(100);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((NumberContext)_localctx).input1 = match(NUMBER);

						((NumberContext)_localctx).value =  Double.parseDouble((((NumberContext)_localctx).input1!=null?((NumberContext)_localctx).input1.getText():null));
					
				}
				break;
			case VAR_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				((NumberContext)_localctx).input2 = match(VAR_NUMBER);

						String varName = (((NumberContext)_localctx).input2!=null?((NumberContext)_localctx).input2.getText():null).split("<Number")[1].trim();
						varName = varName.split(">")[0];
						((NumberContext)_localctx).value =  (Double)varMap.get(varName);
					
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31i\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"\27\n\2\f\2\16\2\32\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\6\6>\n\6\r\6\16\6?\3\6\3\6\3\6\3\6\3\6\6\6G\n\6"+
		"\r\6\16\6H\5\6K\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\b\3\b\3\b\3\b\5\bg\n\b\3\b\2"+
		"\2\t\2\4\6\b\n\f\16\2\2s\2\30\3\2\2\2\4\33\3\2\2\2\6%\3\2\2\2\b(\3\2\2"+
		"\2\nJ\3\2\2\2\f`\3\2\2\2\16f\3\2\2\2\20\27\5\4\3\2\21\27\5\16\b\2\22\27"+
		"\5\6\4\2\23\27\5\b\5\2\24\27\5\n\6\2\25\27\5\f\7\2\26\20\3\2\2\2\26\21"+
		"\3\2\2\2\26\22\3\2\2\2\26\23\3\2\2\2\26\24\3\2\2\2\26\25\3\2\2\2\27\32"+
		"\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2\2\32\30\3\2\2\2\33\34"+
		"\7\23\2\2\34#\7\27\2\2\35\36\5\16\b\2\36\37\b\3\1\2\37$\3\2\2\2 !\5\f"+
		"\7\2!\"\b\3\1\2\"$\3\2\2\2#\35\3\2\2\2# \3\2\2\2$\5\3\2\2\2%&\7\3\2\2"+
		"&\'\b\4\1\2\'\7\3\2\2\2()\5\n\6\2)*\b\5\1\2*\t\3\2\2\2+,\5\f\7\2,=\b\6"+
		"\1\2-.\7\26\2\2./\5\f\7\2/\60\b\6\1\2\60>\3\2\2\2\61\62\7\30\2\2\62\63"+
		"\5\f\7\2\63\64\b\6\1\2\64>\3\2\2\2\65\66\7\31\2\2\66\67\5\f\7\2\678\b"+
		"\6\1\28>\3\2\2\29:\7\31\2\2:;\5\16\b\2;<\b\6\1\2<>\3\2\2\2=-\3\2\2\2="+
		"\61\3\2\2\2=\65\3\2\2\2=9\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@K\3\2"+
		"\2\2AF\5\16\b\2BC\7\31\2\2CD\5\f\7\2DE\b\6\1\2EG\3\2\2\2FB\3\2\2\2GH\3"+
		"\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2J+\3\2\2\2JA\3\2\2\2K\13\3\2\2\2L"+
		"M\7\6\2\2Ma\b\7\1\2NO\7\n\2\2OP\7\6\2\2PQ\7\n\2\2Qa\b\7\1\2RS\7\r\2\2"+
		"ST\5\n\6\2TU\7\16\2\2UV\b\7\1\2Va\3\2\2\2WX\7\n\2\2XY\7\r\2\2YZ\5\n\6"+
		"\2Z[\7\16\2\2[\\\7\n\2\2\\]\b\7\1\2]a\3\2\2\2^_\7\5\2\2_a\b\7\1\2`L\3"+
		"\2\2\2`N\3\2\2\2`R\3\2\2\2`W\3\2\2\2`^\3\2\2\2a\r\3\2\2\2bc\7\21\2\2c"+
		"g\b\b\1\2de\7\4\2\2eg\b\b\1\2fb\3\2\2\2fd\3\2\2\2g\17\3\2\2\2\13\26\30"+
		"#=?HJ`f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}