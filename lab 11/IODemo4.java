// Refine the student manager program to manipulate the student information from
// files
// by using the DataInputStream and DataOutputStream. Assume suitable data

import java.io.*;
import java.time.temporal.IsoFields;

public class IODemo4 {
    public static void main(String[] args) throws Exception {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("Data.txt"));
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("Data3.txt"));
        int i = dataInputStream.read();
        int count = 0;
        String str = null;
        while (i != -1) {
            if (i != 13) {
                if (i != 10) {
                    str = str + (char) i;
                }
            } else {
                count++;
                if (count % 5 == 0) {
                    str = str + "\n";
                } else {
                    str = str + ",";
                }
            }
            i = dataInputStream.read();
        }
        System.out.println(str);
        byte[] bytes = str.getBytes();
        dataOutputStream.write(bytes);
    }
}