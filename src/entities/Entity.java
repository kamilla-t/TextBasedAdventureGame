package entities;
import java.util.Objects;
import java.util.Random;

public abstract class Entity {
    protected String description;
    protected String id;

    // Constructor
    public Entity(String description) {
        this.description = description;
        this.id = this.getClass().getSimpleName();
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getId() {
        return this.id;
    }

    public int RandomInt(int x, int y) {
        return new Random().nextInt(y-x) + x;
    }

    public boolean compare(String description) {
        // Case-insensitive string comparison
        return Objects.equals(this.description.toLowerCase(), description.toLowerCase());
    }

    public String toString() {
        return this.getId() + ": " + this.getDescription();
    }
}
