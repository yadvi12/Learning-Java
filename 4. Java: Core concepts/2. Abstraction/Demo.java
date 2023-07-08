package Abstraction;

public class Demo {
    public static void main(String args[]) {
        Person Alice = new Vegan();
        Alice.speak();
        Alice.eat();
        System.out.println("");
        Person Elsa = new NonVegan();
        Elsa.speak();
        Elsa.eat();
    }
}
