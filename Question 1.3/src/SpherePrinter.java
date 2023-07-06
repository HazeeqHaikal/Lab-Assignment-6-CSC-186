public class SpherePrinter extends ShapePrinter {
    private double radius;

    public SpherePrinter(String jobId, String material, boolean hollow, double radius) {
        super(jobId, material, hollow);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcCost() {
        double cost = 0.0;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        if (super.getMaterial().equals("ABS")) {
            cost = volume * 1.21 * 0.24;
        } else if (super.getMaterial().equals("PLA")) {
            cost = volume * 1.14 * 0.80;
        }

        if (super.isHollow()) {
            cost *= 0.95;
        }

        return cost;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + this.radius;
    }

}