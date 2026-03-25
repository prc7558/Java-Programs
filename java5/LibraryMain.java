package java5;

import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {

        Library library = new Library();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n===== Library Menu =====");
                System.out.println("1. Display Books");
                System.out.println("2. Issue Book");
                System.out.println("3. Return Book");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine();

                try {
                    switch (choice) {
                        case 1:
                            library.displayBooks();
                            break;

                        case 2:
                            System.out.print("Enter book title to issue: ");
                            String issueTitle = sc.nextLine();
                            library.issueBook(issueTitle);
                            break;

                        case 3:
                            System.out.print("Enter book title to return: ");
                            String returnTitle = sc.nextLine();
                            System.out.print("Enter number of days late (0 if not late): ");
                            int daysLate = sc.nextInt();
                            sc.nextLine();
                            library.returnBook(returnTitle, daysLate);
                            break;

                        case 4:
                            System.out.println("Exiting system...");
                            return;

                        default:
                            System.out.println("Invalid choice! Try again.");
                    }
                } catch (BookNotFoundException |
                         BookAlreadyIssuedException |
                         InvalidReturnException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}