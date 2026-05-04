package java6;

import java.util.Scanner;

public class ExpenseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        int choice;

        do {
            System.out.println("====== Expense Manager Options =====");
            System.out.println("1. Add Expense");
            System.out.println("2. Delete Expense");
            System.out.println("3. View Expense");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.println("====================================");

            System.out.print("Choose option (1-5): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    manager.addExpense(sc);
                    break;

                case 2:
                    manager.deleteExpense(sc);
                    break;

                case 3:
                    manager.viewExpenses();
                    break;

                case 4:
                    manager.generateReport();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.\n");
            }

        } while (choice != 5);

        sc.close();
    }
}