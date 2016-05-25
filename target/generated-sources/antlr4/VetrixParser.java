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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PRINT_EXP=7, CONDITION=8, 
		COND_SYMBOL=9, VAR_NUMBER=10, VAR_VECTOR=11, VECTOR=12, NUMBER_TYPE=13, 
		VECTOR_TYPE=14, PRINT=15, STICK=16, L_BR=17, R_BR=18, L_C_BR=19, R_C_BR=20, 
		L_T_BR=21, R_T_BR=22, L_U_BR=23, R_U_BR=24, NUMBER=25, WS=26, ID=27, COMMA=28, 
		SEMICOLON=29, PLUS=30, EQUALS=31, MINUS=32, MULT=33, IF=34, WHILE=35, 
		NL=36, BULLSHIT=37, BITCHES=38;
	public static final int
		RULE_runProgram = 0, RULE_assign = 1, RULE_print = 2, RULE_calculateVectors = 3, 
		RULE_arythmVectors = 4, RULE_vector = 5, RULE_number = 6, RULE_bool_var = 7, 
		RULE_if_condition = 8, RULE_function = 9, RULE_function_call = 10, RULE_while_condition = 11;
	public static final String[] ruleNames = {
		"runProgram", "assign", "print", "calculateVectors", "arythmVectors", 
		"vector", "number", "bool_var", "if_condition", "function", "function_call", 
		"while_condition"
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

	@Override
	public String getGrammarFileName() { return "Vetrix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		java.util.Hashtable varMap = new java.util.Hashtable();
		boolean isFunction = false;
		private MyParser parser = new MyParser();
		
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
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
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PRINT_EXP) | (1L << VAR_NUMBER) | (1L << VAR_VECTOR) | (1L << VECTOR) | (1L << STICK) | (1L << L_C_BR) | (1L << NUMBER) | (1L << ID) | (1L << BULLSHIT) | (1L << BITCHES))) != 0)) {
				{
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(24);
					assign();
					}
					break;
				case 2:
					{
					setState(25);
					number();
					}
					break;
				case 3:
					{
					setState(26);
					print();
					}
					break;
				case 4:
					{
					setState(27);
					calculateVectors();
					}
					break;
				case 5:
					{
					setState(28);
					arythmVectors();
					}
					break;
				case 6:
					{
					setState(29);
					vector();
					}
					break;
				case 7:
					{
					setState(30);
					if_condition();
					}
					break;
				case 8:
					{
					setState(31);
					while_condition();
					}
					break;
				case 9:
					{
					setState(32);
					function();
					}
					break;
				case 10:
					{
					setState(33);
					function_call();
					}
					break;
				}
				}
				setState(38);
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
			setState(39);
			((AssignContext)_localctx).var = match(ID);
			setState(40);
			match(EQUALS);
			setState(47);
			switch (_input.LA(1)) {
			case VAR_NUMBER:
			case NUMBER:
				{
				setState(41);
				((AssignContext)_localctx).num = number();

						varMap.put((((AssignContext)_localctx).var!=null?((AssignContext)_localctx).var.getText():null), ((AssignContext)_localctx).num.value);
					
				}
				break;
			case VAR_VECTOR:
			case VECTOR:
			case STICK:
			case L_C_BR:
				{
				setState(44);
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
			setState(49);
			((PrintContext)_localctx).exp = match(PRINT_EXP);

					String varName = (((PrintContext)_localctx).exp!=null?((PrintContext)_localctx).exp.getText():null).split("[\\(\\)]")[1];
					try{
						Double number = (Double)varMap.get(varName);
						if(number == null){
							throw new FooException("Print Error!");
						}
						parser.makePrintFunction(Double.toString(number), isFunction);
					}
					catch(FooException ex1){}
					catch(Exception ex){
						ArrayList list = (ArrayList)varMap.get(varName);
						if(list == null){
							try{
								throw new FooException("Print Error!");
							}
							catch(FooException ex1){
								
							}
						}
						String str = "";
						for(int i=0; i < list.size(); i++){
							str += list.get(i) + " ";
						}
						
						parser.makePrintFunction(str, isFunction);
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
			setState(52);
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
			setState(86);
			switch (_input.LA(1)) {
			case VAR_VECTOR:
			case VECTOR:
			case STICK:
			case L_C_BR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(55);
				((ArythmVectorsContext)_localctx).sum1 = vector();

				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(57);
						match(PLUS);
						setState(58);
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
						setState(61);
						match(MINUS);
						setState(62);
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
						setState(65);
						match(MULT);
						setState(66);
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
						setState(69);
						match(MULT);
						setState(70);
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
					setState(75); 
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
				setState(77);
				((ArythmVectorsContext)_localctx).sum5 = number();
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					match(MULT);
					setState(79);
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
					setState(84); 
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
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
				setState(90);
				match(STICK);
				setState(91);
				((VectorContext)_localctx).input2 = match(VECTOR);
				setState(92);
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
				setState(94);
				match(L_C_BR);
				setState(95);
				((VectorContext)_localctx).exp1 = arythmVectors();
				setState(96);
				match(R_C_BR);
				((VectorContext)_localctx).values =  ((VectorContext)_localctx).exp1.values;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(STICK);
				setState(100);
				match(L_C_BR);
				setState(101);
				((VectorContext)_localctx).exp2 = arythmVectors();
				setState(102);
				match(R_C_BR);
				setState(103);
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
				setState(106);
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
			setState(114);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((NumberContext)_localctx).input1 = match(NUMBER);

						((NumberContext)_localctx).value =  Double.parseDouble((((NumberContext)_localctx).input1!=null?((NumberContext)_localctx).input1.getText():null));
					
				}
				break;
			case VAR_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((Bool_varContext)_localctx).num1 = number();
				setState(117);
				match(R_T_BR);
				setState(118);
				((Bool_varContext)_localctx).num2 = number();

						((Bool_varContext)_localctx).value =  (((Bool_varContext)_localctx).num1.value > ((Bool_varContext)_localctx).num2.value);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((Bool_varContext)_localctx).num3 = number();
				setState(122);
				match(T__0);
				setState(123);
				((Bool_varContext)_localctx).num4 = number();

						((Bool_varContext)_localctx).value =  (((Bool_varContext)_localctx).num3.value == ((Bool_varContext)_localctx).num4.value); 
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				((Bool_varContext)_localctx).num5 = number();
				setState(127);
				match(L_T_BR);
				setState(128);
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
			setState(133);
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

	public static class FunctionContext extends ParserRuleContext {
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(VetrixParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VetrixParser.ID, i);
		}
		public List<TerminalNode> NL() { return getTokens(VetrixParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VetrixParser.NL, i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
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
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<String> args = new ArrayList<>(); isFunction = true;
			setState(137);
			match(T__1);
			setState(138);
			((FunctionContext)_localctx).ID = match(ID);
			String funcId = (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null);
			setState(140);
			match(T__2);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(141);
				((FunctionContext)_localctx).ID = match(ID);
				args.add((((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null));
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(148);
				match(NL);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(T__3);
			parser.makeFunctionHeader(funcId, args); String retId = "";
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_EXP) | (1L << VAR_NUMBER) | (1L << VAR_VECTOR) | (1L << VECTOR) | (1L << STICK) | (1L << L_C_BR) | (1L << NUMBER) | (1L << ID) | (1L << NL) | (1L << BULLSHIT) | (1L << BITCHES))) != 0)) {
				{
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(156);
					match(NL);
					}
					break;
				case 2:
					{
					setState(157);
					function_call();
					}
					break;
				case 3:
					{
					setState(158);
					assign();
					}
					break;
				case 4:
					{
					setState(159);
					number();
					}
					break;
				case 5:
					{
					setState(160);
					print();
					}
					break;
				case 6:
					{
					setState(161);
					calculateVectors();
					}
					break;
				case 7:
					{
					setState(162);
					arythmVectors();
					}
					break;
				case 8:
					{
					setState(163);
					vector();
					}
					break;
				case 9:
					{
					setState(164);
					if_condition();
					}
					break;
				case 10:
					{
					setState(165);
					while_condition();
					}
					break;
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__4);
			setState(174);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(172);
				((FunctionContext)_localctx).ID = match(ID);
				retId = (((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null);
				}
			}

			setState(176);
			match(T__5);
			parser.makeFunctionReturn(retId);
			 isFunction = false;
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

	public static class Function_callContext extends ParserRuleContext {
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(VetrixParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VetrixParser.ID, i);
		}
		public List<TerminalNode> NL() { return getTokens(VetrixParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VetrixParser.NL, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			List<String> args = new ArrayList<>();
			setState(181);
			((Function_callContext)_localctx).ID = match(ID);
			String funcId = (((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null);
			setState(183);
			match(L_C_BR);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				{
				setState(184);
				((Function_callContext)_localctx).ID = match(ID);
				args.add((((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null));
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(187);
					match(COMMA);
					setState(188);
					((Function_callContext)_localctx).ID = match(ID);
					args.add((((Function_callContext)_localctx).ID!=null?((Function_callContext)_localctx).ID.getText():null));
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(R_C_BR);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					match(NL);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			parser.parseFunctionCall(funcId, args, isFunction);
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
		enterRule(_localctx, 22, RULE_while_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2%\n\2\f"+
		"\2\16\2(\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\6\6L\n\6\r\6\16\6M\3\6\3\6\3\6\3\6\3\6\6\6U\n\6\r\6\16\6"+
		"V\5\6Y\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\3\b\5\bu\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0092\n\13\f\13\16\13\u0095\13"+
		"\13\3\13\7\13\u0098\n\13\f\13\16\13\u009b\13\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a9\n\13\f\13\16\13\u00ac"+
		"\13\13\3\13\3\13\3\13\5\13\u00b1\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c1\n\f\f\f\16\f\u00c4\13\f\7\f\u00c6"+
		"\n\f\f\f\16\f\u00c9\13\f\3\f\3\f\7\f\u00cd\n\f\f\f\16\f\u00d0\13\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\u00f2\2"+
		"&\3\2\2\2\4)\3\2\2\2\6\63\3\2\2\2\b\66\3\2\2\2\nX\3\2\2\2\fn\3\2\2\2\16"+
		"t\3\2\2\2\20\u0085\3\2\2\2\22\u0087\3\2\2\2\24\u008a\3\2\2\2\26\u00b6"+
		"\3\2\2\2\30\u00d3\3\2\2\2\32%\5\4\3\2\33%\5\16\b\2\34%\5\6\4\2\35%\5\b"+
		"\5\2\36%\5\n\6\2\37%\5\f\7\2 %\5\22\n\2!%\5\30\r\2\"%\5\24\13\2#%\5\26"+
		"\f\2$\32\3\2\2\2$\33\3\2\2\2$\34\3\2\2\2$\35\3\2\2\2$\36\3\2\2\2$\37\3"+
		"\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'"+
		"\3\2\2\2\'\3\3\2\2\2(&\3\2\2\2)*\7\35\2\2*\61\7!\2\2+,\5\16\b\2,-\b\3"+
		"\1\2-\62\3\2\2\2./\5\f\7\2/\60\b\3\1\2\60\62\3\2\2\2\61+\3\2\2\2\61.\3"+
		"\2\2\2\62\5\3\2\2\2\63\64\7\t\2\2\64\65\b\4\1\2\65\7\3\2\2\2\66\67\5\n"+
		"\6\2\678\b\5\1\28\t\3\2\2\29:\5\f\7\2:K\b\6\1\2;<\7 \2\2<=\5\f\7\2=>\b"+
		"\6\1\2>L\3\2\2\2?@\7\"\2\2@A\5\f\7\2AB\b\6\1\2BL\3\2\2\2CD\7#\2\2DE\5"+
		"\f\7\2EF\b\6\1\2FL\3\2\2\2GH\7#\2\2HI\5\16\b\2IJ\b\6\1\2JL\3\2\2\2K;\3"+
		"\2\2\2K?\3\2\2\2KC\3\2\2\2KG\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NY\3"+
		"\2\2\2OT\5\16\b\2PQ\7#\2\2QR\5\f\7\2RS\b\6\1\2SU\3\2\2\2TP\3\2\2\2UV\3"+
		"\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2X9\3\2\2\2XO\3\2\2\2Y\13\3\2\2\2Z"+
		"[\7\16\2\2[o\b\7\1\2\\]\7\22\2\2]^\7\16\2\2^_\7\22\2\2_o\b\7\1\2`a\7\25"+
		"\2\2ab\5\n\6\2bc\7\26\2\2cd\b\7\1\2do\3\2\2\2ef\7\22\2\2fg\7\25\2\2gh"+
		"\5\n\6\2hi\7\26\2\2ij\7\22\2\2jk\b\7\1\2ko\3\2\2\2lm\7\r\2\2mo\b\7\1\2"+
		"nZ\3\2\2\2n\\\3\2\2\2n`\3\2\2\2ne\3\2\2\2nl\3\2\2\2o\r\3\2\2\2pq\7\33"+
		"\2\2qu\b\b\1\2rs\7\f\2\2su\b\b\1\2tp\3\2\2\2tr\3\2\2\2u\17\3\2\2\2vw\5"+
		"\16\b\2wx\7\30\2\2xy\5\16\b\2yz\b\t\1\2z\u0086\3\2\2\2{|\5\16\b\2|}\7"+
		"\3\2\2}~\5\16\b\2~\177\b\t\1\2\177\u0086\3\2\2\2\u0080\u0081\5\16\b\2"+
		"\u0081\u0082\7\27\2\2\u0082\u0083\5\16\b\2\u0083\u0084\b\t\1\2\u0084\u0086"+
		"\3\2\2\2\u0085v\3\2\2\2\u0085{\3\2\2\2\u0085\u0080\3\2\2\2\u0086\21\3"+
		"\2\2\2\u0087\u0088\7\'\2\2\u0088\u0089\b\n\1\2\u0089\23\3\2\2\2\u008a"+
		"\u008b\b\13\1\2\u008b\u008c\7\4\2\2\u008c\u008d\7\35\2\2\u008d\u008e\b"+
		"\13\1\2\u008e\u0093\7\5\2\2\u008f\u0090\7\35\2\2\u0090\u0092\b\13\1\2"+
		"\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0099\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\7&\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\6\2\2\u009d"+
		"\u00aa\b\13\1\2\u009e\u00a9\7&\2\2\u009f\u00a9\5\26\f\2\u00a0\u00a9\5"+
		"\4\3\2\u00a1\u00a9\5\16\b\2\u00a2\u00a9\5\6\4\2\u00a3\u00a9\5\b\5\2\u00a4"+
		"\u00a9\5\n\6\2\u00a5\u00a9\5\f\7\2\u00a6\u00a9\5\22\n\2\u00a7\u00a9\5"+
		"\30\r\2\u00a8\u009e\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8"+
		"\u00a1\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2"+
		"\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\7\7\2\2\u00ae\u00af\7\35\2\2\u00af"+
		"\u00b1\b\13\1\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4\b\13\1\2\u00b4\u00b5\b\13\1\2\u00b5"+
		"\25\3\2\2\2\u00b6\u00b7\b\f\1\2\u00b7\u00b8\7\35\2\2\u00b8\u00b9\b\f\1"+
		"\2\u00b9\u00c7\7\25\2\2\u00ba\u00bb\7\35\2\2\u00bb\u00bc\b\f\1\2\u00bc"+
		"\u00c2\3\2\2\2\u00bd\u00be\7\36\2\2\u00be\u00bf\7\35\2\2\u00bf\u00c1\b"+
		"\f\1\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00ba\3\2"+
		"\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00ce\7\26\2\2\u00cb\u00cd\7"+
		"&\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\b\f"+
		"\1\2\u00d2\27\3\2\2\2\u00d3\u00d4\7(\2\2\u00d4\u00d5\b\r\1\2\u00d5\31"+
		"\3\2\2\2\24$&\61KMVXnt\u0085\u0093\u0099\u00a8\u00aa\u00b0\u00c2\u00c7"+
		"\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}