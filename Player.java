package ScyGame;
public class Player {
    
    private Inventory playerInventory;
    private int rowPosition;
    private int colPosition;
    private int health;
    private Item equippedWeapon;
    private Item equippedShield;

    public Player(int rowPosition, int colPosition) {
        playerInventory = new Inventory(20);
        health = 100;
    }

    public int getHealth() {
        return health;
    }

    


}
