/*
threads use shared memory area
threads = faster content switching
A thread is light-weight where a process is heavyweight

for example = A word processor can have one thread running in foreground as an editor and another in the background auto saving the document !

Creating a Threading
There are two ways to create a thread in java

1. By extending thread class

2. By implementing Runnable interface
*/

/*
Multithreading In Java :
----------------------------
Used to maximize the CPU utilization.
We don't want our CPU to be in a free state; for example, Func1() comes into the memory and demands any input/output process. The CPU will need to wait for unit Func1() to complete its input/output operation in such a condition. But, while Func1() completes its I/O operation, the CPU is free and not executing any thread. So, the efficiency of the CPU is decreased in the absence of multithreading.
In the case of multithreading, if a thread demands any I/O operation, then the CPU will let the thread perform its I/O operation, but it will start the execution of a new thread parallel. So, in this case, two threads are executing at the same time.
 */



//Multi Threading By extending thread class

class Work1 extends Thread{
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

class Work2 extends Thread{
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



public class Java_48_Thread_Extends_Thread_Class {
    public static void main(String[] args) {
        Work1 t1 = new Work1();
        Work2 t2 = new Work2();
        t1.start();
        t2.start();
    }
}
