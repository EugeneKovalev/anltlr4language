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
		T__0=1, PRINT_EXP=2, CONDITION=3, COND_SYMBOL=4, VAR_NUMBER=5, VAR_VECTOR=6, 
		VECTOR=7, NUMBER_TYPE=8, VECTOR_TYPE=9, PRINT=10, STICK=11, L_BR=12, R_BR=13, 
		L_C_BR=14, R_C_BR=15, L_T_BR=16, R_T_BR=17, L_U_BR=18, R_U_BR=19, NUMBER=20, 
		WS=21, ID=22, COMMA=23, SEMICOLON=24, PLUS=25, EQUALS=26, MINUS=27, MULT=28, 
		IF=29, WHILE=30, BULLSHIT=31, BITCHES=32;
	public static final int
		RULE_runProgram = 0, RULE_assign = 1, RULE_print = 2, RULE_calculateVectors = 3, 
		RULE_arythmVectors = 4, RULE_vector = 5, RULE_number = 6, RULE_bool_var = 7, 
		RULE_if_condition = 8, RULE_while_condition = 9;
	public static final String[] ruleNames = {
		"runProgram", "assign", "print", "calculateVectors", "arythmVectors", 
		"vector", "number", "bool_var", "if_condition", "while_condition"
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

	@Override
	public String getGrammarFileName() { return "Vetrix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		java.util.Hashtable varMap = new java.util.Hashtable();
		public class FooException extends Exception {
		public FooException() { super(); }
		public FooException(String message) { super(message); System.out.println(message);}
		public FooException(String message, Throwable cause) { super(message, cause); }
		public FooException(Throwable cause) { super(cause); }
	}

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
		public List<If_conditionContext> if_condition() {
			return getRuleContexts(If_conditionContext.class);
		}
		public If_conditionContext if_condition(int i) {
			return getRuleContext(If_conditionContext.class,i);
		}
		public List<While_conditionContext> while_condition() {
			return getRuleContexts(While_conditionContext.class);
		}
		public While_conditionContext while_condition(int i) {
			return getRuleContext(While_conditionContext.class,i);
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
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_EXP) | (1L << VAR_NUMBER) | (1L << VAR_VECTOR) | (1L << VECTOR) | (1L << STICK) | (1L << L_C_BR) | (1L << NUMBER) | (1L << ID) | (1L << BULLSHIT) | (1L << BITCHES))) != 0)) {
				{
				setState(28);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(20);
					assign();
					}
					break;
				case 2:
					{
					setState(21);
					number();
					}
					break;
				case 3:
					{
					setState(22);
					print();
					}
					break;
				case 4:
					{
					setState(23);
					calculateVectors();
					}
					break;
				case 5:
					{
					setState(24);
					arythmVectors();
					}
					break;
				case 6:
					{
					setState(25);
					vector();
					}
					break;
				case 7:
					{
					setState(26);
					if_condition();
					}
					break;
				case 8:
					{
					setState(27);
					while_condition();
					}
					break;
				}
				}
				setState(32);
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
			setState(33);
			((AssignContext)_localctx).var = match(ID);
			setState(34);
			match(EQUALS);
			setState(41);
			switch (_input.LA(1)) {
			case VAR_NUMBER:
			case NUMBER:
				{
				setState(35);
				((AssignContext)_localctx).num = number();

						varMap.put((((AssignContext)_localctx).var!=null?((AssignContext)_localctx).var.getText():null), ((AssignContext)_localctx).num.value);
					
				}
				break;
			case VAR_VECTOR:
			case VECTOR:
			case STICK:
			case L_C_BR:
				{
				setState(38);
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
			setState(43);
			((PrintContext)_localctx).exp = match(PRINT_EXP);

					String varName = (((PrintContext)_localctx).exp!=null?((PrintContext)_localctx).exp.getText():null).split("[\\(\\)]")[1];
					try{
						Double number = (Double)varMap.get(varName);
						if(number == null){
							throw new FooException("Print Error!");
						}
						System.out.println(number);
					}
					catch(FooException ex1){}
					catch(Exception ex){
						ArrayList list = (ArrayList)varMap.get(varName);
						if(list == null){
							try{
								throw new FooException("Print Error!");
							}
							catch(FooException ex1){}
						}
						System.out.println(list);
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
			setState(46);
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
			setState(80);
			switch (_input.LA(1)) {
			case VAR_VECTOR:
			case VECTOR:
			case STICK:
			case L_C_BR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(49);
				((ArythmVectorsContext)_localctx).sum1 = vector();

				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(67);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(51);
						match(PLUS);
						setState(52);
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
						setState(55);
						match(MINUS);
						setState(56);
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
						setState(59);
						match(MULT);
						setState(60);
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
						setState(63);
						match(MULT);
						setState(64);
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
					setState(69); 
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
				setState(71);
				((ArythmVectorsContext)_localctx).sum5 = number();
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72);
					match(MULT);
					setState(73);
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
					setState(78); 
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
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
				setState(84);
				match(STICK);
				setState(85);
				((VectorContext)_localctx).input2 = match(VECTOR);
				setState(86);
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
				setState(88);
				match(L_C_BR);
				setState(89);
				((VectorContext)_localctx).exp1 = arythmVectors();
				setState(90);
				match(R_C_BR);
				((VectorContext)_localctx).values =  ((VectorContext)_localctx).exp1.values;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(STICK);
				setState(94);
				match(L_C_BR);
				setState(95);
				((VectorContext)_localctx).exp2 = arythmVectors();
				setState(96);
				match(R_C_BR);
				setState(97);
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
				setState(100);
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
			setState(108);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				((NumberContext)_localctx).input1 = match(NUMBER);

						((NumberContext)_localctx).value =  Double.parseDouble((((NumberContext)_localctx).input1!=null?((NumberContext)_localctx).input1.getText():null));
					
				}
				break;
			case VAR_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
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

	public static class Bool_varContext extends ParserRuleContext {
		public Boolean value;
		public NumberContext num1;
		public NumberContext num2;
		public NumberContext num3;
		public NumberContext num4;
		public NumberContext num5;
		public NumberContext num6;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public Bool_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterBool_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitBool_var(this);
		}
	}

	public final Bool_varContext bool_var() throws RecognitionException {
		Bool_varContext _localctx = new Bool_varContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool_var);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((Bool_varContext)_localctx).num1 = number();
				setState(111);
				match(R_T_BR);
				setState(112);
				((Bool_varContext)_localctx).num2 = number();

						((Bool_varContext)_localctx).value =  (((Bool_varContext)_localctx).num1.value > ((Bool_varContext)_localctx).num2.value);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((Bool_varContext)_localctx).num3 = number();
				setState(116);
				match(T__0);
				setState(117);
				((Bool_varContext)_localctx).num4 = number();

						((Bool_varContext)_localctx).value =  (((Bool_varContext)_localctx).num3.value == ((Bool_varContext)_localctx).num4.value); 
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				((Bool_varContext)_localctx).num5 = number();
				setState(121);
				match(L_T_BR);
				setState(122);
				((Bool_varContext)_localctx).num6 = number();

						((Bool_varContext)_localctx).value =  (((Bool_varContext)_localctx).num5.value < ((Bool_varContext)_localctx).num6.value); 
					
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

	public static class If_conditionContext extends ParserRuleContext {
		public Token var;
		public TerminalNode BULLSHIT() { return getToken(VetrixParser.BULLSHIT, 0); }
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitIf_condition(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((If_conditionContext)_localctx).var = match(BULLSHIT);

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

	public static class While_conditionContext extends ParserRuleContext {
		public Token var;
		public TerminalNode BITCHES() { return getToken(VetrixParser.BITCHES, 0); }
		public While_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterWhile_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitWhile_condition(this);
		}
	}

	public final While_conditionContext while_condition() throws RecognitionException {
		While_conditionContext _localctx = new While_conditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((While_conditionContext)_localctx).var = match(BITCHES);

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u0088\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6F\n\6"+
		"\r\6\16\6G\3\6\3\6\3\6\3\6\3\6\6\6O\n\6\r\6\16\6P\5\6S\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7i\n\7\3\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\2"+
		"\2\f\2\4\6\b\n\f\16\20\22\24\2\2\u0093\2 \3\2\2\2\4#\3\2\2\2\6-\3\2\2"+
		"\2\b\60\3\2\2\2\nR\3\2\2\2\fh\3\2\2\2\16n\3\2\2\2\20\177\3\2\2\2\22\u0081"+
		"\3\2\2\2\24\u0084\3\2\2\2\26\37\5\4\3\2\27\37\5\16\b\2\30\37\5\6\4\2\31"+
		"\37\5\b\5\2\32\37\5\n\6\2\33\37\5\f\7\2\34\37\5\22\n\2\35\37\5\24\13\2"+
		"\36\26\3\2\2\2\36\27\3\2\2\2\36\30\3\2\2\2\36\31\3\2\2\2\36\32\3\2\2\2"+
		"\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !"+
		"\3\2\2\2!\3\3\2\2\2\" \3\2\2\2#$\7\30\2\2$+\7\34\2\2%&\5\16\b\2&\'\b\3"+
		"\1\2\',\3\2\2\2()\5\f\7\2)*\b\3\1\2*,\3\2\2\2+%\3\2\2\2+(\3\2\2\2,\5\3"+
		"\2\2\2-.\7\4\2\2./\b\4\1\2/\7\3\2\2\2\60\61\5\n\6\2\61\62\b\5\1\2\62\t"+
		"\3\2\2\2\63\64\5\f\7\2\64E\b\6\1\2\65\66\7\33\2\2\66\67\5\f\7\2\678\b"+
		"\6\1\28F\3\2\2\29:\7\35\2\2:;\5\f\7\2;<\b\6\1\2<F\3\2\2\2=>\7\36\2\2>"+
		"?\5\f\7\2?@\b\6\1\2@F\3\2\2\2AB\7\36\2\2BC\5\16\b\2CD\b\6\1\2DF\3\2\2"+
		"\2E\65\3\2\2\2E9\3\2\2\2E=\3\2\2\2EA\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2"+
		"\2\2HS\3\2\2\2IN\5\16\b\2JK\7\36\2\2KL\5\f\7\2LM\b\6\1\2MO\3\2\2\2NJ\3"+
		"\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2R\63\3\2\2\2RI\3\2\2\2S"+
		"\13\3\2\2\2TU\7\t\2\2Ui\b\7\1\2VW\7\r\2\2WX\7\t\2\2XY\7\r\2\2Yi\b\7\1"+
		"\2Z[\7\20\2\2[\\\5\n\6\2\\]\7\21\2\2]^\b\7\1\2^i\3\2\2\2_`\7\r\2\2`a\7"+
		"\20\2\2ab\5\n\6\2bc\7\21\2\2cd\7\r\2\2de\b\7\1\2ei\3\2\2\2fg\7\b\2\2g"+
		"i\b\7\1\2hT\3\2\2\2hV\3\2\2\2hZ\3\2\2\2h_\3\2\2\2hf\3\2\2\2i\r\3\2\2\2"+
		"jk\7\26\2\2ko\b\b\1\2lm\7\7\2\2mo\b\b\1\2nj\3\2\2\2nl\3\2\2\2o\17\3\2"+
		"\2\2pq\5\16\b\2qr\7\23\2\2rs\5\16\b\2st\b\t\1\2t\u0080\3\2\2\2uv\5\16"+
		"\b\2vw\7\3\2\2wx\5\16\b\2xy\b\t\1\2y\u0080\3\2\2\2z{\5\16\b\2{|\7\22\2"+
		"\2|}\5\16\b\2}~\b\t\1\2~\u0080\3\2\2\2\177p\3\2\2\2\177u\3\2\2\2\177z"+
		"\3\2\2\2\u0080\21\3\2\2\2\u0081\u0082\7!\2\2\u0082\u0083\b\n\1\2\u0083"+
		"\23\3\2\2\2\u0084\u0085\7\"\2\2\u0085\u0086\b\13\1\2\u0086\25\3\2\2\2"+
		"\f\36 +EGPRhn\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}