/*
Method 7:
----------
Replaces the element at the specified position in this list with the specified element :

set() method replace the value with given value in specific element
*/


import java.util.ArrayList;

// import java.util.ArrayList; // Import Only ArrayList


public class Java_63_ArrayList_Set_Method {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(3);
        l1.add(6);
        l1.add(3);


        System.out.println("L1 Before Set : "+ l1);

        l1.set(1, 566);

        System.out.println("L1 After Set : "+ l1);


    }
}