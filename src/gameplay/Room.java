package gameplay;

import entities.Entity;
import entities.monsters.Monster;

import java.util.ArrayList;

public class Room extends Entity {
    Inventory pickupsInRoom;
    boolean isFinalRoom;
    Room[] connectedRooms;
    ArrayList<Monster> monsters;

    public Room() {
        super(null);
        this.pickupsInRoom = new Inventory();
        this.isFinalRoom = false;
        this.connectedRooms = new Room[] {};
        this.monsters = new ArrayList<>();
    }

    public Room(String description, Inventory pickupsInRoom, Room[] connectedRooms){
        super(description);
        this.pickupsInRoom = pickupsInRoom;
        this.isFinalRoom = false;
        this.connectedRooms = connectedRooms;
        this.monsters = new ArrayList<>();
    }

}
