/*
Method 8:
----------
size() method return size of a LinkedList.
*/


import java.util.*;
// import java.util.LinkedList; // Import Only LinkedList


public class Java_81_Accessing_LinkedList_and_Size_Method {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(15);
        l1.add(18);
        l1.add(19);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);

        System.out.println("Size of l1 is "+l1.size());

        //Print LinkedList
        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}