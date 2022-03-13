import java.util.Scanner;

public class LengthAndPrintHalfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        int l = str.length();
        String str_ = str.substring(l / 2);
        System.out.println("The length of the string : " + l);
        System.out.println("Half of the string " + str_);
    }
}