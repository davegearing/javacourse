package chapter10;

public class Apple extends Fruit{

    public Apple() {
        setCalories(12);
    }

    public void deCore(){
        System.out.println("Apple decored");
    }

    @Override
    public void makeJuice(){
        System.out.println("Cider made");
    }
}
