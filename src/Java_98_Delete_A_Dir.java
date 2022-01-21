/*
Java Directory Handling or I/o :
-------------------------------
To perform any of the bellow operations on a file in Java, we need to create an object of the file class

Example:
---------
import java.io.File;                    // Importing the File class

File obj = new File("C:\\Users\\Java Projects\\Test");    // Specify the name of the folder

obj.delete()                            // Delete the file, This method return a bool value if the file deleted or not(false means file not available).

N.B:
----
Java delete() Method only delete the empty folder. Folders that are not empty can't be deleted.

It returns true or false as per operation is successful or not.

 */

//import java.io.File;    //Import Only File

import java.io.File;

public class Java_98_Delete_A_Dir {
    public static void main(String[] args) {

        File myFolder = new File("C:\\Users\\Java Projects\\Test");

        //System.out.println(myFile.delete());

        if(myFolder.delete()){
            System.out.println("Folder Deleted");
        }
        else{
            System.out.println("Folder No Deleted");
        }
    }
}
