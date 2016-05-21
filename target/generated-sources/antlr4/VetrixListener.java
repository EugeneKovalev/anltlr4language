// Generated from Vetrix.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VetrixParser}.
 */
public interface VetrixListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link VetrixParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(VetrixParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(VetrixParser.VariableContext ctx);
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
	 * Enter a parse tree produced by {@link VetrixParser#runProgram}.
	 * @param ctx the parse tree
	 */
	void enterRunProgram(VetrixParser.RunProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#runProgram}.
	 * @param ctx the parse tree
	 */
	void exitRunProgram(VetrixParser.RunProgramContext ctx);
}