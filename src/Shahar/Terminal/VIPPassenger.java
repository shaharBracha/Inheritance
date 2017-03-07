package Shahar.Terminal;

/**
 * Created by p0018972 on 03/03/2017.
 */
public class VIPPassenger extends Passenger {
    private double extraDiscount;

    public VIPPassenger(String name, double age, double extraDiscount) {
        super(name, age);
        this.extraDiscount = extraDiscount;
    }

    public VIPPassenger() {
        super();
    }

    public double getExtraDiscount() {
        return extraDiscount;
    }

    public void setExtraDiscount(double extraDiscount) {
        this.extraDiscount = extraDiscount;
    }

    @Override
    public String toString() {
        return "VIPPassenger{" +
                "extraDiscount=" + extraDiscount +
                '}';
    }

    public double priceToPay(double basicTicketPrice){

        return super.priceToPay(basicTicketPrice) * (1 - extraDiscount);
    }

}
