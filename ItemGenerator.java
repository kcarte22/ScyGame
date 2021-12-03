// ItemGenerator.java
// this class contains a static method for creating items randomly

import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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

    public static ArrayList<String> loadWeaponOptions(ArrayList<String> weapons) {
        return null;
    }
}

