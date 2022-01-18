/*
Method 9:
----------
clear() Delete all the element of LinkedList
*/


import java.util.*;
// import java.util.LinkedList; // Import Only LinkedList


public class Java_82_LinkedList_Clear_Method {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(15);
        l1.add(18);
        l1.add(19);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);

        System.out.println("L1 LinkedList Before Clear "+l1);
        l1.clear();
        System.out.println("L1 LinkedList After Clear "+l1);

    }
}