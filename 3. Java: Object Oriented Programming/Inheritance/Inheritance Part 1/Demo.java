package Inheritance;

public class Demo {
    public static void main(String args[]) {
        System.out.println("Displaying info for Honda Bike: ");
        Bike honda = new Bike("long", "diesel", 4, 5, 37, "LED");
        System.out.println(honda.getHandle());
        System.out.println(honda.getFuelTank());
        System.out.println(honda.getEngine());
        System.out.println(honda.getWheels());
        honda.run();

        System.out.println();

        System.out.println("Displaying info for Mercedes Car: ");
        Car mercedes = new Car("petrol", 4, 6, 40, "LED", "left", "high volume", "cold", "off");
        System.out.println(mercedes.getAirConditioner());
        System.out.println(mercedes.getMusicSystem());
        System.out.println(mercedes.getEngine());
        System.out.println(mercedes.getLights());
        mercedes.run();

        System.out.println();

        System.out.println("Displaying info for Ford Truck: ");
        Truck ford = new Truck("diesel", 4, 2, 50, "LED", "left", "low volume", "moderate", 10);
        System.out.println(ford.getContainer());
        System.out.println(ford.getFuelTank());
        System.out.println(ford.getSteering());
        System.out.println(ford.getEngine());
    }
}
