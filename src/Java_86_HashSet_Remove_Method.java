/*
Method 2:
----------
HashSet Removing an element

remove() method is used to delete the specified element from the HashSet.
This method does not throws any exception if the specified element is not present in the HashSet.

*/

import java.util.*;

// import java.util.HashSet; // Import Only HashSet

public class Java_86_HashSet_Remove_Method{
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored

        System.out.println("myHashSet before removing any element : " + myHashSet);
        myHashSet.remove(3); //deletes 3 from the hashset
        System.out.println("myHashSet after removing a element : " + myHashSet);

    }
}
