// Generated from C:/main/study/Theory of Computation/projects/TextBasedAdventureGame/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GameMapParser}.
 */
public interface GameMapListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 */
	void enterGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 */
	void exitGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#room}.
	 * @param ctx the parse tree
	 */
	void enterRoom(GameMapParser.RoomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#room}.
	 * @param ctx the parse tree
	 */
	void exitRoom(GameMapParser.RoomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(GameMapParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(GameMapParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#connections}.
	 * @param ctx the parse tree
	 */
	void enterConnections(GameMapParser.ConnectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#connections}.
	 * @param ctx the parse tree
	 */
	void exitConnections(GameMapParser.ConnectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(GameMapParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(GameMapParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(GameMapParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(GameMapParser.ActionContext ctx);
}