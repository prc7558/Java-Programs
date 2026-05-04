package java6;

public class Expense {

    private String date;
    private String category;
    private String description;
    private double amount;

    public Expense(String date, String category, String description, double amount) {
        this.date = date;
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getMonthYear() {
        return date.substring(3, 10); // MM-YYYY
    }

    @Override
    public String toString() {
        return date + "\t| " + category + "\t| ₹" + amount + " |\t" + description;
    }
}