/*
Java File Handling or I/o :
-------------------------------

Writing to a file :
--------------------

FileWriter class is used with its write() method to write some content in a file.
Do not forget to use the close() method when you're finished writing to a file.


Example:
---------
import java.io.FileWriter;                    // Importing the FileWrite class

FileWriter obj = new FileWriter("filename.txt");    // Specify the name of the file

FileWriter obj = new FileWriter("C:\\Users\\Java Projects\\filename.txt);    // You can also use Absolute Path with file name

fileToWrite.write("Your Text");             // Supply text that you want to write in file.

fileToWrite.close();                        // Close the file to save resources.

N.B:
----
Java fileToWrite() Method can throw IOException.
To handel this exception we always need to use try-catch block while using this method.

 */



import java.io.*;
//import java.io.FileWriter;    //Import Only File writer

public class Java_93_Writing_to_a_File {
    public static void main(String[] args) {

        try {
            FileWriter fileToWrite = new FileWriter("test.txt");
            //FileWriter fileToWrite = new FileWriter("C:\\Users\\Java Projects\\test.txt");
            fileToWrite.write("This is a demo string for testing our java code.\nKeep learning, Keep coding!");
            fileToWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
