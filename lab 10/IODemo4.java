// Create a class called Student. Write a student manager program to manipulate the 
// student information from files by using FileInputStream and FileOutputStream.

import java.io.*;
import java.util.Scanner;
import java.nio.file.*;

public class IODemo4 {
    public static void main(String[] args) throws Exception {

        FileInputStream fInputStream = new FileInputStream("Data.txt");

        FileOutputStream fOutputStream = new FileOutputStream("Data3.txt");
        int i = fInputStream.read();
        int counter = 0;
        String str = "";
        while (i != -1) {
            if (i != 13) {
                if (i != 10) {
                    str = str + (char) i;
                }
            } else {
                counter++;
                if (counter % 5 == 0) {
                    str = str + "\n";
                } else {
                    str = str + ",";
                }
            }
            i = fInputStream.read();
        }
        System.out.println(str);
        byte[] b = str.getBytes();
        fOutputStream.write(b);
        fOutputStream.close();
    }
}
