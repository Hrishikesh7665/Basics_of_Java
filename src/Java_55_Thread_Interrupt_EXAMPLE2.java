/*

Here the thread works normally because no exception occurred during the thread's execution, so the interrupt() only sets the value of the thread flag to true.

 */



class TestThread2 extends Thread{
    public void run(){
        for (int i=0;i<10;++i){
            System.out.println(i);
        }
    }
}

public class Java_55_Thread_Interrupt_EXAMPLE2 {
    public static void main(String[] args) {
        TestThread2 t= new TestThread2();
        t.start();
        t.interrupt();
        System.out.println("Main Thread");

    }
}
