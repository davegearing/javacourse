package chapter10;

public class Market {

    public static void main(String[] Args){

        Fruit orange = new Orange();
        Fruit apple = new Apple();

        Orange orange1 = new Orange();
        Apple apple1 = new Apple();

        apple.makeJuice();
        ((Apple) apple).deCore();
        apple1.makeJuice();
        apple1.deCore();

        orange.makeJuice();
        ((Orange) orange).peel();
        orange1.makeJuice();
        orange1.peel();
    }


}
