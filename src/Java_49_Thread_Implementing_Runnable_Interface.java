/*

Runnable Interface Vs Extending Thread Class :
------------------------------------------------------
As multiple inheritance is not supported in Java, it is impossible to extend the Thread class if your class had already extended some other class.
While implementing Runnable, we do not modify or change the thread's behavior.
More memory is required while extending the Thread class because each thread creates a unique object.
Less memory is required while implementing Runnable because multiple threads share the same object.
 */

/*

Steps To Create A Java Thread Using Runnable Interface:
--------------------------------------------------------------
Create a class and implement the Runnable interface by using the 'implements' keyword.

Override the run() method inside the implementer class.

Create an object of the implementer class in the main() method.

Instantiate the Thread class and pass the object to the Thread constructor.

Call start() on the thread. start()will call the run()method.
 */

//Multi Threading by implementing Runnable interface

class MyWork1 implements Runnable{
    @Override
    public void run(){
        int i =0;
        while(i<400){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyWork2 implements Runnable{
    @Override
    public void run(){
        int i =0;
        while(i<400){
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}



public class Java_49_Thread_Implementing_Runnable_Interface {
    public static void main(String[] args) {
        MyWork1 bullet1 = new MyWork1();
        Thread gun1 = new Thread(bullet1);

        MyWork2 bullet2 = new MyWork2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
