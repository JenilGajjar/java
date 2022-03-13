import java.util.Scanner;

public class PrimeNumber {
    public static void findPrimeNumber(int n) {
        boolean flag = true;
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("The given Number is prime ");
        } else {
            System.out.println("The Given Number is not Prime ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeNumber obj = new PrimeNumber();
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        findPrimeNumber(a);
    }
}