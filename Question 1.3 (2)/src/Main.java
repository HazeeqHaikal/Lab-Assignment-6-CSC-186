import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        CarRental carRental[] = new CarRental[10];

        for (int i = 0; i < carRental.length; i++) {
            carRental[i] = new CarRental("", "", "", 0, false);
        }

        System.out.print("Enter how many car rental (max 10): ");
        int carRentalCount = intInput.nextInt();

        while (carRentalCount > carRental.length) {
            System.out.println("Maximum car rental is 10.");
            System.out.println("Enter how many car rental (max 3): ");
            carRentalCount = intInput.nextInt();
        }

        double totalCharge = 0;
        for (int i = 0; i < carRentalCount; i++) {
            System.out.print("Enter customer IC No: ");
            String custICNo = strInput.nextLine();
            System.out.print("Enter customer name: ");
            String custName = strInput.nextLine();
            System.out.print("Enter customer phone no: ");
            String custPhoneNo = strInput.nextLine();
            System.out.print("Enter rental period (hours): ");
            double period = intInput.nextDouble();
            System.out.print("Want a driver? (Y/N): ");
            char driver = strInput.next().charAt(0);
            driver = Character.toUpperCase(driver);

            boolean driverBoolean = false;
            if (driver == 'Y') {
                driverBoolean = true;
            }

            carRental[i] = new CarRental(custICNo, custName, custPhoneNo, period, driverBoolean);
            totalCharge += carRental[i].calcCharge();

            System.out.println();
            strInput.nextLine();
        }

        System.out.printf("Total amount of car rental RM %.2f", totalCharge);
        System.out.println("\n\nCustomers' who rented cars with the driver option:");
        for (int i = 0; i < carRentalCount; i++) {
            if (carRental[i].getDriver()) {
                System.out.println("Name: " + carRental[i].getCustName());
            }
        }

        strInput.close();
        intInput.close();
    }
}
