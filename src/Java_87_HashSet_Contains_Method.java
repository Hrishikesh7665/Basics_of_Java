/*
Method 3:
----------
Checking if an HashSet contains a specific value or not

contains() method is used to check if an HashSet contains a specified element or not. This method returns the boolean value.

*/

import java.util.*;

// import java.util.HashSet; // Import Only HashSet

public class Java_87_HashSet_Contains_Method {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(5);
        myHashSet.add(6);

        System.out.println("Array list : "+ myHashSet);
        System.out.println("myHashSet list contains 7 : " + myHashSet.contains(7));
        System.out.println("myHashSet list contains 4 : " + myHashSet.contains(4));


    }
}
