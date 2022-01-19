/*
Method 7:
----------
clear() Delete all the element of HashSet
*/


import java.util.*;

// import java.util.HashSet; // Import Only HashSet

public class Java_91_HashSet_Clear_Method {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(16);
        myHashSet.add(33);
        myHashSet.add(78);
        myHashSet.add(19);
        myHashSet.add(29);
        myHashSet.add(10); 

        System.out.println("myHashSet before : " + myHashSet);
        myHashSet.clear(); //deletes all the elements from the hashset
        System.out.println("myHashSet after  : " + myHashSet);

    }
}