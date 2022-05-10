
import java.io.*;
import java.util.Scanner; 
public class IODemo2{
	public static void main(String[] args) throws Exception
	{
		FileReader fileReader = new FileReader("IoDemo1.txt");
		FileWriter fileWriter = new FileWriter("IoDemo2.txt");
		Scanner sc = new Scanner(fileReader);
		
		while(sc.hasNext())
		{
			String str =sc.nextLine();
			str=str.replace("word1","word2");
			fileWriter.write(str + "\n");
			System.out.print(str + "\n");
		}
		fileWriter.close();
		sc.close();
	}
}