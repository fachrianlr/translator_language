// Generated from ADTC.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ADTCParser}.
 */
public interface ADTCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ADTCParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(ADTCParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(ADTCParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#headerGuard}.
	 * @param ctx the parse tree
	 */
	void enterHeaderGuard(ADTCParser.HeaderGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#headerGuard}.
	 * @param ctx the parse tree
	 */
	void exitHeaderGuard(ADTCParser.HeaderGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(ADTCParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(ADTCParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#preprocessorList}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorList(ADTCParser.PreprocessorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#preprocessorList}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorList(ADTCParser.PreprocessorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor(ADTCParser.PreprocessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#preprocessor}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor(ADTCParser.PreprocessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#booleanMacro}.
	 * @param ctx the parse tree
	 */
	void enterBooleanMacro(ADTCParser.BooleanMacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#booleanMacro}.
	 * @param ctx the parse tree
	 */
	void exitBooleanMacro(ADTCParser.BooleanMacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#defineList}.
	 * @param ctx the parse tree
	 */
	void enterDefineList(ADTCParser.DefineListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#defineList}.
	 * @param ctx the parse tree
	 */
	void exitDefineList(ADTCParser.DefineListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#defineMacro}.
	 * @param ctx the parse tree
	 */
	void enterDefineMacro(ADTCParser.DefineMacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#defineMacro}.
	 * @param ctx the parse tree
	 */
	void exitDefineMacro(ADTCParser.DefineMacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#defineDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDefineDeclarator(ADTCParser.DefineDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#defineDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDefineDeclarator(ADTCParser.DefineDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#defineInitializer}.
	 * @param ctx the parse tree
	 */
	void enterDefineInitializer(ADTCParser.DefineInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#defineInitializer}.
	 * @param ctx the parse tree
	 */
	void exitDefineInitializer(ADTCParser.DefineInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#undefList}.
	 * @param ctx the parse tree
	 */
	void enterUndefList(ADTCParser.UndefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#undefList}.
	 * @param ctx the parse tree
	 */
	void exitUndefList(ADTCParser.UndefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#undef}.
	 * @param ctx the parse tree
	 */
	void enterUndef(ADTCParser.UndefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#undef}.
	 * @param ctx the parse tree
	 */
	void exitUndef(ADTCParser.UndefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#conditionalMacroList}.
	 * @param ctx the parse tree
	 */
	void enterConditionalMacroList(ADTCParser.ConditionalMacroListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#conditionalMacroList}.
	 * @param ctx the parse tree
	 */
	void exitConditionalMacroList(ADTCParser.ConditionalMacroListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#conditionalMacro}.
	 * @param ctx the parse tree
	 */
	void enterConditionalMacro(ADTCParser.ConditionalMacroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#conditionalMacro}.
	 * @param ctx the parse tree
	 */
	void exitConditionalMacro(ADTCParser.ConditionalMacroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#ifexpression}.
	 * @param ctx the parse tree
	 */
	void enterIfexpression(ADTCParser.IfexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#ifexpression}.
	 * @param ctx the parse tree
	 */
	void exitIfexpression(ADTCParser.IfexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#elseList}.
	 * @param ctx the parse tree
	 */
	void enterElseList(ADTCParser.ElseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#elseList}.
	 * @param ctx the parse tree
	 */
	void exitElseList(ADTCParser.ElseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#innerIf}.
	 * @param ctx the parse tree
	 */
	void enterInnerIf(ADTCParser.InnerIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#innerIf}.
	 * @param ctx the parse tree
	 */
	void exitInnerIf(ADTCParser.InnerIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(ADTCParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(ADTCParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void enterElsestatement(ADTCParser.ElsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void exitElsestatement(ADTCParser.ElsestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ADTCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ADTCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#lineList}.
	 * @param ctx the parse tree
	 */
	void enterLineList(ADTCParser.LineListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#lineList}.
	 * @param ctx the parse tree
	 */
	void exitLineList(ADTCParser.LineListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#lineDirective}.
	 * @param ctx the parse tree
	 */
	void enterLineDirective(ADTCParser.LineDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#lineDirective}.
	 * @param ctx the parse tree
	 */
	void exitLineDirective(ADTCParser.LineDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#pragmaList}.
	 * @param ctx the parse tree
	 */
	void enterPragmaList(ADTCParser.PragmaListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#pragmaList}.
	 * @param ctx the parse tree
	 */
	void exitPragmaList(ADTCParser.PragmaListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void enterPragmaDirective(ADTCParser.PragmaDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void exitPragmaDirective(ADTCParser.PragmaDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#includeList}.
	 * @param ctx the parse tree
	 */
	void enterIncludeList(ADTCParser.IncludeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#includeList}.
	 * @param ctx the parse tree
	 */
	void exitIncludeList(ADTCParser.IncludeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(ADTCParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(ADTCParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#bodyList}.
	 * @param ctx the parse tree
	 */
	void enterBodyList(ADTCParser.BodyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#bodyList}.
	 * @param ctx the parse tree
	 */
	void exitBodyList(ADTCParser.BodyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ADTCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ADTCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(ADTCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(ADTCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(ADTCParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(ADTCParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(ADTCParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(ADTCParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(ADTCParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(ADTCParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(ADTCParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(ADTCParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(ADTCParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(ADTCParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(ADTCParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(ADTCParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(ADTCParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(ADTCParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(ADTCParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(ADTCParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(ADTCParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(ADTCParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ADTCParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ADTCParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ADTCParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ADTCParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ADTCParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ADTCParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(ADTCParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(ADTCParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ADTCParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ADTCParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ADTCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ADTCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(ADTCParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(ADTCParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ADTCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ADTCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ADTCParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ADTCParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ADTCParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ADTCParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ADTCParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ADTCParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ADTCParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ADTCParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(ADTCParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(ADTCParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(ADTCParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(ADTCParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(ADTCParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(ADTCParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(ADTCParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(ADTCParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(ADTCParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(ADTCParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(ADTCParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(ADTCParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(ADTCParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(ADTCParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(ADTCParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(ADTCParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(ADTCParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(ADTCParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(ADTCParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(ADTCParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(ADTCParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(ADTCParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(ADTCParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(ADTCParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(ADTCParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(ADTCParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(ADTCParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(ADTCParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(ADTCParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(ADTCParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(ADTCParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(ADTCParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(ADTCParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(ADTCParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(ADTCParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(ADTCParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(ADTCParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(ADTCParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(ADTCParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(ADTCParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(ADTCParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(ADTCParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(ADTCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(ADTCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(ADTCParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(ADTCParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(ADTCParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(ADTCParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(ADTCParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(ADTCParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(ADTCParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(ADTCParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(ADTCParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(ADTCParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(ADTCParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(ADTCParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(ADTCParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(ADTCParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(ADTCParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(ADTCParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(ADTCParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(ADTCParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(ADTCParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(ADTCParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(ADTCParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(ADTCParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ADTCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ADTCParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(ADTCParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(ADTCParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(ADTCParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(ADTCParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(ADTCParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(ADTCParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(ADTCParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(ADTCParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(ADTCParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(ADTCParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(ADTCParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(ADTCParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(ADTCParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(ADTCParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(ADTCParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(ADTCParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(ADTCParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(ADTCParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(ADTCParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(ADTCParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ADTCParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(ADTCParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ADTCParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(ADTCParser.EnumerationConstantContext ctx);
}