package User_input;

import java.util.Scanner;

public class App {
    public static void main(String args[]) {
//        System.out.println("What is your name?");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        String name = sc.nextLine();
//        System.out.println("Hi there, " + name + ", have a nice day!");

        System.out.println("What's your age?");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
        sc.close();
    }
}
