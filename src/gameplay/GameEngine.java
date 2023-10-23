package gameplay;

import gamemap_grammar.GameMapLexer;
import gamemap_grammar.GameMapParser;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;

public class GameEngine
{
    public static void main(String[] args)
    {
        //read the World object instance from a text file or literal
        World world = ReadWorldDataFile.oneRoomWorld();
        world.mode = World.PlayMode.explore;
        Player playerOne = new Player("Player", "Kamilla",100,50);
        world.play(playerOne);
    }



}
