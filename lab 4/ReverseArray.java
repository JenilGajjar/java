import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements of an array ");
        int n = sc.nextInt(), i, j;
        int array[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " Element ");
            array[i] = sc.nextInt();
        }
        System.out.println("==============================================");
        for (i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==============================================");
        System.out.println("array in reverse order ");
        for (j = n - 1; j >= 0; j--) {
            System.out.println(array[j]);

        }
    }
}