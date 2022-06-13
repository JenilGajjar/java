// Write a program that counts number of characters, words, and lines in a file.
// Use exceptions to check whether the file that is read exists or not

import java.io.*;

public class IODemo1 {
    public static void main(String[] args) throws Exception {

        FileReader fileReader = new FileReader("IoDemo1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int worldCount = 0, lineCount = 0, characterCount = 0;

        String str = bufferedReader.readLine();

        while (str != null) {
            lineCount++;
            String[] words = str.split(" ");
            worldCount += words.length;
            for (String word : words) {
                characterCount += word.trim().length();
            }
            str = bufferedReader.readLine();
        }
        fileReader.close();
        bufferedReader.close();
        System.out.println("Number of worlds " + worldCount);
        System.out.println("Number of Lines " + lineCount);
        System.out.println("Number of Character " + characterCount);

    }
}
