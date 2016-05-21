// Generated from Vetrix.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VetrixParser}.
 */
public interface VetrixListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VetrixParser#runProgram}.
	 * @param ctx the parse tree
	 */
	void enterRunProgram(VetrixParser.RunProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#runProgram}.
	 * @param ctx the parse tree
	 */
	void exitRunProgram(VetrixParser.RunProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VetrixParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(VetrixParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(VetrixParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link VetrixParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(VetrixParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(VetrixParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VetrixParser#calculateVectors}.
	 * @param ctx the parse tree
	 */
	void enterCalculateVectors(VetrixParser.CalculateVectorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#calculateVectors}.
	 * @param ctx the parse tree
	 */
	void exitCalculateVectors(VetrixParser.CalculateVectorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VetrixParser#arythmVectors}.
	 * @param ctx the parse tree
	 */
	void enterArythmVectors(VetrixParser.ArythmVectorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#arythmVectors}.
	 * @param ctx the parse tree
	 */
	void exitArythmVectors(VetrixParser.ArythmVectorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VetrixParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(VetrixParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(VetrixParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VetrixParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(VetrixParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(VetrixParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VetrixParser#bool_var}.
	 * @param ctx the parse tree
	 */
	void enterBool_var(VetrixParser.Bool_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#bool_var}.
	 * @param ctx the parse tree
	 */
	void exitBool_var(VetrixParser.Bool_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link VetrixParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(VetrixParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(VetrixParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VetrixParser#while_condition}.
	 * @param ctx the parse tree
	 */
	void enterWhile_condition(VetrixParser.While_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#while_condition}.
	 * @param ctx the parse tree
	 */
	void exitWhile_condition(VetrixParser.While_conditionContext ctx);
}