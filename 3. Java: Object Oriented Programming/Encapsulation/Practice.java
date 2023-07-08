package Encapsulation;

public class Practice {
    public static void main(String args[]) {
        Person Juliet = new Person();
        System.out.println(Juliet);
        Person Elsa = new Person("Elsa", 25, "Female");
        System.out.println(Elsa);
        Elsa.setAge(24);
        System.out.println(Elsa);
    }
}
