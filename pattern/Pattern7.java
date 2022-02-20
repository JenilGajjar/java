import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines ");
        int n = sc.nextInt(), num = 1;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(num + "   ");
                    num++;
                } else {
                    System.out.print(ch + "   ");
                    ch++;
                }
            }
            System.out.println(" ");
        }
    }
}
