import java.util.Scanner;

public class Palindrome {
    public int reverseNumber(int n) {
        int i, a = 0;
        while (n > 0) {
            i = n % 10;
            n = n / 10;
            a = (a * 10) + i;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        Palindrome obj = new Palindrome();
        int a = sc.nextInt();
        int b = obj.reverseNumber(a);
        if (a == b) {
            System.out.println("The given Number is palindrome ");
        } else {
            System.out.println("The given number is not palindrome ");
        }
    }
}