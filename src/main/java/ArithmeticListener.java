// Generated from .\Arithmetic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticParser}.
 */
public interface ArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ArithmeticParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ArithmeticParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(ArithmeticParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(ArithmeticParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubtr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubtr(ArithmeticParser.AddSubtrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubtr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubtr(ArithmeticParser.AddSubtrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ArithmeticParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ArithmeticParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultAdd}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultAdd(ArithmeticParser.MultAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultAdd}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultAdd(ArithmeticParser.MultAddContext ctx);
}