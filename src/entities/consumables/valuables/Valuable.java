package entities.consumables.valuables;

import entities.consumables.Consumable;

public abstract class Valuable extends Consumable {
    int value;

    public Valuable(String description, int value) {
        super(description);
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
