import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines ");
        int n = sc.nextInt();
        int t=n-1;
        // int len=(n*2)=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) 
            {
                if (i == 1 || i == n) 
                {
                    System.out.print(n+ " ");
                }
            {

                if (j == 1 || j == n) 
                {
                    System.out.print(n+ " ");
                }
                else{
                    for (int k =t ; n>0 ; k--) {
                        System.out.print(k + " ");
                    }
                } 
            }

                
            }
            System.out.println(" ");
        }
    }
}