import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        SoHo[] soho = new SoHo[320];

        for (int i = 0; i < 320; i++) {
            soho[i] = new SoHo("", 0, "", false, 0, ' ');
        }

        System.out.println("Welcome to the SoHo Management System");
        System.out.println("=====================================");

        System.out.print("Enter the size SoHo to be registered: ");
        int size = intInput.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the buyer name: ");
            String buyerName = strInput.nextLine();

            System.out.print("Enter the IC: ");
            long ic = intInput.nextLong();

            System.out.print("Enter your gender (M/F): ");
            char genderChar = strInput.nextLine().charAt(0);
            genderChar = Character.toUpperCase(genderChar);

            String gender = "";
            switch (genderChar) {
                case 'M':
                    gender = "Male";
                    break;
                case 'F':
                    gender = "Female";
                    break;
                default:
                    System.out.println("Invalid");
            }

            System.out.print("Are you a bumiputera? (Y/N): ");
            char bumiputeraChar = strInput.nextLine().charAt(0);
            bumiputeraChar = Character.toUpperCase(bumiputeraChar);

            boolean bumiputera = false;
            switch (bumiputeraChar) {
                case 'Y':
                    bumiputera = true;
                    break;
                case 'N':
                    bumiputera = false;
                    break;
                default:
                    System.out.println("Invalid");
            }

            System.out.print("Enter the unit price (RM): ");
            double unitPrice = intInput.nextDouble();

            System.out.print("\nFully furnished (F)\nPartially furnished (P)\n\nEnter the packages (F/P): ");
            char packages = strInput.nextLine().charAt(0);
            packages = Character.toUpperCase(packages);

            soho[i] = new SoHo(buyerName, ic, gender, bumiputera, unitPrice, packages);
            System.out.println();
        }

        System.out.println("SoHo buyer list that is female and bought fully furnished package");
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (soho[i].getGender().equals("Female") && soho[i].getPackages() == 'F') {
                System.out.println(soho[i]);
                count++;
            }
        }

        System.out.println("\nTotal number of SoHo female buyers who bought fully furnished package: " + count);

        strInput.close();
        intInput.close();
    }
}