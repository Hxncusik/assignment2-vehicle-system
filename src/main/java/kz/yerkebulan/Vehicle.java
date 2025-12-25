package kz.yerkebulan;

public abstract class Vehicle {
    protected String brand;
    protected int year;

    protected Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo() {
        System.out.println("Vehicle info:");
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
