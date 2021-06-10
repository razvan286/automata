// Generated from .\Arithmetic.g4 by ANTLR 4.9
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
	 * Enter a parse tree produced by {@link ArithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ArithmeticParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ArithmeticParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(ArithmeticParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(ArithmeticParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(ArithmeticParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(ArithmeticParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ArithmeticParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ArithmeticParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(ArithmeticParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(ArithmeticParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(ArithmeticParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(ArithmeticParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(ArithmeticParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(ArithmeticParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(ArithmeticParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(ArithmeticParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ArithmeticParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ArithmeticParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ArithmeticParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ArithmeticParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(ArithmeticParser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(ArithmeticParser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(ArithmeticParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(ArithmeticParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFactExpr(ArithmeticParser.FactExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFactExpr(ArithmeticParser.FactExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(ArithmeticParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(ArithmeticParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(ArithmeticParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(ArithmeticParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(ArithmeticParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(ArithmeticParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(ArithmeticParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(ArithmeticParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ArithmeticParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ArithmeticParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(ArithmeticParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(ArithmeticParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(ArithmeticParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(ArithmeticParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntAtom}
	 * labeled alternative in {@link ArithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntAtom(ArithmeticParser.IntAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntAtom}
	 * labeled alternative in {@link ArithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntAtom(ArithmeticParser.IntAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolAtom}
	 * labeled alternative in {@link ArithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBoolAtom(ArithmeticParser.BoolAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolAtom}
	 * labeled alternative in {@link ArithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBoolAtom(ArithmeticParser.BoolAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdAtom}
	 * labeled alternative in {@link ArithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(ArithmeticParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdAtom}
	 * labeled alternative in {@link ArithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(ArithmeticParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link ArithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(ArithmeticParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link ArithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(ArithmeticParser.StringAtomContext ctx);
}