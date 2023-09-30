package gameplay;

import entities.Entity;
import entities.monsters.Monster;

public class Room extends Entity {
    Inventory inventory;
    Monster monster;

    public Room(String description) {
        super(description);
    }
}
