# Lab 7: Student Management (File I/O & Persistence)

## Overview
This lab assignment demonstrates how to implement persistent storage in a Java application using basic file I/O operations. It allows users to manage student records that are saved to and loaded from both TXT and CSV files, ensuring data survives program restarts.

## Key Concepts
- **File Persistence**: Reading from and writing to local files using `FileReader` and `FileWriter`.
- **Buffered I/O**: Using `BufferedReader` and `BufferedWriter` for efficient file access.
- **CSV Formatting**: Serializing objects into Comma-Separated Values (CSV) for compatibility with spreadsheet software.
- **Record Management (CRUD)**: Implementing logic to Create, Read, Update, and Delete records in an `ArrayList`.
- **Try-with-Resources**: Ensuring file streams are automatically closed to prevent resource leaks.
- **Parsing**: Converting string data from files back into numeric and object types.

## Code Structure
- **Student.java**: Data model for a student.
  - `toFileString()`: Formats student data for CSV/TXT storage.
- **StudentManager.java**: The persistence and logic layer.
  - `loadFromFile()`: Reads `students.txt` on startup.
  - `saveToFile()`: Synchronizes the current list to `students.txt` and `students.csv`.
  - `viewStudents()`: Demonstrates reading directly from a CSV file for display.
  - `addStudent()`, `deleteStudent()`, `searchByName()`, `updateStudent()`: CRUD logic.
- **StudentMain.java**: The interactive menu that drives the application.
- **students.txt / students.csv**: Persistent data files (generated/updated by the program).
- **run.ps1**: Automation script.
- **sample_input.txt**: Example input for testing.

## How to Run
### Manual Execution
1. Compile: `javac *.java`
2. Run: `java StudentMain`

### Quick Run
```powershell
.\run.ps1
```

## Sample Interaction
```text
===== STUDENT RECORDS MENU =====
1. Add Student
2. Delete Student
3. Search by Name
4. Update Student
5. View All (from CSV)
6. Exit and Save
Enter choice: 1
Enter ID: 101
Enter Name: Alice
Enter Age: 20
Enter Grade: A
Student added
```

## Features
- Multi-format storage: Saves to both human-readable text and structured CSV.
- Automatic data loading on startup.
- Safe resource management using modern Java idioms.
- Interactive search and update capabilities.
