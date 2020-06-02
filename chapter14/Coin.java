package chapter14;

import java.util.Random;

/**
 * TODO: Document me!
 *
 * @author dgearing
 *
 */
public class Coin {

    public static final String HEADS = "HEADS";
    public static final String TAILS = "TAILS";

    private String side;

    /**
     * flip the coin
     * @return the side
     */
    public static void flip(Coin coin) {
        Random random = new Random ();
        int rvalue = random.nextInt(100);
        if (rvalue<50){
            coin.setSide(HEADS);
        }
        else{
            coin.setSide(TAILS);
        }
    }

    /**
     * @return the side
     */
    public String getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(String side) {
        this.side = side;
    }

}
