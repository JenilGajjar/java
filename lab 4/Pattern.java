import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of lines ");
        int n = sc.nextInt(), i, j, k;
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println(" ");
        }
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            for (j = 1; j <= n - i; j++) {
                System.out.print("*   ");
            }
            System.out.println(" ");
        }
    }
}