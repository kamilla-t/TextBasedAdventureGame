// Generated from C:/main/study/Theory of Computation/projects/TextBasedAdventureGame/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GameMapParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GameMapVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoom(GameMapParser.RoomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(GameMapParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#connections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnections(GameMapParser.ConnectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnection(GameMapParser.ConnectionContext ctx);
}