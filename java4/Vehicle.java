package java4;

public class Vehicle {

    protected String name;
    protected double ratePerDay;

    public Vehicle(String name, double ratePerDay) {
        this.name = name;
        this.ratePerDay = ratePerDay;
    }

    public double calculateRent(int days) {
        return ratePerDay * days;
    }

    public void display() {
        System.out.println("Vehicle: " + name);
        System.out.println("Rate per day: " + ratePerDay);
    }
}