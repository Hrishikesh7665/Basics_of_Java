/*
Java File Handling or I/o :
-------------------------------
To perform any of the above operations on a file in Java, we need to create an object of the file.

Example:
---------
import java.io.File;                    // Importing the File class

File obj = new File("filename.txt");    // Specify the name of the file

File obj = new File("C:\\Users\\Java Projects\\filename.txt);    // You can also use Absolute Path with file name


N.B:
----
Java createNewFile() Method can throw IOException.
To handel this exception we always need to use try-catch block while using this method.

 */

//import java.io.File;    //Import Only File

import java.io.*;           // Import all from io class

public class Java_92_Create_A_NewFile {
    public static void main(String[] args) {

        File myFile = new File("test.txt");
        //File myFile = new File("C:\\Users\\Java Projects\\test.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
