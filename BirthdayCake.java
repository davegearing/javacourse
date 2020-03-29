package chapter9;

public class BirthdayCake extends Cake {

    protected Integer numberOfCandles;

    public BirthdayCake(String flavour, Integer candles) {
        super(flavour);
        setNumberOfCandles(candles);
        setPrice(3.5 + getNumberOfCandles()*0.35);
    }

    public Integer getNumberOfCandles() {
        return numberOfCandles;
    }

    public void setNumberOfCandles(Integer numberOfCandles) {
        this.numberOfCandles = numberOfCandles;
    }
}
