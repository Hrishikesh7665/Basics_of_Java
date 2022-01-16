/*
Add a sleep method in the welcome thread of question 5 to delay its execution for 200ms.
*/


import java.util.ArrayList;

class Thread1New extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
    }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}
class Thread2New extends Thread {
    public void run() {
            System.out.println("Good morning");
        }
    }
public class Question_Set_7_ArrayList {
    public static void main(String[] args) {
        Thread1New t1= new Thread1New();
        Thread2New t2= new Thread2New();
        t1.start();
        t2.start();
    }
}