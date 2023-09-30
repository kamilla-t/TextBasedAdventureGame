package entities;

public abstract class Character extends Entity {
    int currentHealthPoints;

    public Character(String description, int currentHealthPoints) {
        // Parent class constructor (Entity)
        super(description);
        this.currentHealthPoints = currentHealthPoints;
    }

    public int getCurrentHealthPoints(){
        return this.currentHealthPoints;
    }

    public void setCurrentHealthPoints(int currentHealthPoints) {
        if (currentHealthPoints > 0) {
            this.currentHealthPoints = currentHealthPoints;
            return;
        }

        this.currentHealthPoints = 0;
    }

    public abstract int dealAttackDamage();
    public abstract int defendAttack(Character enemy);
}
