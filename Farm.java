package chapter11;

public class Farm {

    public static void main(String[] Args){

        Pig pig = new Pig();
        pig.makeSound();
        pig.eat();

        Duck duck = new Duck();
        duck.makeSound();
        duck.eat();
    }
}
