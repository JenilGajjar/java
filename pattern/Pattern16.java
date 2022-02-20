import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number Of Lines ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }

            if (i == n) {
                System.out.println(" ");
                for (int k = 1; k <= i; k++) {
                    System.out.print(" *");
                }
            }
            System.out.println(" ");
        }
    }
}
