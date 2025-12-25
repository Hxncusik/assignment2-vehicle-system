package kz.yerkebulan;

public abstract class Vehicle {
    private String brand;
    private int year;

    protected Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    abstract void startEngine();
    abstract void stopEngine();

    public void displayInfo(){
        System.out.println("Vehicle brand: " + brand + ", Year: " + year);
    }
}
