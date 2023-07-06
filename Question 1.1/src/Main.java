import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);

        System.out.println("Welcome to Food Ordering System");
        System.out.print("Enter the amount of food to order: ");
        int quantityOfOrder = intInput.nextInt();
        
        System.out.println();
        int numOfCustomer = 0;
        WesternFood[] westernFood = new WesternFood[quantityOfOrder];
        for(int i = 0; i < quantityOfOrder; i++) {
            westernFood[i] = new WesternFood();
            System.out.print("Enter the customer name: ");
            westernFood[i].setName(strInput.nextLine());
            System.out.print("1. Lamb Chop\n2. Chicken Chop\n3. Fish and Chips\n\nEnter the food set (1, 2, 3): ");
            westernFood[i].setFoodSet(intInput.nextInt());
            System.out.print("Enter the quantity of order: ");
            westernFood[i].setQuantityOfOrder(intInput.nextInt());
            System.out.print("Do you have a membership card? (Y/N): ");
            char member = intInput.next().charAt(0);
            member = Character.toUpperCase(member);
            switch (member) {
                case 'Y':
                    westernFood[i].setMember(true);
                    break;
                case 'N':
                    westernFood[i].setMember(false);
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
            System.out.print("Do you want to add dessert? (Y/N): ");
            char dessert = intInput.next().charAt(0);
            dessert = Character.toUpperCase(dessert);
            switch (dessert) {
                case 'Y':
                    westernFood[i].setDessert(true);
                    break;
                case 'N':
                    westernFood[i].setDessert(false);
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }

            System.out.println();
        }

        double totalAllPayment = 0.0;
        for(int i = 0; i < quantityOfOrder; i++) {

            System.out.println(westernFood[i].toString());
            System.out.printf("Total Price: RM %.2f\n", westernFood[i].Payment());
            System.out.println();
            numOfCustomer++;
            totalAllPayment += westernFood[i].Payment();
        }

        System.out.println("Total number of customers: " + numOfCustomer);
        System.out.printf("Total payment for all customers: RM %.2f\n", totalAllPayment);
        
        for(int i = 0; i < quantityOfOrder; i++) {
            if(westernFood[i].getFoodSet() == 1){
                System.out.println(westernFood[i]);
            }
        }

        intInput.close();
        strInput.close();
        
    }
}