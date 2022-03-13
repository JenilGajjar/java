import java.util.Scanner;

public class AverageInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements of an array ");
        int n = sc.nextInt(), i;
        int array[] = new int[n], sum = 0;
        for (i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }
        float avg = (float) sum / i;
        System.out.println("The average of an elements of an aaray  is " + String.format("%.2f", avg));
    }
}
