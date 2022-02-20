import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println(" ");
        }
    }
}
