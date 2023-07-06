public class Food {
    private String name;
    private int quantityOfOrder;
    private boolean member;

    public Food(String name, int quantityOfOrder, boolean member) {
        this.name = name;
        this.quantityOfOrder = quantityOfOrder;
        this.member = member;
    }

    // default constructor
    public Food() {
        this.name = "";
        this.quantityOfOrder = 0;
        this.member = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getQuantityOfOrder() {
        return this.quantityOfOrder;
    }

    public void setQuantityOfOrder(int quantityOfOrder) {
        this.quantityOfOrder = quantityOfOrder;
    }

    public boolean isMember() {
        return this.member;
    }

    public boolean getMember() {
        return this.member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Customer Name: " + getName() + "\n" +
                "Quantity of Order: " + getQuantityOfOrder() + "\n" +
                "Member: " + getMember() + "\n";
    }
}