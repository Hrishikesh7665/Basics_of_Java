/*
Do- while loop is similar to a while loop except for the fact that it is guaranteed to execute at least once.
Use a do-while loop when the exact number of iterations is unknown, but you need to execute a code block at least once.
After executing a part of a program for once, the rest of the code gets executed on the basis of a given boolean condition.
Syntax
*/


public class Java_11_Do_while_loop {
    public static void main(String[] args) {
//        int a = 0;
//        while(a<5){
//            System.out.println(a);
//            a++;
//        }
        int b = 10;
        do {
            System.out.println(b);
            b++;
        }while(b<5);

        int c = 1;
        do{
            System.out.println(c);
            c++;
        }while(c<=45);

    }
}