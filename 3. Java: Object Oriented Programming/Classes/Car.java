public class Car {
    private String doors;
    private String engine;
    private String driver;
    private int speed;

    // getter function
    public int getSpeed(){
        return speed;
    }

    // setter function
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
