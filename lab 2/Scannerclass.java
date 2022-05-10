// import java.util.*; // to import all the utilites
import java.util.Scanner;
public class Scannerclass{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a= input.nextInt();
		System.out.println("Enter a number ");
		int b= input.nextInt();
		int c=a+b;
		System.out.println("Addition :"+c);
	}
}