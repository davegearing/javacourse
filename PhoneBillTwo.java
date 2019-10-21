package chapter6;

public class PhoneBillTwo {

    /* define class properties
        the bill id
        the base cost of the plan
        the minutes included with the plan
        the minutes used
        the minutes in excess of the allowance
     */

    private String billId;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;
    private int minutesOver;

    /*
    we know the tax rate, 15%
    we know the charge per minute over plan use, $0.25
     */
    double taxRate = 0.15;
    double overRate = 0.25;

    /*
    the constructors
    default sets everything to zero
    bill id only sets the Standard plan
    otherwise set plan costs by signature/arguments
     */

    public PhoneBillTwo(){
        setBillId("none");
        setBaseCost(0);
        setAllotedMinutes(0);
        setMinutesUsed(0);
        this.minutesOver = getMinutesOver(minutesUsed, allottedMinutes);
    }

    public PhoneBillTwo(String billId){
        setBillId(billId);
        setBaseCost(25);
        setAllotedMinutes(60);
        setMinutesUsed(85);
        this.minutesOver = getMinutesOver(minutesUsed, allottedMinutes);
    }

    public PhoneBillTwo(String billId, double baseCost, int allottedMinutes, int minutesUsed){
        setBillId(billId);
        setBaseCost(baseCost);
        setAllotedMinutes(allottedMinutes);
        setMinutesUsed(minutesUsed);
        this.minutesOver = getMinutesOver(minutesUsed, allottedMinutes);
    }

    /*
    setters
     */
    public void setBillId(String billId){
        this.billId = billId;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public void setAllotedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    /*
    calculate minutes over plan allowance
     */
    public int getMinutesOver(int minutesUsed, int allottedMinutes){
        if(minutesUsed > allottedMinutes){
            minutesOver = minutesUsed - allottedMinutes;
        }
        else {
            minutesOver = 0;
        }

        return minutesOver;
    }

    /*
    getters
     */
    public String getBillId(){
        return billId;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }

    /*
    itemised bill printout to console
    */
    public void itemisedBill(){
        double overage = this.minutesOver * overRate;
        double cost = this.baseCost + overage;
        double taxAmount = cost * taxRate;
        double totalCost = cost + taxAmount;

        System.out.println("Bill Id = " + billId);
        System.out.println("plan cost = $" + this.baseCost);
        System.out.println("overage minutes [" + this.minutesOver + "] cost = $" + overage);
        System.out.println("tax = $" + taxAmount);
        System.out.println("total cost for plan " + billId + " = $" + totalCost);
        System.out.println("----------------------------");
    }
}
