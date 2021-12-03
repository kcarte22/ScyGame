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
    
    public static Item generate() {
        // TODO: replace this with your own code!
        Item randomItem;
        ItemType randomType = itemTypeValues.get(rng.nextInt(typeSize));

        return new Item(ItemType.Other, "Vase", 10, 2, 0);
    }

    public static ArrayList<String> loadWeaponOptions(Scanner s, ArrayList<String> weapons) throws FileNotFoundException {
            s = new Scanner(new File("weapons.txt"));
            String weapon;
            for (int i = 0; i < weapons.size(); i++) {
                weapon = s.next();
                weapons.add(weapon);
                if (weapon == null) {
                    break;
                }
            }



        return null;
    }
}

