# Lab 6: Expense Manager (Collections & Reporting)

## Overview
This lab assignment implements a personal finance tracker. It allows users to record, categorize, and analyze their expenses. The focus is on using Java Collections (specifically `ArrayList` and `HashMap`) to store and aggregate data.

## Key Concepts
- **ArrayList**: Using a dynamic list to store an arbitrary number of `Expense` objects.
- **HashMap**: Leveraging key-value pairs to aggregate expenses by category and by month.
- **Data Modeling**: Creating an `Expense` class with fields for date, category, description, and amount.
- **Aggregation Logic**: Iterating through data to calculate totals and grouped summaries.
- **String Parsing**: Extracting month/year information from date strings using `substring()`.
- **CRUD Operations**: Implementing logic to add, view, and delete records.

## Code Structure
- **Expense.java**: The data model representing a single financial transaction.
  - Includes a `getMonthYear()` helper for reporting.
  - Overrides `toString()` for clean console display.
- **ExpenseManager.java**: The business logic controller.
  - `expenses`: An `ArrayList<Expense>` to store the transaction history.
  - `addExpense()` / `deleteExpense()`: Management of the list.
  - `generateReport()`: Uses `HashMap` to calculate totals grouped by category and date.
- **ExpenseMain.java**: The main entry point providing a console-based menu.
- **run.ps1**: PowerShell script for automation.
- **sample_input.txt**: Example input for testing the add/report flow.

## How to Run
### Manual Execution
1. Compile: `javac *.java`
2. Run: `java ExpenseMain`

### Quick Run
```powershell
.\run.ps1
```

## Sample Interaction
```text
===== EXPENSE MANAGER MENU =====
1. Add Expense
2. View Expenses
3. Delete Expense
4. Generate Summary Report
5. Exit
Enter choice: 1
Enter date (DD-MM-YYYY): 01-05-2026
Select category: 1 (Food)
Enter amount: 250.50
Enter description: Lunch
Expense added successfully!
```

## Features
- Dynamic expense categorization (Food, Transport, Rent, etc.).
- Categorized and monthly summary reports.
- In-memory data persistence during the program execution.
- Formatted output using tabs and currency symbols.
