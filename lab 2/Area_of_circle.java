import java.util.Scanner;
public class Area_of_circle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius ");
		int r = sc.nextInt();
		System.out.println("Area of circle is "+ (3.14*r*r)); 
	}
}