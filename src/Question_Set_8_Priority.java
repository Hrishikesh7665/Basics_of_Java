/*
Demonstrate gerPriority() and setPriority() methods in Java threads.
*/


class Thread1 extends Thread{
    public void run(){
        System.out.println("Welcome");
    }
}
class Thread2 extends Thread {
    public void run() {
            System.out.println("Good morning");
        }
    }
public class Question_Set_8_Priority {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();
        t1.setPriority(5);
        t2.setPriority(1);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}