import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Lines ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println(" ");
        }
        // for (int i = 1; i <=n ; i++) {
        // for(int j=1;j<=(n+1-i);j++){
        // System.out.print(j + " ");
        // }
        // System.out.println(" ");
        // }
    }
}
