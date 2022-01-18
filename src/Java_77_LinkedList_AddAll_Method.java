/*
Method 4:
----------
Merging two LinkedList

The elements of an LinkedList can be merged into another LinkedList with the help of the addAll() method.

Syntax :
---------
addAll() Add LinkedList2 at last of LinkedList1

addAll(index,Array2) Add LinkedList2 at specific index of LinkedList1
*/


import java.util.*;

// import java.util.LinkedList; // Import Only LinkedList

public class Java_77_LinkedList_AddAll_Method {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();          // LinkedList 1

        LinkedList<Integer> l2 = new LinkedList<>();          // LinkedList 2

        LinkedList<Integer> l3 = new LinkedList<>();          // LinkedList 3

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        l3.add(1001);
        l3.add(1002);
        l3.add(1003);
        l3.add(1004);

        System.out.println("L1 LinkedList : "+ l1);
        System.out.println("L2 LinkedList : " +l2);
        l1.addAll(l2);                                              // Merging LinkedList2 With LinkedList1
        System.out.println("L1 LinkedList after merging: "+ l1);
        System.out.println("L2 LinkedList : " +l2);

        l1.addAll(1,l3);                                       // Add LinkedList3 at 1 index of LinkedList1
        System.out.println("L1 LinkedList after merging: "+ l1);
        System.out.println("L3 LinkedList : " +l3);


    }
}