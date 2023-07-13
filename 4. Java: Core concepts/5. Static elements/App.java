package Static_elements;

public class App {
    public static void main(String args[]) {
//        TestStatic obj1 = new TestStatic();
        System.out.println("Current variable value: " + TestStatic.getStaticVariable());
        TestStatic.setStaticVariable(1);
//        System.out.println("Current variable value: " + TestStatic.getStaticVariable());

//        TestStatic obj2 = new TestStatic();
        System.out.println("Current variable value: " + TestStatic.getStaticVariable());
        TestStatic.setStaticVariable(24);
        System.out.println("Current variable value: " + TestStatic.getStaticVariable());

//        TestStatic obj3 = new TestStatic();
//        System.out.println("Current variable value: " + TestStatic.getStaticVariable());
    }
}
