import java.util.Scanner;
public class Greaternumber{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a= input.nextInt();
		int b= input.nextInt();
		int c= input.nextInt();

		if(a>b && a>c)
		{
			System.out.println(a+ " is the  greatest number ");
		}
		else if (b>a && b>c) 
		{
			System.out.println(b+ " is the  greatest number ");				
		}
		else
		{
			System.out.println(c+ " is the  greatest number ");	
		}
	}
}