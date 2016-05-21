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
		PRINT_EXP=1, VECTOR=2, SUMMED_VECTORS=3, PROGRAM=4, START=5, END=6, STICK=7, 
		L_BR=8, R_BR=9, L_C_BR=10, R_C_BR=11, NUMBER=12, WS=13, ID=14, COMMA=15, 
		SEMICOLON=16, VECTOR_TYPE=17, PRINT=18, PLUS=19, EQUALS=20, MINUS=21, 
		MULT=22;
	public static final int
		RULE_assign = 0, RULE_variable = 1, RULE_number = 2, RULE_print = 3, RULE_runProgram = 4;
	public static final String[] ruleNames = {
		"assign", "variable", "number", "print", "runProgram"
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
	public static class AssignContext extends ParserRuleContext {
		public Double value;
		public Token var;
		public NumberContext num;
		public TerminalNode EQUALS() { return getToken(VetrixParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(VetrixParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
		enterRule(_localctx, 0, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((AssignContext)_localctx).var = match(ID);
			setState(11);
			match(EQUALS);
			setState(12);
			((AssignContext)_localctx).num = number();

					varMap.put((((AssignContext)_localctx).var!=null?((AssignContext)_localctx).var.getText():null), ((AssignContext)_localctx).num.value);
				
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
		enterRule(_localctx, 2, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
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
			setState(18);
			((NumberContext)_localctx).input = match(NUMBER);

					((NumberContext)_localctx).value =  Double.parseDouble((((NumberContext)_localctx).input!=null?((NumberContext)_localctx).input.getText():null));
				
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
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			((PrintContext)_localctx).exp = match(PRINT_EXP);

					String varName = (((PrintContext)_localctx).exp!=null?((PrintContext)_localctx).exp.getText():null).split("[\\(\\)]")[1];
					System.out.println((Double)varMap.get(varName));
				
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
		enterRule(_localctx, 8, RULE_runProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_EXP) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				setState(28);
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
					variable();
					}
					break;
				case 3:
					{
					setState(26);
					number();
					}
					break;
				case 4:
					{
					setState(27);
					print();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\37\n\6\f\6\16\6\"\13\6\3\6\2\2\7\2\4"+
		"\6\b\n\2\2\"\2\f\3\2\2\2\4\21\3\2\2\2\6\24\3\2\2\2\b\27\3\2\2\2\n \3\2"+
		"\2\2\f\r\7\20\2\2\r\16\7\26\2\2\16\17\5\6\4\2\17\20\b\2\1\2\20\3\3\2\2"+
		"\2\21\22\7\20\2\2\22\23\b\3\1\2\23\5\3\2\2\2\24\25\7\16\2\2\25\26\b\4"+
		"\1\2\26\7\3\2\2\2\27\30\7\3\2\2\30\31\b\5\1\2\31\t\3\2\2\2\32\37\5\2\2"+
		"\2\33\37\5\4\3\2\34\37\5\6\4\2\35\37\5\b\5\2\36\32\3\2\2\2\36\33\3\2\2"+
		"\2\36\34\3\2\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\13"+
		"\3\2\2\2\" \3\2\2\2\4\36 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}