# Lab 8: Food Delivery Simulation (Threads & Synchronization)

## Overview
This lab assignment simulates a food delivery system using Java's multi-threading capabilities. It models multiple delivery agents (threads) competing to pick up and deliver orders from a shared queue. The focus is on thread execution and synchronized access to shared data.

## Key Concepts
- **Thread Class**: Extending the `Thread` class to create concurrent entities (`DeliveryAgent`).
- **Synchronized Blocks**: Using `synchronized (DeliveryAgent.class)` to prevent multiple threads from picking the same order simultaneously (Race Condition prevention).
- **Static Shared State**: Using `static` variables to represent the global order queue and progress counters across all agent instances.
- **Thread Sleep**: Simulating real-world delay (delivery time) using `Thread.sleep()`.
- **Object Composition**: The `DeliveryAgent` class containing a reference to an array of `Order` objects.

## Code Structure
- **Order.java**: Simple data model for a delivery request (ID and food item).
- **DeliveryAgent.java**: The core worker thread.
  - Extends `Thread`.
  - Uses static variables (`index`, `deliverCount`, `completeCount`) to track global progress.
  - The `run()` method contains the simulation logic: picking an order, "delivering" it (sleeping), and marking it complete.
- **FoodDeliveryMain.java**: The simulation orchestrator.
  - Initializes a set of sample orders.
  - Creates and starts multiple agent threads (Agent A, B, and C).
- **run.ps1**: PowerShell script for quick compilation and execution.

## How to Run
### Manual Execution
1. Compile: `javac *.java`
2. Run: `java FoodDeliveryMain`

### Quick Run
```powershell
.\run.ps1
```

## Sample Output
```text
Agent A delivering --> Order ID: 1 (Pizza)
Agent B delivering --> Order ID: 2 (Burger)
Agent C delivering --> Order ID: 3 (Pasta)

Agent A COMPLETED Order ID: 1
Agent A delivering --> Order ID: 4 (Sandwich)
Agent B COMPLETED Order ID: 2
Agent B delivering --> Order ID: 5 (Biryani)
...
```

## Features
- Dynamic thread-safe order processing.
- Simulation of concurrent workloads.
- Use of static synchronization to manage a shared "bottleneck" (the order queue).
