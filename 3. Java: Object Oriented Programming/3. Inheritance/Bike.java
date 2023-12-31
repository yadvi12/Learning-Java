package Inheritance;

public class Bike extends Vehicle {
    private String handle;

    public Bike() {
        super();
        this.handle = "short";
    }

    public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    // method overriding
    public void run() {
        System.out.println("Bike is running!");
    }
}
