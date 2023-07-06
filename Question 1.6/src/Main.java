import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        System.out.println("Welcome to  Kesuma Skills Development Centre (KSDC)");
        System.out.println("-------------------------------------------------");

        RoomActivity[] roomActivity = new RoomActivity[50];
        for (int i = 0; i < roomActivity.length; i++) {
            roomActivity[i] = new RoomActivity("", ' ', 0.0, "", "", 0);
        }

        System.out.print("\nEnter Number of Room Activity: ");
        int numOfRoomActivity = intInput.nextInt();

        System.out.println();

        for (int i = 0; i < numOfRoomActivity; i++) {
            System.out.print("Enter Activity Name: ");
            String activityName = stringInput.nextLine();

            System.out.print("Enter Organiser (G - Government, P - Private, U - University): ");
            char organiser = stringInput.nextLine().charAt(0);
            organiser = Character.toUpperCase(organiser);

            System.out.print("Enter Budget (RM): ");
            double budget = intInput.nextDouble();

            System.out.print("Enter Date: ");
            String date = stringInput.nextLine();

            System.out.print(
                    "Enter Room Type (A - Auditorium, M - Meeting Room, L - Computer Lab, S - Seminar Room): ");
            String roomType = stringInput.nextLine();
            roomType = roomType.toUpperCase();

            int numOfParticipant = 0;
            System.out.print("Enter Number of Participant: ");
            numOfParticipant = intInput.nextInt();

            roomActivity[i] = new RoomActivity(activityName, organiser, budget, date, roomType, numOfParticipant);
            System.out.println();
        }

        System.out.println("\nRoom Activity Details");
        System.out.println("---------------------\n");

        double totalPrivate = 0;
        for (int i = 0; i < numOfRoomActivity; i++) {
            System.out.println(roomActivity[i]);
            System.out.printf("Room Charges: RM%.2f\n", roomActivity[i].roomCharges());
            System.out.println();

            if (roomActivity[i].getOrganiser() == 'P')
                totalPrivate += roomActivity[i].roomCharges();
        }

        System.out.println("\nTotal Cost for Private Organiser: RM" + totalPrivate);

        System.out.println("\nBooking for lab with more than 30 participants: ");
        int numOfLab = 0;
        for (int i = 0; i < numOfRoomActivity; i++) {
            if (roomActivity[i].getRoomType().equals("L") && roomActivity[i].getNumOfParticipant() > 30) {
                System.out.println(roomActivity[i]);
                numOfLab++;
            }

            System.out.println();
        }

        System.out.println("Total Booking for lab with more than 30 participants: " + numOfLab);

        intInput.close();
        stringInput.close();
    }
}