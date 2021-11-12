package ScyGame;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Inventory {
    
    private ArrayList<Item> items;
    private int maxWeight;
    private Item equippedWeapon;
    private Item equippedArmor;

    public Inventory(int maxWeight) {
        items = new ArrayList<Item>();
        this.maxWeight = maxWeight;
    }

    /** The add method takes the totalWeight of the items to determine if an item can be added.
     * It returns true if the item can be added, and false if not.
     * @param item
     * @return
     */
    public boolean add(Item item) {
        if (this.totalWeight() < maxWeight) {
            items.add(item);
            return true;
        } else {
            return false;
        }
    }

    /** The totalWeight method is used to retrieve the total weight of an inventory's items. The
     *  result is returned as an int.
     * @return
     */
    public int totalWeight() {
        int weight = 0;
        for (Item item : items) {
            weight = weight + item.getWeight();
        }
        return weight;
    }

    public void print() {
        for (Item item : items) {
            System.out.println(item.getName() + " " + item.getWeight() + " " + item.getValue() + " " + item.getStrength());
        }
    }

    /** The drop method prompts a user with the list of items currently in the inventory. The selection
     * the user enters will be used to drop the item with the same name.
    */
    public void drop() {
        for (Item item : items)  {
            System.out.println(item.getName());
        }
        try {
            Scanner console = new Scanner(System.in);
            String droppedItem = console.nextLine();
            for (Item item : items) {
                if (droppedItem == item.getName()) {
                    items.remove(item);
                    System.out.println("Item has been removed from your inventory");
                }
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    /** The equioWeapon method lists the items within the inventory and prompts the user
     * to enter which will be equipped as their weapon. The item that the user enters, must also
     * have the ItemType WEAPON.
    */
    public void equipWeapon() {
        for (Item item : items) {
            System.out.println(item.getName());
            System.out.println(item.getType().toString());
        }
        Scanner console = new Scanner(System.in);
        String equippedWeaponString = console.nextLine();
        for (Item item : items) {
            if (equippedWeaponString == item.getName()) {
                if (item.getType() == ItemType.WEAPON) {
                    equippedWeapon = item;
                    System.out.println(equippedWeapon + " is equipped");
                }
            }
        }
    }

    public void equipArmor() {
        for (Item item : items) {
            System.out.println(item.getName());
            System.out.println(item.getType().toString());
        }
        Scanner console = new Scanner(System.in);
        String equippedArmorString = console.next();
        for (Item item : items) {
            if (equippedArmorString == item.getName()) {
                if (item.getType() == ItemType.SHIELD) {
                    equippedArmor = item;
                    System.out.println(equippedArmor + " is equipped.");
                }
            }
        }
    }

    public int getMaxWeight() {
        return maxWeight;
    }

}
