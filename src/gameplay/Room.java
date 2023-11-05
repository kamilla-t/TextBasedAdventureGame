package gameplay;

import entities.Entity;
import entities.Pickup;
import entities.monsters.Monster;

import java.util.ArrayList;

public class Room extends Entity {
    Inventory pickupsInRoom;
    boolean isFinalRoom;
    ArrayList<Room> connectedRooms;
    ArrayList<Monster> monsters;

    public Room(String description, Boolean isFinalRoom) {
        super(description);
        this.pickupsInRoom = new Inventory();
        this.isFinalRoom = isFinalRoom;
        this.connectedRooms = new ArrayList<>();
        this.monsters = new ArrayList<>();
    }

    public Room(String description, Inventory pickupsInRoom, ArrayList<Room> connectedRooms){
        super(description);
        this.pickupsInRoom = pickupsInRoom;
        this.isFinalRoom = false;
        this.connectedRooms = connectedRooms;
        this.monsters = new ArrayList<>();
    }

    public void SpawnMonster(Monster monster) {
        if (monster.appear()) {
            this.monsters.add(monster);
        }
    }

    public void AddPickup(Pickup pickup) {
        this.pickupsInRoom.add(pickup);
    }

    public void AddConnectedRoom(Room room) {
        this.connectedRooms.add(room);
    }

    public static void ConnectRooms(Room room1, Room room2) {
        room1.AddConnectedRoom(room2);
        room2.AddConnectedRoom(room1);
    }

    public String GetRoomContent() {
        String roomDescription = "";

        roomDescription += "Room: " + this.getDescription() + "\n";

        roomDescription += "Room Contents: \n";
        for (Pickup item : this.pickupsInRoom.getItems()) {
            roomDescription += "- " + item.toString() + "\n";
        }

        //Print room monsters
        roomDescription += "Room Monsters: \n";
        for (Monster monster : this.monsters) {
            roomDescription += "- " + monster.toString() + "\n";
        }

        //Print room connections
        roomDescription += "Room Connections: \n";
        for (Room connection: this.connectedRooms) {
            roomDescription += "- to Room " + connection.getDescription() + "\n";
        }

        return roomDescription;
    }

    public void DeleteMonster(Monster monster) {
        for (int i = 0; i < this.monsters.size(); i++) {
            if (monster.compare(this.monsters.get(i).getDescription())) {
                this.monsters.remove(i);
                return;
            }
        }
        System.out.println("Monster not found " + monster.toString());
    }
}
