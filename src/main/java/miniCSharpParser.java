// Generated from miniCSharp.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniCSharpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAMESPACE=1, CLASS=2, ACCESSOR=3, IF=4, ELSE=5, RETURN=6, TYPE=7, LPAREN=8, 
		RPAREN=9, LBRACKET=10, RBRACKET=11, SEMICOLON=12, ASSIGN=13, RELOP=14, 
		AROP=15, ID=16, LONG_NUMBER=17, INT_NUMBER=18, WHITESPACE=19, COMMENT=20, 
		ANY=21;
	public static final int
		RULE_program = 0, RULE_namespace = 1, RULE_class_def = 2, RULE_class_body = 3, 
		RULE_attribute_list = 4, RULE_attribute = 5, RULE_function_list = 6, RULE_function = 7, 
		RULE_parameter = 8, RULE_function_body = 9, RULE_variable_list = 10, RULE_variable = 11, 
		RULE_statement_list = 12, RULE_statement = 13, RULE_compound_statement = 14, 
		RULE_assignment_statement = 15, RULE_num_exp = 16, RULE_exp = 17, RULE_literal = 18, 
		RULE_function_call = 19, RULE_argument = 20, RULE_if_statement = 21, RULE_if_part = 22, 
		RULE_rel_exp = 23, RULE_return_statement = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "namespace", "class_def", "class_body", "attribute_list", 
			"attribute", "function_list", "function", "parameter", "function_body", 
			"variable_list", "variable", "statement_list", "statement", "compound_statement", 
			"assignment_statement", "num_exp", "exp", "literal", "function_call", 
			"argument", "if_statement", "if_part", "rel_exp", "return_statement"
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

	@Override
	public String getGrammarFileName() { return "miniCSharp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniCSharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			namespace();
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(miniCSharpParser.NAMESPACE, 0); }
		public TerminalNode ID() { return getToken(miniCSharpParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(miniCSharpParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(miniCSharpParser.RBRACKET, 0); }
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(NAMESPACE);
			setState(53);
			match(ID);
			setState(54);
			match(LBRACKET);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==ACCESSOR) {
				{
				{
				setState(55);
				class_def();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(RBRACKET);
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(miniCSharpParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(miniCSharpParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(miniCSharpParser.LBRACKET, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(miniCSharpParser.RBRACKET, 0); }
		public TerminalNode ACCESSOR() { return getToken(miniCSharpParser.ACCESSOR, 0); }
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESSOR) {
				{
				setState(63);
				match(ACCESSOR);
				}
			}

			setState(66);
			match(CLASS);
			setState(67);
			match(ID);
			setState(68);
			match(LBRACKET);
			setState(69);
			class_body();
			setState(70);
			match(RBRACKET);
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

	public static class Class_bodyContext extends ParserRuleContext {
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitClass_body(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			attribute_list();
			setState(73);
			function_list();
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

	public static class Attribute_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitAttribute_list(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75);
					attribute();
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(miniCSharpParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(miniCSharpParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(miniCSharpParser.SEMICOLON, 0); }
		public TerminalNode ACCESSOR() { return getToken(miniCSharpParser.ACCESSOR, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESSOR) {
				{
				setState(81);
				match(ACCESSOR);
				}
			}

			setState(84);
			match(TYPE);
			setState(85);
			match(ID);
			setState(86);
			match(SEMICOLON);
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

	public static class Function_listContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterFunction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitFunction_list(this);
		}
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACCESSOR || _la==TYPE) {
				{
				{
				setState(88);
				function();
				}
				}
				setState(93);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(miniCSharpParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(miniCSharpParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(miniCSharpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(miniCSharpParser.RPAREN, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode ACCESSOR() { return getToken(miniCSharpParser.ACCESSOR, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESSOR) {
				{
				setState(94);
				match(ACCESSOR);
				}
			}

			setState(97);
			match(TYPE);
			setState(98);
			match(ID);
			setState(99);
			match(LPAREN);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(100);
				parameter();
				}
			}

			setState(103);
			match(RPAREN);
			setState(104);
			function_body();
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(miniCSharpParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(miniCSharpParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(TYPE);
			setState(107);
			match(ID);
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

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(miniCSharpParser.LBRACKET, 0); }
		public Variable_listContext variable_list() {
			return getRuleContext(Variable_listContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(miniCSharpParser.RBRACKET, 0); }
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitFunction_body(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LBRACKET);
			setState(110);
			variable_list();
			setState(111);
			statement_list();
			setState(112);
			match(RBRACKET);
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

	public static class Variable_listContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterVariable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitVariable_list(this);
		}
	}

	public final Variable_listContext variable_list() throws RecognitionException {
		Variable_listContext _localctx = new Variable_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(114);
				variable();
				}
				}
				setState(119);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(miniCSharpParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(miniCSharpParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(miniCSharpParser.SEMICOLON, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(TYPE);
			setState(121);
			match(ID);
			setState(122);
			match(SEMICOLON);
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

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << RETURN) | (1L << LBRACKET) | (1L << ID))) != 0)) {
				{
				{
				setState(124);
				statement();
				}
				}
				setState(129);
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

	public static class StatementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				compound_statement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				assignment_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				if_statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				return_statement();
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

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(miniCSharpParser.LBRACKET, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(miniCSharpParser.RBRACKET, 0); }
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(LBRACKET);
			setState(137);
			statement_list();
			setState(138);
			match(RBRACKET);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniCSharpParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(miniCSharpParser.ASSIGN, 0); }
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(miniCSharpParser.SEMICOLON, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(141);
			match(ASSIGN);
			setState(142);
			num_exp(0);
			setState(143);
			match(SEMICOLON);
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

	public static class Num_expContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public TerminalNode AROP() { return getToken(miniCSharpParser.AROP, 0); }
		public Num_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterNum_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitNum_exp(this);
		}
	}

	public final Num_expContext num_exp() throws RecognitionException {
		return num_exp(0);
	}

	private Num_expContext num_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Num_expContext _localctx = new Num_expContext(_ctx, _parentState);
		Num_expContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_num_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			exp();
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Num_expContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_num_exp);
					setState(148);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(149);
					match(AROP);
					setState(150);
					exp();
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(miniCSharpParser.ID, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(miniCSharpParser.LPAREN, 0); }
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(miniCSharpParser.RPAREN, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(LPAREN);
				setState(160);
				num_exp(0);
				setState(161);
				match(RPAREN);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(miniCSharpParser.INT_NUMBER, 0); }
		public TerminalNode LONG_NUMBER() { return getToken(miniCSharpParser.LONG_NUMBER, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==LONG_NUMBER || _la==INT_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniCSharpParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(miniCSharpParser.LPAREN, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(miniCSharpParser.RPAREN, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(LPAREN);
			setState(169);
			argument();
			setState(170);
			match(RPAREN);
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<Num_expContext> num_exp() {
			return getRuleContexts(Num_expContext.class);
		}
		public Num_expContext num_exp(int i) {
			return getRuleContext(Num_expContext.class,i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << ID) | (1L << LONG_NUMBER) | (1L << INT_NUMBER))) != 0)) {
				{
				{
				setState(172);
				num_exp(0);
				}
				}
				setState(177);
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

	public static class If_statementContext extends ParserRuleContext {
		public If_partContext if_part() {
			return getRuleContext(If_partContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(miniCSharpParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_statement);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				if_part();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				if_part();
				setState(180);
				match(ELSE);
				setState(181);
				statement();
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

	public static class If_partContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(miniCSharpParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(miniCSharpParser.LPAREN, 0); }
		public Rel_expContext rel_exp() {
			return getRuleContext(Rel_expContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(miniCSharpParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterIf_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitIf_part(this);
		}
	}

	public final If_partContext if_part() throws RecognitionException {
		If_partContext _localctx = new If_partContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IF);
			setState(186);
			match(LPAREN);
			setState(187);
			rel_exp();
			setState(188);
			match(RPAREN);
			setState(189);
			statement();
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

	public static class Rel_expContext extends ParserRuleContext {
		public List<Num_expContext> num_exp() {
			return getRuleContexts(Num_expContext.class);
		}
		public Num_expContext num_exp(int i) {
			return getRuleContext(Num_expContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(miniCSharpParser.RELOP, 0); }
		public Rel_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterRel_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitRel_exp(this);
		}
	}

	public final Rel_expContext rel_exp() throws RecognitionException {
		Rel_expContext _localctx = new Rel_expContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rel_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			num_exp(0);
			setState(192);
			match(RELOP);
			setState(193);
			num_exp(0);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(miniCSharpParser.RETURN, 0); }
		public Num_expContext num_exp() {
			return getRuleContext(Num_expContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(miniCSharpParser.SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniCSharpListener ) ((miniCSharpListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(RETURN);
			setState(196);
			num_exp(0);
			setState(197);
			match(SEMICOLON);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return num_exp_sempred((Num_expContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean num_exp_sempred(Num_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00ca\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\3\4"+
		"\5\4C\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\7\6O\n\6\f\6\16\6R\13"+
		"\6\3\7\5\7U\n\7\3\7\3\7\3\7\3\7\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\t\5\tb"+
		"\n\t\3\t\3\t\3\t\3\t\5\th\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\7\fv\n\f\f\f\16\fy\13\f\3\r\3\r\3\r\3\r\3\16\7\16\u0080\n"+
		"\16\f\16\16\16\u0083\13\16\3\17\3\17\3\17\3\17\5\17\u0089\n\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7"+
		"\22\u009a\n\22\f\22\16\22\u009d\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u00a6\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\7\26\u00b0"+
		"\n\26\f\26\16\26\u00b3\13\26\3\27\3\27\3\27\3\27\3\27\5\27\u00ba\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\2\3\"\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2"+
		"\3\3\2\23\24\2\u00c2\2\64\3\2\2\2\4\66\3\2\2\2\6B\3\2\2\2\bJ\3\2\2\2\n"+
		"P\3\2\2\2\fT\3\2\2\2\16]\3\2\2\2\20a\3\2\2\2\22l\3\2\2\2\24o\3\2\2\2\26"+
		"w\3\2\2\2\30z\3\2\2\2\32\u0081\3\2\2\2\34\u0088\3\2\2\2\36\u008a\3\2\2"+
		"\2 \u008e\3\2\2\2\"\u0093\3\2\2\2$\u00a5\3\2\2\2&\u00a7\3\2\2\2(\u00a9"+
		"\3\2\2\2*\u00b1\3\2\2\2,\u00b9\3\2\2\2.\u00bb\3\2\2\2\60\u00c1\3\2\2\2"+
		"\62\u00c5\3\2\2\2\64\65\5\4\3\2\65\3\3\2\2\2\66\67\7\3\2\2\678\7\22\2"+
		"\28<\7\f\2\29;\5\6\4\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2"+
		"\2><\3\2\2\2?@\7\r\2\2@\5\3\2\2\2AC\7\5\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2"+
		"\2\2DE\7\4\2\2EF\7\22\2\2FG\7\f\2\2GH\5\b\5\2HI\7\r\2\2I\7\3\2\2\2JK\5"+
		"\n\6\2KL\5\16\b\2L\t\3\2\2\2MO\5\f\7\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2P"+
		"Q\3\2\2\2Q\13\3\2\2\2RP\3\2\2\2SU\7\5\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2"+
		"\2VW\7\t\2\2WX\7\22\2\2XY\7\16\2\2Y\r\3\2\2\2Z\\\5\20\t\2[Z\3\2\2\2\\"+
		"_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\17\3\2\2\2_]\3\2\2\2`b\7\5\2\2a`\3\2\2"+
		"\2ab\3\2\2\2bc\3\2\2\2cd\7\t\2\2de\7\22\2\2eg\7\n\2\2fh\5\22\n\2gf\3\2"+
		"\2\2gh\3\2\2\2hi\3\2\2\2ij\7\13\2\2jk\5\24\13\2k\21\3\2\2\2lm\7\t\2\2"+
		"mn\7\22\2\2n\23\3\2\2\2op\7\f\2\2pq\5\26\f\2qr\5\32\16\2rs\7\r\2\2s\25"+
		"\3\2\2\2tv\5\30\r\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\27\3\2\2"+
		"\2yw\3\2\2\2z{\7\t\2\2{|\7\22\2\2|}\7\16\2\2}\31\3\2\2\2~\u0080\5\34\17"+
		"\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\33\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0089\5\36\20\2\u0085"+
		"\u0089\5 \21\2\u0086\u0089\5,\27\2\u0087\u0089\5\62\32\2\u0088\u0084\3"+
		"\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\35\3\2\2\2\u008a\u008b\7\f\2\2\u008b\u008c\5\32\16\2\u008c\u008d\7\r"+
		"\2\2\u008d\37\3\2\2\2\u008e\u008f\7\22\2\2\u008f\u0090\7\17\2\2\u0090"+
		"\u0091\5\"\22\2\u0091\u0092\7\16\2\2\u0092!\3\2\2\2\u0093\u0094\b\22\1"+
		"\2\u0094\u0095\5$\23\2\u0095\u009b\3\2\2\2\u0096\u0097\f\3\2\2\u0097\u0098"+
		"\7\21\2\2\u0098\u009a\5$\23\2\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c#\3\2\2\2\u009d\u009b\3"+
		"\2\2\2\u009e\u00a6\5&\24\2\u009f\u00a6\7\22\2\2\u00a0\u00a6\5(\25\2\u00a1"+
		"\u00a2\7\n\2\2\u00a2\u00a3\5\"\22\2\u00a3\u00a4\7\13\2\2\u00a4\u00a6\3"+
		"\2\2\2\u00a5\u009e\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5"+
		"\u00a1\3\2\2\2\u00a6%\3\2\2\2\u00a7\u00a8\t\2\2\2\u00a8\'\3\2\2\2\u00a9"+
		"\u00aa\7\22\2\2\u00aa\u00ab\7\n\2\2\u00ab\u00ac\5*\26\2\u00ac\u00ad\7"+
		"\13\2\2\u00ad)\3\2\2\2\u00ae\u00b0\5\"\22\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2+\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b4\u00ba\5.\30\2\u00b5\u00b6\5.\30\2\u00b6\u00b7"+
		"\7\7\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00ba\3\2\2\2\u00b9\u00b4\3\2\2\2"+
		"\u00b9\u00b5\3\2\2\2\u00ba-\3\2\2\2\u00bb\u00bc\7\6\2\2\u00bc\u00bd\7"+
		"\n\2\2\u00bd\u00be\5\60\31\2\u00be\u00bf\7\13\2\2\u00bf\u00c0\5\34\17"+
		"\2\u00c0/\3\2\2\2\u00c1\u00c2\5\"\22\2\u00c2\u00c3\7\20\2\2\u00c3\u00c4"+
		"\5\"\22\2\u00c4\61\3\2\2\2\u00c5\u00c6\7\b\2\2\u00c6\u00c7\5\"\22\2\u00c7"+
		"\u00c8\7\16\2\2\u00c8\63\3\2\2\2\20<BPT]agw\u0081\u0088\u009b\u00a5\u00b1"+
		"\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}