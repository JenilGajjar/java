import java.io.*;
import java.util.Scanner;

public class IODemo5 {
    public static void main(String[] args) throws Exception {

        FileReader fileReader = new FileReader("Data.txt");
        Scanner sc = new Scanner(fileReader);

        FileWriter fileWriter = new FileWriter("Data2.txt");

        String str[] = new String[5];
        while (sc.hasNextLine()) {
            for (int i = 0; i < str.length; i++) {
                if (i == str.length - 1) {
                    str[i] = sc.nextLine();
                    fileWriter.write(str[i]);
                    System.out.print(str[i]);
                } else {
                    str[i] = sc.nextLine();
                    fileWriter.write(str[i] + ",");
                    System.out.print(str[i] + ",");
                }
            }
            fileWriter.write("\n");
            System.out.println();
        }
        fileWriter.close();
    }
}
