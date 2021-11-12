package ScyGame;
public class Item {

    private ItemType type;
    private String name;
    private int weight;
    private int value;
    private int strength;

    public Item(ItemType type, String name, int weight, int value, int strength) {
        this.type = type;
        this.name = name;
        weight = 0;
        value = 0;
        strength = 0;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public ItemType getType() {
        return type;
    }

    public int getStrength() {
        return strength;
    }

    public String toString() {
        return null;
    }



}