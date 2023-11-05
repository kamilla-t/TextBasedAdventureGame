package entities.openables;

import entities.Pickup;

public class WarChest extends Openable{
    public WarChest(String description, boolean locked, Pickup contents) {
        super(description, locked, contents);
    }
}
