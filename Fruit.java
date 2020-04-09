package chapter10;

public class Fruit {

    protected Integer calories;

    public Fruit() {
        setCalories(0);
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("made juice");
    }
}
