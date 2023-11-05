package entities.openables;

import entities.Pickup;

public class TreasureChest extends Openable{
    public TreasureChest(String description, boolean locked, Pickup contents) {
        super(description, locked, contents);
    }
}
