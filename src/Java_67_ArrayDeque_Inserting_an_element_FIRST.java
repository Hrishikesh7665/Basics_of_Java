/*
Inserting an element on ArrayDeque:
------------------------------------
Insertion at Front :-
----------------------
add(), offerFirst() and addFirst() methods are used to insert an element at front of an array deque.
*/


import java.util.*;
public class Java_67_ArrayDeque_Inserting_an_element_FIRST {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.offerFirst(10);
        System.out.println(ad1);

    }
}
