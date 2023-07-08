package Inheritance;

public class Truck extends Vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private int container;

    public Truck() {
        super();
        this.steering = "right";
        this.musicSystem = "high volume";
        this.airConditioner = "moderate";
        this.container = 7;
    }

    public Truck(String engine, int wheels, int seats, int fuelTank, String lights, String steering, String musicSystem, String airConditioner, int container) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public int getContainer() {
        return container;
    }
}
