// Write a program to create basic calculator by getting 2 numbers and 1 string
// (operation) from the user and apply the operation given in a string on the
// given
// numbers.

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter Operation");
        String str = sc.next();
        if (str.equals("+")) {
            System.out.println("Addition : " + (a + b));
        } else if (str.equalsIgnoreCase("x")) {
            System.out.println("Multiplication : " + (a * b));
        } else if (str.equals("/")) {
            System.out.println("Division : " + (a / b));
        } else if (str.equals("%")) {
            System.out.println("Reminder : " + (a % b));
        } else {
            System.out.println("Substraction: " + (a - b));
        }

    }
}