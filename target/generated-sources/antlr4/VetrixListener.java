// Generated from Vetrix.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VetrixParser}.
 */
public interface VetrixListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link VetrixParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(VetrixParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VetrixParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(VetrixParser.VectorContext ctx);
}