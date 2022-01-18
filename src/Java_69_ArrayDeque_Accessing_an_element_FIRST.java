/*
Accessing an element on ArrayDeque:
------------------------------------
Accessing at Front :-
----------------------
getFirst() & peekFirst() methods are used to get the first element of the deque array.
*/


import java.util.ArrayDeque;

public class Java_69_ArrayDeque_Accessing_an_element_FIRST {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());

    }
}
