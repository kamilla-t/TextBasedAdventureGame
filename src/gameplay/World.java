package gameplay;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Pickup;
import entities.consumables.food.Food;
import entities.consumables.valuables.Valuable;
import entities.monsters.Monster;
import entities.openables.Openable;
import entities.wieldables.Wieldable;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import playercommand_grammar.*;

public class World {
    public enum PlayMode {battle, explore;}

    Player player;
    Room currentRoom;
    Monster currentMonster;
    PlayMode mode;
    ArrayList<Room> rooms;
    Boolean gameInProgress;

    public World() {
        rooms = new ArrayList<>();
    }

    public void onEnterRoom() {
        System.out.println("onEnterRoom method is called");

        if (this.currentRoom == null) {
            System.out.println("No room is currently set. Please set the initial room");
            return;
        }

        System.out.println(this.currentRoom.GetRoomContent());
    }

    public World(Room room) {
        this.currentRoom = room;
    }

    public void play(Player player)
    {
        this.player = player;
        System.out.println("Welcome player " + player.toString());
        this.onEnterRoom();
        this.gameInProgress = true;

        while (this.gameInProgress) {
            switch (this.mode) {
                //explore mode
                case explore:
                    processExploreUserInput();
                    break;
                //battle mode
                case battle:
                    processBattleUserInput();
                    break;
            }
        }
    }

    //Scanner
    private void processExploreUserInput(){
        if (this.player.getCurrentHealthPoints() <= 0) {
            System.out.println("You lose!");
            this.gameInProgress = false;
            return;
        }

        if (this.currentRoom.isFinalRoom && this.currentRoom.monsters.size() == 0) {
            System.out.println("You won!");
            this.gameInProgress = false;
            return;
        }

        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();

        try {
            PlayerCommandLexer lexer = new PlayerCommandLexer(CharStreams.fromString(input));
            CommonTokenStream stream = new CommonTokenStream(lexer);
            PlayerCommandParser parser = new PlayerCommandParser(stream);
            PlayerCommandParser.CommandContext tree = parser.command();

            var commandNodes = tree.action().children;
            String action = commandNodes.get(0).toString();
            String id = "";
            if (commandNodes.size() > 1) {
                id = commandNodes.get(1).toString();
            }

            switch (action) {
                case "door":
                    this.door(id);
                    break;
                case "pickup":
                    this.pickup(id);
                    break;
                case "describe":
                    this.describe();
                    break;
                case "admire":
                    this.admire(id);
                    break;
                case "eat":
                    this.eat(id);
                    break;
                case "stats":
                    this.stats();
                    break;
                case "wield":
                    this.wield(id);
                    break;
                case "open":
                    this.open(id);
                    break;
                case "help":
                    this.help();
                    break;
                case "battle":
                    this.battle(id);
                    break;
                default:
                    break;
            }
        }
        catch (Exception ex) {
            System.out.println("Something went wrong " + ex.toString() + ". Use help.");
            return;
        }
    }
    private void processBattleUserInput(){
        if (this.player.getCurrentHealthPoints() <= 0) {
            System.out.println("You lose!");
            this.gameInProgress = false;
            return;
        }

        if (this.currentRoom.isFinalRoom && this.currentRoom.monsters.size() == 0) {
            System.out.println("You won!");
            this.gameInProgress = false;
            return;
        }

        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();

        try {
            PlayerCommandLexer lexer = new PlayerCommandLexer(CharStreams.fromString(input));
            CommonTokenStream stream = new CommonTokenStream(lexer);
            PlayerCommandParser parser = new PlayerCommandParser(stream);
            PlayerCommandParser.CommandContext tree = parser.command();

            var commandNodes = tree.action().children;
            String action = commandNodes.get(0).toString();
            String id = "";
            if (commandNodes.size() > 1) {
                id = commandNodes.get(1).toString();
            }

            switch (action) {
                case "attack":
                    this.attack();
                    break;
                case "help":
                    this.help();
                    break;
                case "wield":
                    this.wield(id);
                    break;
                default:
                    break;
            }
        }
        catch (Exception ex) {
            System.out.println("Something went wrong " + ex.toString() + ". Use help.");
            return;
        }
    }

