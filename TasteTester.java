package chapter9;

public class TasteTester extends Cake{

    public TasteTester(String flavour) {
        super(flavour);
    }

    public static void main(String[] args){
        Cake cake = new Cake("Strawberry");
        Cake defaultcake = new Cake();
        BirthdayCake birthdaycake = new BirthdayCake("Orange", 13);
        BirthdayCake defaultbirthdaycake = new BirthdayCake();
        WeddingCake weddingcake = new WeddingCake("Mixed Fruit", 5);
        WeddingCake defaultweddingcake = new WeddingCake();

        System.out.println("A cake is £" + cake.getPrice() + " and is " + cake.getFlavour() + " flavour");
        System.out.println("A birthday cake is £" + birthdaycake.getPrice() + " and is " + birthdaycake.getFlavour() + " flavour with " + birthdaycake.getNumberOfCandles() + " candles");
        System.out.println("A wedding cake is £" + weddingcake.getPrice() + " and is " + weddingcake.getFlavour() + " flavour with " + weddingcake.getTiers() + " tiers");
        System.out.println("A default cake is £" + defaultcake.getPrice() + " and is " + defaultcake.getFlavour() + " flavour");
        System.out.println("A default birthday cake is £" + defaultbirthdaycake.getPrice() + " and is " + defaultbirthdaycake.getFlavour() + " flavour with " + defaultbirthdaycake.getNumberOfCandles() + " candles");
        System.out.println("A default wedding cake is £" + defaultweddingcake.getPrice() + " and is " + defaultweddingcake.getFlavour() + " flavour with " + defaultweddingcake.getTiers() + " tiers");

    }



}
