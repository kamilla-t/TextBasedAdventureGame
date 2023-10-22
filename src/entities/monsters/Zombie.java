package entities.monsters;

public class Zombie extends Monster{
    public Zombie(String description, int currentHealthPoints, int probability, int damage) {
        super("Zombie", 10, 50, 2);
    }
}
