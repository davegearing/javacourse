package chapter9;

public class Cake {

    protected String flavour;
    protected double price;

    public Cake(String flavour) {
        setFlavour(flavour);
        setPrice(3);
    }

    public String getFlavour() {
        return flavour;
    }

    public double getPrice() {
        return price;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
