/*
Method 6:
----------
Finding the Last occurrence of a specified number in the LinkedList :

lastIndexOf() method prints the index of the last occurrence of a particular number. Returns -1 if the element is not present in the LinkedList.
*/


import java.util.*;
// import java.util.LinkedList; // Import Only LinkedList


public class Java_79_LinkedList_LastIndexOf_Method {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(3);
        l1.add(6);
        l1.add(3);

        System.out.println("L1 LinkedList : "+ l1);
        System.out.println("The last occurrence of 3 in l1 is at index : " + l1.lastIndexOf(3));

    }
}