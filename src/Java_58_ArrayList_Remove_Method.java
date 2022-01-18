/*
Method 2:
----------
ArrayList Removing an element

remove() method is used to delete or remove an element at a given index from the ArrayList.

Syntax :
---------
L1.remove(index number)

*/

import java.util.ArrayList;

// import java.util.ArrayList; // Import Only ArrayList

public class Java_58_ArrayList_Remove_Method{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5,5);

        System.out.println("Array list before : "+ l1);

        l1.remove(0);           // Remove Element at Index 0

        System.out.println("ArrayList after removing the value at index 0 :" + l1);

    }
}
