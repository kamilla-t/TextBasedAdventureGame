package entities.openables;

import entities.Pickup;

public class WarChest extends Openable{
    public WarChest(boolean locked, Pickup contents) {
        super("War chest", locked, contents);
    }
}
