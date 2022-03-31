import java.util.Scanner;

class Circle {
    double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void displayArea() {
        System.out.println(Math.PI * radius * radius);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius ");
        int r = sc.nextInt();
        Circle circle1 = new Circle(r);
        System.out.println(circle1.getArea());
        circle1.displayArea();
    }
}