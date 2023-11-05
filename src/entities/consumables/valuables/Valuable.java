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

    public static Valuable parseValuable(String type, String id) {
        Valuable valuable = null;
        switch (type) {
            case "Chalice":
                valuable = new Chalice(id);
                break;
            case "Coin":
                valuable = new Coin(id);
                break;
            case "GoldBar":
                valuable = new GoldBar(id);
                break;
            case "Jewel":
                valuable = new Jewel(id);
                break;
            case "Mobile":
                valuable = new Mobile(id);
                break;
            case "MoneyBag":
                valuable = new MoneyBag(id);
                break;
        }

        return valuable;
    }
}
