import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);

        ShapePrinter[] printing = new ShapePrinter[100];

        for (int i = 0; i < printing.length; i++) {
            printing[i] = null;
        }

        System.out.println("Welcome to the 3D Printer Cost Calculator!");

        System.out.print("Enter the number of shapes you would like to print: ");
        int numShapes = intInput.nextInt();

        double totalRadius = 0.0;
        double averageRadius = 0.0;

        double totalHeight = 0.0;
        double averageHeight = 0.0;

        int sphereCount = 0;
        int cuboidCount = 0;

        System.out.println();
        for (int i = 0; i < numShapes; i++) {
            System.out.print("1. Sphere\n2. Cuboid\nEnter your choice (1-2): ");
            int choice = intInput.nextInt();

            System.out.print("Enter the job ID: ");
            String jobId = strInput.nextLine();

            System.out.print("Enter the material (ABS or PLA): ");
            String material = strInput.nextLine();

            System.out.print("Hollow shape? (Y/N): ");
            char hollow = strInput.nextLine().charAt(0);
            hollow = Character.toUpperCase(hollow);

            boolean isHollow = false;

            if (hollow == 'Y') {
                isHollow = true;
            }

            if (choice == 1) {
                System.out.print("Enter the radius (CM): ");
                double radius = intInput.nextDouble();

                printing[sphereCount] = new SpherePrinter(jobId, material, isHollow, radius);
                sphereCount++;
            } else if (choice == 2) {
                System.out.print("Enter the length (CM): ");
                double length = intInput.nextDouble();

                System.out.print("Enter the width (CM): ");
                double width = intInput.nextDouble();

                System.out.print("Enter the height (CM): ");
                double height = intInput.nextDouble();

                System.out.print("1. Rounded\n2. Sharp\nEnter your choice (1-2): ");
                int edgeTypeChoice = intInput.nextInt();
                String edgeType = "";

                if (edgeTypeChoice == 1) {
                    edgeType = "Rounded";
                } else if (edgeTypeChoice == 2) {
                    edgeType = "Sharp";
                }

                printing[cuboidCount] = new CuboidPrinter(jobId, material, isHollow, length, width, height, edgeType);
                cuboidCount++;
            }

            System.out.println();
        }

        System.out.println("\nPrinting Jobs id that starts with '11' and use PLA material: ");
        System.out.println("----------------------------------------");
        for (int i = 0; i < numShapes; i++) {
            if (printing[i] instanceof SpherePrinter && printing[i].getJobId().startsWith("11")
                    && printing[i].getMaterial().equals("PLA")) {
                        System.out.println(printing[i]);
            }

            if (printing[i] instanceof CuboidPrinter && printing[i].getJobId().startsWith("11")
                    && printing[i].getMaterial().equals("PLA")) {
                        System.out.println(printing[i]);
            }

            // if (cuboid[i].isHollow()) {
            if (printing[i] instanceof CuboidPrinter && printing[i].isHollow()) {
                totalHeight += ((CuboidPrinter) printing[i]).getHeight();
            }

            // if (sphere[i].isHollow()) {
            if (printing[i] instanceof SpherePrinter && printing[i].isHollow()) {
                totalHeight += ((SpherePrinter) printing[i]).getRadius() * 2;
            }

            System.out.println();
        }

        averageHeight = totalHeight / numShapes;
        averageRadius = totalRadius / numShapes;

        System.out.println("Average height of hollow cuboid: " + averageHeight + " cm");
        System.out.println("Average radius of hollow sphere: " + averageRadius + " cm");

        intInput.close();
        strInput.close();
    }
}
