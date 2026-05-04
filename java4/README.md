# Lab 4: Vehicle Rental System (Inheritance & Polymorphism)

## Overview
This lab demonstrates the core OOP concepts of inheritance and polymorphism through a vehicle rental simulation. It uses a base `Vehicle` class and specialized subclasses (`Car`, `Bike`, `Truck`) to model different types of vehicles with unique rental rates.

## Key Concepts
- **Inheritance**: Subclasses (`Car`, `Bike`, `Truck`) inheriting fields and methods from the `Vehicle` base class.
- **Polymorphism**: Using a base class reference (`Vehicle v`) to point to subclass objects, allowing dynamic method binding.
- **Method Overriding**: Subclasses providing specific implementations (though in this specific lab, they primarily use `super()` to set base properties).
- **Access Modifiers**: Using `protected` for fields to allow direct access in subclasses while maintaining some encapsulation.
- **Dynamic Object Instantiation**: Creating specific vehicle objects based on runtime user input.

## Code Structure
- **Vehicle.java**: The base class.
  - Fields: `name`, `ratePerDay`.
  - Methods: `calculateRent(days)`, `display()`.
- **Car.java**, **Bike.java**, **Truck.java**: Subclasses that extend `Vehicle`.
  - Each subclass sets its own default name and rental rate (e.g., Car: 2000, Bike: 500, Truck: 5000).
- **VehicleMain.java**: The driver program that handles selection logic and displays the calculated rent.
- **run.ps1**: PowerShell automation for compiling and running the lab.
- **sample_input.txt**: Example input (Vehicle type and days).

## How to Run
### Manual Execution
1. Compile: `javac *.java`
2. Run: `java VehicleMain`

### Quick Run
```powershell
.\run.ps1
```

## Sample Interaction
```text
--- Vehicle Rental System ---
1. Car
2. Bike
3. Truck
Choose vehicle: 1
Enter number of rental days: 5

Vehicle: Car
Rate per day: 2000.0
Total Rent: ₹10000.0
```

## Features
- Flexible rental calculation based on vehicle type and duration.
- Demonstrates "is-a" relationship (e.g., a Car *is a* Vehicle).
- Scalable design: adding a new vehicle type only requires creating a new subclass.
