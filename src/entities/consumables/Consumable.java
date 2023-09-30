package entities.consumables;

import entities.Pickup;

public abstract class Consumable extends Pickup {
    boolean consumed;

    public Consumable(String description) {
        super(description);
    }

    public boolean getConsumed(){
        return this.consumed;
    }

    public void setConsumed(boolean consumed){
        this.consumed = consumed;
    }
}
