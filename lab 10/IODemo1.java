// Write a program that counts number of characters, words, and lines in a file.
// Use exceptions to check whether the file that is read exists or not

import java.io.*;

public class IODemo1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("IoDemo1.txt");
        int a = fin.read(), worldCount = 0, lineCount = 0, characterCount = 0;
        while (a != -1) {

            if (a == 32) {
                worldCount += 1;
                characterCount--;
            }

            if (a == 13) {
                lineCount++;
                characterCount -= 2;
                worldCount++;
            }
            System.out.println(a);
            a = fin.read();
            characterCount++;
        }
        worldCount++;
        lineCount++;
        System.out.println("Number of worlds " + worldCount);
        System.out.println("Number of Lines " + lineCount);
        System.out.println("Number of Character " + characterCount);

    }
}