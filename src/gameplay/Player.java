package gameplay;

import entities.Character;
import entities.wieldables.Wieldable;

public class Player extends Character
{
    Inventory inventory;
    String name;
    int confidencePoints;
    Wieldable weapon;

    public Player(String description, String name, int currentHealthPoints, int confidencePoints)
    {
        super(description, currentHealthPoints);
        this.name = name;
        this.confidencePoints = confidencePoints;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getConfidencePoints(){
        return this.confidencePoints;
    }

    public void setConfidencePoints(int confidencePoints){
        this.confidencePoints = confidencePoints;
    }

    public Wieldable getWeapon(){
        return this.weapon;
    }

    public void setWeapon(Wieldable weapon) {
        this.weapon = weapon;
    }

    public Inventory getInventory(){
        return this.inventory;
    }

    public void setInventory(Inventory inventory){
        this.inventory = inventory;
    }

    @Override
    public int dealAttackDamage() {
        int h = this.weapon.hit();
        int c = this.confidencePoints;
        int d = h + h * c / 100;
        return d;
    }

    @Override
    public int defendAttack(Character enemy) {
        int d = enemy.dealAttackDamage();
        int newHealth = this.getCurrentHealthPoints() - d;
        int newConfidence = this.getConfidencePoints() - d / 2;
        this.setCurrentHealthPoints(newHealth);
        this.setConfidencePoints(newConfidence);
        return d;
    }
}
