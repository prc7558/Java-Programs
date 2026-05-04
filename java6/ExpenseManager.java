package java6;

import java.util.*;

public class ExpenseManager {

    private ArrayList<Expense> expenses = new ArrayList<>();

    private String[] categories = {
            "Food", "Transportation", "Shopping",
            "Rent", "Entertainment", "Healthcare",
            "Education", "Other"
    };

    // Add Expense
    public void addExpense(Scanner sc) {

        System.out.println("===== Add Expense =====");
        System.out.print("Enter date (DD-MM-YYYY): ");
        String date = sc.nextLine();

        System.out.println("List of Categories:");
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }

        System.out.print("Select category: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice < 1 || choice > categories.length) {
            System.out.println("Invalid category selection!");
            return;
        }

        String category = categories[choice - 1];

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter description: ");
        String description = sc.nextLine();

        expenses.add(new Expense(date, category, description, amount));

        System.out.println("Expense added successfully!\n");
        System.out.println("-----------------------");
    }

    // Delete Expense
    public void deleteExpense(Scanner sc) {

        System.out.println("===== Delete Expense =====");

        viewExpenses();

        if (expenses.isEmpty()) {
            System.out.println("No expenses to delete");
            System.out.println("--------------------------");
            return;
        }

        System.out.print("Enter expense number to delete: ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index > 0 && index <= expenses.size()) {
            expenses.remove(index - 1);
            System.out.println("Expense deleted successfully!\n");
        } else {
            System.out.println("Invalid index.\n");
        }

        System.out.println("--------------------------");
    }

    // View Expenses
    public void viewExpenses() {

        System.out.println("===== View Expenses =====");

        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            System.out.println("-------------------------");
            return;
        }

        for (int i = 0; i < expenses.size(); i++) {
            System.out.println((i + 1) + ". " + expenses.get(i));
        }

        System.out.println("-------------------------");
    }

    // Generate Report
    public void generateReport() {

        System.out.println("===== Expense Summary Report =====");

        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            System.out.println("-----------------------------------");
            return;
        }

        double totalExpense = 0;

        HashMap<String, Double> categoryMap = new HashMap<>();
        HashMap<String, Double> monthMap = new HashMap<>();

        for (Expense e : expenses) {

            totalExpense += e.getAmount();

            categoryMap.put(e.getCategory(),
                    categoryMap.getOrDefault(e.getCategory(), 0.0) + e.getAmount());

            String monthYear = e.getMonthYear();
            monthMap.put(monthYear,
                    monthMap.getOrDefault(monthYear, 0.0) + e.getAmount());
        }

        System.out.println("\nTotal Expense: ₹" + totalExpense);
        System.out.println("-----------------------------------");

        System.out.println("\nExpense by Category:");
        for (String category : categoryMap.keySet()) {
            System.out.println(category + ": ₹" + categoryMap.get(category));
        }

        System.out.println("-----------------------------------");

        System.out.println("\nExpense by Month:");
        for (String month : monthMap.keySet()) {
            System.out.println(month + ": ₹" + monthMap.get(month));
        }

        System.out.println("-----------------------------------");
    }
}