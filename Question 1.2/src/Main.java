import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);

        Artist[] artist = new Artist[100];
        Performer[] performer = new Performer[100];
        Painter[] painter = new Painter[100];

        for (int i = 0; i < 100; i++) {
            artist[i] = new Artist();
            performer[i] = new Performer();
            painter[i] = new Painter();
        }

        System.out.print("Enter the number of Artist: ");
        int size = intInput.nextInt();

        int performerIndex = 0;
        int painterIndex = 0;
        for (int i = 0; i < size; i++) {
            System.out
                    .print("1. Singer\n2. Musician\n3. Actor\n4. Painter\n5. Animator\n\nEnter the type of artist: ");
            int type = intInput.nextInt();

            String artistProfession = "";

            if (type == 4) {
                artistProfession = "Painter";
            } else {
                artistProfession = "Performer";
            }

            System.out.print("Enter the name of artist: ");
            String artistName = strInput.nextLine();

            System.out.print("Enter the payment of artist (RM): ");
            double payment = intInput.nextDouble();

            if (type == 4) {
                System.out.print("Enter the number of painting: ");
                int numOfPainting = intInput.nextInt();

                painter[painterIndex] = new Painter(artistProfession, artistName, payment, numOfPainting);
                painterIndex++;
            } else {
                System.out.print("1. Rock\n2. R&B\n3. Theater\n4. Magician\n\nEnter the genre of artist: ");
                int genre = intInput.nextInt();

                String genreType = "";
                switch (genre) {
                    case 1:
                        genreType = "Rock";
                        break;
                    case 2:
                        genreType = "R&B";
                        break;
                    case 3:
                        genreType = "Theater";
                        break;
                    case 4:
                        genreType = "Magician";
                        break;
                    default:
                        genreType = "Rock";
                        break;
                }

                System.out.print("Enter the working hours of artist: ");
                int workingHours = intInput.nextInt();

                performer[performerIndex] = new Performer(artistProfession, artistName, payment, workingHours,
                        genreType);
                performerIndex++;

            }

            System.out.println();
        }

        System.out.println("Performer objects from the Rock genre with payment more than RM 10000:");
        for (int i = 0; i < performerIndex; i++) {
            if (performer[i].getGenre() == "Rock" && performer[i].getPayment() > 10000) {
                System.out.println(performer[i]);
            }
        }

        System.out.println("\nPainter objects that sold more than 10 paintings:");
        for (int i = 0; i < size; i++) {
            if (painter[i].getNumOfPainting() > 10) {
                System.out.println(painter[i]);
            }
        }

        intInput.close();
        strInput.close();
    }
}
