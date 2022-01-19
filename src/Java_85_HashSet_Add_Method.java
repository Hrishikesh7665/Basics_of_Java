/*
Method 1:
----------------
HashSet Adding an element

add() method is used to add elements in HashSet.
The insertion order of the elements does not remain preserved in HashSet.
All the duplicate elements are ignored because the set contains only unique values.
*/


import java.util.*;

// import java.util.HashSet; // Import Only HashSet

public class Java_85_HashSet_Add_Method {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);      // This element will be ignored

        System.out.println(myHashSet);
    }
}
