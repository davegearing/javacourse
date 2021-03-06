package chapter14;

import java.util.Scanner;

/**
 * TODO: Document me!
 *
 * @author dgearing
 *
 */
public class CoinTossGame {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.println("player 1, what is your name? ");
        String name1 = scanner.next();
        Player player1 = new Player(name1);

        System.out.println("player 2, what is your name? ");
        String name2 = scanner.next();
        Player player2 = new Player(name2);

        guess(player1, player2, scanner);

        Coin coin = new Coin();
        coin.flip(coin);
        System.out.println("coin toss was " + coin.getSide());

        if(coin.getSide() == player1.getGuess()){
            System.out.println(player1.getName() + " you win!!");
        }
        else{
            System.out.println(player2.getName() + " you win!!");
        }

        scanner.close();
    }

    public static void guess(Player player1, Player player2, Scanner scanner){

        boolean getGuess = true;

        while (getGuess){
            System.out.println(player1.getName() + " choose heads or tails ");
            String yourGuess = scanner.next();
            yourGuess = yourGuess.toUpperCase();
            System.out.println(player1.getName() + " you guessed " + yourGuess);

            if (yourGuess.equals("HEADS")){
                getGuess = false;
                player1.setGuess("HEADS");
                player2.setGuess("TAILS");
            }
            else{
                if (yourGuess.equals("TAILS")){
                    getGuess = false;
                    player1.setGuess("TAILS");
                    player2.setGuess("HEADS");
                }
            }
         }
    }

}
