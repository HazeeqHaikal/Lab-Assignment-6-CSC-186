public class Performer extends Artist {
    private int workingHours;
    private String genre;

    public Performer() {
        super();
        workingHours = 0;
        genre = "";
    }

    public Performer(String artistProfession, String artistName, double payment, int workingHours, String genre) {
        super(artistProfession, artistName, payment);
        this.workingHours = workingHours;
        this.genre = genre;
    }

    public int getWorkingHours() {
        return this.workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double payArtist() {
        double totalPayment = super.getPayment() * workingHours;

        if (workingHours > 24) {
            totalPayment += 500;
        }

        return totalPayment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWorking Hours: " + workingHours + "\nGenre: " + genre;
    }

}
