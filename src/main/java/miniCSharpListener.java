// Generated from miniCSharp.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniCSharpParser}.
 */
public interface miniCSharpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(miniCSharpParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(miniCSharpParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(miniCSharpParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(miniCSharpParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(miniCSharpParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(miniCSharpParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(miniCSharpParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(miniCSharpParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(miniCSharpParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(miniCSharpParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(miniCSharpParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(miniCSharpParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_list(miniCSharpParser.Function_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_list(miniCSharpParser.Function_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(miniCSharpParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(miniCSharpParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(miniCSharpParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(miniCSharpParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(miniCSharpParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(miniCSharpParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_list(miniCSharpParser.Variable_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_list(miniCSharpParser.Variable_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(miniCSharpParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(miniCSharpParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(miniCSharpParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(miniCSharpParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(miniCSharpParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(miniCSharpParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(miniCSharpParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(miniCSharpParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(miniCSharpParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(miniCSharpParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void enterNum_exp(miniCSharpParser.Num_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#num_exp}.
	 * @param ctx the parse tree
	 */
	void exitNum_exp(miniCSharpParser.Num_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(miniCSharpParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(miniCSharpParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(miniCSharpParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(miniCSharpParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(miniCSharpParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(miniCSharpParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(miniCSharpParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(miniCSharpParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(miniCSharpParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(miniCSharpParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#if_part}.
	 * @param ctx the parse tree
	 */
	void enterIf_part(miniCSharpParser.If_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#if_part}.
	 * @param ctx the parse tree
	 */
	void exitIf_part(miniCSharpParser.If_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#rel_exp}.
	 * @param ctx the parse tree
	 */
	void enterRel_exp(miniCSharpParser.Rel_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#rel_exp}.
	 * @param ctx the parse tree
	 */
	void exitRel_exp(miniCSharpParser.Rel_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniCSharpParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(miniCSharpParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniCSharpParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(miniCSharpParser.Return_statementContext ctx);
}