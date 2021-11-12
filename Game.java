package ScyGame;
import java.util.ArrayList;

public class Game {
    
    private static Game theInstance;
    private static Player user;
    private static ArrayList<Enemy> enemies = new ArrayList<Enemy>(10);

    /**
     * This constructor initilializes the instance of the game. It will be used to keep track of the 
     * players Game Mode. Here we may add supplemental features that can be used to make the game
     * more interesting.
     * @return
     */
    static Game instance() {
        if (theInstance == null) {
            theInstance = new Game();
        }
        return theInstance;
    }

    public static void game() {
        int hrow = 4, hcol = 4;
        boolean done = false;
        while (!done) {
            World.makeMap(hrow, hcol);
            World.listInfo();
            
            // this "blocks" until we get a key from the user
            Key key = Terminal.getKey();
            switch (key) {
                case ESCAPE:
                    done = true;
                    break;
                case LEFT:  hcol--; break;
                case RIGHT: hcol++; break;
                case UP:    hrow--; break;
                case DOWN:  hrow++; break;
                case P:
                    // note we must use print (not println) and pass \n\r explicitly!
                    System.out.print("There is nothing here!\n\r");
                    Terminal.pause(1.5);
                    break;
                case COLON:
                    Terminal.warpCursor(40, 0);
                    String cmd = Terminal.getLine(":");
                    if (cmd.equals("use")) {
                        String item = Terminal.getLine("Use what? ");
                        System.out.print("You don't have that!\n\r"); 
                        Terminal.pause(1.5);
                    } else {
                        System.out.print("Invalid command\n\r"); 
                        Terminal.pause(1.5);
                    }
                    break;
                
            }

        }
    }

}

    

    

