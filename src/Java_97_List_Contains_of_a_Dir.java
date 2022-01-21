/*
Java Directory Handling or I/o :
-------------------------------
To perform any of the bellow operations on a file in Java, we need to create an object of the file class

Example:
---------
import java.io.File;                    // Importing the File class

File obj = new File(Absolute\\Path);    // Supply Absolute Path of New Directory

list()                                  // Return the files and folders name in a directory in a from of list


N.B:
----


 */


//import java.io.File;    //Import Only File

import java.io.*;

public class Java_97_List_Contains_of_a_Dir {
    public static void main(String[] args) {
        //Creating a File object for directory
        File directoryPath = new File("C:\\Users\\Java Projects\\Test");
        //List of all files and directories
        String contents[] = directoryPath.list();
        System.out.println("List of files and directories in the specified directory:");
        for(int i=0; i<contents.length; i++) {
            System.out.println(contents[i]);
        }
    }
}
