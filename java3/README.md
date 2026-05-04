# Lab 3: Text Operations (String Manipulation)

## Overview
This lab explores the versatile world of `String` handling in Java. It implements a wide range of text transformation and analysis utilities, ranging from basic case conversion to complex substring replacement and character sorting.

## Key Concepts
- **String Immutability**: Understanding how `String` objects behave in Java (though this lab often creates new strings or uses char arrays).
- **Character Array Manipulation**: Manually iterating over `char[]` to modify text (e.g., ASCII shifts for case conversion).
- **Pattern Matching**: Implementing basic search and replace algorithms without using regex.
- **StringBuilder**: Using `StringBuilder` for efficient string reversal and manipulation.
- **Menu-Driven Logic**: A robust `do-while` loop with `switch-case` for multi-step text processing.

## Code Structure
- **TextOperations.java**: The logic engine for text processing.
  - `toUpperCase()` / `toLowerCase()`: Manual case conversion using ASCII values.
  - `reverse()`: Reverses the string in-place using a char array.
  - `countWords()`: Counts occurrences of spaces to estimate word count.
  - `extractDigits()`: Filters numerical characters from the text.
  - `searchSubstring(sub)`: Manual implementation of substring existence check.
  - `replaceSubstring(old, new)`: Manual find-and-replace logic.
  - `checkPalindrome()`: Verifies if the text reads the same forwards and backwards.
- **TextMain.java**: The user interface for selecting transformations.
- **run.ps1**: PowerShell script to compile and run the lab.
- **sample_input.txt**: Example input for quick testing.

## How to Run
### Manual Execution
1. Compile: `javac *.java`
2. Run: `java TextMain`

### Quick Run
```powershell
.\run.ps1
```

## Sample Interaction
```text
Enter text: Hello World
===== TEXT TRANSFORMER MENU =====
1. Convert to Uppercase
2. Convert to Lowercase
...
Enter choice: 1
Uppercase: HELLO WORLD
```

## Features
- Over 12 different text operations.
- Manual algorithm implementation for learning purposes (avoiding some standard library shortcuts).
- State preservation: transformations can be chained (e.g., convert to uppercase, then reverse).
