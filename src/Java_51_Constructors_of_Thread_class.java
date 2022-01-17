/*
There Are So Many Constructors Available For Thread Class But, Here We Only Talk About The Most Used Ones.

Below are the commonly used constructors of the thread class:
-----------------------------------------------------------------

Thread ( )
Thread ( string )
Thread ( Runnable r )
Thread ( Runnable r, String name )

 */

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}
public class Java_51_Constructors_of_Thread_class {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Arjun");
        MyThr t2 = new MyThr("Bhim");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());

    }
}