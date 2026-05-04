# Lab 1: Student Data Management (OOP Basics)

## Overview
This lab assignment demonstrates the fundamental principles of Object-Oriented Programming (OOP) in Java. It models a simple student record system that calculates academic performance metrics based on subject marks.

## Key Concepts
- **Classes and Objects**: Encapsulating data and behavior within the `Student` class.
- **Encapsulation**: Using private fields with public methods for data access.
- **Constructors & Initializers**: Setting up object state.
- **Control Flow**: Using loops and conditionals for grade calculation.
- **Console I/O**: Using `java.util.Scanner` for interactive user input.

## Code Structure
- **Student.java**: The core data model.
  - `studentID`, `name`, `marks[]`: Private fields.
  - `calcAvg()`: Calculates the average mark.
  - `getResult()`: Determines if the student passed (Average >= 50 and all subjects >= 40).
  - `displayDetails()`: Formats and prints student information.
- **StudentMain.java**: The entry point.
  - Handles user interaction and object instantiation.
- **run.ps1**: PowerShell script for quick execution.
- **sample_input.txt**: Example input for automated testing.

## How to Run
### Manual Execution
1. Navigate to the `java1` directory.
2. Compile the source files:
   ```powershell
   javac *.java
   ```
3. Run the main class:
   ```powershell
   java StudentMain
   ```

### Quick Run (PowerShell)
Execute the provided script:
```powershell
.\run.ps1
```

## Sample Interaction
```text
Enter Student ID: 101
Enter Name: Alice
Enter number of subjects: 3
Enter marks for subject 1: 85
Enter marks for subject 2: 90
Enter marks for subject 3: 78

--- Student Details ---
Student ID: 101
Name: Alice
Average Marks: 84.33333333333333
Result: PASS
```

## Features
- Dynamic mark entry for any number of subjects.
- Automatic pass/fail logic based on minimum criteria.
- Clean separation of concerns between logic (`Student`) and UI (`StudentMain`).
