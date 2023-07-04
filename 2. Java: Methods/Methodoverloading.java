public class Methodoverloading {
    public static void main(String args[]) {
        System.out.println("Area of rectangle is " + area(14.25d, 10.65d));
        System.out.println("Area of square is " + area(5));
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static int area(int side) {
        return side * side;
    }


}
