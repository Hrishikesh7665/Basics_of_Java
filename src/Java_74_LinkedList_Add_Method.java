/*
Method 1:
----------------
Adding Element in LinkedList:

Similar to ArrayList, add() method is used to add elements in a linked list.

add(Object): Inserts an element at the end of the ArrayList.

add(Index,Object) : Inserts an element at the given index.

*/

import java.util.*;
// import java.util.LinkedList; // Import Only LinkedList

public class Java_74_LinkedList_Add_Method {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);                  // Appends 1 to the end of this list.
        l1.add(2);                  // Appends 2 to the end of this list.
        l1.add(3);                  // Appends 3 to the end of this list.
        l1.add(4);                  // Appends 4 to the end of this list.
        l1.add(6);                  // Appends 6 to the end of this list.

        l1.add(5,5);  // Inserts the 5 at the 5 position in this list.

        System.out.println("L1 Linked list : "+ l1);
    }
}
