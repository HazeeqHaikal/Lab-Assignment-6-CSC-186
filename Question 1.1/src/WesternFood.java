public class WesternFood extends Food{
    
    // attributes
    private int foodSet;
    private boolean dessert;

    // normal constructor
    public WesternFood(String name, int quantityOfOrder, boolean member, int foodSet, boolean dessert) {
        super(name, quantityOfOrder, member);
        this.foodSet = foodSet;
        this.dessert = dessert;
    }

    // default constructor
    public WesternFood() {
        super();
        this.foodSet = 0;
        this.dessert = false;
    }

    // getters and setters

    public int getFoodSet() {
        return this.foodSet;
    }

    public void setFoodSet(int foodSet) {
        this.foodSet = foodSet;
    }

    public boolean isDessert() {
        return this.dessert;
    }

    public boolean getDessert() {
        return this.dessert;
    }

    public void setDessert(boolean dessert) {
        this.dessert = dessert;
    }

    // methods
    public double Payment() {
        double amount = 0.0;
        switch (foodSet) {
            case 1:
                amount = 30.0;
                break;
            case 2:
                amount = 20.0;
                break;
            case 3:
                amount = 15.0;
                break;
            default:
                System.out.println("Invalid food set selected.");
                break;
        }
        double totalPrice = amount * getQuantityOfOrder();
        if (dessert) {
            totalPrice += 10.90 * getQuantityOfOrder();
        }

        if (getMember()) {
            totalPrice *= 0.9;
        }

        return totalPrice;
    }

    // toString method
    public String toString() {
        String dessertAvailable = "";
        if (dessert) {
            dessertAvailable = "Yes";
        } else {
            dessertAvailable = "No";
        }
        return super.toString() +
                "Food Set: " + getFoodSet() + "\n" +
                "Dessert: " + dessertAvailable + "\n";
    }
}