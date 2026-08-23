void main()  {

Count count1 = new Count("Filp");
Thread thread1 = new Thread(count1);
thread1.start();

Count count2 = new Count("Flop");
Thread thread2 = new Thread(count2);
thread2.start();

}

//////////////

public class Count implements Runnable {

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
