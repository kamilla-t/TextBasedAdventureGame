package entities.wieldables;

import entities.Pickup;

public abstract class Wieldable extends Pickup {
    int high;
    int low;

    public Wieldable(String description, int low, int high) {
        super(description);
        this.low = low;
        this.high = high;
    }

    public int getHigh() {
        return this.high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
    public int getLow() {
        return this.low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int hit(){
        return this.RandomInt(this.low, this.high);
    }
}
