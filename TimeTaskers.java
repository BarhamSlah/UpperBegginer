import java.util.Timer;
import java.util.TimerTask;

public class Main{
    public static void main()  {

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {

            int number = 5;
            @Override
            public void run() {
                number --;
                System.out.println("I love you 😘");
                if (number == 0) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("The task was done ");
                    } catch (Exception e){
                        System.out.println("Something went wrong");
                    }
                    timer.cancel();
                }
            }
        };

        timer.schedule(timerTask , 500 , 1000);

    }
}

