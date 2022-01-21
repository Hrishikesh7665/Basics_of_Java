/*
Java File Handling or I/o :
-------------------------------

Reading a file :
--------------------

The Scanner class is used to read a file.
It is important to enclose the method in a try-catch block to handle the IOException.


Example:
---------
import java.io.File;                    // Importing the File class

import java.util.Scanner;               // We need to use scanner class to read a file

File obj = new File("filename.txt");    // Specify the name of the file

File obj = new File("C:\\Users\\Java Projects\\filename.txt);    // You can also use Absolute Path with file name

Scanner sc = new Scanner(obj);            // Read a single line from a file

hasNextLine()                       // This method is return bool value if there a next line or not.

N.B:
----
To handel this exception we always need to use try-catch block while using this method.

To Read multiple lines from a file we need to use while loop.



 */


import java.io.*;           // Import all from io class
import java.util.Scanner;   // We need to use scanner class to read a file

//import java.io.File;    //Import Only File
//import java.io.FileNotFoundException;


public class Java_94_Reading_a_File {
    public static void main(String[] args) {

        File myFile = new File("test.txt");
        //File myFile = new File("C:\\Users\\Java Projects\\test.txt");

        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
