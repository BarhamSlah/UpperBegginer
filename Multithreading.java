When you create a custom class that extends Thread, both methods relate directly to your class

🚀 start() is Inherited: You get it automatically from the built-in Thread class. Call it (myObject.start()) to launch a brand-new thread.

🔄 run() is Overridden: You define your custom task inside public void run() so the new thread knows what code to execute.   

"When we extend Thread, our class gets the start() method. When we call t1.start(), Java creates a new thread, and that new thread automatically executes the run() method."    
    
    

Multithreading (Parallel): To make tasks execute simultaneously (interleaving output like "high" and "hello" side by side), you need to utilize threads.

*************************************************************************************************************************************************************************************************
void main()  {

Count count1 = new Count("Filp");
Thread thread1 = new Thread(count1);
thread1.start();

Count count2 = new Count("Flop");
Thread thread2 = new Thread(count2);
thread2.start();

}

//////////////
 
public class Count extends Thread  {

    String text;

    Count(String text) {
        this.text = text;
    }

@Override
    public void run() {
    for (int i = 1; i <= 5; i++) {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()  + " " +  text);
            // Thread.currentThread().getName() this is tell you this time queue of which thread by display name of thread
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

}
