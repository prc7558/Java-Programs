package java4;

import java.util.Scanner;

public class VehicleMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vehicle v = null;

        System.out.println("\n--- Vehicle Rental System ---");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");

        System.out.print("Choose vehicle: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                v = new Car();
                break;

            case 2:
                v = new Bike();
                break;

            case 3:
                v = new Truck();
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        v.display();
        double total = v.calculateRent(days);

        System.out.println("Total Rent: ₹" + total);

        sc.close();
    }
}