/*
Method 9:
----------
clear() Delete all the element of array list
*/


import java.util.ArrayList;

// import java.util.ArrayList; // Import Only ArrayList

public class Java_65_ArrayList_Clear_Method {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(15);
        l1.add(18);
        l1.add(19);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);

        System.out.println("L1 ArrayList Before Clear "+l1);
        l1.clear();
        System.out.println("L1 ArrayList After Clear "+l1);

    }
}