// Write an application that reads a file and counts the number of occurrences of digit 5. 
// Supply the file name as a command-line argument.

import java.io.*;
import java.util.Scanner;
import java.nio.file.*;

public class IODemo3 {
	public static void main(String[] args) throws Exception {

		// Creating a path choosing file from local
		// directory by creating an object of Path class
		Path fileName = Path.of("IODemo.txt");
		// Now calling Files.readString() method to
		// read the file
		String str = Files.readString(fileName);
		// Printing the string
		System.out.println(str);

		// ======================================================================
		// code for counting

		FileReader fileReader = new FileReader(args[0]);
		Scanner sc = new Scanner(fileReader);
		int number_Of_Digit_5 = 0;
		while (sc.hasNextLine()) {
			String line = sc.next();
			if (line.length() == 5) {
				number_Of_Digit_5++;
			}
		}
		System.out.print("Number of occurrences of digit 5 " + number_Of_Digit_5);
		sc.close();
	}
}