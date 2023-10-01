
package gameplay;
import java.util.Scanner;

import entities.Pickup;
import entities.consumables.valuables.Valuable;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import gamemap_grammar.*;
import org.antlr.v4.runtime.Token;
import playercommand_grammar.*;

public class World {
    public enum PlayMode {battle, explore;}

    Player player;
    Room startingRoom;
    PlayMode mode;
    Room room;

    public World() {

    }

    public World(Room room) {
        this.room = room;
    }

    public void onEnterRoom()
	{
	}

    public void play(Player player)
    {
        this.player = player;
        System.out.println("Welcome player " + player);

        System.out.println(player);
        this.onEnterRoom();

        boolean gameInProgress = true;
        while (gameInProgress) {
            switch (this.mode) {
                case explore:
                    processExploreUserInput();
                    break;
                case battle:
                    processBattleUserInput();
                    break;
            }
        }
    }

    //Scanner
    private void processExploreUserInput(){
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();

        PlayerCommandLexer lexer = new PlayerCommandLexer(CharStreams.fromString(input));
        Token token = lexer.nextToken();

        switch (token.getText()) {
            case "pickup":
                this.pickup("Jewel");
                break;
            case "battle":
                break;
            case "admire":
                this.admire("GoldBars");
                break;
            default:
                break;

        }
    }
    private void processBattleUserInput(){

    }

    private void pickup(String itemId) {
        // Pickup from room
        Pickup foundItem = this.room.pickupsInRoom.select(itemId);
        if (foundItem == null) {
            return;
        }
        // Put item to player
        this.room.pickupsInRoom.remove(foundItem);
        this.player.inventory.add(foundItem);
    }

    private void admire(String itemId) {
        // ???
        Pickup foundItem = this.player.inventory.select(itemId);
        if (foundItem == null) {
            return;
        }
        if (foundItem instanceof Valuable) {
            this.player.admire((Valuable)foundItem);
        }
    }

    // battle
}
