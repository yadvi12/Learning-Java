package Interfaces;

public class Practice {
    public static void main(String args[]) {
        /*OnePlus5 phone = new OnePlus5();
        int processor = phone.processor();
        System.out.println("Processor: "+processor);*/

        Phone phone = new OnePlus5();
        System.out.println("Processor: " + phone.processor());
        System.out.println("Space in GB: " + phone.spaceInGB());

    }
}
