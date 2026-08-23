import java.util.Scanner;

void main()  {

Scanner scanner = new Scanner(System.in);

Count count = new Count();
Thread thread = new Thread(count);
thread.setDaemon(true); // when main class finished it will stop every classes
thread.start();

System.out.println("Enter your name in 5 seconds if not you will lose");
System.out.print("What is your name ? ");
String name = scanner.nextLine();
System.out.println("Welcome " + name);

}

////////////////////

public class Count implements Runnable {

@Override
    public void run() {
    for (int i = 1; i <= 5; i++) {
        try {
            Thread.sleep(1000);
            if (i == 5) {
                System.out.println("\nYou lost");
            }

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

}
