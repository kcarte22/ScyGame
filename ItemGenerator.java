package ScyGame;
import java.util.Random;
import java.util.ArrayList;

public class ItemGenerator {
   
    public static Item generate() { 
        ArrayList<String> itemNames = new ArrayList<String>();
        itemNames.add("Tracer Rifle");
        itemNames.add("Lightsaber");
        itemNames.add("Fusion Blaster");
        itemNames.add("Flux Cannon");
        itemNames.add("Plasma Pistol");
        Random rand = new Random();
        int selection = rand.nextInt(ItemType.values().length);
        ItemType randomItemType = ItemType.values()[selection];
        String itemName = itemNames.get(rand.nextInt(5));
        if (itemName.equals("Tracer Rifle")) {
            if (randomItemType == ItemType.WEAPON) {
                itemName = itemName + "Gun";
            } else if (randomItemType == ItemType.SHIELD) {
                itemName = itemName + "Armor";
            } else if (randomItemType == ItemType.OTHER) {
                itemName = itemName + "Power Up";
            } else {
                itemName = itemName + "broken item";
            }
        } else if (itemName.equals("Lightsaber")) {
            if (randomItemType == ItemType.WEAPON) {
                itemName = itemName + "Sword";
            } else if (randomItemType == ItemType.SHIELD) {
                itemName = itemName + "Armor";
            } else if (randomItemType == ItemType.OTHER) {
                itemName = itemName + "Power Up";
            } else {
                itemName = itemName + "broken item";
            }
        } else if (itemName.equals("Fusion Blaster")) {
            if (randomItemType == ItemType.WEAPON) {
                itemName = itemName + "Gun";
            } else if (randomItemType == ItemType.SHIELD) {
                itemName = itemName + "Armor";
            } else if (randomItemType == ItemType.OTHER) {
                itemName = itemName + "Power Up";
            } else {
                itemName = itemName + "broken item";
            }
        } else if (itemName.equals("Flux Cannon")) {
            if (randomItemType == ItemType.WEAPON) {
                itemName = itemName + "Gun";
            } else if (randomItemType == ItemType.SHIELD) {
                itemName = itemName + "Armor";
            } else if (randomItemType == ItemType.OTHER) {
                itemName = itemName + "Power Up";
            } else {
                itemName = itemName + "broken item";
            }
        } else if (itemName.equals("Plasma Pistol")) {
            if (randomItemType == ItemType.WEAPON) {
                itemName = itemName + "Gun";
            } else if (randomItemType == ItemType.SHIELD) {
                itemName = itemName + "Armor";
            } else if (randomItemType == ItemType.OTHER) {
                itemName = itemName + "Power Up";
            } else {
                itemName = itemName + "broken item";
            }
        } else {
		itemName = null;
	}
        int randWeight = rand.nextInt(11);
        int randValue = rand.nextInt(6);
        int randStrength = rand.nextInt(16);
        Item randomItem = new Item(randomItemType, itemName, randWeight, randValue, randStrength);
        return randomItem;
    }
}



