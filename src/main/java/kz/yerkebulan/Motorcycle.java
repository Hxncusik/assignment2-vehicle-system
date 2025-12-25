package kz.yerkebulan;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has sidecar: " + hasSidecar);
    }
}
