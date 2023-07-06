public class ResidentialSuites extends House {
    private String residentialSuiteType;

    public ResidentialSuites(String buyerName, long ic, String gender, boolean bumiputera,
            String residentialSuiteType) {
        super(buyerName, ic, gender, bumiputera);
        this.residentialSuiteType = residentialSuiteType;
    }

    public String getResidentialSuiteType() {
        return this.residentialSuiteType;
    }

    public void setResidentialSuiteType(String residentialSuiteType) {
        this.residentialSuiteType = residentialSuiteType;
    }

    public double residentialSuitesPrice() {
        double price = 0;

        return price;
    }

    public String toString() {
        return super.toString() + "\nResidential Suite Type: " + residentialSuiteType;
    }
}
