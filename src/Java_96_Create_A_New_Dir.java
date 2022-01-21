/*
Java Directory Handling or I/o :
-------------------------------
To perform any of the bellow operations on a file in Java, we need to create an object of the file class

Example:
---------
import java.io.File;                    // Importing the File class

File obj = new File(Absolute\\Path);    // Supply Absolute Path of New Directory

obj.mkdir();                    //Create the new Directory

obj.mkdirs();                   //Create the new Directory's

N.B:
----
Java mkdir() Method Create a single directory only, and it returns true or false as per operation is successful or not.

Java mkdirs() Method Create hierarchy of directory, and it returns true or false as per operation is successful or not.

 */

//import java.io.File;    //Import Only File

import java.io.*;

public class Java_96_Create_A_New_Dir {
    public static void main(String[] args) {

        // Create a single directory
        File f = new File("C:\\Users\\Java Projects\\Test");

        if(f.mkdir()){
            System.out.println("Directory created successfully");
        }else{
            System.out.println("Sorry could’t create specified directory");
        }


        // Create a Multiple directory (hierarchy)
        File f2 = new File("C:\\Users\\Java Projects\\Test\\SubFolder1");

        if(f2.mkdirs()){
            System.out.println("Directory's created successfully");
        }else{
            System.out.println("Sorry could’t create specified directory's");
        }
    }
}
