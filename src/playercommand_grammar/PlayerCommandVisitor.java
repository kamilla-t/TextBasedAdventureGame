// Generated from C:/main/study/Theory of Computation/projects/TextBasedAdventureGame/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayerCommandParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayerCommandVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(PlayerCommandParser.ActionContext ctx);
}