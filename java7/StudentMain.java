package java7;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        manager.loadFromFile();

        int choice;

        do {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. View Students");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Consume invalid input
                choice = -1;
                continue;
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    manager.addStudent(new Student(id, name, age, grade));
                    manager.saveToFile();
                    break;

                case 2:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    manager.deleteStudent(delId);
                    manager.saveToFile();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();
                    manager.searchByName(search);
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new Grade: ");
                    String newGrade = sc.nextLine();

                    manager.updateStudent(updateId, newName, newAge, newGrade);
                    manager.saveToFile();
                    break;
                	
                case 5:
                    manager.viewStudents();
                    break;
                    
                case 6:          
                    manager.saveToFile();
                    System.out.println("Data saved. Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}