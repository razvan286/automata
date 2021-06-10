// Generated from .\Arithmetic.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithmeticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithmeticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ArithmeticParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ArithmeticParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(ArithmeticParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(ArithmeticParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ArithmeticParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(ArithmeticParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(ArithmeticParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(ArithmeticParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(ArithmeticParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ArithmeticParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ArithmeticParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#return_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_(ArithmeticParser.Return_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(ArithmeticParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(ArithmeticParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactExpr(ArithmeticParser.FactExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(ArithmeticParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(ArithmeticParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(ArithmeticParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(ArithmeticParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(ArithmeticParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(ArithmeticParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(ArithmeticParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntAtom}
	 * labeled alternative in {@link ArithmeticParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtom(ArithmeticParser.IntAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAtom}
	 * labeled alternative in {@link ArithmeticParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAtom(ArithmeticParser.BoolAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdAtom}
	 * labeled alternative in {@link ArithmeticParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(ArithmeticParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link ArithmeticParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(ArithmeticParser.StringAtomContext ctx);
}