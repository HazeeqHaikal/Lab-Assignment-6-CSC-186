public class Artist {
    private String artistProfession;
    private String artistName;
    private double payment;

    public Artist() {
        artistProfession = "";
        artistName = "";
        payment = 0;
    }

    public Artist(String artistProfession, String artistName, double payment) {
        this.artistProfession = artistProfession;
        this.artistName = artistName;
        this.payment = payment;
    }

    public void setArtist(String artistProfession, String artistName, double payment) {
        this.artistProfession = artistProfession;
        this.artistName = artistName;
        this.payment = payment;
    }

    public String getArtistProfession() {
        return this.artistProfession;
    }

    public void setArtistProfession(String artistProfession) {
        this.artistProfession = artistProfession;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public double getPayment() {
        return this.payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double payArtist() {
        return payment;
    }

    public String toString() {
        return "Artist Profession: " + artistProfession + "\n" +
                "Artist Name: " + artistName + "\n" +
                "Payment: RM " + String.format("%.2f", payment);
    }

}
