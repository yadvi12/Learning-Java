public class Method {
    public static void main(String args[]) {
        sayHello("Yadvi");
        System.out.println("Area of rectangle is " + areaRectangle(5.4,3.2));
    }

    // function with no return type
    public static void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }

    // function with return type double
    public static double areaRectangle(double length, double width) {
        double answer = length*width;
        return answer;
    }
}
