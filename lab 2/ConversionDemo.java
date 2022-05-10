// Write a program to convert temperature from Fahrenheit to Celsius. (Formula :
// c = f-32*5/9

public class ConversionDemo {

    public static void fahrenheittoCelsius(float f) {
        double c = ((f - 32) * 5) / 9;
        System.out.println(c);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        float temp = sc.nextFloat();
        fahrenheittoCelsius(temp);
    }
}