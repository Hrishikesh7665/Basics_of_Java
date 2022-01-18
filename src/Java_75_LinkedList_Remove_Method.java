/*
Method 2:
----------
Removing an element from the LinkedList:

remove() method is used to remove an element from the linked list.

Syntax :
---------
L1.remove(index number)

*/

import java.util.*;
// import java.util.LinkedList; // Import Only LinkedList


public class Java_75_LinkedList_Remove_Method{
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5,5);

        System.out.println("L1 Linked list before: "+ l1);

        l1.remove(2); //removes element present at 2nd index

        System.out.println("L1 Linked list after: "  + l1);
    }
}
