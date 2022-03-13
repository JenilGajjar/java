import java.util.Scanner;

public class MaximumFromThreeNumber {
    public static int maximum(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = maximum(a, b, c);
        System.out.println("Maximum Number from given three number is : " + max);
    }
}