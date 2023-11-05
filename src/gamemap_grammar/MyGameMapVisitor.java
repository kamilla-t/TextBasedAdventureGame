package gamemap_grammar;

import entities.consumables.food.Bread;
import entities.consumables.food.Food;
import entities.consumables.food.Mead;
import entities.consumables.food.RoastBoar;
import entities.consumables.valuables.*;
import entities.monsters.Dragon;
import entities.monsters.Monster;
import entities.monsters.Ogre;
import entities.monsters.Zombie;
import entities.openables.Openable;
import entities.openables.TreasureChest;
import entities.openables.WarChest;
import entities.wieldables.Axe;
import entities.wieldables.Sword;
import entities.wieldables.Wieldable;
import gameplay.*;

import java.util.HashMap;
import java.util.Map;

public class MyGameMapVisitor extends GameMapBaseVisitor<Void> {
    // Initialize currentRoom
    private Map<Integer, Room> rooms = new HashMap<>();
    private int currentRoomNumber;
    private Room currentRoom;
    private World world;

    public MyGameMapVisitor(World world) {
        this.world = world;
    }

    @Override
    public Void visitRoom(GameMapParser.RoomContext ctx) {
        String[] roomArgs = ctx.ROOMID().toString().split(",");
        String roomDesc = roomArgs[0].substring(2);
        Boolean isFinal = Boolean.parseBoolean(roomArgs[1]);
        this.currentRoom = new Room(roomDesc, isFinal);
        this.world.AddRoom(this.currentRoom);
        return super.visitRoom(ctx);
    }

    @Override
    public Void visitAttr(GameMapParser.AttrContext ctx) {
        if (ctx.MONSTER() != null) {
            String[] monsterArgs = ctx.MONSTER().toString().split(",");
            String monsterType = monsterArgs[0].substring(2);
            String monsterId = monsterArgs[1];
            Monster monster = null;
            switch (monsterType) {
                case "Ogre":
                    monster = new Ogre(monsterId);
                    break;
                case "Zombie":
                    monster = new Zombie(monsterId);
                    break;
                case "Dragon":
                    monster = new Dragon(monsterId);
                    break;
            }
            if (monster != null) {
                this.currentRoom.SpawnMonster(monster);
            }
        }
        if (ctx.VALUABLES() != null) {
            String[] valuableArgs = ctx.VALUABLES().toString().split(",");
            String valuableType = valuableArgs[0].substring(2);
            String valuableId = valuableArgs[1];
            Valuable valuable = Valuable.parseValuable(valuableType, valuableId);
            if (valuable != null) {
                this.currentRoom.AddPickup(valuable);
            }
        }
        if (ctx.FOOD() != null) {
            String[] foodArgs = ctx.FOOD().toString().split(",");
            String foodType = foodArgs[0].substring(2);
            String foodId = foodArgs[1];
            Food food = null;
            switch (foodType) {
                case "Bread":
                    food = new Bread(foodId);
                    break;
                case "Mead":
                    food = new Mead(foodId);
                    break;
                case "RoastBoar":
                    food = new RoastBoar(foodId);
                    break;
            }
            if (food != null) {
                this.currentRoom.AddPickup(food);
            }
        }
        if (ctx.OPENABLE() != null) {
            String[] openableArgs = ctx.OPENABLE().toString().split("V:");
            String[] openableChestArgs = openableArgs[0].split(",");
            String[] openableValuableArgs = openableArgs[1].split(",");

            String chestType = openableChestArgs[0].substring(2);
            String chestDesc = openableChestArgs[1];
            Boolean chestLocked = Boolean.parseBoolean(openableChestArgs[2]);

            String valuableType = openableValuableArgs[0];
            String valuableId = openableValuableArgs[1];
            Valuable valuable = Valuable.parseValuable(valuableType, valuableId);

            if (valuable != null) {
                Openable openable = null;
                switch (chestType) {
                    case "TreasureChest":
                        openable = new TreasureChest(chestDesc, chestLocked, valuable);
                        break;
                    case "WarChest":
                        openable = new WarChest(chestDesc, chestLocked, valuable);
                        break;
                }
                if (openable != null) {
                    this.currentRoom.AddPickup(openable);
                }
            }
        }
        if (ctx.WIELDABLE() != null) {
            String[] wieldableArgs = ctx.WIELDABLE().toString().split(",");
            String wieldableType = wieldableArgs[0].substring(2);
            String wieldableId = wieldableArgs[1];
            Wieldable wieldable = null;
            switch (wieldableType) {
                case "Axe":
                    wieldable = new Axe(wieldableId);
                    break;
                case "Sword":
                    wieldable = new Sword(wieldableId);
                    break;
            }
            if (wieldable != null) {
                this.currentRoom.AddPickup(wieldable);
            }
        }
        return super.visitAttr(ctx);
    }

    @Override
    public Void visitConnection(GameMapParser.ConnectionContext ctx) {
        String roomDesc1 = ctx.INT(0).toString();
        String roomDesc2 = ctx.INT(1).toString();
        Room room1 = this.world.GetRoomByDescription(roomDesc1);
        Room room2 = this.world.GetRoomByDescription(roomDesc2);
        if (room1 != null && room2 != null) {
            Room.ConnectRooms(room1, room2);
        }
        return super.visitConnection(ctx);
    }
}