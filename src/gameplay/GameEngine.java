package gameplay;
import java.util.Scanner;

public class GameEngine
{
    public static void main(String[] args)
    {
        //Read the game map from the provides string
        World world = ReadWorldDataFile.basicWorld();

        if (world != null) {
            world.mode = World.PlayMode.explore;
            System.out.println("Welcome to the game");
            System.out.println("Please enter your character name: ");
            Scanner scanner = new Scanner(System.in);
            String playerName = scanner.nextLine();
            Player playerOne = new Player(playerName, playerName, 100, 50);
            world.play(playerOne);
        }
        else {
            System.out.println("Failed to load the game map");
        }
    }
}
