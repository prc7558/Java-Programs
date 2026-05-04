# Lab 9: Threads & Runnables (Concurrency Basics)

## Overview
This lab assignment provides a foundational look at Java's concurrency model. It demonstrates the two primary ways to create and manage threads in Java: by implementing the `Runnable` interface and by extending the `Thread` class.

## Key Concepts
- **Implementing Runnable**: Decoupling the task logic from the thread execution mechanism.
- **Extending Thread**: Creating specialized thread objects.
- **Thread Lifecycle**: Understanding the transition from `new` to `runnable` (via `start()`) and `running`.
- **Concurrency**: Multiple threads executing their `run()` methods in parallel (or interleaved by the JVM).
- **Thread.sleep()**: Using timed waits to control thread execution speed.

## Code Structure
- **RunnableDemo.java**:
  - `MyRunnable`: Implements the `Runnable` interface.
  - `RunnableDemo`: Instantiates the runnable, wraps it in a `Thread` object, and starts it.
- **ThreadDemo.java**:
  - `MyThread`: Extends the `Thread` class and overrides the `run()` method with a loop.
  - `ThreadDemo`: Starts two concurrent instances of `MyThread` to show interleaved output.
- **run.ps1**: PowerShell script to compile and run both demos.

## How to Run
### Manual Execution
1. Compile: `javac *.java`
2. Run Runnable Demo: `java RunnableDemo`
3. Run Thread Demo: `java ThreadDemo`

### Quick Run
```powershell
.\run.ps1
```

## Sample Output (ThreadDemo)
```text
Thread is running: 1
Thread is running: 1
Thread is running: 2
Thread is running: 2
Thread is running: 3
Thread is running: 3
...
```

## Features
- Comparison between `Thread` inheritance and `Runnable` implementation.
- Visual demonstration of concurrent execution.
- Basic exception handling for thread interruptions.
