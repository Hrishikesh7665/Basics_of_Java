/*
Method 4:
----------
Merging two HashSet

The elements of an HashSet can be merged into another HashSet with the help of the addAll() method.

Syntax :
---------
addAll() merge HashSet2 with HashSet1

*/


import java.util.*;

// import java.util.HashSet; // Import Only HashSet

public class Java_88_HashSet_AddAll_Method {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet1 = new HashSet<>(6, 0.5f);          // HashSet 1

        HashSet<Integer> myHashSet2 = new HashSet<>(6, 0.5f);          // HashSet 2

        myHashSet1.add(1);
        myHashSet1.add(2);
        myHashSet1.add(3);
        myHashSet1.add(4);
        myHashSet1.add(5);
        myHashSet1.add(6);

        myHashSet2.add(11);
        myHashSet2.add(12);
        myHashSet2.add(13);
        myHashSet2.add(14);

        System.out.println("myHashSet1 HashSet : "+ myHashSet1);
        System.out.println("myHashSet2 HashSet : " +myHashSet2);

        myHashSet1.addAll(myHashSet2);                                              // Merging Array2 With Array1
        System.out.println("myHashSet1 HashSet after merging: "+ myHashSet1);

    }
}