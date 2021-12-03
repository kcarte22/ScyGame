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

    private static Random rng;
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
            
        }

        return new Item(ItemType.Other, "Vase", 10, 2, 0);
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
    }
}

