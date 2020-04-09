package chapter9;

public class WeddingCake extends Cake{

    protected Integer tiers;

    public WeddingCake(){
        super("Vanilla Sponge");
        setTiers(1);
        setPrice(4 + getTiers());
    }
    public WeddingCake(String flavour, Integer tiers) {
        super(flavour);
        setTiers(tiers);
        setPrice(4 + getTiers());
    }

    public Integer getTiers() {
        return tiers;
    }

    public void setTiers(Integer tiers) {
        this.tiers = tiers;
    }
}
