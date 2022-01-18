/*
Removing an element on ArrayDeque:
------------------------------------
Removing at Front :-
----------------------
removeFirst() & pollFirst() methods are used to delete an element from the head of the queue.

removeFirst() throws an exception if the queue is empty.

pollFirst() returns null if the queue is empty.
*/


import java.util.ArrayDeque;

public class Java_71_ArrayDeque_Removing_an_element_FIRST {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);

        ad1.pollFirst(); //deletes 6
        ad1.removeFirst(); //deletes 56

        System.out.println(ad1);

    }
}
