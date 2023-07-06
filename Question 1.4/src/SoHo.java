public class SoHo extends House {
    private double unitPrice;
    private char packages;

    public SoHo(String buyerName, long ic, String gender, boolean bumiputera, double unitPrice, char packages) {
        super(buyerName, ic, gender, bumiputera);
        this.unitPrice = unitPrice;
        this.packages = packages;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public char getPackages() {
        return this.packages;
    }

    public void setPackages(char packages) {
        this.packages = packages;
    }

    public double sohoPrice() {
        double price = 0;
        switch (packages) {
            case 'F':
                price = unitPrice + 50000;
                break;
            case 'P':
                price = unitPrice + 20000;
                break;
        }

        if (super.getBumiputera())
            price *= 0.9;

        return price;
    }

    public String toString() {
        return super.toString() + "\nUnit Price: RM " + String.format("%.2f", unitPrice) + "\nPackages: " + packages;
    }
}
