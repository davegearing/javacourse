package chapter9;

public class TasteTester extends Cake{

    public TasteTester(String flavour) {
        super(flavour);
    }

    public static void main(String[] args){
        Cake cake = new Cake("Vanilla");
        BirthdayCake birthdaycake = new BirthdayCake("Orange", 13);
        WeddingCake weddingcake = new WeddingCake("Mixed Fruit", 5);

        System.out.println("A cake is £" + cake.getPrice() + " and is " + cake.getFlavour() + " flavour");
        System.out.println("A birthday cake is £" + birthdaycake.getPrice() + " and is " + birthdaycake.getFlavour() + " flavour with " + birthdaycake.getNumberOfCandles() + " candles");
        System.out.println("A wedding cake is £" + weddingcake.getPrice() + " and is " + weddingcake.getFlavour() + " flavour with " + weddingcake.getTiers() + " tiers");
    }



}
