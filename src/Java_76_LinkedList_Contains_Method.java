/*
Method 3:
----------
Checking if an LinkedList contains a specific value or not

contains() method is used to check if an LinkedList contains a specified element or not. This method returns the boolean value.

*/

import java.util.*;

// import java.util.LinkedList; // Import Only LinkedList

public class Java_76_LinkedList_Contains_Method {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        System.out.println("Linked List: "+ l1);
        System.out.println("L1 list contains 7 : " + l1.contains(7));
        System.out.println("L1 list contains 4 : " + l1.contains(4));


    }
}
