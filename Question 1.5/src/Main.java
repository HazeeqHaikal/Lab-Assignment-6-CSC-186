import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        DineInCustomer[] dine = new DineInCustomer[50];
        DeliveryCustomer[] deliver = new DeliveryCustomer[50];

        for (int i = 0; i < 50; i++) {
            dine[i] = new DineInCustomer("", ' ', 0, 0, ' ');
            deliver[i] = new DeliveryCustomer("", ' ', "");
        }

        System.out.println("Welcome to Makette Steamboat & Grill");

        System.out.print("Enter the amount of customers: ");
        int amount = intInput.nextInt();

        double totalDeliveryCost = 0;

        for (int i = 0; i < amount; i++) {
            System.out.print("Enter the customer name: ");
            String name = strInput.nextLine();

            System.out.print("Dine in? (Y/N): ");
            char dineIn = strInput.nextLine().charAt(0);
            dineIn = Character.toUpperCase(dineIn);
            System.out.print(
                    "Package A: RM100\nPackage B: RM150\nPackage C: RM200\n\nEnter the package menu (A/B/C): ");
            char menu = strInput.nextLine().charAt(0);
            menu = Character.toUpperCase(menu);

            if (dineIn == 'Y') {

                System.out.print("Do you want to add other package? (Y/N): ");
                char otherPackage = strInput.nextLine().charAt(0);
                otherPackage = Character.toUpperCase(otherPackage);

                char menu2 = ' ';
                if (otherPackage == 'Y') {
                    System.out.print(
                            "Package A: RM100\nPackage B: RM150\nPackage C: RM200\n\nEnter the package menu (A/B/C): ");
                    menu2 = strInput.nextLine().charAt(0);
                    menu2 = Character.toUpperCase(menu2);
                }

                System.out.print("Enter the number of adult: ");
                int adult = intInput.nextInt();

                System.out.print("Enter the number of child: ");
                int child = intInput.nextInt();

                dine[i] = new DineInCustomer(name, menu, adult, child, menu2);
            } else if (dineIn == 'N') {
                System.out.print("Enter the address: ");
                String address = strInput.nextLine();

                System.out.print("Enter the distance (km): ");
                double distance = intInput.nextDouble();

                deliver[i] = new DeliveryCustomer(name, menu, address);
                double price = deliver[i].calculatePrice(distance);
                totalDeliveryCost += price;

                System.out.printf("Cost for delivery: RM %.2f\n", price);
            } else {
                System.out.println("Invalid input");
            }

            System.out.println();
        }

        int count = 0;
        for (int i = 0; i < amount; i++) {
            if (dine[i].isDineIn()) {
                if (i == 0)
                    System.out.println("Dine In Customer");
                System.out.println(dine[i]);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("\nNo dine in customer");
        } else {
            System.out.println("\nTotal dine in customer: " + count);
        }

        System.out.println("\nDelivery Customer");
        System.out.printf("Total delivery cost: RM %.2f", totalDeliveryCost);
    }
}
