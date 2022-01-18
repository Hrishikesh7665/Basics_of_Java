/*
Method 3:
----------
Checking if an ArrayList contains a specific value or not

contains() method is used to check if an ArrayList contains a specified element or not. This method returns the boolean value.

*/

import java.util.ArrayList;

// import java.util.ArrayList; // Import Only ArrayList

public class Java_59_ArrayList_Contains_Method {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        System.out.println("Array list : "+ l1);
        System.out.println("L1 list contains 7 : " + l1.contains(7));
        System.out.println("L1 list contains 4 : " + l1.contains(4));


    }
}
