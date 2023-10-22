
package gameplay;
import java.io.Console;
import java.util.Scanner;

import entities.Pickup;
import entities.consumables.food.Food;
import entities.consumables.valuables.Valuable;
import entities.monsters.Monster;
import entities.openables.Openable;
import entities.wieldables.Wieldable;
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
        if (this.player.getCurrentHealthPoints() <= 0) {
            System.out.println("Game over");
            return;
        }

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
        if (this.player.getCurrentHealthPoints() <= 0) {
            System.out.println("Game over");
            return;
        }

        // process input
    }

    private void pickup(String itemId) {
        if (this.mode == PlayMode.battle) {
            System.out.println("Invalid for battle mode.");
            return;
        }

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
        if (this.mode == PlayMode.battle) {
            System.out.println("Invalid for battle mode.");
            return;
        }

        // ???
        Pickup foundItem = this.player.inventory.select(itemId);
        if (foundItem == null) {
            return;
        }
        if (foundItem instanceof Valuable) {
            this.player.admire((Valuable)foundItem);
        }
    }

    //describe command
    private void describe(){
        if (this.mode == PlayMode.battle) {
            System.out.println("Invalid for battle mode.");
            return;
        }

        for (Monster monster: this.room.monsters) {
            System.out.println(monster.getDescription());
        }
        for (Pickup pickup: this.room.pickupsInRoom.getItems()) {
            System.out.println(pickup.getDescription());
        }
        for (Room room1: this.room.connectedRooms) {
            System.out.println(room1.getDescription());
        }
    }

    //door n command
    private void door(String roomId){
        if (this.mode == PlayMode.battle) {
            System.out.println("Invalid for battle mode.");
            return;
        }

        for (Room room1: this.room.connectedRooms) {
            if (room1.compareID(roomId)) {
                this.room = room1;
                return;
            }
        }
        System.out.println("Room " + roomId + " is not found");
    }

    //eat food command
    private void eat(String foodId){
        if (this.mode == PlayMode.battle) {
            System.out.println("Invalid for battle mode.");
            return;
        }

        for(Pickup pickup : this.player.inventory.getItems()) {
            if (pickup.compareID(foodId)) {
                if (pickup instanceof Food) {
                    this.player.setCurrentHealthPoints(
                            this.player.getCurrentHealthPoints() +
                                    ((Food) pickup).getHealthPoints());
                    this.player.inventory.remove(pickup);
                    return;
                }
                System.out.println("pickup " + foodId + " is not food");
                return;
            }
        }
        System.out.println("pickup " + foodId + " is not found");
    }

    //stats command
    private void stats() {
        if (this.mode == PlayMode.battle) {
            System.out.println("Invalid for battle mode.");
            return;
        }

        System.out.println("Confidence points: " + this.player.getConfidencePoints());
        System.out.println("Health points: " + this.player.getCurrentHealthPoints());
        System.out.println("Inventory items: ");
        for (Pickup pickup: this.player.inventory.getItems()) {
            System.out.println(pickup.getDescription());
        }
    }

    //wield weapon
    private void wieldWeapon(String weaponId) {
        for (Pickup pickup: this.player.inventory.getItems()) {
            if (pickup.compareID(weaponId)) {
                if (pickup instanceof Wieldable) {
                    this.player.setWeapon((Wieldable) pickup);
                    return;
                }
                System.out.println("You cannot wear this item " + weaponId);
                return;
            }
        }
        System.out.println("Weapon " + weaponId + " is not found");
    }

    //open chest
    private void openChest(String chestId){
        if (this.mode == PlayMode.battle) {
            System.out.println("Invalid for battle mode.");
            return;
        }

        for (Pickup pickup: this.room.pickupsInRoom.getItems()) {
            if (pickup.compareID(chestId)) {
                if (pickup instanceof  Openable) {
                    this.player.inventory.add(((Openable) pickup).getContents());
                    this.room.pickupsInRoom.remove(pickup);
                    return;
                }
                System.out.println("You cannot open " + chestId);
                return;
            }
        }
        System.out.println("Chest " + chestId + " is not found");
    }

    //help command
    private void help() {
        System.out.println("[door n]: opens door labeled n and enter room");
        System.out.println("[pick up]: pick up item in a room and put it to inventory");
        System.out.println("[describe]: describes the room, list of pickups on the floor, and number of doors available");
        System.out.println("[admire valuable]: admire a valuable may only be used once to increase confidence but not " +
                "removed from the player's inventory");
        System.out.println("[eat food]: eats a food pickup in the inventory to increase health points. " +
                "If eaten then remove from inventory.");
        System.out.println("[stats]: display confidence, health points and inventory.");
        System.out.println("[wield weapon]: you may have weapon in inventory and you can use it for the battle.");
        System.out.println("[open chest]: when player opens war chest and items transfer to player's inventory " +
                "and delete war chest from the room");
        System.out.println("[help]: displays all commands");
        System.out.println("[attack]: attack the monster using wielded weapon");
    }

    // battle
    //attack command
    private void attack(String monsterId) {
        if (this.mode == PlayMode.explore) {
            System.out.println("Invalid for explore mode.");
            return;
        }

        for (Monster monster: this.room.monsters) {
            if (monster.compareID(monsterId)) {
                monster.defendAttack(this.player);

                // counter-attack
                if (monster.getCurrentHealthPoints() > 0) {
                    this.player.defendAttack(monster);

                    if (this.player.getCurrentHealthPoints() <= 0) {
                        System.out.println("Game over");
                        return;
                    }
                }
                return;
            }
        }
        System.out.println("Monster " + monsterId + " is not found");
    }
}
