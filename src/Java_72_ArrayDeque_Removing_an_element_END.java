/*
Removing an element on ArrayDeque:
------------------------------------
Removing at END :-
----------------------
removeLast() & pollLast() methods are used to delete an element from the tail of the queue.
*/


import java.util.ArrayDeque;

public class Java_72_ArrayDeque_Removing_an_element_END {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);

        ad1.pollLast(); //deletes 19
        ad1.removeLast(); //deletes 91

        System.out.println(ad1);

    }
}
