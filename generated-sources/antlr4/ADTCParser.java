// Generated from ADTC.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ADTCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, Define=20, ElifDefined=21, Elif=22, ElseMacro=23, 
		Endif=24, Ifndef=25, Ifdef=26, Include=27, IfDefined=28, IfMacro=29, Line=30, 
		Pragma=31, Undef=32, Auto=33, Break=34, Case=35, Char=36, Const=37, Default=38, 
		Do=39, Double=40, Enum=41, Extern=42, Float=43, For=44, Goto=45, If=46, 
		Inline=47, Int=48, Long=49, Register=50, Restrict=51, Return=52, Short=53, 
		Signed=54, Sizeof=55, Static=56, Struct=57, Switch=58, Typedef=59, Union=60, 
		Unsigned=61, Void=62, Volatile=63, While=64, Alignas=65, Alignof=66, Atomic=67, 
		Bool=68, Complex=69, Generic=70, Imaginary=71, Noreturn=72, StaticAssert=73, 
		ThreadLocal=74, LeftParen=75, RightParen=76, LeftBracket=77, RightBracket=78, 
		LeftBrace=79, RightBrace=80, Less=81, LessEqual=82, Greater=83, GreaterEqual=84, 
		LeftShift=85, RightShift=86, Plus=87, PlusPlus=88, Minus=89, MinusMinus=90, 
		Star=91, Div=92, Mod=93, And=94, Or=95, AndAnd=96, OrOr=97, Caret=98, 
		Not=99, Tilde=100, Question=101, Colon=102, Semi=103, Comma=104, Assign=105, 
		StarAssign=106, DivAssign=107, ModAssign=108, PlusAssign=109, MinusAssign=110, 
		LeftShiftAssign=111, RightShiftAssign=112, AndAssign=113, XorAssign=114, 
		OrAssign=115, Equal=116, NotEqual=117, Arrow=118, Dot=119, Ellipsis=120, 
		Identifier=121, Constant=122, StringLiteral=123, Whitespace=124, Newline=125, 
		BlockComment=126, LineComment=127;
	public static final int
		RULE_header = 0, RULE_headerGuard = 1, RULE_translationUnit = 2, RULE_preprocessorList = 3, 
		RULE_preprocessor = 4, RULE_booleanMacro = 5, RULE_defineList = 6, RULE_defineMacro = 7, 
		RULE_defineDeclarator = 8, RULE_defineInitializer = 9, RULE_undefList = 10, 
		RULE_undef = 11, RULE_conditionalMacroList = 12, RULE_conditionalMacro = 13, 
		RULE_ifexpression = 14, RULE_elseList = 15, RULE_innerIf = 16, RULE_ifstatement = 17, 
		RULE_elsestatement = 18, RULE_statement = 19, RULE_lineList = 20, RULE_lineDirective = 21, 
		RULE_pragmaList = 22, RULE_pragmaDirective = 23, RULE_includeList = 24, 
		RULE_include = 25, RULE_bodyList = 26, RULE_declaration = 27, RULE_declarationSpecifiers = 28, 
		RULE_declarationSpecifier = 29, RULE_initDeclaratorList = 30, RULE_staticAssertDeclaration = 31, 
		RULE_constantExpression = 32, RULE_conditionalExpression = 33, RULE_logicalOrExpression = 34, 
		RULE_logicalAndExpression = 35, RULE_inclusiveOrExpression = 36, RULE_exclusiveOrExpression = 37, 
		RULE_andExpression = 38, RULE_equalityExpression = 39, RULE_relationalExpression = 40, 
		RULE_shiftExpression = 41, RULE_additiveExpression = 42, RULE_multiplicativeExpression = 43, 
		RULE_castExpression = 44, RULE_expression = 45, RULE_assignmentExpression = 46, 
		RULE_assignmentOperator = 47, RULE_typeName = 48, RULE_unaryExpression = 49, 
		RULE_postfixExpression = 50, RULE_argumentExpressionList = 51, RULE_unaryOperator = 52, 
		RULE_initDeclarator = 53, RULE_initializer = 54, RULE_initializerList = 55, 
		RULE_designation = 56, RULE_designatorList = 57, RULE_designator = 58, 
		RULE_primaryExpression = 59, RULE_genericSelection = 60, RULE_genericAssocList = 61, 
		RULE_genericAssociation = 62, RULE_alignmentSpecifier = 63, RULE_functionSpecifier = 64, 
		RULE_gccAttributeSpecifier = 65, RULE_gccAttributeList = 66, RULE_gccAttribute = 67, 
		RULE_storageClassSpecifier = 68, RULE_typeSpecifier = 69, RULE_atomicTypeSpecifier = 70, 
		RULE_structOrUnionSpecifier = 71, RULE_structOrUnion = 72, RULE_structDeclaration = 73, 
		RULE_structDeclarationList = 74, RULE_specifierQualifierList = 75, RULE_typeQualifier = 76, 
		RULE_structDeclaratorList = 77, RULE_structDeclarator = 78, RULE_declarator = 79, 
		RULE_pointer = 80, RULE_directDeclarator = 81, RULE_parameterTypeList = 82, 
		RULE_parameterList = 83, RULE_parameterDeclaration = 84, RULE_abstractDeclarator = 85, 
		RULE_gccDeclaratorExtension = 86, RULE_directAbstractDeclarator = 87, 
		RULE_identifierList = 88, RULE_typeQualifierList = 89, RULE_typedefName = 90, 
		RULE_enumSpecifier = 91, RULE_enumeratorList = 92, RULE_enumerator = 93, 
		RULE_enumerationConstant = 94;
	public static final String[] ruleNames = {
		"header", "headerGuard", "translationUnit", "preprocessorList", "preprocessor", 
		"booleanMacro", "defineList", "defineMacro", "defineDeclarator", "defineInitializer", 
		"undefList", "undef", "conditionalMacroList", "conditionalMacro", "ifexpression", 
		"elseList", "innerIf", "ifstatement", "elsestatement", "statement", "lineList", 
		"lineDirective", "pragmaList", "pragmaDirective", "includeList", "include", 
		"bodyList", "declaration", "declarationSpecifiers", "declarationSpecifier", 
		"initDeclaratorList", "staticAssertDeclaration", "constantExpression", 
		"conditionalExpression", "logicalOrExpression", "logicalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
		"castExpression", "expression", "assignmentExpression", "assignmentOperator", 
		"typeName", "unaryExpression", "postfixExpression", "argumentExpressionList", 
		"unaryOperator", "initDeclarator", "initializer", "initializerList", "designation", 
		"designatorList", "designator", "primaryExpression", "genericSelection", 
		"genericAssocList", "genericAssociation", "alignmentSpecifier", "functionSpecifier", 
		"gccAttributeSpecifier", "gccAttributeList", "gccAttribute", "storageClassSpecifier", 
		"typeSpecifier", "atomicTypeSpecifier", "structOrUnionSpecifier", "structOrUnion", 
		"structDeclaration", "structDeclarationList", "specifierQualifierList", 
		"typeQualifier", "structDeclaratorList", "structDeclarator", "declarator", 
		"pointer", "directDeclarator", "parameterTypeList", "parameterList", "parameterDeclaration", 
		"abstractDeclarator", "gccDeclaratorExtension", "directAbstractDeclarator", 
		"identifierList", "typeQualifierList", "typedefName", "enumSpecifier", 
		"enumeratorList", "enumerator", "enumerationConstant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true 1'", "'false 0'", "'boolean unsigned char'", "'startup'", 
		"'exit'", "'warn'", "'__extension__'", "'__builtin_va_arg'", "'__builtin_offsetof'", 
		"'__inline__'", "'__stdcall'", "'__declspec'", "'__attribute__'", "'boolean'", 
		"'__m128'", "'__m128d'", "'__m128i'", "'__typeof__'", "'__asm'", null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'auto'", "'break'", "'case'", "'char'", "'const'", "'default'", "'do'", 
		"'double'", "'enum'", "'extern'", "'float'", "'for'", "'goto'", "'if'", 
		"'inline'", "'int'", "'long'", "'register'", "'restrict'", "'return'", 
		"'short'", "'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", 
		"'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'", "'while'", 
		"'_Alignas'", "'_Alignof'", "'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", 
		"'_Imaginary'", "'_Noreturn'", "'_Static_assert'", "'_Thread_local'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", 
		"'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", 
		"'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", 
		"'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", 
		"'^='", "'|='", "'=='", "'!='", "'->'", "'.'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "Define", "ElifDefined", 
		"Elif", "ElseMacro", "Endif", "Ifndef", "Ifdef", "Include", "IfDefined", 
		"IfMacro", "Line", "Pragma", "Undef", "Auto", "Break", "Case", "Char", 
		"Const", "Default", "Do", "Double", "Enum", "Extern", "Float", "For", 
		"Goto", "If", "Inline", "Int", "Long", "Register", "Restrict", "Return", 
		"Short", "Signed", "Sizeof", "Static", "Struct", "Switch", "Typedef", 
		"Union", "Unsigned", "Void", "Volatile", "While", "Alignas", "Alignof", 
		"Atomic", "Bool", "Complex", "Generic", "Imaginary", "Noreturn", "StaticAssert", 
		"ThreadLocal", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
		"LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", 
		"Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", 
		"Question", "Colon", "Semi", "Comma", "Assign", "StarAssign", "DivAssign", 
		"ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", "RightShiftAssign", 
		"AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual", "Arrow", "Dot", 
		"Ellipsis", "Identifier", "Constant", "StringLiteral", "Whitespace", "Newline", 
		"BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "ADTC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ADTCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HeaderContext extends ParserRuleContext {
		public HeaderGuardContext headerGuard() {
			return getRuleContext(HeaderGuardContext.class,0);
		}
		public TerminalNode Endif() { return getToken(ADTCParser.Endif, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			headerGuard();
			setState(192);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << Define) | (1L << Ifndef) | (1L << Ifdef) | (1L << Include) | (1L << IfDefined) | (1L << IfMacro) | (1L << Line) | (1L << Pragma) | (1L << Undef) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Alignas - 65)) | (1L << (Atomic - 65)) | (1L << (Bool - 65)) | (1L << (Complex - 65)) | (1L << (Noreturn - 65)) | (1L << (StaticAssert - 65)) | (1L << (ThreadLocal - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(191);
				translationUnit(0);
				}
			}

			setState(194);
			match(Endif);
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

	public static class HeaderGuardContext extends ParserRuleContext {
		public TerminalNode Ifndef() { return getToken(ADTCParser.Ifndef, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ADTCParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ADTCParser.Identifier, i);
		}
		public TerminalNode Define() { return getToken(ADTCParser.Define, 0); }
		public HeaderGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterHeaderGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitHeaderGuard(this);
		}
	}

	public final HeaderGuardContext headerGuard() throws RecognitionException {
		HeaderGuardContext _localctx = new HeaderGuardContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_headerGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(Ifndef);
			setState(197);
			match(Identifier);
			setState(198);
			match(Define);
			setState(199);
			match(Identifier);
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public BodyListContext bodyList() {
			return getRuleContext(BodyListContext.class,0);
		}
		public PreprocessorListContext preprocessorList() {
			return getRuleContext(PreprocessorListContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitTranslationUnit(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			switch (_input.LA(1)) {
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case Semi:
			case Identifier:
				{
				setState(202);
				bodyList();
				}
				break;
			case Define:
			case Ifndef:
			case Ifdef:
			case Include:
			case IfDefined:
			case IfMacro:
			case Line:
			case Pragma:
			case Undef:
				{
				setState(203);
				preprocessorList(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new TranslationUnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
						setState(206);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(207);
						bodyList();
						}
						break;
					case 2:
						{
						_localctx = new TranslationUnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
						setState(208);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(209);
						preprocessorList(0);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class PreprocessorListContext extends ParserRuleContext {
		public PreprocessorContext preprocessor() {
			return getRuleContext(PreprocessorContext.class,0);
		}
		public PreprocessorListContext preprocessorList() {
			return getRuleContext(PreprocessorListContext.class,0);
		}
		public PreprocessorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterPreprocessorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitPreprocessorList(this);
		}
	}

	public final PreprocessorListContext preprocessorList() throws RecognitionException {
		return preprocessorList(0);
	}

	private PreprocessorListContext preprocessorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PreprocessorListContext _localctx = new PreprocessorListContext(_ctx, _parentState);
		PreprocessorListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_preprocessorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(216);
			preprocessor();
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PreprocessorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_preprocessorList);
					setState(218);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(219);
					preprocessor();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class PreprocessorContext extends ParserRuleContext {
		public IncludeListContext includeList() {
			return getRuleContext(IncludeListContext.class,0);
		}
		public DefineListContext defineList() {
			return getRuleContext(DefineListContext.class,0);
		}
		public UndefListContext undefList() {
			return getRuleContext(UndefListContext.class,0);
		}
		public BooleanMacroContext booleanMacro() {
			return getRuleContext(BooleanMacroContext.class,0);
		}
		public ConditionalMacroListContext conditionalMacroList() {
			return getRuleContext(ConditionalMacroListContext.class,0);
		}
		public LineListContext lineList() {
			return getRuleContext(LineListContext.class,0);
		}
		public PragmaListContext pragmaList() {
			return getRuleContext(PragmaListContext.class,0);
		}
		public PreprocessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterPreprocessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitPreprocessor(this);
		}
	}

	public final PreprocessorContext preprocessor() throws RecognitionException {
		PreprocessorContext _localctx = new PreprocessorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_preprocessor);
		try {
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				includeList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				defineList(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				undefList(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				booleanMacro();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				conditionalMacroList(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				lineList(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(231);
				pragmaList(0);
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

	public static class BooleanMacroContext extends ParserRuleContext {
		public List<TerminalNode> Define() { return getTokens(ADTCParser.Define); }
		public TerminalNode Define(int i) {
			return getToken(ADTCParser.Define, i);
		}
		public BooleanMacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanMacro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterBooleanMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitBooleanMacro(this);
		}
	}

	public final BooleanMacroContext booleanMacro() throws RecognitionException {
		BooleanMacroContext _localctx = new BooleanMacroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_booleanMacro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(Define);
			setState(235);
			match(T__0);
			setState(236);
			match(Define);
			setState(237);
			match(T__1);
			setState(238);
			match(Define);
			setState(239);
			match(T__2);
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

	public static class DefineListContext extends ParserRuleContext {
		public DefineMacroContext defineMacro() {
			return getRuleContext(DefineMacroContext.class,0);
		}
		public DefineListContext defineList() {
			return getRuleContext(DefineListContext.class,0);
		}
		public DefineListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDefineList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDefineList(this);
		}
	}

	public final DefineListContext defineList() throws RecognitionException {
		return defineList(0);
	}

	private DefineListContext defineList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DefineListContext _localctx = new DefineListContext(_ctx, _parentState);
		DefineListContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_defineList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(242);
			defineMacro();
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DefineListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_defineList);
					setState(244);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(245);
					defineMacro();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class DefineMacroContext extends ParserRuleContext {
		public TerminalNode Define() { return getToken(ADTCParser.Define, 0); }
		public DefineDeclaratorContext defineDeclarator() {
			return getRuleContext(DefineDeclaratorContext.class,0);
		}
		public DefineInitializerContext defineInitializer() {
			return getRuleContext(DefineInitializerContext.class,0);
		}
		public DefineMacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineMacro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDefineMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDefineMacro(this);
		}
	}

	public final DefineMacroContext defineMacro() throws RecognitionException {
		DefineMacroContext _localctx = new DefineMacroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defineMacro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(Define);
			setState(252);
			defineDeclarator();
			setState(253);
			defineInitializer();
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

	public static class DefineDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DefineDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDefineDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDefineDeclarator(this);
		}
	}

	public final DefineDeclaratorContext defineDeclarator() throws RecognitionException {
		DefineDeclaratorContext _localctx = new DefineDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defineDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(Identifier);
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(256);
				match(LeftParen);
				setState(258);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(257);
					identifierList(0);
					}
				}

				setState(260);
				match(RightParen);
				}
				break;
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

	public static class DefineInitializerContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public DefineInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDefineInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDefineInitializer(this);
		}
	}

	public final DefineInitializerContext defineInitializer() throws RecognitionException {
		DefineInitializerContext _localctx = new DefineInitializerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defineInitializer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(263);
					matchWildcard();
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					primaryExpression();
					setState(273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(270);
							matchWildcard();
							}
							} 
						}
						setState(275);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class UndefListContext extends ParserRuleContext {
		public UndefContext undef() {
			return getRuleContext(UndefContext.class,0);
		}
		public UndefListContext undefList() {
			return getRuleContext(UndefListContext.class,0);
		}
		public UndefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undefList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterUndefList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitUndefList(this);
		}
	}

	public final UndefListContext undefList() throws RecognitionException {
		return undefList(0);
	}

	private UndefListContext undefList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UndefListContext _localctx = new UndefListContext(_ctx, _parentState);
		UndefListContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_undefList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(282);
			undef();
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UndefListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_undefList);
					setState(284);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(285);
					undef();
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class UndefContext extends ParserRuleContext {
		public TerminalNode Undef() { return getToken(ADTCParser.Undef, 0); }
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public UndefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterUndef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitUndef(this);
		}
	}

	public final UndefContext undef() throws RecognitionException {
		UndefContext _localctx = new UndefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_undef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(Undef);
			setState(292);
			match(Identifier);
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

	public static class ConditionalMacroListContext extends ParserRuleContext {
		public ConditionalMacroContext conditionalMacro() {
			return getRuleContext(ConditionalMacroContext.class,0);
		}
		public ConditionalMacroListContext conditionalMacroList() {
			return getRuleContext(ConditionalMacroListContext.class,0);
		}
		public ConditionalMacroListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalMacroList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterConditionalMacroList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitConditionalMacroList(this);
		}
	}

	public final ConditionalMacroListContext conditionalMacroList() throws RecognitionException {
		return conditionalMacroList(0);
	}

	private ConditionalMacroListContext conditionalMacroList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalMacroListContext _localctx = new ConditionalMacroListContext(_ctx, _parentState);
		ConditionalMacroListContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_conditionalMacroList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(295);
			conditionalMacro();
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalMacroListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalMacroList);
					setState(297);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(298);
					conditionalMacro();
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ConditionalMacroContext extends ParserRuleContext {
		public IfexpressionContext ifexpression() {
			return getRuleContext(IfexpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Endif() { return getToken(ADTCParser.Endif, 0); }
		public TerminalNode IfDefined() { return getToken(ADTCParser.IfDefined, 0); }
		public TerminalNode IfMacro() { return getToken(ADTCParser.IfMacro, 0); }
		public TerminalNode Ifdef() { return getToken(ADTCParser.Ifdef, 0); }
		public TerminalNode Ifndef() { return getToken(ADTCParser.Ifndef, 0); }
		public InnerIfContext innerIf() {
			return getRuleContext(InnerIfContext.class,0);
		}
		public ElseListContext elseList() {
			return getRuleContext(ElseListContext.class,0);
		}
		public ConditionalMacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalMacro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterConditionalMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitConditionalMacro(this);
		}
	}

	public final ConditionalMacroContext conditionalMacro() throws RecognitionException {
		ConditionalMacroContext _localctx = new ConditionalMacroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionalMacro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Ifndef) | (1L << Ifdef) | (1L << IfDefined) | (1L << IfMacro))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(305);
			ifexpression();
			setState(306);
			statement();
			setState(308);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Ifndef) | (1L << Ifdef) | (1L << IfDefined) | (1L << IfMacro))) != 0)) {
				{
				setState(307);
				innerIf(0);
				}
			}

			setState(311);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ElifDefined) | (1L << Elif) | (1L << ElseMacro))) != 0)) {
				{
				setState(310);
				elseList(0);
				}
			}

			setState(313);
			match(Endif);
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

	public static class IfexpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterIfexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitIfexpression(this);
		}
	}

	public final IfexpressionContext ifexpression() throws RecognitionException {
		IfexpressionContext _localctx = new IfexpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifexpression);
		int _la;
		try {
			int _alt;
			setState(347);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(LeftParen);
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(316);
						matchWildcard();
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(329);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Alignof - 66)) | (1L << (Generic - 66)) | (1L << (LeftParen - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (AndAnd - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
					{
					setState(322);
					expression(0);
					setState(326);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(323);
							matchWildcard();
							}
							} 
						}
						setState(328);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					}
					}
				}

				setState(331);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(332);
						matchWildcard();
						}
						} 
					}
					setState(337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(345);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(338);
					expression(0);
					setState(342);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(339);
							matchWildcard();
							}
							} 
						}
						setState(344);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					}
					}
					break;
				}
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

	public static class ElseListContext extends ParserRuleContext {
		public ElsestatementContext elsestatement() {
			return getRuleContext(ElsestatementContext.class,0);
		}
		public InnerIfContext innerIf() {
			return getRuleContext(InnerIfContext.class,0);
		}
		public ElseListContext elseList() {
			return getRuleContext(ElseListContext.class,0);
		}
		public ElseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterElseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitElseList(this);
		}
	}

	public final ElseListContext elseList() throws RecognitionException {
		return elseList(0);
	}

	private ElseListContext elseList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ElseListContext _localctx = new ElseListContext(_ctx, _parentState);
		ElseListContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_elseList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(350);
			elsestatement();
			setState(352);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(351);
				innerIf(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_elseList);
					setState(354);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(355);
					elsestatement();
					}
					} 
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class InnerIfContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public InnerIfContext innerIf() {
			return getRuleContext(InnerIfContext.class,0);
		}
		public InnerIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterInnerIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitInnerIf(this);
		}
	}

	public final InnerIfContext innerIf() throws RecognitionException {
		return innerIf(0);
	}

	private InnerIfContext innerIf(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InnerIfContext _localctx = new InnerIfContext(_ctx, _parentState);
		InnerIfContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_innerIf, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(362);
			ifstatement();
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InnerIfContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_innerIf);
					setState(364);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(365);
					ifstatement();
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode Endif() { return getToken(ADTCParser.Endif, 0); }
		public IfexpressionContext ifexpression() {
			return getRuleContext(IfexpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode IfDefined() { return getToken(ADTCParser.IfDefined, 0); }
		public TerminalNode IfMacro() { return getToken(ADTCParser.IfMacro, 0); }
		public TerminalNode Ifdef() { return getToken(ADTCParser.Ifdef, 0); }
		public TerminalNode Ifndef() { return getToken(ADTCParser.Ifndef, 0); }
		public InnerIfContext innerIf() {
			return getRuleContext(InnerIfContext.class,0);
		}
		public ElseListContext elseList() {
			return getRuleContext(ElseListContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitIfstatement(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Ifndef) | (1L << Ifdef) | (1L << IfDefined) | (1L << IfMacro))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(372);
			ifexpression();
			setState(373);
			statement();
			setState(375);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Ifndef) | (1L << Ifdef) | (1L << IfDefined) | (1L << IfMacro))) != 0)) {
				{
				setState(374);
				innerIf(0);
				}
			}

			setState(378);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ElifDefined) | (1L << Elif) | (1L << ElseMacro))) != 0)) {
				{
				setState(377);
				elseList(0);
				}
			}

			}
			setState(380);
			match(Endif);
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

	public static class ElsestatementContext extends ParserRuleContext {
		public TerminalNode ElifDefined() { return getToken(ADTCParser.ElifDefined, 0); }
		public IfexpressionContext ifexpression() {
			return getRuleContext(IfexpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Elif() { return getToken(ADTCParser.Elif, 0); }
		public TerminalNode ElseMacro() { return getToken(ADTCParser.ElseMacro, 0); }
		public ElsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterElsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitElsestatement(this);
		}
	}

	public final ElsestatementContext elsestatement() throws RecognitionException {
		ElsestatementContext _localctx = new ElsestatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elsestatement);
		try {
			setState(392);
			switch (_input.LA(1)) {
			case ElifDefined:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				match(ElifDefined);
				setState(383);
				ifexpression();
				setState(384);
				statement();
				}
				break;
			case Elif:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(Elif);
				setState(387);
				ifexpression();
				setState(388);
				statement();
				}
				break;
			case ElseMacro:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(ElseMacro);
				setState(391);
				statement();
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(394);
					matchWildcard();
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(407);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(400);
				match(Identifier);
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(401);
						matchWildcard();
						}
						} 
					}
					setState(406);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
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

	public static class LineListContext extends ParserRuleContext {
		public LineDirectiveContext lineDirective() {
			return getRuleContext(LineDirectiveContext.class,0);
		}
		public LineListContext lineList() {
			return getRuleContext(LineListContext.class,0);
		}
		public LineListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterLineList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitLineList(this);
		}
	}

	public final LineListContext lineList() throws RecognitionException {
		return lineList(0);
	}

	private LineListContext lineList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LineListContext _localctx = new LineListContext(_ctx, _parentState);
		LineListContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_lineList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(410);
			lineDirective();
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LineListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lineList);
					setState(412);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(413);
					lineDirective();
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class LineDirectiveContext extends ParserRuleContext {
		public TerminalNode Line() { return getToken(ADTCParser.Line, 0); }
		public TerminalNode Constant() { return getToken(ADTCParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(ADTCParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(ADTCParser.StringLiteral, i);
		}
		public LineDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterLineDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitLineDirective(this);
		}
	}

	public final LineDirectiveContext lineDirective() throws RecognitionException {
		LineDirectiveContext _localctx = new LineDirectiveContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lineDirective);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(Line);
			setState(420);
			match(Constant);
			setState(426);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(422); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(421);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(424); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	public static class PragmaListContext extends ParserRuleContext {
		public PragmaDirectiveContext pragmaDirective() {
			return getRuleContext(PragmaDirectiveContext.class,0);
		}
		public PragmaListContext pragmaList() {
			return getRuleContext(PragmaListContext.class,0);
		}
		public PragmaListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterPragmaList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitPragmaList(this);
		}
	}

	public final PragmaListContext pragmaList() throws RecognitionException {
		return pragmaList(0);
	}

	private PragmaListContext pragmaList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PragmaListContext _localctx = new PragmaListContext(_ctx, _parentState);
		PragmaListContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_pragmaList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(429);
			pragmaDirective();
			}
			_ctx.stop = _input.LT(-1);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PragmaListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pragmaList);
					setState(431);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(432);
					pragmaDirective();
					}
					} 
				}
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public TerminalNode Pragma() { return getToken(ADTCParser.Pragma, 0); }
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(ADTCParser.Constant, 0); }
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitPragmaDirective(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pragmaDirective);
		int _la;
		try {
			setState(448);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(Pragma);
				setState(439);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(440);
				match(Identifier);
				setState(442);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(441);
					match(Constant);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(Pragma);
				setState(445);
				match(T__5);
				setState(446);
				_la = _input.LA(1);
				if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (Plus - 87)) | (1L << (Minus - 87)) | (1L << (Dot - 87)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(447);
				match(Identifier);
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

	public static class IncludeListContext extends ParserRuleContext {
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public IncludeListContext includeList() {
			return getRuleContext(IncludeListContext.class,0);
		}
		public IncludeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterIncludeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitIncludeList(this);
		}
	}

	public final IncludeListContext includeList() throws RecognitionException {
		return includeList(0);
	}

	private IncludeListContext includeList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IncludeListContext _localctx = new IncludeListContext(_ctx, _parentState);
		IncludeListContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_includeList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(451);
			include();
			}
			_ctx.stop = _input.LT(-1);
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IncludeListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_includeList);
					setState(453);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(454);
					include();
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode Include() { return getToken(ADTCParser.Include, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(ADTCParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(ADTCParser.StringLiteral, i);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_include);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(Include);
			setState(462); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(461);
					match(StringLiteral);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(464); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BodyListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BodyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterBodyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitBodyList(this);
		}
	}

	public final BodyListContext bodyList() throws RecognitionException {
		BodyListContext _localctx = new BodyListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bodyList);
		try {
			setState(468);
			switch (_input.LA(1)) {
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				declaration();
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(Semi);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declaration);
		int _la;
		try {
			setState(477);
			switch (_input.LA(1)) {
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case ThreadLocal:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				declarationSpecifiers();
				setState(472);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LeftParen - 75)) | (1L << (Star - 75)) | (1L << (Caret - 75)) | (1L << (Identifier - 75)))) != 0)) {
					{
					setState(471);
					initDeclaratorList(0);
					}
				}

				setState(474);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				staticAssertDeclaration();
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

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDeclarationSpecifiers(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(479);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(482); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDeclarationSpecifier(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declarationSpecifier);
		try {
			setState(489);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				typeSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				alignmentSpecifier();
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitInitDeclaratorList(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(492);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(494);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(495);
					match(Comma);
					setState(496);
					initDeclarator();
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode StaticAssert() { return getToken(ADTCParser.StaticAssert, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(ADTCParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(ADTCParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitStaticAssertDeclaration(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(StaticAssert);
			setState(503);
			match(LeftParen);
			setState(504);
			constantExpression();
			setState(505);
			match(Comma);
			setState(507); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(506);
				match(StringLiteral);
				}
				}
				setState(509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(511);
			match(RightParen);
			setState(512);
			match(Semi);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			conditionalExpression();
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			logicalOrExpression(0);
			setState(522);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(517);
				match(Question);
				setState(518);
				expression(0);
				setState(519);
				match(Colon);
				setState(520);
				conditionalExpression();
				}
				break;
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(525);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(527);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(528);
					match(OrOr);
					setState(529);
					logicalAndExpression(0);
					}
					} 
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(536);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(538);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(539);
					match(AndAnd);
					setState(540);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(547);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(549);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(550);
					match(Or);
					setState(551);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(558);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(560);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(561);
					match(Caret);
					setState(562);
					andExpression(0);
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(569);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(571);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(572);
					match(And);
					setState(573);
					equalityExpression(0);
					}
					} 
				}
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(580);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(588);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(582);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(583);
						match(Equal);
						setState(584);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(585);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(586);
						match(NotEqual);
						setState(587);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(594);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(608);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(596);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(597);
						match(Less);
						setState(598);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(599);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(600);
						match(Greater);
						setState(601);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(602);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(603);
						match(LessEqual);
						setState(604);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(605);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(606);
						match(GreaterEqual);
						setState(607);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(614);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(622);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(616);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(617);
						match(LeftShift);
						setState(618);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(619);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(620);
						match(RightShift);
						setState(621);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(628);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(636);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(630);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(631);
						match(Plus);
						setState(632);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(633);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(634);
						match(Minus);
						setState(635);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(642);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(653);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(644);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(645);
						match(Star);
						setState(646);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(647);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(648);
						match(Div);
						setState(649);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(650);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(651);
						match(Mod);
						setState(652);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_castExpression);
		try {
			setState(670);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(LeftParen);
				setState(660);
				typeName();
				setState(661);
				match(RightParen);
				setState(662);
				castExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				match(T__6);
				setState(665);
				match(LeftParen);
				setState(666);
				typeName();
				setState(667);
				match(RightParen);
				setState(668);
				castExpression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(673);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(675);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(676);
					match(Comma);
					setState(677);
					assignmentExpression();
					}
					} 
				}
				setState(682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_assignmentExpression);
		try {
			setState(688);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				unaryExpression();
				setState(685);
				assignmentOperator();
				setState(686);
				assignmentExpression();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (Assign - 105)) | (1L << (StarAssign - 105)) | (1L << (DivAssign - 105)) | (1L << (ModAssign - 105)) | (1L << (PlusAssign - 105)) | (1L << (MinusAssign - 105)) | (1L << (LeftShiftAssign - 105)) | (1L << (RightShiftAssign - 105)) | (1L << (AndAssign - 105)) | (1L << (XorAssign - 105)) | (1L << (OrAssign - 105)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			specifierQualifierList();
			setState(694);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LeftParen - 75)) | (1L << (LeftBracket - 75)) | (1L << (Star - 75)) | (1L << (Caret - 75)))) != 0)) {
				{
				setState(693);
				abstractDeclarator();
				}
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_unaryExpression);
		try {
			setState(718);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				match(PlusPlus);
				setState(698);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(699);
				match(MinusMinus);
				setState(700);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(701);
				unaryOperator();
				setState(702);
				castExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(704);
				match(Sizeof);
				setState(705);
				unaryExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(706);
				match(Sizeof);
				setState(707);
				match(LeftParen);
				setState(708);
				typeName();
				setState(709);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(711);
				match(Alignof);
				setState(712);
				match(LeftParen);
				setState(713);
				typeName();
				setState(714);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(716);
				match(AndAnd);
				setState(717);
				match(Identifier);
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(721);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(722);
				match(LeftParen);
				setState(723);
				typeName();
				setState(724);
				match(RightParen);
				setState(725);
				match(LeftBrace);
				setState(726);
				initializerList(0);
				setState(727);
				match(RightBrace);
				}
				break;
			case 3:
				{
				setState(729);
				match(LeftParen);
				setState(730);
				typeName();
				setState(731);
				match(RightParen);
				setState(732);
				match(LeftBrace);
				setState(733);
				initializerList(0);
				setState(734);
				match(Comma);
				setState(735);
				match(RightBrace);
				}
				break;
			case 4:
				{
				setState(737);
				match(T__6);
				setState(738);
				match(LeftParen);
				setState(739);
				typeName();
				setState(740);
				match(RightParen);
				setState(741);
				match(LeftBrace);
				setState(742);
				initializerList(0);
				setState(743);
				match(RightBrace);
				}
				break;
			case 5:
				{
				setState(745);
				match(T__6);
				setState(746);
				match(LeftParen);
				setState(747);
				typeName();
				setState(748);
				match(RightParen);
				setState(749);
				match(LeftBrace);
				setState(750);
				initializerList(0);
				setState(751);
				match(Comma);
				setState(752);
				match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(777);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(756);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(757);
						match(LeftBracket);
						setState(758);
						expression(0);
						setState(759);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(761);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(762);
						match(LeftParen);
						setState(764);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Alignof - 66)) | (1L << (Generic - 66)) | (1L << (LeftParen - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (AndAnd - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
							{
							setState(763);
							argumentExpressionList(0);
							}
						}

						setState(766);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(767);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(768);
						match(Dot);
						setState(769);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(770);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(771);
						match(Arrow);
						setState(772);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(773);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(774);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(775);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(776);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitArgumentExpressionList(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(783);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(790);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(785);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(786);
					match(Comma);
					setState(787);
					assignmentExpression();
					}
					} 
				}
				setState(792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (Plus - 87)) | (1L << (Minus - 87)) | (1L << (Star - 87)) | (1L << (And - 87)) | (1L << (Not - 87)) | (1L << (Tilde - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitInitDeclarator(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_initDeclarator);
		try {
			setState(800);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				declarator();
				setState(797);
				match(Assign);
				setState(798);
				initializer();
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

	public static class InitializerContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_initializer);
		int _la;
		try {
			setState(813);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				match(LeftBrace);
				setState(805);
				_la = _input.LA(1);
				if (_la==T__7 || _la==T__8 || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Generic - 70)) | (1L << (LeftParen - 70)) | (1L << (LeftBracket - 70)) | (1L << (LeftBrace - 70)) | (1L << (Dot - 70)) | (1L << (Identifier - 70)) | (1L << (Constant - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(804);
					initializerList(0);
					}
				}

				setState(807);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				match(LeftBrace);
				setState(809);
				initializerList(0);
				setState(810);
				match(Comma);
				setState(811);
				match(RightBrace);
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

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitInitializerList(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_initializerList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(817);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(816);
				designation();
				}
			}

			setState(819);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(829);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(821);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(822);
					match(Comma);
					setState(824);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(823);
						designation();
						}
					}

					setState(826);
					initializer();
					}
					} 
				}
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDesignation(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			designatorList(0);
			setState(833);
			match(Assign);
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

	public static class DesignatorListContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDesignatorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDesignatorList(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		return designatorList(0);
	}

	private DesignatorListContext designatorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, _parentState);
		DesignatorListContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_designatorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(836);
			designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(838);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(839);
					designator();
					}
					} 
				}
				setState(844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class DesignatorContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_designator);
		try {
			setState(851);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				match(LeftBracket);
				setState(846);
				primaryExpression();
				setState(847);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				match(Dot);
				setState(850);
				match(Identifier);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(ADTCParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(ADTCParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(ADTCParser.StringLiteral, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_primaryExpression);
		try {
			int _alt;
			setState(879);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				match(Identifier);
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				match(Constant);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(856); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(855);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(858); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(860);
				match(LeftParen);
				setState(861);
				expression(0);
				setState(862);
				match(RightParen);
				}
				break;
			case Generic:
				enterOuterAlt(_localctx, 5);
				{
				setState(864);
				genericSelection();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(865);
				match(T__7);
				setState(866);
				match(LeftParen);
				setState(867);
				unaryExpression();
				setState(868);
				match(Comma);
				setState(869);
				typeName();
				setState(870);
				match(RightParen);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(872);
				match(T__8);
				setState(873);
				match(LeftParen);
				setState(874);
				typeName();
				setState(875);
				match(Comma);
				setState(876);
				unaryExpression();
				setState(877);
				match(RightParen);
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

	public static class GenericSelectionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterGenericSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitGenericSelection(this);
		}
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(Generic);
			setState(882);
			match(LeftParen);
			setState(883);
			assignmentExpression();
			setState(884);
			match(Comma);
			setState(885);
			genericAssocList(0);
			setState(886);
			match(RightParen);
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

	public static class GenericAssocListContext extends ParserRuleContext {
		public GenericAssociationContext genericAssociation() {
			return getRuleContext(GenericAssociationContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterGenericAssocList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitGenericAssocList(this);
		}
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		return genericAssocList(0);
	}

	private GenericAssocListContext genericAssocList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, _parentState);
		GenericAssocListContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_genericAssocList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(889);
			genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(896);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GenericAssocListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_genericAssocList);
					setState(891);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(892);
					match(Comma);
					setState(893);
					genericAssociation();
					}
					} 
				}
				setState(898);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class GenericAssociationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterGenericAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitGenericAssociation(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_genericAssociation);
		try {
			setState(906);
			switch (_input.LA(1)) {
			case T__6:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				typeName();
				setState(900);
				match(Colon);
				setState(901);
				assignmentExpression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				match(Default);
				setState(904);
				match(Colon);
				setState(905);
				assignmentExpression();
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

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterAlignmentSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitAlignmentSpecifier(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_alignmentSpecifier);
		try {
			setState(918);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				match(Alignas);
				setState(909);
				match(LeftParen);
				setState(910);
				typeName();
				setState(911);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(913);
				match(Alignas);
				setState(914);
				match(LeftParen);
				setState(915);
				constantExpression();
				setState(916);
				match(RightParen);
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

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitFunctionSpecifier(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_functionSpecifier);
		int _la;
		try {
			setState(926);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				_la = _input.LA(1);
				if ( !(((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__10 - 10)) | (1L << (Inline - 10)) | (1L << (Noreturn - 10)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				gccAttributeSpecifier();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(922);
				match(T__11);
				setState(923);
				match(LeftParen);
				setState(924);
				match(Identifier);
				setState(925);
				match(RightParen);
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

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterGccAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitGccAttributeSpecifier(this);
		}
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(T__12);
			setState(929);
			match(LeftParen);
			setState(930);
			match(LeftParen);
			setState(931);
			gccAttributeList();
			setState(932);
			match(RightParen);
			setState(933);
			match(RightParen);
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

	public static class GccAttributeListContext extends ParserRuleContext {
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterGccAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitGccAttributeList(this);
		}
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_gccAttributeList);
		int _la;
		try {
			setState(944);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				gccAttribute();
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(936);
					match(Comma);
					setState(937);
					gccAttribute();
					}
					}
					setState(942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class GccAttributeContext extends ParserRuleContext {
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterGccAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitGccAttribute(this);
		}
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_gccAttribute);
		int _la;
		try {
			setState(955);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case Define:
			case ElifDefined:
			case Elif:
			case ElseMacro:
			case Endif:
			case Ifndef:
			case Ifdef:
			case Include:
			case IfDefined:
			case IfMacro:
			case Line:
			case Pragma:
			case Undef:
			case Auto:
			case Break:
			case Case:
			case Char:
			case Const:
			case Default:
			case Do:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case For:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Struct:
			case Switch:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case While:
			case Alignas:
			case Alignof:
			case Atomic:
			case Bool:
			case Complex:
			case Generic:
			case Imaginary:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftBracket:
			case RightBracket:
			case LeftBrace:
			case RightBrace:
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case LeftShift:
			case RightShift:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case Div:
			case Mod:
			case And:
			case Or:
			case AndAnd:
			case OrOr:
			case Caret:
			case Not:
			case Tilde:
			case Question:
			case Colon:
			case Semi:
			case Assign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case PlusAssign:
			case MinusAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case AndAssign:
			case XorAssign:
			case OrAssign:
			case Equal:
			case NotEqual:
			case Arrow:
			case Dot:
			case Ellipsis:
			case Identifier:
			case Constant:
			case StringLiteral:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LeftParen - 75)) | (1L << (RightParen - 75)) | (1L << (Comma - 75)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(952);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(947);
					match(LeftParen);
					setState(949);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Alignof - 66)) | (1L << (Generic - 66)) | (1L << (LeftParen - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (AndAnd - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
						{
						setState(948);
						argumentExpressionList(0);
						}
					}

					setState(951);
					match(RightParen);
					}
				}

				}
				break;
			case RightParen:
			case Comma:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitStorageClassSpecifier(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (Auto - 33)) | (1L << (Extern - 33)) | (1L << (Register - 33)) | (1L << (Static - 33)) | (1L << (Typedef - 33)) | (1L << (ThreadLocal - 33)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_typeSpecifier);
		int _la;
		try {
			setState(973);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Complex:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				_la = _input.LA(1);
				if ( !(((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__14 - 14)) | (1L << (T__15 - 14)) | (1L << (T__16 - 14)) | (1L << (Char - 14)) | (1L << (Double - 14)) | (1L << (Float - 14)) | (1L << (Int - 14)) | (1L << (Long - 14)) | (1L << (Short - 14)) | (1L << (Signed - 14)) | (1L << (Unsigned - 14)) | (1L << (Void - 14)) | (1L << (Bool - 14)) | (1L << (Complex - 14)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				match(T__6);
				setState(961);
				match(LeftParen);
				setState(962);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(963);
				match(RightParen);
				}
				break;
			case Atomic:
				enterOuterAlt(_localctx, 3);
				{
				setState(964);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 4);
				{
				setState(965);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 5);
				{
				setState(966);
				enumSpecifier();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(967);
				typedefName();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(968);
				match(T__17);
				setState(969);
				match(LeftParen);
				setState(970);
				constantExpression();
				setState(971);
				match(RightParen);
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

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterAtomicTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitAtomicTypeSpecifier(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(Atomic);
			setState(976);
			match(LeftParen);
			setState(977);
			typeName();
			setState(978);
			match(RightParen);
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

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterStructOrUnionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitStructOrUnionSpecifier(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(993);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(980);
				structOrUnion();
				setState(982);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(981);
					match(Identifier);
					}
				}

				setState(984);
				match(LeftBrace);
				setState(986);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Atomic - 67)) | (1L << (Bool - 67)) | (1L << (Complex - 67)) | (1L << (StaticAssert - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(985);
					structDeclarationList(0);
					}
				}

				setState(988);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				structOrUnion();
				setState(991);
				match(Identifier);
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

	public static class StructOrUnionContext extends ParserRuleContext {
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterStructOrUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitStructOrUnion(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_structDeclaration);
		int _la;
		try {
			setState(1004);
			switch (_input.LA(1)) {
			case T__6:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				specifierQualifierList();
				setState(999);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LeftParen - 75)) | (1L << (Star - 75)) | (1L << (Caret - 75)) | (1L << (Colon - 75)) | (1L << (Identifier - 75)))) != 0)) {
					{
					setState(998);
					structDeclaratorList(0);
					}
				}

				setState(1001);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				staticAssertDeclaration();
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

	public static class StructDeclarationListContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterStructDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitStructDeclarationList(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		return structDeclarationList(0);
	}

	private StructDeclarationListContext structDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, _parentState);
		StructDeclarationListContext _prevctx = _localctx;
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_structDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1007);
			structDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1013);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclarationList);
					setState(1009);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1010);
					structDeclaration();
					}
					} 
				}
				setState(1015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitSpecifierQualifierList(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_specifierQualifierList);
		try {
			setState(1024);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				typeSpecifier();
				setState(1018);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1017);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				typeQualifier();
				setState(1022);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1021);
					specifierQualifierList();
					}
					break;
				}
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitTypeQualifier(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Const - 37)) | (1L << (Restrict - 37)) | (1L << (Atomic - 37)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public StructDeclaratorContext structDeclarator() {
			return getRuleContext(StructDeclaratorContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitStructDeclaratorList(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		return structDeclaratorList(0);
	}

	private StructDeclaratorListContext structDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, _parentState);
		StructDeclaratorListContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_structDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1029);
			structDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1036);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclaratorList);
					setState(1031);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1032);
					match(Comma);
					setState(1033);
					structDeclarator();
					}
					} 
				}
				setState(1038);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitStructDeclarator(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_structDeclarator);
		int _la;
		try {
			setState(1045);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1039);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LeftParen - 75)) | (1L << (Star - 75)) | (1L << (Caret - 75)) | (1L << (Identifier - 75)))) != 0)) {
					{
					setState(1040);
					declarator();
					}
				}

				setState(1043);
				match(Colon);
				setState(1044);
				constantExpression();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(1047);
				pointer();
				}
			}

			setState(1050);
			directDeclarator(0);
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

	public static class PointerContext extends ParserRuleContext {
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_pointer);
		int _la;
		try {
			setState(1070);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				match(Star);
				setState(1054);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1053);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1056);
				match(Star);
				setState(1058);
				_la = _input.LA(1);
				if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Const - 37)) | (1L << (Restrict - 37)) | (1L << (Atomic - 37)))) != 0)) {
					{
					setState(1057);
					typeQualifierList(0);
					}
				}

				setState(1060);
				pointer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1061);
				match(Caret);
				setState(1063);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1062);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1065);
				match(Caret);
				setState(1067);
				_la = _input.LA(1);
				if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Const - 37)) | (1L << (Restrict - 37)) | (1L << (Atomic - 37)))) != 0)) {
					{
					setState(1066);
					typeQualifierList(0);
					}
				}

				setState(1069);
				pointer();
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(ADTCParser.Static, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDirectDeclarator(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(1073);
				match(Identifier);
				}
				break;
			case LeftParen:
				{
				setState(1074);
				match(LeftParen);
				setState(1075);
				declarator();
				setState(1076);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1123);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(1080);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1081);
						match(LeftBracket);
						setState(1083);
						_la = _input.LA(1);
						if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Const - 37)) | (1L << (Restrict - 37)) | (1L << (Atomic - 37)))) != 0)) {
							{
							setState(1082);
							typeQualifierList(0);
							}
						}

						setState(1086);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Alignof - 66)) | (1L << (Generic - 66)) | (1L << (LeftParen - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (AndAnd - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
							{
							setState(1085);
							assignmentExpression();
							}
						}

						setState(1088);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(1089);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1090);
						match(LeftBracket);
						setState(1091);
						match(Static);
						setState(1093);
						_la = _input.LA(1);
						if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Const - 37)) | (1L << (Restrict - 37)) | (1L << (Atomic - 37)))) != 0)) {
							{
							setState(1092);
							typeQualifierList(0);
							}
						}

						setState(1095);
						assignmentExpression();
						setState(1096);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(1098);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1099);
						match(LeftBracket);
						setState(1100);
						typeQualifierList(0);
						setState(1101);
						match(Static);
						setState(1102);
						assignmentExpression();
						setState(1103);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(1105);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1106);
						match(LeftBracket);
						setState(1108);
						_la = _input.LA(1);
						if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Const - 37)) | (1L << (Restrict - 37)) | (1L << (Atomic - 37)))) != 0)) {
							{
							setState(1107);
							typeQualifierList(0);
							}
						}

						setState(1110);
						match(Star);
						setState(1111);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(1112);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1113);
						match(LeftParen);
						setState(1114);
						parameterTypeList();
						setState(1115);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(1117);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1118);
						match(LeftParen);
						setState(1120);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(1119);
							identifierList(0);
							}
						}

						setState(1122);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(1127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterParameterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitParameterTypeList(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_parameterTypeList);
		try {
			setState(1133);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				parameterList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1129);
				parameterList(0);
				setState(1130);
				match(Comma);
				setState(1131);
				match(Ellipsis);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1136);
			parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(1138);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1139);
					match(Comma);
					setState(1140);
					parameterDeclaration();
					}
					} 
				}
				setState(1145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_parameterDeclaration);
		try {
			setState(1153);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146);
				declarationSpecifiers();
				setState(1147);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149);
				declarationSpecifiers();
				setState(1151);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1150);
					abstractDeclarator();
					}
					break;
				}
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

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitAbstractDeclarator(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_abstractDeclarator);
		int _la;
		try {
			int _alt;
			setState(1166);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1157);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(1156);
					pointer();
					}
				}

				setState(1159);
				directAbstractDeclarator(0);
				setState(1163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1160);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
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

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(ADTCParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(ADTCParser.StringLiteral, i);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterGccDeclaratorExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitGccDeclaratorExtension(this);
		}
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(1177);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(1168);
				match(T__18);
				setState(1169);
				match(LeftParen);
				setState(1171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1170);
					match(StringLiteral);
					}
					}
					setState(1173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(1175);
				match(RightParen);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(1176);
				gccAttributeSpecifier();
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

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(ADTCParser.Static, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitDirectAbstractDeclarator(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1180);
				match(LeftParen);
				setState(1181);
				abstractDeclarator();
				setState(1182);
				match(RightParen);
				setState(1186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1183);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1189);
				match(LeftBracket);
				setState(1191);
				_la = _input.LA(1);
				if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Const - 37)) | (1L << (Restrict - 37)) | (1L << (Atomic - 37)))) != 0)) {
					{
					setState(1190);
					typeQualifierList(0);
					}
				}

				setState(1194);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Alignof - 66)) | (1L << (Generic - 66)) | (1L << (LeftParen - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (AndAnd - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
					{
					setState(1193);
					assignmentExpression();
					}
				}

				setState(1196);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(1197);
				match(LeftBracket);
				setState(1198);
				match(Static);
				setState(1200);
				_la = _input.LA(1);
				if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Const - 37)) | (1L << (Restrict - 37)) | (1L << (Atomic - 37)))) != 0)) {
					{
					setState(1199);
					typeQualifierList(0);
					}
				}

				setState(1202);
				assignmentExpression();
				setState(1203);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(1205);
				match(LeftBracket);
				setState(1206);
				typeQualifierList(0);
				setState(1207);
				match(Static);
				setState(1208);
				assignmentExpression();
				setState(1209);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(1211);
				match(LeftBracket);
				setState(1212);
				match(Star);
				setState(1213);
				match(RightBracket);
				}
				break;
			case 6:
				{
				setState(1214);
				match(LeftParen);
				setState(1216);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Alignas - 65)) | (1L << (Atomic - 65)) | (1L << (Bool - 65)) | (1L << (Complex - 65)) | (1L << (Noreturn - 65)) | (1L << (ThreadLocal - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1215);
					parameterTypeList();
					}
				}

				setState(1218);
				match(RightParen);
				setState(1222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1219);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1224);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1268);
					switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1227);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1228);
						match(LeftBracket);
						setState(1230);
						_la = _input.LA(1);
						if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Const - 37)) | (1L << (Restrict - 37)) | (1L << (Atomic - 37)))) != 0)) {
							{
							setState(1229);
							typeQualifierList(0);
							}
						}

						setState(1233);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Alignof - 66)) | (1L << (Generic - 66)) | (1L << (LeftParen - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (AndAnd - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
							{
							setState(1232);
							assignmentExpression();
							}
						}

						setState(1235);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1236);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1237);
						match(LeftBracket);
						setState(1238);
						match(Static);
						setState(1240);
						_la = _input.LA(1);
						if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Const - 37)) | (1L << (Restrict - 37)) | (1L << (Atomic - 37)))) != 0)) {
							{
							setState(1239);
							typeQualifierList(0);
							}
						}

						setState(1242);
						assignmentExpression();
						setState(1243);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1245);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1246);
						match(LeftBracket);
						setState(1247);
						typeQualifierList(0);
						setState(1248);
						match(Static);
						setState(1249);
						assignmentExpression();
						setState(1250);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1252);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1253);
						match(LeftBracket);
						setState(1254);
						match(Star);
						setState(1255);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1256);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1257);
						match(LeftParen);
						setState(1259);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Alignas - 65)) | (1L << (Atomic - 65)) | (1L << (Bool - 65)) | (1L << (Complex - 65)) | (1L << (Noreturn - 65)) | (1L << (ThreadLocal - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1258);
							parameterTypeList();
							}
						}

						setState(1261);
						match(RightParen);
						setState(1265);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1262);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(1267);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(1272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1274);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(1281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(1276);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1277);
					match(Comma);
					setState(1278);
					match(Identifier);
					}
					} 
				}
				setState(1283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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

	public static class TypeQualifierListContext extends ParserRuleContext {
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterTypeQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitTypeQualifierList(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		return typeQualifierList(0);
	}

	private TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1285);
			typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(1287);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1288);
					typeQualifier();
					}
					} 
				}
				setState(1293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
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

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitTypedefName(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(Identifier);
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(ADTCParser.Enum, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitEnumSpecifier(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_enumSpecifier);
		int _la;
		try {
			setState(1315);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				match(Enum);
				setState(1298);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1297);
					match(Identifier);
					}
				}

				setState(1300);
				match(LeftBrace);
				setState(1301);
				enumeratorList(0);
				setState(1302);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1304);
				match(Enum);
				setState(1306);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1305);
					match(Identifier);
					}
				}

				setState(1308);
				match(LeftBrace);
				setState(1309);
				enumeratorList(0);
				setState(1310);
				match(Comma);
				setState(1311);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1313);
				match(Enum);
				setState(1314);
				match(Identifier);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitEnumeratorList(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		return enumeratorList(0);
	}

	private EnumeratorListContext enumeratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, _parentState);
		EnumeratorListContext _prevctx = _localctx;
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_enumeratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1318);
			enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(1320);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1321);
					match(Comma);
					setState(1322);
					enumerator();
					}
					} 
				}
				setState(1327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumerator);
		try {
			setState(1333);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				enumerationConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329);
				enumerationConstant();
				setState(1330);
				match(Assign);
				setState(1331);
				constantExpression();
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

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ADTCParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).enterEnumerationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ADTCListener ) ((ADTCListener)listener).exitEnumerationConstant(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			match(Identifier);
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
		case 2:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 3:
			return preprocessorList_sempred((PreprocessorListContext)_localctx, predIndex);
		case 6:
			return defineList_sempred((DefineListContext)_localctx, predIndex);
		case 10:
			return undefList_sempred((UndefListContext)_localctx, predIndex);
		case 12:
			return conditionalMacroList_sempred((ConditionalMacroListContext)_localctx, predIndex);
		case 15:
			return elseList_sempred((ElseListContext)_localctx, predIndex);
		case 16:
			return innerIf_sempred((InnerIfContext)_localctx, predIndex);
		case 20:
			return lineList_sempred((LineListContext)_localctx, predIndex);
		case 22:
			return pragmaList_sempred((PragmaListContext)_localctx, predIndex);
		case 24:
			return includeList_sempred((IncludeListContext)_localctx, predIndex);
		case 30:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 34:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 35:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 36:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 37:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 38:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 39:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 40:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 41:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 42:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 43:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 45:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 50:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 51:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 55:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 57:
			return designatorList_sempred((DesignatorListContext)_localctx, predIndex);
		case 61:
			return genericAssocList_sempred((GenericAssocListContext)_localctx, predIndex);
		case 74:
			return structDeclarationList_sempred((StructDeclarationListContext)_localctx, predIndex);
		case 77:
			return structDeclaratorList_sempred((StructDeclaratorListContext)_localctx, predIndex);
		case 81:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 83:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 87:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		case 88:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 89:
			return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);
		case 92:
			return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean preprocessorList_sempred(PreprocessorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean defineList_sempred(DefineListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean undefList_sempred(UndefListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalMacroList_sempred(ConditionalMacroListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean elseList_sempred(ElseListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean innerIf_sempred(InnerIfContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lineList_sempred(LineListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pragmaList_sempred(PragmaListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean includeList_sempred(IncludeListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 4);
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 2);
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 2);
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 3);
		case 28:
			return precpred(_ctx, 2);
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 10);
		case 32:
			return precpred(_ctx, 9);
		case 33:
			return precpred(_ctx, 8);
		case 34:
			return precpred(_ctx, 7);
		case 35:
			return precpred(_ctx, 6);
		case 36:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean genericAssocList_sempred(GenericAssocListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclarationList_sempred(StructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclaratorList_sempred(StructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return precpred(_ctx, 6);
		case 44:
			return precpred(_ctx, 5);
		case 45:
			return precpred(_ctx, 4);
		case 46:
			return precpred(_ctx, 3);
		case 47:
			return precpred(_ctx, 2);
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 5);
		case 51:
			return precpred(_ctx, 4);
		case 52:
			return precpred(_ctx, 3);
		case 53:
			return precpred(_ctx, 2);
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 57:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0081\u053c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\3\2\3\2\5\2\u00c3\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4"+
		"\u00cf\n\4\3\4\3\4\3\4\3\4\7\4\u00d5\n\4\f\4\16\4\u00d8\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\7\5\u00df\n\5\f\5\16\5\u00e2\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00eb\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00f9"+
		"\n\b\f\b\16\b\u00fc\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u0105\n\n\3\n"+
		"\5\n\u0108\n\n\3\13\7\13\u010b\n\13\f\13\16\13\u010e\13\13\3\13\3\13\7"+
		"\13\u0112\n\13\f\13\16\13\u0115\13\13\7\13\u0117\n\13\f\13\16\13\u011a"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\7\f\u0121\n\f\f\f\16\f\u0124\13\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\7\16\u012e\n\16\f\16\16\16\u0131\13\16\3\17"+
		"\3\17\3\17\3\17\5\17\u0137\n\17\3\17\5\17\u013a\n\17\3\17\3\17\3\20\3"+
		"\20\7\20\u0140\n\20\f\20\16\20\u0143\13\20\3\20\3\20\7\20\u0147\n\20\f"+
		"\20\16\20\u014a\13\20\5\20\u014c\n\20\3\20\3\20\7\20\u0150\n\20\f\20\16"+
		"\20\u0153\13\20\3\20\3\20\7\20\u0157\n\20\f\20\16\20\u015a\13\20\5\20"+
		"\u015c\n\20\5\20\u015e\n\20\3\21\3\21\3\21\5\21\u0163\n\21\3\21\3\21\7"+
		"\21\u0167\n\21\f\21\16\21\u016a\13\21\3\22\3\22\3\22\3\22\3\22\7\22\u0171"+
		"\n\22\f\22\16\22\u0174\13\22\3\23\3\23\3\23\3\23\5\23\u017a\n\23\3\23"+
		"\5\23\u017d\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u018b\n\24\3\25\7\25\u018e\n\25\f\25\16\25\u0191\13\25\3\25"+
		"\3\25\7\25\u0195\n\25\f\25\16\25\u0198\13\25\5\25\u019a\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u01a1\n\26\f\26\16\26\u01a4\13\26\3\27\3\27\3\27"+
		"\6\27\u01a9\n\27\r\27\16\27\u01aa\5\27\u01ad\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u01b4\n\30\f\30\16\30\u01b7\13\30\3\31\3\31\3\31\3\31\5\31"+
		"\u01bd\n\31\3\31\3\31\3\31\3\31\5\31\u01c3\n\31\3\32\3\32\3\32\3\32\3"+
		"\32\7\32\u01ca\n\32\f\32\16\32\u01cd\13\32\3\33\3\33\6\33\u01d1\n\33\r"+
		"\33\16\33\u01d2\3\34\3\34\5\34\u01d7\n\34\3\35\3\35\5\35\u01db\n\35\3"+
		"\35\3\35\3\35\5\35\u01e0\n\35\3\36\6\36\u01e3\n\36\r\36\16\36\u01e4\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u01ec\n\37\3 \3 \3 \3 \3 \3 \7 \u01f4\n "+
		"\f \16 \u01f7\13 \3!\3!\3!\3!\3!\6!\u01fe\n!\r!\16!\u01ff\3!\3!\3!\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\5#\u020d\n#\3$\3$\3$\3$\3$\3$\7$\u0215\n$\f$\16"+
		"$\u0218\13$\3%\3%\3%\3%\3%\3%\7%\u0220\n%\f%\16%\u0223\13%\3&\3&\3&\3"+
		"&\3&\3&\7&\u022b\n&\f&\16&\u022e\13&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0236"+
		"\n\'\f\'\16\'\u0239\13\'\3(\3(\3(\3(\3(\3(\7(\u0241\n(\f(\16(\u0244\13"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u024f\n)\f)\16)\u0252\13)\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u0263\n*\f*\16*\u0266\13*\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\7+\u0271\n+\f+\16+\u0274\13+\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\7,\u027f\n,\f,\16,\u0282\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\7-\u0290\n-\f-\16-\u0293\13-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5."+
		"\u02a1\n.\3/\3/\3/\3/\3/\3/\7/\u02a9\n/\f/\16/\u02ac\13/\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u02b3\n\60\3\61\3\61\3\62\3\62\5\62\u02b9\n\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02d1\n\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u02f5\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u02ff\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64"+
		"\u030c\n\64\f\64\16\64\u030f\13\64\3\65\3\65\3\65\3\65\3\65\3\65\7\65"+
		"\u0317\n\65\f\65\16\65\u031a\13\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u0323\n\67\38\38\38\58\u0328\n8\38\38\38\38\38\38\58\u0330\n8\3"+
		"9\39\59\u0334\n9\39\39\39\39\39\59\u033b\n9\39\79\u033e\n9\f9\169\u0341"+
		"\139\3:\3:\3:\3;\3;\3;\3;\3;\7;\u034b\n;\f;\16;\u034e\13;\3<\3<\3<\3<"+
		"\3<\3<\5<\u0356\n<\3=\3=\3=\6=\u035b\n=\r=\16=\u035c\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0372\n=\3>\3>\3>\3>\3>\3"+
		">\3>\3?\3?\3?\3?\3?\3?\7?\u0381\n?\f?\16?\u0384\13?\3@\3@\3@\3@\3@\3@"+
		"\3@\5@\u038d\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0399\nA\3B\3B\3B\3B"+
		"\3B\3B\5B\u03a1\nB\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\7D\u03ad\nD\fD\16D\u03b0"+
		"\13D\3D\5D\u03b3\nD\3E\3E\3E\5E\u03b8\nE\3E\5E\u03bb\nE\3E\5E\u03be\n"+
		"E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u03d0\nG\3H\3H\3"+
		"H\3H\3H\3I\3I\5I\u03d9\nI\3I\3I\5I\u03dd\nI\3I\3I\3I\3I\3I\5I\u03e4\n"+
		"I\3J\3J\3K\3K\5K\u03ea\nK\3K\3K\3K\5K\u03ef\nK\3L\3L\3L\3L\3L\7L\u03f6"+
		"\nL\fL\16L\u03f9\13L\3M\3M\5M\u03fd\nM\3M\3M\5M\u0401\nM\5M\u0403\nM\3"+
		"N\3N\3O\3O\3O\3O\3O\3O\7O\u040d\nO\fO\16O\u0410\13O\3P\3P\5P\u0414\nP"+
		"\3P\3P\5P\u0418\nP\3Q\5Q\u041b\nQ\3Q\3Q\3R\3R\5R\u0421\nR\3R\3R\5R\u0425"+
		"\nR\3R\3R\3R\5R\u042a\nR\3R\3R\5R\u042e\nR\3R\5R\u0431\nR\3S\3S\3S\3S"+
		"\3S\3S\5S\u0439\nS\3S\3S\3S\5S\u043e\nS\3S\5S\u0441\nS\3S\3S\3S\3S\3S"+
		"\5S\u0448\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0457\nS\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0463\nS\3S\7S\u0466\nS\fS\16S\u0469\13S\3"+
		"T\3T\3T\3T\3T\5T\u0470\nT\3U\3U\3U\3U\3U\3U\7U\u0478\nU\fU\16U\u047b\13"+
		"U\3V\3V\3V\3V\3V\5V\u0482\nV\5V\u0484\nV\3W\3W\5W\u0488\nW\3W\3W\7W\u048c"+
		"\nW\fW\16W\u048f\13W\5W\u0491\nW\3X\3X\3X\6X\u0496\nX\rX\16X\u0497\3X"+
		"\3X\5X\u049c\nX\3Y\3Y\3Y\3Y\3Y\7Y\u04a3\nY\fY\16Y\u04a6\13Y\3Y\3Y\5Y\u04aa"+
		"\nY\3Y\5Y\u04ad\nY\3Y\3Y\3Y\3Y\5Y\u04b3\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\5Y\u04c3\nY\3Y\3Y\7Y\u04c7\nY\fY\16Y\u04ca\13Y\5Y\u04cc"+
		"\nY\3Y\3Y\3Y\5Y\u04d1\nY\3Y\5Y\u04d4\nY\3Y\3Y\3Y\3Y\3Y\5Y\u04db\nY\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04ee\nY\3Y\3Y\7Y"+
		"\u04f2\nY\fY\16Y\u04f5\13Y\7Y\u04f7\nY\fY\16Y\u04fa\13Y\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\7Z\u0502\nZ\fZ\16Z\u0505\13Z\3[\3[\3[\3[\3[\7[\u050c\n[\f[\16[\u050f"+
		"\13[\3\\\3\\\3]\3]\5]\u0515\n]\3]\3]\3]\3]\3]\3]\5]\u051d\n]\3]\3]\3]"+
		"\3]\3]\3]\3]\5]\u0526\n]\3^\3^\3^\3^\3^\3^\7^\u052e\n^\f^\16^\u0531\13"+
		"^\3_\3_\3_\3_\3_\5_\u0538\n_\3`\3`\3`\n\u010c\u0113\u0141\u0148\u0151"+
		"\u0158\u018f\u0196%\6\b\16\26\32 \"*.\62>FHJLNPRTVX\\fhpt|\u0096\u009c"+
		"\u00a4\u00a8\u00b0\u00b2\u00b4\u00baa\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\2\16\4\2\33\34\36\37\3\2\6"+
		"\7\5\2YY[[yy\3\2ku\7\2YY[[]]``ef\5\2\f\r\61\61JJ\4\2MNjj\b\2##,,\64\64"+
		"::==LL\n\2\20\23&&**--\62\63\678?@FG\3\2\21\23\4\2;;>>\5\2\'\'\65\65E"+
		"E\u05a5\2\u00c0\3\2\2\2\4\u00c6\3\2\2\2\6\u00ce\3\2\2\2\b\u00d9\3\2\2"+
		"\2\n\u00ea\3\2\2\2\f\u00ec\3\2\2\2\16\u00f3\3\2\2\2\20\u00fd\3\2\2\2\22"+
		"\u0101\3\2\2\2\24\u010c\3\2\2\2\26\u011b\3\2\2\2\30\u0125\3\2\2\2\32\u0128"+
		"\3\2\2\2\34\u0132\3\2\2\2\36\u015d\3\2\2\2 \u015f\3\2\2\2\"\u016b\3\2"+
		"\2\2$\u0175\3\2\2\2&\u018a\3\2\2\2(\u018f\3\2\2\2*\u019b\3\2\2\2,\u01a5"+
		"\3\2\2\2.\u01ae\3\2\2\2\60\u01c2\3\2\2\2\62\u01c4\3\2\2\2\64\u01ce\3\2"+
		"\2\2\66\u01d6\3\2\2\28\u01df\3\2\2\2:\u01e2\3\2\2\2<\u01eb\3\2\2\2>\u01ed"+
		"\3\2\2\2@\u01f8\3\2\2\2B\u0204\3\2\2\2D\u0206\3\2\2\2F\u020e\3\2\2\2H"+
		"\u0219\3\2\2\2J\u0224\3\2\2\2L\u022f\3\2\2\2N\u023a\3\2\2\2P\u0245\3\2"+
		"\2\2R\u0253\3\2\2\2T\u0267\3\2\2\2V\u0275\3\2\2\2X\u0283\3\2\2\2Z\u02a0"+
		"\3\2\2\2\\\u02a2\3\2\2\2^\u02b2\3\2\2\2`\u02b4\3\2\2\2b\u02b6\3\2\2\2"+
		"d\u02d0\3\2\2\2f\u02f4\3\2\2\2h\u0310\3\2\2\2j\u031b\3\2\2\2l\u0322\3"+
		"\2\2\2n\u032f\3\2\2\2p\u0331\3\2\2\2r\u0342\3\2\2\2t\u0345\3\2\2\2v\u0355"+
		"\3\2\2\2x\u0371\3\2\2\2z\u0373\3\2\2\2|\u037a\3\2\2\2~\u038c\3\2\2\2\u0080"+
		"\u0398\3\2\2\2\u0082\u03a0\3\2\2\2\u0084\u03a2\3\2\2\2\u0086\u03b2\3\2"+
		"\2\2\u0088\u03bd\3\2\2\2\u008a\u03bf\3\2\2\2\u008c\u03cf\3\2\2\2\u008e"+
		"\u03d1\3\2\2\2\u0090\u03e3\3\2\2\2\u0092\u03e5\3\2\2\2\u0094\u03ee\3\2"+
		"\2\2\u0096\u03f0\3\2\2\2\u0098\u0402\3\2\2\2\u009a\u0404\3\2\2\2\u009c"+
		"\u0406\3\2\2\2\u009e\u0417\3\2\2\2\u00a0\u041a\3\2\2\2\u00a2\u0430\3\2"+
		"\2\2\u00a4\u0438\3\2\2\2\u00a6\u046f\3\2\2\2\u00a8\u0471\3\2\2\2\u00aa"+
		"\u0483\3\2\2\2\u00ac\u0490\3\2\2\2\u00ae\u049b\3\2\2\2\u00b0\u04cb\3\2"+
		"\2\2\u00b2\u04fb\3\2\2\2\u00b4\u0506\3\2\2\2\u00b6\u0510\3\2\2\2\u00b8"+
		"\u0525\3\2\2\2\u00ba\u0527\3\2\2\2\u00bc\u0537\3\2\2\2\u00be\u0539\3\2"+
		"\2\2\u00c0\u00c2\5\4\3\2\u00c1\u00c3\5\6\4\2\u00c2\u00c1\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\32\2\2\u00c5\3\3\2\2"+
		"\2\u00c6\u00c7\7\33\2\2\u00c7\u00c8\7{\2\2\u00c8\u00c9\7\26\2\2\u00c9"+
		"\u00ca\7{\2\2\u00ca\5\3\2\2\2\u00cb\u00cc\b\4\1\2\u00cc\u00cf\5\66\34"+
		"\2\u00cd\u00cf\5\b\5\2\u00ce\u00cb\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d6"+
		"\3\2\2\2\u00d0\u00d1\f\5\2\2\u00d1\u00d5\5\66\34\2\u00d2\u00d3\f\3\2\2"+
		"\u00d3\u00d5\5\b\5\2\u00d4\u00d0\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\7\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00da\b\5\1\2\u00da\u00db\5\n\6\2\u00db\u00e0\3\2"+
		"\2\2\u00dc\u00dd\f\3\2\2\u00dd\u00df\5\n\6\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\t\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e3\u00eb\5\62\32\2\u00e4\u00eb\5\16\b\2\u00e5"+
		"\u00eb\5\26\f\2\u00e6\u00eb\5\f\7\2\u00e7\u00eb\5\32\16\2\u00e8\u00eb"+
		"\5*\26\2\u00e9\u00eb\5.\30\2\u00ea\u00e3\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea"+
		"\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00e9\3\2\2\2\u00eb\13\3\2\2\2\u00ec\u00ed\7\26\2\2\u00ed\u00ee"+
		"\7\3\2\2\u00ee\u00ef\7\26\2\2\u00ef\u00f0\7\4\2\2\u00f0\u00f1\7\26\2\2"+
		"\u00f1\u00f2\7\5\2\2\u00f2\r\3\2\2\2\u00f3\u00f4\b\b\1\2\u00f4\u00f5\5"+
		"\20\t\2\u00f5\u00fa\3\2\2\2\u00f6\u00f7\f\3\2\2\u00f7\u00f9\5\20\t\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\17\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\26\2\2\u00fe\u00ff"+
		"\5\22\n\2\u00ff\u0100\5\24\13\2\u0100\21\3\2\2\2\u0101\u0107\7{\2\2\u0102"+
		"\u0104\7M\2\2\u0103\u0105\5\u00b2Z\2\u0104\u0103\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\7N\2\2\u0107\u0102\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\23\3\2\2\2\u0109\u010b\13\2\2\2\u010a\u0109\3\2\2"+
		"\2\u010b\u010e\3\2\2\2\u010c\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0118"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0113\5x=\2\u0110\u0112\13\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0114\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u010f\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\25\3\2\2"+
		"\2\u011a\u0118\3\2\2\2\u011b\u011c\b\f\1\2\u011c\u011d\5\30\r\2\u011d"+
		"\u0122\3\2\2\2\u011e\u011f\f\3\2\2\u011f\u0121\5\30\r\2\u0120\u011e\3"+
		"\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\27\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\"\2\2\u0126\u0127\7{\2\2"+
		"\u0127\31\3\2\2\2\u0128\u0129\b\16\1\2\u0129\u012a\5\34\17\2\u012a\u012f"+
		"\3\2\2\2\u012b\u012c\f\3\2\2\u012c\u012e\5\34\17\2\u012d\u012b\3\2\2\2"+
		"\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\33"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\t\2\2\2\u0133\u0134\5\36\20\2"+
		"\u0134\u0136\5(\25\2\u0135\u0137\5\"\22\2\u0136\u0135\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u013a\5 \21\2\u0139\u0138\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\32\2\2\u013c\35\3\2\2"+
		"\2\u013d\u0141\7M\2\2\u013e\u0140\13\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u014b\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0148\5\\/\2\u0145\u0147\13\2\2\2\u0146\u0145\3\2"+
		"\2\2\u0147\u014a\3\2\2\2\u0148\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u0144\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u015e\7N\2\2\u014e\u0150\13\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0152\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0152\u015b\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0158\5\\/\2\u0155"+
		"\u0157\13\2\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0159\3"+
		"\2\2\2\u0158\u0156\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u0154\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u013d\3\2"+
		"\2\2\u015d\u0151\3\2\2\2\u015e\37\3\2\2\2\u015f\u0160\b\21\1\2\u0160\u0162"+
		"\5&\24\2\u0161\u0163\5\"\22\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2"+
		"\u0163\u0168\3\2\2\2\u0164\u0165\f\3\2\2\u0165\u0167\5&\24\2\u0166\u0164"+
		"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"!\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\b\22\1\2\u016c\u016d\5$\23\2"+
		"\u016d\u0172\3\2\2\2\u016e\u016f\f\3\2\2\u016f\u0171\5$\23\2\u0170\u016e"+
		"\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"#\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\t\2\2\2\u0176\u0177\5\36\20"+
		"\2\u0177\u0179\5(\25\2\u0178\u017a\5\"\22\2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u017d\5 \21\2\u017c\u017b\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7\32\2\2\u017f"+
		"%\3\2\2\2\u0180\u0181\7\27\2\2\u0181\u0182\5\36\20\2\u0182\u0183\5(\25"+
		"\2\u0183\u018b\3\2\2\2\u0184\u0185\7\30\2\2\u0185\u0186\5\36\20\2\u0186"+
		"\u0187\5(\25\2\u0187\u018b\3\2\2\2\u0188\u0189\7\31\2\2\u0189\u018b\5"+
		"(\25\2\u018a\u0180\3\2\2\2\u018a\u0184\3\2\2\2\u018a\u0188\3\2\2\2\u018b"+
		"\'\3\2\2\2\u018c\u018e\13\2\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2"+
		"\2\u018f\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0199\3\2\2\2\u0191\u018f"+
		"\3\2\2\2\u0192\u0196\7{\2\2\u0193\u0195\13\2\2\2\u0194\u0193\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0199\u0192\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		")\3\2\2\2\u019b\u019c\b\26\1\2\u019c\u019d\5,\27\2\u019d\u01a2\3\2\2\2"+
		"\u019e\u019f\f\3\2\2\u019f\u01a1\5,\27\2\u01a0\u019e\3\2\2\2\u01a1\u01a4"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3+\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a6\7 \2\2\u01a6\u01ac\7|\2\2\u01a7\u01a9\7}\2"+
		"\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"-\3\2\2\2\u01ae\u01af\b\30\1\2\u01af\u01b0\5\60\31\2\u01b0\u01b5\3\2\2"+
		"\2\u01b1\u01b2\f\3\2\2\u01b2\u01b4\5\60\31\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6/\3\2\2\2"+
		"\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7!\2\2\u01b9\u01ba\t\3\2\2\u01ba\u01bc"+
		"\7{\2\2\u01bb\u01bd\7|\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01c3\3\2\2\2\u01be\u01bf\7!\2\2\u01bf\u01c0\7\b\2\2\u01c0\u01c1\t\4"+
		"\2\2\u01c1\u01c3\7{\2\2\u01c2\u01b8\3\2\2\2\u01c2\u01be\3\2\2\2\u01c3"+
		"\61\3\2\2\2\u01c4\u01c5\b\32\1\2\u01c5\u01c6\5\64\33\2\u01c6\u01cb\3\2"+
		"\2\2\u01c7\u01c8\f\3\2\2\u01c8\u01ca\5\64\33\2\u01c9\u01c7\3\2\2\2\u01ca"+
		"\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\63\3\2\2"+
		"\2\u01cd\u01cb\3\2\2\2\u01ce\u01d0\7\35\2\2\u01cf\u01d1\7}\2\2\u01d0\u01cf"+
		"\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\65\3\2\2\2\u01d4\u01d7\58\35\2\u01d5\u01d7\7i\2\2\u01d6\u01d4\3\2\2\2"+
		"\u01d6\u01d5\3\2\2\2\u01d7\67\3\2\2\2\u01d8\u01da\5:\36\2\u01d9\u01db"+
		"\5> \2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01dd\7i\2\2\u01dd\u01e0\3\2\2\2\u01de\u01e0\5@!\2\u01df\u01d8\3\2\2"+
		"\2\u01df\u01de\3\2\2\2\u01e09\3\2\2\2\u01e1\u01e3\5<\37\2\u01e2\u01e1"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		";\3\2\2\2\u01e6\u01ec\5\u008aF\2\u01e7\u01ec\5\u008cG\2\u01e8\u01ec\5"+
		"\u009aN\2\u01e9\u01ec\5\u0082B\2\u01ea\u01ec\5\u0080A\2\u01eb\u01e6\3"+
		"\2\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01ec=\3\2\2\2\u01ed\u01ee\b \1\2\u01ee\u01ef\5l\67\2\u01ef"+
		"\u01f5\3\2\2\2\u01f0\u01f1\f\3\2\2\u01f1\u01f2\7j\2\2\u01f2\u01f4\5l\67"+
		"\2\u01f3\u01f0\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6?\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7K\2\2\u01f9\u01fa"+
		"\7M\2\2\u01fa\u01fb\5B\"\2\u01fb\u01fd\7j\2\2\u01fc\u01fe\7}\2\2\u01fd"+
		"\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201\u0202\7N\2\2\u0202\u0203\7i\2\2\u0203A"+
		"\3\2\2\2\u0204\u0205\5D#\2\u0205C\3\2\2\2\u0206\u020c\5F$\2\u0207\u0208"+
		"\7g\2\2\u0208\u0209\5\\/\2\u0209\u020a\7h\2\2\u020a\u020b\5D#\2\u020b"+
		"\u020d\3\2\2\2\u020c\u0207\3\2\2\2\u020c\u020d\3\2\2\2\u020dE\3\2\2\2"+
		"\u020e\u020f\b$\1\2\u020f\u0210\5H%\2\u0210\u0216\3\2\2\2\u0211\u0212"+
		"\f\3\2\2\u0212\u0213\7c\2\2\u0213\u0215\5H%\2\u0214\u0211\3\2\2\2\u0215"+
		"\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217G\3\2\2\2"+
		"\u0218\u0216\3\2\2\2\u0219\u021a\b%\1\2\u021a\u021b\5J&\2\u021b\u0221"+
		"\3\2\2\2\u021c\u021d\f\3\2\2\u021d\u021e\7b\2\2\u021e\u0220\5J&\2\u021f"+
		"\u021c\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222I\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0225\b&\1\2\u0225\u0226"+
		"\5L\'\2\u0226\u022c\3\2\2\2\u0227\u0228\f\3\2\2\u0228\u0229\7a\2\2\u0229"+
		"\u022b\5L\'\2\u022a\u0227\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022dK\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0230"+
		"\b\'\1\2\u0230\u0231\5N(\2\u0231\u0237\3\2\2\2\u0232\u0233\f\3\2\2\u0233"+
		"\u0234\7d\2\2\u0234\u0236\5N(\2\u0235\u0232\3\2\2\2\u0236\u0239\3\2\2"+
		"\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238M\3\2\2\2\u0239\u0237"+
		"\3\2\2\2\u023a\u023b\b(\1\2\u023b\u023c\5P)\2\u023c\u0242\3\2\2\2\u023d"+
		"\u023e\f\3\2\2\u023e\u023f\7`\2\2\u023f\u0241\5P)\2\u0240\u023d\3\2\2"+
		"\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243O"+
		"\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\b)\1\2\u0246\u0247\5R*\2\u0247"+
		"\u0250\3\2\2\2\u0248\u0249\f\4\2\2\u0249\u024a\7v\2\2\u024a\u024f\5R*"+
		"\2\u024b\u024c\f\3\2\2\u024c\u024d\7w\2\2\u024d\u024f\5R*\2\u024e\u0248"+
		"\3\2\2\2\u024e\u024b\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251Q\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\b*\1\2\u0254"+
		"\u0255\5T+\2\u0255\u0264\3\2\2\2\u0256\u0257\f\6\2\2\u0257\u0258\7S\2"+
		"\2\u0258\u0263\5T+\2\u0259\u025a\f\5\2\2\u025a\u025b\7U\2\2\u025b\u0263"+
		"\5T+\2\u025c\u025d\f\4\2\2\u025d\u025e\7T\2\2\u025e\u0263\5T+\2\u025f"+
		"\u0260\f\3\2\2\u0260\u0261\7V\2\2\u0261\u0263\5T+\2\u0262\u0256\3\2\2"+
		"\2\u0262\u0259\3\2\2\2\u0262\u025c\3\2\2\2\u0262\u025f\3\2\2\2\u0263\u0266"+
		"\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265S\3\2\2\2\u0266"+
		"\u0264\3\2\2\2\u0267\u0268\b+\1\2\u0268\u0269\5V,\2\u0269\u0272\3\2\2"+
		"\2\u026a\u026b\f\4\2\2\u026b\u026c\7W\2\2\u026c\u0271\5V,\2\u026d\u026e"+
		"\f\3\2\2\u026e\u026f\7X\2\2\u026f\u0271\5V,\2\u0270\u026a\3\2\2\2\u0270"+
		"\u026d\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2"+
		"\2\2\u0273U\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0276\b,\1\2\u0276\u0277"+
		"\5X-\2\u0277\u0280\3\2\2\2\u0278\u0279\f\4\2\2\u0279\u027a\7Y\2\2\u027a"+
		"\u027f\5X-\2\u027b\u027c\f\3\2\2\u027c\u027d\7[\2\2\u027d\u027f\5X-\2"+
		"\u027e\u0278\3\2\2\2\u027e\u027b\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e"+
		"\3\2\2\2\u0280\u0281\3\2\2\2\u0281W\3\2\2\2\u0282\u0280\3\2\2\2\u0283"+
		"\u0284\b-\1\2\u0284\u0285\5Z.\2\u0285\u0291\3\2\2\2\u0286\u0287\f\5\2"+
		"\2\u0287\u0288\7]\2\2\u0288\u0290\5Z.\2\u0289\u028a\f\4\2\2\u028a\u028b"+
		"\7^\2\2\u028b\u0290\5Z.\2\u028c\u028d\f\3\2\2\u028d\u028e\7_\2\2\u028e"+
		"\u0290\5Z.\2\u028f\u0286\3\2\2\2\u028f\u0289\3\2\2\2\u028f\u028c\3\2\2"+
		"\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292Y"+
		"\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u02a1\5d\63\2\u0295\u0296\7M\2\2\u0296"+
		"\u0297\5b\62\2\u0297\u0298\7N\2\2\u0298\u0299\5Z.\2\u0299\u02a1\3\2\2"+
		"\2\u029a\u029b\7\t\2\2\u029b\u029c\7M\2\2\u029c\u029d\5b\62\2\u029d\u029e"+
		"\7N\2\2\u029e\u029f\5Z.\2\u029f\u02a1\3\2\2\2\u02a0\u0294\3\2\2\2\u02a0"+
		"\u0295\3\2\2\2\u02a0\u029a\3\2\2\2\u02a1[\3\2\2\2\u02a2\u02a3\b/\1\2\u02a3"+
		"\u02a4\5^\60\2\u02a4\u02aa\3\2\2\2\u02a5\u02a6\f\3\2\2\u02a6\u02a7\7j"+
		"\2\2\u02a7\u02a9\5^\60\2\u02a8\u02a5\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa"+
		"\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab]\3\2\2\2\u02ac\u02aa\3\2\2\2"+
		"\u02ad\u02b3\5D#\2\u02ae\u02af\5d\63\2\u02af\u02b0\5`\61\2\u02b0\u02b1"+
		"\5^\60\2\u02b1\u02b3\3\2\2\2\u02b2\u02ad\3\2\2\2\u02b2\u02ae\3\2\2\2\u02b3"+
		"_\3\2\2\2\u02b4\u02b5\t\5\2\2\u02b5a\3\2\2\2\u02b6\u02b8\5\u0098M\2\u02b7"+
		"\u02b9\5\u00acW\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9c\3\2\2"+
		"\2\u02ba\u02d1\5f\64\2\u02bb\u02bc\7Z\2\2\u02bc\u02d1\5d\63\2\u02bd\u02be"+
		"\7\\\2\2\u02be\u02d1\5d\63\2\u02bf\u02c0\5j\66\2\u02c0\u02c1\5Z.\2\u02c1"+
		"\u02d1\3\2\2\2\u02c2\u02c3\79\2\2\u02c3\u02d1\5d\63\2\u02c4\u02c5\79\2"+
		"\2\u02c5\u02c6\7M\2\2\u02c6\u02c7\5b\62\2\u02c7\u02c8\7N\2\2\u02c8\u02d1"+
		"\3\2\2\2\u02c9\u02ca\7D\2\2\u02ca\u02cb\7M\2\2\u02cb\u02cc\5b\62\2\u02cc"+
		"\u02cd\7N\2\2\u02cd\u02d1\3\2\2\2\u02ce\u02cf\7b\2\2\u02cf\u02d1\7{\2"+
		"\2\u02d0\u02ba\3\2\2\2\u02d0\u02bb\3\2\2\2\u02d0\u02bd\3\2\2\2\u02d0\u02bf"+
		"\3\2\2\2\u02d0\u02c2\3\2\2\2\u02d0\u02c4\3\2\2\2\u02d0\u02c9\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d1e\3\2\2\2\u02d2\u02d3\b\64\1\2\u02d3\u02f5\5x=\2\u02d4"+
		"\u02d5\7M\2\2\u02d5\u02d6\5b\62\2\u02d6\u02d7\7N\2\2\u02d7\u02d8\7Q\2"+
		"\2\u02d8\u02d9\5p9\2\u02d9\u02da\7R\2\2\u02da\u02f5\3\2\2\2\u02db\u02dc"+
		"\7M\2\2\u02dc\u02dd\5b\62\2\u02dd\u02de\7N\2\2\u02de\u02df\7Q\2\2\u02df"+
		"\u02e0\5p9\2\u02e0\u02e1\7j\2\2\u02e1\u02e2\7R\2\2\u02e2\u02f5\3\2\2\2"+
		"\u02e3\u02e4\7\t\2\2\u02e4\u02e5\7M\2\2\u02e5\u02e6\5b\62\2\u02e6\u02e7"+
		"\7N\2\2\u02e7\u02e8\7Q\2\2\u02e8\u02e9\5p9\2\u02e9\u02ea\7R\2\2\u02ea"+
		"\u02f5\3\2\2\2\u02eb\u02ec\7\t\2\2\u02ec\u02ed\7M\2\2\u02ed\u02ee\5b\62"+
		"\2\u02ee\u02ef\7N\2\2\u02ef\u02f0\7Q\2\2\u02f0\u02f1\5p9\2\u02f1\u02f2"+
		"\7j\2\2\u02f2\u02f3\7R\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02d2\3\2\2\2\u02f4"+
		"\u02d4\3\2\2\2\u02f4\u02db\3\2\2\2\u02f4\u02e3\3\2\2\2\u02f4\u02eb\3\2"+
		"\2\2\u02f5\u030d\3\2\2\2\u02f6\u02f7\f\f\2\2\u02f7\u02f8\7O\2\2\u02f8"+
		"\u02f9\5\\/\2\u02f9\u02fa\7P\2\2\u02fa\u030c\3\2\2\2\u02fb\u02fc\f\13"+
		"\2\2\u02fc\u02fe\7M\2\2\u02fd\u02ff\5h\65\2\u02fe\u02fd\3\2\2\2\u02fe"+
		"\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u030c\7N\2\2\u0301\u0302\f\n"+
		"\2\2\u0302\u0303\7y\2\2\u0303\u030c\7{\2\2\u0304\u0305\f\t\2\2\u0305\u0306"+
		"\7x\2\2\u0306\u030c\7{\2\2\u0307\u0308\f\b\2\2\u0308\u030c\7Z\2\2\u0309"+
		"\u030a\f\7\2\2\u030a\u030c\7\\\2\2\u030b\u02f6\3\2\2\2\u030b\u02fb\3\2"+
		"\2\2\u030b\u0301\3\2\2\2\u030b\u0304\3\2\2\2\u030b\u0307\3\2\2\2\u030b"+
		"\u0309\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030eg\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0311\b\65\1\2\u0311\u0312"+
		"\5^\60\2\u0312\u0318\3\2\2\2\u0313\u0314\f\3\2\2\u0314\u0315\7j\2\2\u0315"+
		"\u0317\5^\60\2\u0316\u0313\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3\2"+
		"\2\2\u0318\u0319\3\2\2\2\u0319i\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u031c"+
		"\t\6\2\2\u031ck\3\2\2\2\u031d\u0323\5\u00a0Q\2\u031e\u031f\5\u00a0Q\2"+
		"\u031f\u0320\7k\2\2\u0320\u0321\5n8\2\u0321\u0323\3\2\2\2\u0322\u031d"+
		"\3\2\2\2\u0322\u031e\3\2\2\2\u0323m\3\2\2\2\u0324\u0330\5x=\2\u0325\u0327"+
		"\7Q\2\2\u0326\u0328\5p9\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329\u0330\7R\2\2\u032a\u032b\7Q\2\2\u032b\u032c\5p9\2"+
		"\u032c\u032d\7j\2\2\u032d\u032e\7R\2\2\u032e\u0330\3\2\2\2\u032f\u0324"+
		"\3\2\2\2\u032f\u0325\3\2\2\2\u032f\u032a\3\2\2\2\u0330o\3\2\2\2\u0331"+
		"\u0333\b9\1\2\u0332\u0334\5r:\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2"+
		"\2\u0334\u0335\3\2\2\2\u0335\u0336\5n8\2\u0336\u033f\3\2\2\2\u0337\u0338"+
		"\f\3\2\2\u0338\u033a\7j\2\2\u0339\u033b\5r:\2\u033a\u0339\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033e\5n8\2\u033d\u0337\3\2\2"+
		"\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340q"+
		"\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0343\5t;\2\u0343\u0344\7k\2\2\u0344"+
		"s\3\2\2\2\u0345\u0346\b;\1\2\u0346\u0347\5v<\2\u0347\u034c\3\2\2\2\u0348"+
		"\u0349\f\3\2\2\u0349\u034b\5v<\2\u034a\u0348\3\2\2\2\u034b\u034e\3\2\2"+
		"\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034du\3\2\2\2\u034e\u034c"+
		"\3\2\2\2\u034f\u0350\7O\2\2\u0350\u0351\5x=\2\u0351\u0352\7P\2\2\u0352"+
		"\u0356\3\2\2\2\u0353\u0354\7y\2\2\u0354\u0356\7{\2\2\u0355\u034f\3\2\2"+
		"\2\u0355\u0353\3\2\2\2\u0356w\3\2\2\2\u0357\u0372\7{\2\2\u0358\u0372\7"+
		"|\2\2\u0359\u035b\7}\2\2\u035a\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c"+
		"\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0372\3\2\2\2\u035e\u035f\7M"+
		"\2\2\u035f\u0360\5\\/\2\u0360\u0361\7N\2\2\u0361\u0372\3\2\2\2\u0362\u0372"+
		"\5z>\2\u0363\u0364\7\n\2\2\u0364\u0365\7M\2\2\u0365\u0366\5d\63\2\u0366"+
		"\u0367\7j\2\2\u0367\u0368\5b\62\2\u0368\u0369\7N\2\2\u0369\u0372\3\2\2"+
		"\2\u036a\u036b\7\13\2\2\u036b\u036c\7M\2\2\u036c\u036d\5b\62\2\u036d\u036e"+
		"\7j\2\2\u036e\u036f\5d\63\2\u036f\u0370\7N\2\2\u0370\u0372\3\2\2\2\u0371"+
		"\u0357\3\2\2\2\u0371\u0358\3\2\2\2\u0371\u035a\3\2\2\2\u0371\u035e\3\2"+
		"\2\2\u0371\u0362\3\2\2\2\u0371\u0363\3\2\2\2\u0371\u036a\3\2\2\2\u0372"+
		"y\3\2\2\2\u0373\u0374\7H\2\2\u0374\u0375\7M\2\2\u0375\u0376\5^\60\2\u0376"+
		"\u0377\7j\2\2\u0377\u0378\5|?\2\u0378\u0379\7N\2\2\u0379{\3\2\2\2\u037a"+
		"\u037b\b?\1\2\u037b\u037c\5~@\2\u037c\u0382\3\2\2\2\u037d\u037e\f\3\2"+
		"\2\u037e\u037f\7j\2\2\u037f\u0381\5~@\2\u0380\u037d\3\2\2\2\u0381\u0384"+
		"\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383}\3\2\2\2\u0384"+
		"\u0382\3\2\2\2\u0385\u0386\5b\62\2\u0386\u0387\7h\2\2\u0387\u0388\5^\60"+
		"\2\u0388\u038d\3\2\2\2\u0389\u038a\7(\2\2\u038a\u038b\7h\2\2\u038b\u038d"+
		"\5^\60\2\u038c\u0385\3\2\2\2\u038c\u0389\3\2\2\2\u038d\177\3\2\2\2\u038e"+
		"\u038f\7C\2\2\u038f\u0390\7M\2\2\u0390\u0391\5b\62\2\u0391\u0392\7N\2"+
		"\2\u0392\u0399\3\2\2\2\u0393\u0394\7C\2\2\u0394\u0395\7M\2\2\u0395\u0396"+
		"\5B\"\2\u0396\u0397\7N\2\2\u0397\u0399\3\2\2\2\u0398\u038e\3\2\2\2\u0398"+
		"\u0393\3\2\2\2\u0399\u0081\3\2\2\2\u039a\u03a1\t\7\2\2\u039b\u03a1\5\u0084"+
		"C\2\u039c\u039d\7\16\2\2\u039d\u039e\7M\2\2\u039e\u039f\7{\2\2\u039f\u03a1"+
		"\7N\2\2\u03a0\u039a\3\2\2\2\u03a0\u039b\3\2\2\2\u03a0\u039c\3\2\2\2\u03a1"+
		"\u0083\3\2\2\2\u03a2\u03a3\7\17\2\2\u03a3\u03a4\7M\2\2\u03a4\u03a5\7M"+
		"\2\2\u03a5\u03a6\5\u0086D\2\u03a6\u03a7\7N\2\2\u03a7\u03a8\7N\2\2\u03a8"+
		"\u0085\3\2\2\2\u03a9\u03ae\5\u0088E\2\u03aa\u03ab\7j\2\2\u03ab\u03ad\5"+
		"\u0088E\2\u03ac\u03aa\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3\2\2\2"+
		"\u03ae\u03af\3\2\2\2\u03af\u03b3\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1\u03b3"+
		"\3\2\2\2\u03b2\u03a9\3\2\2\2\u03b2\u03b1\3\2\2\2\u03b3\u0087\3\2\2\2\u03b4"+
		"\u03ba\n\b\2\2\u03b5\u03b7\7M\2\2\u03b6\u03b8\5h\65\2\u03b7\u03b6\3\2"+
		"\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\7N\2\2\u03ba"+
		"\u03b5\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc\u03be\3\2"+
		"\2\2\u03bd\u03b4\3\2\2\2\u03bd\u03bc\3\2\2\2\u03be\u0089\3\2\2\2\u03bf"+
		"\u03c0\t\t\2\2\u03c0\u008b\3\2\2\2\u03c1\u03d0\t\n\2\2\u03c2\u03c3\7\t"+
		"\2\2\u03c3\u03c4\7M\2\2\u03c4\u03c5\t\13\2\2\u03c5\u03d0\7N\2\2\u03c6"+
		"\u03d0\5\u008eH\2\u03c7\u03d0\5\u0090I\2\u03c8\u03d0\5\u00b8]\2\u03c9"+
		"\u03d0\5\u00b6\\\2\u03ca\u03cb\7\24\2\2\u03cb\u03cc\7M\2\2\u03cc\u03cd"+
		"\5B\"\2\u03cd\u03ce\7N\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03c1\3\2\2\2\u03cf"+
		"\u03c2\3\2\2\2\u03cf\u03c6\3\2\2\2\u03cf\u03c7\3\2\2\2\u03cf\u03c8\3\2"+
		"\2\2\u03cf\u03c9\3\2\2\2\u03cf\u03ca\3\2\2\2\u03d0\u008d\3\2\2\2\u03d1"+
		"\u03d2\7E\2\2\u03d2\u03d3\7M\2\2\u03d3\u03d4\5b\62\2\u03d4\u03d5\7N\2"+
		"\2\u03d5\u008f\3\2\2\2\u03d6\u03d8\5\u0092J\2\u03d7\u03d9\7{\2\2\u03d8"+
		"\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc\7Q"+
		"\2\2\u03db\u03dd\5\u0096L\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd"+
		"\u03de\3\2\2\2\u03de\u03df\7R\2\2\u03df\u03e4\3\2\2\2\u03e0\u03e1\5\u0092"+
		"J\2\u03e1\u03e2\7{\2\2\u03e2\u03e4\3\2\2\2\u03e3\u03d6\3\2\2\2\u03e3\u03e0"+
		"\3\2\2\2\u03e4\u0091\3\2\2\2\u03e5\u03e6\t\f\2\2\u03e6\u0093\3\2\2\2\u03e7"+
		"\u03e9\5\u0098M\2\u03e8\u03ea\5\u009cO\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea"+
		"\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\7i\2\2\u03ec\u03ef\3\2\2\2\u03ed"+
		"\u03ef\5@!\2\u03ee\u03e7\3\2\2\2\u03ee\u03ed\3\2\2\2\u03ef\u0095\3\2\2"+
		"\2\u03f0\u03f1\bL\1\2\u03f1\u03f2\5\u0094K\2\u03f2\u03f7\3\2\2\2\u03f3"+
		"\u03f4\f\3\2\2\u03f4\u03f6\5\u0094K\2\u03f5\u03f3\3\2\2\2\u03f6\u03f9"+
		"\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u0097\3\2\2\2\u03f9"+
		"\u03f7\3\2\2\2\u03fa\u03fc\5\u008cG\2\u03fb\u03fd\5\u0098M\2\u03fc\u03fb"+
		"\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0403\3\2\2\2\u03fe\u0400\5\u009aN"+
		"\2\u03ff\u0401\5\u0098M\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u0403\3\2\2\2\u0402\u03fa\3\2\2\2\u0402\u03fe\3\2\2\2\u0403\u0099\3\2"+
		"\2\2\u0404\u0405\t\r\2\2\u0405\u009b\3\2\2\2\u0406\u0407\bO\1\2\u0407"+
		"\u0408\5\u009eP\2\u0408\u040e\3\2\2\2\u0409\u040a\f\3\2\2\u040a\u040b"+
		"\7j\2\2\u040b\u040d\5\u009eP\2\u040c\u0409\3\2\2\2\u040d\u0410\3\2\2\2"+
		"\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u009d\3\2\2\2\u0410\u040e"+
		"\3\2\2\2\u0411\u0418\5\u00a0Q\2\u0412\u0414\5\u00a0Q\2\u0413\u0412\3\2"+
		"\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\7h\2\2\u0416"+
		"\u0418\5B\"\2\u0417\u0411\3\2\2\2\u0417\u0413\3\2\2\2\u0418\u009f\3\2"+
		"\2\2\u0419\u041b\5\u00a2R\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b"+
		"\u041c\3\2\2\2\u041c\u041d\5\u00a4S\2\u041d\u00a1\3\2\2\2\u041e\u0420"+
		"\7]\2\2\u041f\u0421\5\u00b4[\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2"+
		"\u0421\u0431\3\2\2\2\u0422\u0424\7]\2\2\u0423\u0425\5\u00b4[\2\u0424\u0423"+
		"\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0431\5\u00a2R"+
		"\2\u0427\u0429\7d\2\2\u0428\u042a\5\u00b4[\2\u0429\u0428\3\2\2\2\u0429"+
		"\u042a\3\2\2\2\u042a\u0431\3\2\2\2\u042b\u042d\7d\2\2\u042c\u042e\5\u00b4"+
		"[\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0431\5\u00a2R\2\u0430\u041e\3\2\2\2\u0430\u0422\3\2\2\2\u0430\u0427"+
		"\3\2\2\2\u0430\u042b\3\2\2\2\u0431\u00a3\3\2\2\2\u0432\u0433\bS\1\2\u0433"+
		"\u0439\7{\2\2\u0434\u0435\7M\2\2\u0435\u0436\5\u00a0Q\2\u0436\u0437\7"+
		"N\2\2\u0437\u0439\3\2\2\2\u0438\u0432\3\2\2\2\u0438\u0434\3\2\2\2\u0439"+
		"\u0467\3\2\2\2\u043a\u043b\f\b\2\2\u043b\u043d\7O\2\2\u043c\u043e\5\u00b4"+
		"[\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0440\3\2\2\2\u043f"+
		"\u0441\5^\60\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2"+
		"\2\2\u0442\u0466\7P\2\2\u0443\u0444\f\7\2\2\u0444\u0445\7O\2\2\u0445\u0447"+
		"\7:\2\2\u0446\u0448\5\u00b4[\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2"+
		"\u0448\u0449\3\2\2\2\u0449\u044a\5^\60\2\u044a\u044b\7P\2\2\u044b\u0466"+
		"\3\2\2\2\u044c\u044d\f\6\2\2\u044d\u044e\7O\2\2\u044e\u044f\5\u00b4[\2"+
		"\u044f\u0450\7:\2\2\u0450\u0451\5^\60\2\u0451\u0452\7P\2\2\u0452\u0466"+
		"\3\2\2\2\u0453\u0454\f\5\2\2\u0454\u0456\7O\2\2\u0455\u0457\5\u00b4[\2"+
		"\u0456\u0455\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u0459"+
		"\7]\2\2\u0459\u0466\7P\2\2\u045a\u045b\f\4\2\2\u045b\u045c\7M\2\2\u045c"+
		"\u045d\5\u00a6T\2\u045d\u045e\7N\2\2\u045e\u0466\3\2\2\2\u045f\u0460\f"+
		"\3\2\2\u0460\u0462\7M\2\2\u0461\u0463\5\u00b2Z\2\u0462\u0461\3\2\2\2\u0462"+
		"\u0463\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0466\7N\2\2\u0465\u043a\3\2"+
		"\2\2\u0465\u0443\3\2\2\2\u0465\u044c\3\2\2\2\u0465\u0453\3\2\2\2\u0465"+
		"\u045a\3\2\2\2\u0465\u045f\3\2\2\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2"+
		"\2\2\u0467\u0468\3\2\2\2\u0468\u00a5\3\2\2\2\u0469\u0467\3\2\2\2\u046a"+
		"\u0470\5\u00a8U\2\u046b\u046c\5\u00a8U\2\u046c\u046d\7j\2\2\u046d\u046e"+
		"\7z\2\2\u046e\u0470\3\2\2\2\u046f\u046a\3\2\2\2\u046f\u046b\3\2\2\2\u0470"+
		"\u00a7\3\2\2\2\u0471\u0472\bU\1\2\u0472\u0473\5\u00aaV\2\u0473\u0479\3"+
		"\2\2\2\u0474\u0475\f\3\2\2\u0475\u0476\7j\2\2\u0476\u0478\5\u00aaV\2\u0477"+
		"\u0474\3\2\2\2\u0478\u047b\3\2\2\2\u0479\u0477\3\2\2\2\u0479\u047a\3\2"+
		"\2\2\u047a\u00a9\3\2\2\2\u047b\u0479\3\2\2\2\u047c\u047d\5:\36\2\u047d"+
		"\u047e\5\u00a0Q\2\u047e\u0484\3\2\2\2\u047f\u0481\5:\36\2\u0480\u0482"+
		"\5\u00acW\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0484\3\2\2"+
		"\2\u0483\u047c\3\2\2\2\u0483\u047f\3\2\2\2\u0484\u00ab\3\2\2\2\u0485\u0491"+
		"\5\u00a2R\2\u0486\u0488\5\u00a2R\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2"+
		"\2\2\u0488\u0489\3\2\2\2\u0489\u048d\5\u00b0Y\2\u048a\u048c\5\u00aeX\2"+
		"\u048b\u048a\3\2\2\2\u048c\u048f\3\2\2\2\u048d\u048b\3\2\2\2\u048d\u048e"+
		"\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u0490\u0485\3\2\2\2\u0490"+
		"\u0487\3\2\2\2\u0491\u00ad\3\2\2\2\u0492\u0493\7\25\2\2\u0493\u0495\7"+
		"M\2\2\u0494\u0496\7}\2\2\u0495\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497"+
		"\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049c\7N"+
		"\2\2\u049a\u049c\5\u0084C\2\u049b\u0492\3\2\2\2\u049b\u049a\3\2\2\2\u049c"+
		"\u00af\3\2\2\2\u049d\u049e\bY\1\2\u049e\u049f\7M\2\2\u049f\u04a0\5\u00ac"+
		"W\2\u04a0\u04a4\7N\2\2\u04a1\u04a3\5\u00aeX\2\u04a2\u04a1\3\2\2\2\u04a3"+
		"\u04a6\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04cc\3\2"+
		"\2\2\u04a6\u04a4\3\2\2\2\u04a7\u04a9\7O\2\2\u04a8\u04aa\5\u00b4[\2\u04a9"+
		"\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04ad\5^"+
		"\60\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04cc\7P\2\2\u04af\u04b0\7O\2\2\u04b0\u04b2\7:\2\2\u04b1\u04b3\5\u00b4"+
		"[\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4"+
		"\u04b5\5^\60\2\u04b5\u04b6\7P\2\2\u04b6\u04cc\3\2\2\2\u04b7\u04b8\7O\2"+
		"\2\u04b8\u04b9\5\u00b4[\2\u04b9\u04ba\7:\2\2\u04ba\u04bb\5^\60\2\u04bb"+
		"\u04bc\7P\2\2\u04bc\u04cc\3\2\2\2\u04bd\u04be\7O\2\2\u04be\u04bf\7]\2"+
		"\2\u04bf\u04cc\7P\2\2\u04c0\u04c2\7M\2\2\u04c1\u04c3\5\u00a6T\2\u04c2"+
		"\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c8\7N"+
		"\2\2\u04c5\u04c7\5\u00aeX\2\u04c6\u04c5\3\2\2\2\u04c7\u04ca\3\2\2\2\u04c8"+
		"\u04c6\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cc\3\2\2\2\u04ca\u04c8\3\2"+
		"\2\2\u04cb\u049d\3\2\2\2\u04cb\u04a7\3\2\2\2\u04cb\u04af\3\2\2\2\u04cb"+
		"\u04b7\3\2\2\2\u04cb\u04bd\3\2\2\2\u04cb\u04c0\3\2\2\2\u04cc\u04f8\3\2"+
		"\2\2\u04cd\u04ce\f\7\2\2\u04ce\u04d0\7O\2\2\u04cf\u04d1\5\u00b4[\2\u04d0"+
		"\u04cf\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d3\3\2\2\2\u04d2\u04d4\5^"+
		"\60\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5"+
		"\u04f7\7P\2\2\u04d6\u04d7\f\6\2\2\u04d7\u04d8\7O\2\2\u04d8\u04da\7:\2"+
		"\2\u04d9\u04db\5\u00b4[\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u04dc\3\2\2\2\u04dc\u04dd\5^\60\2\u04dd\u04de\7P\2\2\u04de\u04f7\3\2"+
		"\2\2\u04df\u04e0\f\5\2\2\u04e0\u04e1\7O\2\2\u04e1\u04e2\5\u00b4[\2\u04e2"+
		"\u04e3\7:\2\2\u04e3\u04e4\5^\60\2\u04e4\u04e5\7P\2\2\u04e5\u04f7\3\2\2"+
		"\2\u04e6\u04e7\f\4\2\2\u04e7\u04e8\7O\2\2\u04e8\u04e9\7]\2\2\u04e9\u04f7"+
		"\7P\2\2\u04ea\u04eb\f\3\2\2\u04eb\u04ed\7M\2\2\u04ec\u04ee\5\u00a6T\2"+
		"\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f3"+
		"\7N\2\2\u04f0\u04f2\5\u00aeX\2\u04f1\u04f0\3\2\2\2\u04f2\u04f5\3\2\2\2"+
		"\u04f3\u04f1\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f7\3\2\2\2\u04f5\u04f3"+
		"\3\2\2\2\u04f6\u04cd\3\2\2\2\u04f6\u04d6\3\2\2\2\u04f6\u04df\3\2\2\2\u04f6"+
		"\u04e6\3\2\2\2\u04f6\u04ea\3\2\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6\3\2"+
		"\2\2\u04f8\u04f9\3\2\2\2\u04f9\u00b1\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fb"+
		"\u04fc\bZ\1\2\u04fc\u04fd\7{\2\2\u04fd\u0503\3\2\2\2\u04fe\u04ff\f\3\2"+
		"\2\u04ff\u0500\7j\2\2\u0500\u0502\7{\2\2\u0501\u04fe\3\2\2\2\u0502\u0505"+
		"\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u00b3\3\2\2\2\u0505"+
		"\u0503\3\2\2\2\u0506\u0507\b[\1\2\u0507\u0508\5\u009aN\2\u0508\u050d\3"+
		"\2\2\2\u0509\u050a\f\3\2\2\u050a\u050c\5\u009aN\2\u050b\u0509\3\2\2\2"+
		"\u050c\u050f\3\2\2\2\u050d\u050b\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u00b5"+
		"\3\2\2\2\u050f\u050d\3\2\2\2\u0510\u0511\7{\2\2\u0511\u00b7\3\2\2\2\u0512"+
		"\u0514\7+\2\2\u0513\u0515\7{\2\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2"+
		"\2\u0515\u0516\3\2\2\2\u0516\u0517\7Q\2\2\u0517\u0518\5\u00ba^\2\u0518"+
		"\u0519\7R\2\2\u0519\u0526\3\2\2\2\u051a\u051c\7+\2\2\u051b\u051d\7{\2"+
		"\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f"+
		"\7Q\2\2\u051f\u0520\5\u00ba^\2\u0520\u0521\7j\2\2\u0521\u0522\7R\2\2\u0522"+
		"\u0526\3\2\2\2\u0523\u0524\7+\2\2\u0524\u0526\7{\2\2\u0525\u0512\3\2\2"+
		"\2\u0525\u051a\3\2\2\2\u0525\u0523\3\2\2\2\u0526\u00b9\3\2\2\2\u0527\u0528"+
		"\b^\1\2\u0528\u0529\5\u00bc_\2\u0529\u052f\3\2\2\2\u052a\u052b\f\3\2\2"+
		"\u052b\u052c\7j\2\2\u052c\u052e\5\u00bc_\2\u052d\u052a\3\2\2\2\u052e\u0531"+
		"\3\2\2\2\u052f\u052d\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u00bb\3\2\2\2\u0531"+
		"\u052f\3\2\2\2\u0532\u0538\5\u00be`\2\u0533\u0534\5\u00be`\2\u0534\u0535"+
		"\7k\2\2\u0535\u0536\5B\"\2\u0536\u0538\3\2\2\2\u0537\u0532\3\2\2\2\u0537"+
		"\u0533\3\2\2\2\u0538\u00bd\3\2\2\2\u0539\u053a\7{\2\2\u053a\u00bf\3\2"+
		"\2\2\u0097\u00c2\u00ce\u00d4\u00d6\u00e0\u00ea\u00fa\u0104\u0107\u010c"+
		"\u0113\u0118\u0122\u012f\u0136\u0139\u0141\u0148\u014b\u0151\u0158\u015b"+
		"\u015d\u0162\u0168\u0172\u0179\u017c\u018a\u018f\u0196\u0199\u01a2\u01aa"+
		"\u01ac\u01b5\u01bc\u01c2\u01cb\u01d2\u01d6\u01da\u01df\u01e4\u01eb\u01f5"+
		"\u01ff\u020c\u0216\u0221\u022c\u0237\u0242\u024e\u0250\u0262\u0264\u0270"+
		"\u0272\u027e\u0280\u028f\u0291\u02a0\u02aa\u02b2\u02b8\u02d0\u02f4\u02fe"+
		"\u030b\u030d\u0318\u0322\u0327\u032f\u0333\u033a\u033f\u034c\u0355\u035c"+
		"\u0371\u0382\u038c\u0398\u03a0\u03ae\u03b2\u03b7\u03ba\u03bd\u03cf\u03d8"+
		"\u03dc\u03e3\u03e9\u03ee\u03f7\u03fc\u0400\u0402\u040e\u0413\u0417\u041a"+
		"\u0420\u0424\u0429\u042d\u0430\u0438\u043d\u0440\u0447\u0456\u0462\u0465"+
		"\u0467\u046f\u0479\u0481\u0483\u0487\u048d\u0490\u0497\u049b\u04a4\u04a9"+
		"\u04ac\u04b2\u04c2\u04c8\u04cb\u04d0\u04d3\u04da\u04ed\u04f3\u04f6\u04f8"+
		"\u0503\u050d\u0514\u051c\u0525\u052f\u0537";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}