package entities.openables;

import entities.Pickup;
import entities.openers.Opener;

public class Openable extends Pickup {
    Opener opener;

    public Openable(String description) {
        super(description);
    }
}
