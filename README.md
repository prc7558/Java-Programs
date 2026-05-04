# PPL Lab Assignments (Java)

## Overview
This repository contains a collection of Java programs developed during Semester 4 for the **Principles of Programming Languages (PPL)** lab. Each assignment is designed to explore and implement core Java concepts, ranging from basic Object-Oriented Design to advanced Multi-threading and File I/O.

## Key Learning Objectives
- **Object-Oriented Design**: Mastering classes, inheritance, polymorphism, and encapsulation.
- **Algorithm Implementation**: Developing logic for array manipulation and string processing.
- **Error Handling**: implementing robust systems using custom exceptions.
- **Persistence**: Managing data using file-based storage (CSV/TXT).
- **Concurrency**: Understanding multi-threaded execution and synchronization.

## Prerequisites
- **Java JDK 8** or later.
- `javac` and `java` available on your system path.
- Verify installation:
  ```powershell
  java -version
  javac -version
  ```

## Lab Directory

| Folder | Topic | Key Focus | Run Command |
| :--- | :--- | :--- | :--- |
| **[java1](java1/)** | Student OOP | Classes, Encapsulation | `java StudentMain` |
| **[java2](java2/)** | Array Operations | Algorithms, Searching, Sorting | `java ArrayMain` |
| **[java3](java3/)** | Text Operations | String Manipulation | `java TextMain` |
| **[java4](java4/)** | Vehicle Rental | Inheritance, Polymorphism | `java VehicleMain` |
| **[java5](java5/)** | Library System | Exceptions, Collections | `java LibraryMain` |
| **[java6](java6/)** | Expense Manager | Data Aggregation, HashMap | `java ExpenseMain` |
| **[java7](java7/)** | Student Records | File I/O (CSV/TXT) | `java StudentMain` |
| **[java8](java8/)** | Food Delivery | Synchronization, Threads | `java FoodDeliveryMain` |
| **[java9](java9/)** | Thread Demos | Runnable vs Thread | `java ThreadDemo` |

## How to Run a Lab
1. Open a terminal (PowerShell recommended).
2. Navigate to the specific lab folder:
   ```powershell
   cd java1
   ```
3. Compile and run:
   ```powershell
   javac *.java
   java StudentMain
   ```
   *Note: Each lab also includes a `run.ps1` script for one-click compilation and execution.*

## Project Structure
Each lab directory is self-contained and follows this structure:
- `*.java`: Source code files.
- `README.md`: Detailed documentation for the specific lab.
- `run.ps1`: Convenience script for Windows users.
- `sample_input.txt`: Example data for non-interactive testing.

---
*Developed for Academic Purposes — Semester 4 PPL Lab.*
