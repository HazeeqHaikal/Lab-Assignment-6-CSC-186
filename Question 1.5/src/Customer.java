public abstract class Customer {
    protected String customerName;
    private char packageMenu;

    public Customer(String customerName, char packageMenu) {
        this.customerName = customerName;
        this.packageMenu = packageMenu;
    }

    public String getCustomerName() {
        return customerName;
    }

    public char getPackageMenu() {
        return packageMenu;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPackageMenu(char packageMenu) {
        this.packageMenu = packageMenu;
    }

    public abstract boolean isDineIn();

    public String toString() {
        return "Customer Name: " + customerName + "\nPackage Menu: " + packageMenu;
    }
}