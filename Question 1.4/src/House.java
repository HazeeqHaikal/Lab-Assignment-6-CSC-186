public class House {
    private String buyerName;
    private long ic;
    private String gender;
    private boolean bumiputera;

    public House(String buyerName, long ic, String gender, boolean bumiputera) {
        this.buyerName = buyerName;
        this.ic = ic;
        this.gender = gender;
        this.bumiputera = bumiputera;
    }

    public String getBuyerName() {
        return this.buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public long getIc() {
        return this.ic;
    }

    public void setIc(long ic) {
        this.ic = ic;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isBumiputera() {
        return this.bumiputera;
    }

    public boolean getBumiputera() {
        return this.bumiputera;
    }

    public void setBumiputera(boolean bumiputera) {
        this.bumiputera = bumiputera;
    }

    public String toString() {
        return "Name of Buyer: " + buyerName + "\nIC: " + ic + "\nGender: " + gender + "\nBumiputera: " + bumiputera;
    }

}