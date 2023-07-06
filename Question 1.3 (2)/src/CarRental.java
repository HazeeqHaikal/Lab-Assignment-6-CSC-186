public class CarRental extends RentalService {
    private double period;
    private boolean driver;

    public CarRental(String custICNo, String custName, String custPhoneNo, double period, boolean driver) {
        super(custICNo, custName, custPhoneNo);
        this.period = period;
        this.driver = driver;
    }

    public double getPeriod() {
        return this.period;
    }

    public void setPeriod(double period) {
        this.period = period;
    }

    public boolean isDriver() {
        return this.driver;
    }

    public boolean getDriver() {
        return this.driver;
    }

    public void setDriver(boolean driver) {
        this.driver = driver;
    }

    public double calcCharge() {
        double charges = 0;
        if(period <= 6){
            charges = 185.00;
        } else if(period > 6 && period <= 12){
            charges = 230.00;
        } else if(period > 12 && period <= 24){
            charges = 285.00;
        } else {
            charges = 285.00 + (period - 24) * 25.00;
        }

        if(driver){
            charges += 150.00;
        }

        return charges;
    }

    public String toString() {
        return super.toString() + "\nPeriod: " + period + "\nDriver: " + driver;
    }
}
