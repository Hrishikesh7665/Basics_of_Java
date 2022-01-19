/*
Method 6:
----------
size() method return size of a HashSet.
*/


import java.util.*;

// import java.util.HashSet; // Import Only HashSet

public class Java_90_HashSet_Size_Method {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);

        myHashSet.add(15);
        myHashSet.add(18);
        myHashSet.add(19);
        myHashSet.add(6);
        myHashSet.add(7);
        myHashSet.add(4);
        myHashSet.add(6);

        System.out.println("Size of myHashSet is "+myHashSet.size());

        System.out.println(myHashSet);
    }
}