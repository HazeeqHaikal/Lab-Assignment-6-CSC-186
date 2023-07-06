public class DeliveryCustomer extends Customer {
    private String address;

    public DeliveryCustomer(String customerName, char packageMenu, String address) {
        super(customerName, packageMenu);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double calculatePrice(double km) {
        double total = 0;
        switch (super.getPackageMenu()) {
            case 'A':
                total = 100;
            case 'B':
                total = 150;
            case 'C':
                total = 200;
            default:
                break;
        }

        if (km > 15) {
            total += 10;
        }

        return total;
    }

    public boolean isDineIn() {
        return false;
    }

    public String toString() {
        return super.toString() + "\nAddress: " + address;
    }

    
}
