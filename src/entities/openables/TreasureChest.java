package entities.openables;

import entities.Pickup;

public class TreasureChest extends Openable{
    public TreasureChest(boolean locked, Pickup contents) {
        super("Treasure Chest", locked, contents);
    }
}
