package entities.monsters;

import entities.Character;

public class Monster extends Character {
    int probability;
    int damage;

    public Monster(String description, int currentHealthPoints, int probability, int damage) {
        super(description, currentHealthPoints);
        this.probability = probability;
        this.damage = damage;
    }

    public int getProbability(){
        return this.probability;
    }

    public void setProbability(int probability){
        this.probability = probability;
    }

    public int getDamage(){
        return this.damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    @Override
    public int dealAttackDamage() {
        int r = this.RandomInt(1, 10);
        return this.damage + r;
    }

    @Override
    public int defendAttack(Character enemy) {
        int d = enemy.dealAttackDamage();
        int newHealthPoint = this.getCurrentHealthPoints() - d;
        this.setCurrentHealthPoints(newHealthPoint);
        return d;
    }

    public boolean appear(){
        if (this.getCurrentHealthPoints() <= 0) {
            return false;
        }
        int x = this.RandomInt(0, 101);
        return x <= this.probability;
    }
}
