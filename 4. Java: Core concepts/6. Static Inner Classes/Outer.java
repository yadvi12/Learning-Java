package Static_inner_class;

public class Outer {
    // private int testVar = 5;
    //private static int testVar = 5;

    public static void testingOuterMethod() {
        //System.out.println("Testing outer class method!");
        System.out.println("Value of inner class variable: " + Inner.x);
        Inner.testingInnerMethod();
    }

    public static class Inner {
        public static int x = 0;

        public static void testingInnerMethod() {
            System.out.println("Testing inner class method!");
            // System.out.println("Test Variable: " + new Outer().testVar);
            //System.out.println("Test Variable: " + testVar);
            //testingOuterMethod();
        }
    }
}
