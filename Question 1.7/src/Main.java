import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);

        onlineClass[] onlineClass = new onlineClass[100];

        for (int i = 0; i < onlineClass.length; i++) {
            onlineClass[i] = new onlineClass("", "", 0, 'A', 0, "");
        }
        System.out.println("Welcome to the course registration system");

        System.out.print("\nEnter amount of students: ");
        int amountOfStudents = intInput.nextInt();

        for (int i = 0; i < amountOfStudents; i++) {
            System.out.print("Enter student ID: ");
            String studentID = strInput.nextLine();

            System.out.print("Enter student name: ");
            String studentName = strInput.nextLine();

            System.out.print("Enter student age: ");
            int studentAge = intInput.nextInt();

            System.out.print("Enter student gender (M/F): ");
            char studentGender = strInput.nextLine().charAt(0);

            System.out.print("\n1. Undergraduate\n2. Postgraduate\n\nEnter student type (1-2): ");
            int studentType = intInput.nextInt();

            System.out.print("\n1. COMP\n2. ENG\n\nEnter program code (1-2): ");
            int programCodeInt = intInput.nextInt();

            String programCode = "";
            switch (programCodeInt) {
                case 1:
                    programCode = "COMP";
                    break;
                case 2:
                    programCode = "ENG";
                    break;
                default:
                    break;
            }

            onlineClass[i] = new onlineClass(studentID, studentName, studentAge, studentGender, studentType,
                    programCode);

            System.out.println();

        }

        for (int i = 0; i < amountOfStudents; i++) {
            if (onlineClass[i].getStudentID().equals("2017111222")) {
                onlineClass[i].setProgramCode("COMP");
                break;
            }
        }

        double totalFee = 0;
        for (int i = 0; i < amountOfStudents; i++) {
            switch (onlineClass[i].getProgramCode()) {
                case "ENG":
                    if (onlineClass[i].getStudentType() == 1) {
                        totalFee += onlineClass[i].calculateFee();
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.printf("Total fee collected from engineering program for undergraduate students: RM %.2f\n",
                totalFee);

        for (int i = 0; i < amountOfStudents; i++) {
            if (onlineClass[i].getStudentName().equals("Alexander")) {
                System.out.println(
                        "Program code enrolled by a student named 'Alexander': " + onlineClass[i].getProgramCode());
                break;
            }
        }

        intInput.close();
        strInput.close();

    }
}