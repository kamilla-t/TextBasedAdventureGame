package entities.consumables.food;

import entities.consumables.Consumable;

public abstract class Food extends Consumable {
    int healthPoints;

    public Food(String description, int healthPoints) {
        super(description);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }
}
