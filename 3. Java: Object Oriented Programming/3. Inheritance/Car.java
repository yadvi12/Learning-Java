package Inheritance;

public class Car extends Vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private String fridge;

    public Car() {
        super();
        this.steering = "straight";
        this.musicSystem = "low volume";
        this.airConditioner = "cold";
        this.fridge = "on";
    }

    public Car(String engine, int wheels, int seats, int fuelTank, String lights, String steering, String musicSystem, String airConditioner, String fridge) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.fridge = fridge;
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

    public String getFridge() {
        return fridge;
    }
}
