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
		PRINT_EXP=1, VECTOR=2, STICK=3, L_BR=4, R_BR=5, L_C_BR=6, R_C_BR=7, NUMBER=8, 
		WS=9, ID=10, COMMA=11, SEMICOLON=12, VECTOR_TYPE=13, PRINT=14, PLUS=15, 
		EQUALS=16, MINUS=17, MULT=18;
	public static final int
		RULE_runProgram = 0, RULE_assign = 1, RULE_variable = 2, RULE_number = 3, 
		RULE_print = 4, RULE_calculateVectors = 5, RULE_arythmVectors = 6, RULE_vector = 7;
	public static final String[] ruleNames = {
		"runProgram", "assign", "variable", "number", "print", "calculateVectors", 
		"arythmVectors", "vector"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'|'", "'['", "']'", "'('", "')'", null, null, null, 
		"','", "';'", "'Vector'", "'print'", "'+'", "'='", "'-'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRINT_EXP", "VECTOR", "STICK", "L_BR", "R_BR", "L_C_BR", "R_C_BR", 
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_EXP) | (1L << VECTOR) | (1L << STICK) | (1L << L_C_BR) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				setState(23);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(16);
					assign();
					}
					break;
				case 2:
					{
					setState(17);
					variable();
					}
					break;
				case 3:
					{
					setState(18);
					number();
					}
					break;
				case 4:
					{
					setState(19);
					print();
					}
					break;
				case 5:
					{
					setState(20);
					calculateVectors();
					}
					break;
				case 6:
					{
					setState(21);
					arythmVectors();
					}
					break;
				case 7:
					{
					setState(22);
					vector();
					}
					break;
				}
				}
				setState(27);
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
			setState(28);
			((AssignContext)_localctx).var = match(ID);
			setState(29);
			match(EQUALS);
			setState(36);
			switch (_input.LA(1)) {
			case NUMBER:
			case ID:
				{
				setState(30);
				((AssignContext)_localctx).num = number();

						varMap.put((((AssignContext)_localctx).var!=null?((AssignContext)_localctx).var.getText():null), ((AssignContext)_localctx).num.value);
					
				}
				break;
			case VECTOR:
			case STICK:
			case L_C_BR:
				{
				setState(33);
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

	public static class VariableContext extends ParserRuleContext {
		public Double value;
		public Token var;
		public TerminalNode ID() { return getToken(VetrixParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VetrixListener ) ((VetrixListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((VariableContext)_localctx).var = match(ID);
			((VariableContext)_localctx).value =  (Double)varMap.get((((VariableContext)_localctx).var!=null?((VariableContext)_localctx).var.getText():null));
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
		public TerminalNode ID() { return getToken(VetrixParser.ID, 0); }
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
		enterRule(_localctx, 6, RULE_number);
		try {
			setState(45);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((NumberContext)_localctx).input1 = match(NUMBER);

						((NumberContext)_localctx).value =  Double.parseDouble((((NumberContext)_localctx).input1!=null?((NumberContext)_localctx).input1.getText():null));
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((NumberContext)_localctx).input2 = match(ID);

						((NumberContext)_localctx).value =  (Double)varMap.get((((NumberContext)_localctx).input2!=null?((NumberContext)_localctx).input2.getText():null));
					
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
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
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
		enterRule(_localctx, 10, RULE_calculateVectors);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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
		enterRule(_localctx, 12, RULE_arythmVectors);
		int _la;
		try {
			setState(84);
			switch (_input.LA(1)) {
			case VECTOR:
			case STICK:
			case L_C_BR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(53);
				((ArythmVectorsContext)_localctx).sum1 = vector();

				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(55);
						match(PLUS);
						setState(56);
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
						setState(59);
						match(MINUS);
						setState(60);
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
						setState(63);
						match(MULT);
						setState(64);
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
						setState(67);
						match(MULT);
						setState(68);
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
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT))) != 0) );
				}
				}
				break;
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(75);
				((ArythmVectorsContext)_localctx).sum5 = number();
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76);
					match(MULT);
					setState(77);
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
					setState(82); 
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
		enterRule(_localctx, 14, RULE_vector);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
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
				setState(88);
				match(STICK);
				setState(89);
				((VectorContext)_localctx).input2 = match(VECTOR);
				setState(90);
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
				setState(92);
				match(L_C_BR);
				setState(93);
				((VectorContext)_localctx).exp1 = arythmVectors();
				setState(94);
				match(R_C_BR);
				((VectorContext)_localctx).values =  ((VectorContext)_localctx).exp1.values;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(STICK);
				setState(98);
				match(L_C_BR);
				setState(99);
				((VectorContext)_localctx).exp2 = arythmVectors();
				setState(100);
				match(R_C_BR);
				setState(101);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\'\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\60\n\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\6\bJ\n\b\r\b\16\bK\3\b\3\b\3\b\3\b\3\b\6\bS\n\b\r\b\16\bT\5\bW\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\tk\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2v\2\33\3\2\2\2\4\36\3\2\2"+
		"\2\6(\3\2\2\2\b/\3\2\2\2\n\61\3\2\2\2\f\64\3\2\2\2\16V\3\2\2\2\20j\3\2"+
		"\2\2\22\32\5\4\3\2\23\32\5\6\4\2\24\32\5\b\5\2\25\32\5\n\6\2\26\32\5\f"+
		"\7\2\27\32\5\16\b\2\30\32\5\20\t\2\31\22\3\2\2\2\31\23\3\2\2\2\31\24\3"+
		"\2\2\2\31\25\3\2\2\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\35\3"+
		"\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\33\3\2\2\2\36\37\7"+
		"\f\2\2\37&\7\22\2\2 !\5\b\5\2!\"\b\3\1\2\"\'\3\2\2\2#$\5\20\t\2$%\b\3"+
		"\1\2%\'\3\2\2\2& \3\2\2\2&#\3\2\2\2\'\5\3\2\2\2()\7\f\2\2)*\b\4\1\2*\7"+
		"\3\2\2\2+,\7\n\2\2,\60\b\5\1\2-.\7\f\2\2.\60\b\5\1\2/+\3\2\2\2/-\3\2\2"+
		"\2\60\t\3\2\2\2\61\62\7\3\2\2\62\63\b\6\1\2\63\13\3\2\2\2\64\65\5\16\b"+
		"\2\65\66\b\7\1\2\66\r\3\2\2\2\678\5\20\t\28I\b\b\1\29:\7\21\2\2:;\5\20"+
		"\t\2;<\b\b\1\2<J\3\2\2\2=>\7\23\2\2>?\5\20\t\2?@\b\b\1\2@J\3\2\2\2AB\7"+
		"\24\2\2BC\5\20\t\2CD\b\b\1\2DJ\3\2\2\2EF\7\24\2\2FG\5\b\5\2GH\b\b\1\2"+
		"HJ\3\2\2\2I9\3\2\2\2I=\3\2\2\2IA\3\2\2\2IE\3\2\2\2JK\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2LW\3\2\2\2MR\5\b\5\2NO\7\24\2\2OP\5\20\t\2PQ\b\b\1\2QS\3\2\2"+
		"\2RN\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2V\67\3\2\2\2VM\3\2"+
		"\2\2W\17\3\2\2\2XY\7\4\2\2Yk\b\t\1\2Z[\7\5\2\2[\\\7\4\2\2\\]\7\5\2\2]"+
		"k\b\t\1\2^_\7\b\2\2_`\5\16\b\2`a\7\t\2\2ab\b\t\1\2bk\3\2\2\2cd\7\5\2\2"+
		"de\7\b\2\2ef\5\16\b\2fg\7\t\2\2gh\7\5\2\2hi\b\t\1\2ik\3\2\2\2jX\3\2\2"+
		"\2jZ\3\2\2\2j^\3\2\2\2jc\3\2\2\2k\21\3\2\2\2\13\31\33&/IKTVj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}