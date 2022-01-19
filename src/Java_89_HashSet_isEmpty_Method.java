/*
Method 5:
----------
Checking if the HashSet is empty or not :

isEmpty() method is used to check if there is any object in the HashSet or not.
This method returns a boolean value.

*/


import java.util.*;

// import java.util.HashSet; // Import Only HashSet


public class Java_89_HashSet_isEmpty_Method {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);

        HashSet<Integer> myHashSet1 = new HashSet<>();

        System.out.println(myHashSet.isEmpty());
        System.out.println(myHashSet1.isEmpty());


    }
}