/*
Method 4:
----------
Merging two ArrayLists

The elements of an ArrayList can be merged into another Arraylist with the help of the addAll() method.

Syntax :
---------
addAll() Add Array2 at last of Array1

addAll(index,Array2) Add Array2 at specific index of Array1
*/


import java.util.ArrayList;

// import java.util.ArrayList; // Import Only ArrayList

public class Java_60_ArrayList_AddAll_Method {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();          // ArrayList 1

        ArrayList<Integer> l2 = new ArrayList<>();          // ArrayList 2

        ArrayList<Integer> l3 = new ArrayList<>();          // ArrayList 3

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

        System.out.println("L1 Array list : "+ l1);
        System.out.println("L2 Array list : " +l2);
        l1.addAll(l2);                                              // Merging Array2 With Array1
        System.out.println("L1 Array list after merging: "+ l1);
        System.out.println("L2 Array list : " +l2);

        l1.addAll(1,l3);                                       // Add Array3 at 1 index of Array1
        System.out.println("L1 Array list after merging: "+ l1);
        System.out.println("L3 Array list : " +l3);


    }
}