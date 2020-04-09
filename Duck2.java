package chapter11;

public class Duck2 extends AnimalClass {

    public Duck2() {
        System.out.println("I'm a Duck2");
    }

    @Override
    public void makeSound(){
        System.out.println("Quack Quack");
    }

}
