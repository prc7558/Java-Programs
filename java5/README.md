# Lab 5: Library System (Exceptions & Collections)

## Overview
This lab simulates a mini-library management system. It focuses on robust error handling using custom exceptions and managing a collection of items (books). The system supports checking out books, returning them, and calculating late fees.

## Key Concepts
- **Custom Exceptions**: Creating user-defined exception classes by extending `java.lang.Exception`.
- **Exception Propagation**: Using the `throws` keyword to signal that a method might encounter an error.
- **Try-Catch Blocks**: Handling specific errors gracefully at the UI level.
- **Collection Management**: Iterating over an array of objects and updating their state.
- **Business Logic Validation**: Checking conditions (e.g., is the book already issued? is the return date valid?) and triggering appropriate responses.

## Code Structure
- **Book.java**: Data model for a book, containing its title and availability status.
- **Library.java**: The management layer.
  - Contains a pre-defined array of `Book` objects.
  - `issueBook(title)`: Checks if a book exists and is available. Throws exceptions if not.
  - `returnBook(title, daysLate)`: Processes returns and calculates late fees (₹6/day after a 3-day grace period).
- **Custom Exception Classes**:
  - `BookNotFoundException`: Thrown when searching for a title not in the catalog.
  - `BookAlreadyIssuedException`: Thrown if a user tries to check out an unavailable book.
  - `InvalidReturnException`: Thrown for negative days or returning a book that wasn't issued.
- **LibraryMain.java**: Interactive menu for library operations.
- **run.ps1**: Automation script.
- **sample_input.txt**: Example input for testing.

## How to Run
### Manual Execution
1. Compile: `javac *.java`
2. Run: `java LibraryMain`

### Quick Run
```powershell
.\run.ps1
```

## Sample Interaction
```text
Library Menu:
1. View Books
2. Issue Book
3. Return Book
4. Exit
Choose: 2
Enter title: Java Programming
Book checked out successfully: Java Programming
```

## Features
- Graceful handling of invalid user inputs.
- Calculation of late fees based on business rules.
- State-aware system (prevents double-issuing or invalid returns).
