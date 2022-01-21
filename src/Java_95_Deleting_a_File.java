/*
Java File Handling or I/o :
-------------------------------

Deleting a file :
--------------------

The delete() method is used to delete a file in Java


Example:
---------
import java.io.File;                    // Importing the File class

File obj = new File("filename.txt");    // Specify the name of the file

File obj = new File("C:\\Users\\Java Projects\\filename.txt);    // You can also use Absolute Path with file name

obj.delete()                            // Delete the file, This method return a bool value if the file deleted or not(false means file not available).

 */


import java.io.*;

//import java.io.File;    //Import Only File



public class Java_95_Deleting_a_File {
    public static void main(String[] args) {

        File myFile = new File("test.txt");
        //File myFile = new File("C:\\Users\\Java Projects\\test.txt");

        //System.out.println(myFile.delete());

        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file or file not available");
        }

    }
}