    private void pickup(String itemId) {
        if (this.mode == PlayMode.battle) {
            System.out.println("Invalid for battle mode.");
            return;
        }

        // Pickup from room
        Pickup foundItem = this.currentRoom.pickupsInRoom.select(itemId);
        if (foundItem == null) {
            System.out.println("Item not found: " + itemId + ".");
            return;
        }
        // Put item to player
        this.currentRoom.pickupsInRoom.remove(foundItem);
        this.player.inventory.add(foundItem);
        System.out.println(this.currentRoom.GetRoomContent());
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
            System.out.println("You admired: " + foundItem.toString());
            System.out.println("Your confidence points: " + this.player.getConfidencePoints());
        }
    }

    //describe command
    private void describe(){
        if (this.mode == PlayMode.battle) {
            System.out.println("Invalid for battle mode.");
            return;
        }

        for (Monster monster: this.currentRoom.monsters) {
            System.out.println(monster.getDescription());
        }
        for (Pickup pickup: this.currentRoom.pickupsInRoom.getItems()) {
            System.out.println(pickup.getDescription());
        }
        for (Room room1: this.currentRoom.connectedRooms) {
            System.out.println(room1.getDescription());
        }
    }

    //door n command
    private void door(String roomId){
        if (this.mode == PlayMode.battle) {
            System.out.println("Invalid for battle mode.");
            return;
        }

        if (this.currentRoom.monsters.size() > 0) {
            System.out.println("Monsters won't let you escape.");
            return;
        }

        for (Room room: this.currentRoom.connectedRooms) {
            if (room.compare(roomId)) {
                this.currentRoom = room;
                System.out.println(this.currentRoom.GetRoomContent());
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
            if (pickup.compare(foodId)) {
                if (pickup instanceof Food) {
                    this.player.setCurrentHealthPoints(
                            this.player.getCurrentHealthPoints() +
                                    ((Food) pickup).getHealthPoints());
                    this.player.inventory.remove(pickup);
                    System.out.println("You ate " + pickup.toString());
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
    private void wield(String weaponId) {
        for (Pickup pickup: this.player.inventory.getItems()) {
            if (pickup.compare(weaponId)) {
                if (pickup instanceof Wieldable) {
                    this.player.setWeapon((Wieldable) pickup);
                    System.out.println("You equipped " + pickup.toString());
                    return;
                }
                System.out.println("You cannot wear this item " + weaponId);
                return;
            }
        }
        System.out.println("Weapon " + weaponId + " is not found");
    }

    //open chest
    private void open(String chestId){
        if (this.mode == PlayMode.battle) {
            System.out.println("Invalid for battle mode.");
            return;
        }

        for (Pickup pickup: this.currentRoom.pickupsInRoom.getItems()) {
            if (pickup.compare(chestId)) {
                if (pickup instanceof Openable) {
                    this.player.inventory.add(((Openable) pickup).getContents());
                    this.currentRoom.pickupsInRoom.remove(pickup);
                    System.out.println(this.currentRoom.GetRoomContent());
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

    private void battle(String monsterId) {
        if (this.mode == PlayMode.battle) {
            System.out.println("Invalid for battle mode.");
            return;
        }
        for (Monster monster: this.currentRoom.monsters) {
            if (monster.compare(monsterId)) {
                this.currentMonster = monster;
                this.mode = PlayMode.battle;
                System.out.println("Battle started!");
                return;
            }
        }
        System.out.println("Monster not found.");
    }

    // battle
    //attack command
    private void attack() {
        if (this.mode == PlayMode.explore) {
            System.out.println("Invalid for explore mode.");
            return;
        }

        this.currentMonster.defendAttack(this.player);
        System.out.println("Monster HP: " + this.currentMonster.getCurrentHealthPoints());

        // counter-attack
        if (this.currentMonster.getCurrentHealthPoints() > 0) {
            this.player.defendAttack(this.currentMonster);
            System.out.println("Your HP: " + this.player.getCurrentHealthPoints());
        }
        else {
            this.currentRoom.DeleteMonster(this.currentMonster);
            this.mode = PlayMode.explore;
            this.currentMonster = null;
            System.out.println("Monster is dead.");
            System.out.println(this.currentRoom.GetRoomContent());
        }
    }

    public void AddRoom(Room room) {
        this.rooms.add(room);
    }

    public Room GetRoomByDescription(String description) {
        for (Room room: this.rooms) {
            String desc = room.getDescription();
            if (desc.equals(description)) {
                return room;
            }
        }
        return null;
    }
}
