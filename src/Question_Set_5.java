/*
Question:
----------
Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
*/

class NewThread1 extends Thread{
    public void run(){
        while (true){
        System.out.println("Welcome");
    }
    }
}
class NewThread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}
public class Question_Set_5 {
    public static void main(String[] args) {
        NewThread1 t1= new NewThread1();
        NewThread2 t2= new NewThread2();
        t1.start();
        t2.start();
    }
}