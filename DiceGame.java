package chapter4;

import java.util.Random;

public class DiceGame {

    public static void main(String arg[]){
        /*
        roll the dice game
        roll the dice up to 5 times
        sum up the total
        if user reaches 20 exactly they win
        if the don't reach 20, under or over, then they lose
         */

        Random random = new Random();

        int maxRolls = 5;
        int endCount = 20;
        int atCount = 0;

        for(int i=0; i<maxRolls && atCount < 20; i++){
            int die = random.nextInt(6) + 1;
            System.out.println("You rolled " + die + " on roll " + (i+1));
            atCount = atCount + die;

            if(atCount<20){
                System.out.println("You are at space " + atCount);
                int spacesToGo = endCount - atCount;
                if(i<maxRolls-1) {
                    System.out.println("You have " + spacesToGo + " to go");
                }
            }
        }

        // did they win or lose?

        if(atCount==20){
            System.out.println("You have WON");
        }
        else{
            System.out.println("You have LOST");
        }
    }
}
