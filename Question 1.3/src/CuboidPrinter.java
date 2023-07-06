public class CuboidPrinter extends ShapePrinter {
    private double length;
    private double width;
    private double height;
    private String edgeType;

    public CuboidPrinter(String jobId, String material, boolean hollow, double length, double width, double height,
            String edgeType) {
        super(jobId, material, hollow);
        this.length = length;
        this.width = width;
        this.height = height;
        this.edgeType = edgeType;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getEdgeType() {
        return this.edgeType;
    }

    public void setEdgeType(String edgeType) {
        this.edgeType = edgeType;
    }

    @Override
    public double calcCost() {
        double cost = 0.0;
        double volume = length * width * height;

        if (super.getMaterial().equals("ABS")) {
            cost = volume * 1.21 * 0.24;
            if (super.isHollow()) {
                cost *= 0.8;
            }
        } else if (super.getMaterial().equals("PLA")) {
            cost = volume * 1.14 * 0.80;
        }

        if (edgeType.equals("Rounded")) {
            cost *= 1.05;
        }

        return cost;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLength: " + this.length + "\nWidth: " + this.width + "\nHeight: " + this.height
                + "\nEdge Type: " + this.edgeType;
    }

}
