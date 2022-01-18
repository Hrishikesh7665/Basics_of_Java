/*
Method 5:
----------
Finding the first occurrence of a specified number in the ArrayList :

Indexof() method prints the index of the first occurrence of a particular number. Returns -1 if the element is not present in the ArrayList.
*/


import java.util.ArrayList;

// import java.util.ArrayList; // Import Only ArrayList


public class Java_61_ArrayList_IndexOf_Method {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(3);

        System.out.println("L1 Array list : " + l1);
        System.out.println("The first occurrence of 3 in l1 is at index : " + l1.indexOf(3));


    }
}