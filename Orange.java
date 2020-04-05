package chapter10;

public class Orange extends Fruit {

    public Orange() {
        setCalories(10);
    }

    public void peel() {
        System.out.println("Orange peel removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Orange juice made");
    }
}


