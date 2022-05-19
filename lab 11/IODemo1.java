
// Refine the student manager program to manipulate the student information from files
// by using the BufferedReader and BufferedWriter

import java.io.*;

public class IODemo1 {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("Data.txt");
        BufferedReader bufferdReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("Data2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        int count = 1;
        String str = bufferdReader.readLine();
        while (str != null) {
            if (count % 5 != 0) {
                System.out.print(str + ",");
                bufferedWriter.write(str + ",");
            } else {
                System.out.println(str);
                bufferedWriter.write(str + "\n");

            }
            count++;
            str = bufferdReader.readLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}