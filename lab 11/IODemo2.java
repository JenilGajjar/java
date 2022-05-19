// Write a program to check that whether the name given from command line is
// file or
// not? If it is a file then print the size of file and if it is directory then
// it should display the
// name of all files in it.

import java.io.*;

public class IODemo2 {
    public static void main(String[] args) {
        File file = new File(args[0]);
        if (file.isFile()) {
            System.out.println("is File ");
            long bytes = file.length();
            long kilobytes = bytes / 1024;
            long megabytes = kilobytes / 1024;

            System.out.println("bytes " + bytes);
            System.out.println("kilobytes " + kilobytes);
            System.out.println("megabytes " + megabytes);

        } else if (file.isDirectory()) {
            System.out.println("is Directory");
            // Technique 1
            // File[] files = file.listFiles();
            // for (File file2 : files) {
            // System.out.println(file2.getName());
            // }

            // Technique 2
            String[] pathnames;
            pathnames = file.list();
            for (String string : pathnames) {
                System.out.println(string);
            }
        }
    }
}