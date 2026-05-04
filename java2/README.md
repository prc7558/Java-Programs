# Lab 2: Array Operations and Puzzles

## Overview
This lab focuses on fundamental array algorithms and data manipulation in Java. It provides an interactive menu-driven interface to perform various operations such as searching, sorting, finding missing elements, and merging arrays.

## Key Concepts
- **Array Traversal**: Iterating through elements using loops.
- **Linear Search**: Finding an element's index.
- **Sorting**: Using built-in utilities like `java.util.Arrays.sort()`.
- **Mathematical Puzzles**: Calculating missing numbers using sum formulas.
- **Merge Logic**: Combining two sorted-like arrays into one.
- **Nested Loops**: Solving the "Sum Pair" puzzle (finding pairs that sum to a target).

## Code Structure
- **ArrayOperations.java**: Contains the logic for all array tasks.
  - `findMissing()`: Uses the $n(n+1)/2$ formula to find a missing number in a sequence.
  - `sortArray()`: Sorts the array in ascending order.
  - `searchElement(int key)`: Performs a linear search.
  - `findLargest()` / `findSmallest()`: Scans the array for extreme values.
  - `sumPair(int target)`: Finds pairs of elements that add up to a specific value.
  - `mergeArrays()`: Static method to merge two user-provided arrays.
- **ArrayMain.java**: The driver program with a `do-while` menu loop.
- **run.ps1**: Automation script for the lab.
- **sample_input.txt**: Pre-defined inputs for testing.

## How to Run
### Manual Execution
1. Compile: `javac *.java`
2. Run: `java ArrayMain`

### Quick Run
```powershell
.\run.ps1
```

## Sample Interaction
```text
Enter size of array: 5
Enter element 1: 10
Enter element 2: 20
Enter element 3: 30
Enter element 4: 40
Enter element 5: 50

--- Array Puzzle Menu ---
1. Find Missing Number
2. Sort Array
3. Search Element
4. Find Largest Element
5. Find Smallest Element
6. Sum Pair Puzzle
7. Merge Arrays
8. Exit
Enter choice: 4
Largest Element: 50
```

## Features
- Interactive CLI menu.
- Support for multiple algorithmic challenges.
- Demonstrates both instance and static methods.
