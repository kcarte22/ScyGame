package ScyGame;
public class Enemy {
    
    private EnemyType type;
    private int health;
    private int rowPosition;
    private int colPosition;


    public Enemy(int health, int rowPosition, int colPosition) {
	    health = 100;


    }

    public EnemyType getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }
}
