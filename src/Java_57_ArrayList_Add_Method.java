/*
The ArrayList class is the dynamic array found in the java.util package.
The size of the normal array can not be changed, but ArrayList provides us the ability to increase or decrease the size.
ArrayList is slower than the standard array, but it helps us to manipulate the data easily.


How to declare an ArrayList :
-------------------------------
ArrayList<Integer> l1 = new ArrayList<>();      //Creates an ArrayList object of integer type

ArrayList<Integer> l1 = new ArrayList<>(5);      //Creates an ArrayList object of integer type with initial capacity of 5

//N.B: After initialing capacity we can't add more than this capacity.


ArrayList Contain So Many  Methods. You Can Read About Those Methods In Oracle Documentation.
*/

/*
Method 1:
----------------
ArrayList Adding an element

add() method is used to insert an element in the ArrayList.
add(Object): Inserts an element at the end of the ArrayList.
add(Index,Object) : Inserts an element at the given index.
*/

import java.util.*;

// import java.util.ArrayList; // Import Only ArrayList

public class Java_57_ArrayList_Add_Method {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);                  // Appends 1 to the end of this list.
        l1.add(2);                  // Appends 2 to the end of this list.
        l1.add(3);                  // Appends 3 to the end of this list.
        l1.add(4);                  // Appends 4 to the end of this list.
        l1.add(6);                  // Appends 6 to the end of this list.

        l1.add(5,5);  // Inserts the 5 at the 5 position in this list.

        System.out.println(l1);
    }
}
