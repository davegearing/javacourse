package chapter14;

/**
 * TODO: Document me!
 *
 * @author dgearing
 *
 */
public class Player {

    private String name;
    private String guess;

    public Player(String playername){
        if(playername != ""){
            setName(playername);
        }
        else{
            throw new IllegalArgumentException("no name specified");
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the guess
     */
    public String getGuess() {
        return guess;
    }

    /**
     * @param guess the guess to set
     */
    public void setGuess(String guess) {
        this.guess = guess;
    }


}

