package chapter14;

import java.util.Random;

/**
 * TODO: Document me!
 *
 * @author dgearing
 *
 */
public class Coin {

    static final String HEADS = "HEADS";
    static final String TAILS = "TAILS";

    private String side;
    
    /**
     * flip the coin 
     * @return the side
     */
    public static void flip() {
        Random random = new Random ();
        int rvalue = random.nextInt(100);
        if (rvalue<50){
            setSide(HEADS);
        }
        else{
            setSide(TAILS);
        }
    }

    /**
     * @return the side
     */
    public String getSide() {
        this.flip();
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(String theside) {
        this.side = theside;
    }
    
}
