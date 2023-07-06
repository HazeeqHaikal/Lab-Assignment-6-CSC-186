public class Painter extends Artist {
    private int numOfPainting;

    public Painter() {
        super();
        numOfPainting = 0;
    }

    public Painter(String artistProfession, String artistName, double payment, int numOfPainting) {
        super(artistProfession, artistName, payment);
        this.numOfPainting = numOfPainting;
    }

    public int getNumOfPainting() {
        return this.numOfPainting;
    }

    public void setNumOfPainting(int numOfPainting) {
        this.numOfPainting = numOfPainting;
    }

    public double payArtist() {
        double totalPayment = super.getPayment() * numOfPainting;

        if (numOfPainting > 5) {
            double tokenOfAppreciation = totalPayment * 0.1;
            totalPayment += tokenOfAppreciation;
        }

        return totalPayment;

    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Painting: " + numOfPainting;
    }
}
