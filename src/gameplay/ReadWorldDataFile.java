package gameplay;

import gamemap_grammar.GameMapLexer;
import gamemap_grammar.GameMapParser;
import gamemap_grammar.MyGameMapVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.file.Paths;

public class ReadWorldDataFile
{

/**
 * Static method to read a text file containing
 * a basic World to be played by the Game Engine
 *
 * */
    public static World basicWorld()
    {
        //read a basic map from a text file and
        //use antlr to parse and construct a World object.
        try {
            World world = new World();
            String filePath = Paths.get(System.getProperty("user.dir"), "src", "GameMap.txt").toString();
            ANTLRFileStream input = new ANTLRFileStream(filePath);
            GameMapLexer lexer = new GameMapLexer(input);
            CommonTokenStream stream = new CommonTokenStream(lexer);
            GameMapParser parser = new GameMapParser(stream);
            ParseTree tree = parser.gamemap();
            MyGameMapVisitor visitor = new MyGameMapVisitor(world);
            visitor.visit(tree);
            world.currentRoom = world.rooms.get(0);
            return world;
        }
        catch (Exception ex) {
            System.out.println("Could not read file because of " + ex);
            return null;
        }
    }
}
