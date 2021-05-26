// Generated from Arithmetic.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link ArithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ArithmeticParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link ArithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ArithmeticParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ArithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVar(ArithmeticParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link ArithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVar(ArithmeticParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NL}
	 * labeled alternative in {@link ArithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterNL(ArithmeticParser.NLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NL}
	 * labeled alternative in {@link ArithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitNL(ArithmeticParser.NLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ArithmeticParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ArithmeticParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(ArithmeticParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(ArithmeticParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(ArithmeticParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(ArithmeticParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPow(ArithmeticParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPow(ArithmeticParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterID(ArithmeticParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitID(ArithmeticParser.IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFact(ArithmeticParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFact(ArithmeticParser.FactContext ctx);
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
}