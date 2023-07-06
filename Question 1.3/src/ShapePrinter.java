public abstract class ShapePrinter {
    private String jobId;
    private String material;
    private boolean hollow;

    public ShapePrinter(String jobId, String material, boolean hollow) {
        this.jobId = jobId;
        this.material = material;
        this.hollow = hollow;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isHollow() {
        return this.hollow;
    }

    public boolean getHollow() {
        return this.hollow;
    }

    public void setHollow(boolean hollow) {
        this.hollow = hollow;
    }

    public abstract double calcCost();

    public String toString() {
        return "Job ID: " + this.jobId + "\nMaterial: " + this.material + "\nHollow: " + this.hollow;
    }

}