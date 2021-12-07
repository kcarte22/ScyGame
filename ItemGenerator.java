// ItemGenerator.java
// this class contains a static method for creating items randomly

import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemGenerator {
	private static Random rng = new Random(); 
	public static Item generate() {
		ArrayList<Item> items = new ArrayList<Item>();
        	items.add(new Item(ItemType.Other, "Space Rock", 5, 1, 0));
		items.add(new Item(ItemType.Other, "CPU", 2, 10, 0));
		items.add(new Item(ItemType.Other, "Wires", 1, 3, 0));
		items.add(new Item(ItemType.Other, "Docking Bay Key", 0, 25, 0));
		items.add(new Item(ItemType.Other, "Energy Cell", 5, 50, 0));
		items.add(new Item(ItemType.Armor, "Kolt Mesh", 10, 20, 0));
		items.add(new Item(ItemType.Armor, "Harlin Robe", 8, 15, 0));
		items.add(new Item(ItemType.Armor, "Cask Robe", 7, 10, 0));
		items.add(new Item(ItemType.Armor, "Drax Armor", 20, 50, 0));
		items.add(new Item(ItemType.Armor, "Zaid Armor", 16, 45, 0));
		items.add(new Item(ItemType.Weapon, "Meteor Hand Pistol", 5, 10, 9));
		items.add(new Item(ItemType.Weapon, "Active Proton Pistol", 4, 12, 8));
		items.add(new Item(ItemType.Weapon, "Peacekeeper Thermal Phaser", 30, 10, 15));
		items.add(new Item(ItemType.Weapon, "Sunshine Electron Phaser", 8, 25, 15));
		items.add(new Item(ItemType.Weapon, "Stormfury Phaser", 6, 18, 10));
		int x = rng.nextInt(15);
		return items.get(x);	

	}	


/*    private static Random rng;
    private static List<ItemType> itemTypeValues = Collections.unmodifiableList(Arrays.asList(ItemType.values()));
    private static int typeSize = itemTypeValues.size();
    private static ArrayList<String> weapons = new ArrayList<String>();
    private static ArrayList<String> armors = new ArrayList<String>();
    private static ArrayList<String> misc = new ArrayList<String>();
    
    public static Item generate() {
        try {
            loadWeaponOptions(weapons);
            loadArmorOptions(armors);
            loadMiscOptions(misc);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Item randomItem;
        ItemType randomType = itemTypeValues.get(rng.nextInt(typeSize));
        if (randomType == ItemType.Weapon) {
            String itemName = weapons.get(rng.nextInt(weapons.size()));
            int weight = rng.nextInt(20);
            int value = rng.nextInt(15);
            int strength = rng.nextInt(30);
            randomItem = new Item(randomType, itemName, weight, value, strength);
        } else if (randomType == ItemType.Armor) {
            String itemName = armors.get(rng.nextInt(armors.size()));
            int aWeight = rng.nextInt(12);
            int aValue = rng.nextInt(15);
            int aStrength = rng.nextInt(8);
            randomItem = new Item(ItemType.Armor, itemName, aWeight, aValue, aStrength);
        } else if (randomType == ItemType.Other) {
            String itemName = misc.get(rng.nextInt(misc.size()));
            int mWeight = rng.nextInt(15);
            int mValue = rng.nextInt(30);
            int mStrength = rng.nextInt(5);
            randomItem = new Item(ItemType.Other, itemName, mWeight, mValue, mStrength);
        } else {
            randomItem =  null;
        }

        return randomItem;
    }

    public static ArrayList<String> loadWeaponOptions(ArrayList<String> weapons) throws FileNotFoundException {
            Scanner s = new Scanner(new File("weapons.txt"));
            while (s.hasNext()) {
                String[] options = s.next().split(",");
                Collections.addAll(weapons, options);
                continue;
            }
        return weapons;
    }

    public static ArrayList<String> loadArmorOptions(ArrayList<String> armors) throws FileNotFoundException {
        Scanner s = new Scanner(new File("armor.txt"));
        while (s.hasNext()) {
            String[] armorOptions = s.next().split(",");
            Collections.addAll(armors, armorOptions);
            continue;
        }
        return armors;
    }

    public static ArrayList<String> loadMiscOptions(ArrayList<String> misc) throws FileNotFoundException { 
        Scanner s = new Scanner(new File("misc.txt"));
        while (s.hasNext()) {
            String[] miscOptions = s.next().split(",");
            Collections.addAll(misc, miscOptions);
            continue;
        }
        return misc;
    } */
}

