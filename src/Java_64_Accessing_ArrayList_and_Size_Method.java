/*
Method 8:
----------
size() method return size of a ArrayList.
*/


import java.util.ArrayList;

// import java.util.ArrayList; // Import Only ArrayList

public class Java_64_Accessing_ArrayList_and_Size_Method {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(15);
        l1.add(18);
        l1.add(19);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);

        System.out.println("Size of l1 is "+l1.size());

        //Print ArrayList
        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}