// Generated from C:/main/study/Theory of Computation/projects/TextBasedAdventureGame/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayerCommandParser}.
 */
public interface PlayerCommandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(PlayerCommandParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(PlayerCommandParser.ActionContext ctx);
}