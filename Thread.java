import java.util.Scanner;

void main(String[] args) {

    // Runnable is work but Thread is worker
    Delay delay = new Delay();
    Thread thread = new Thread(delay);
    thread.setDaemon(true);  // when the main would be 
    thread.start();

    Scanner scanner = new Scanner(System.in);
    System.out.println("You have 5 seconds to write your name  ");
    System.out.print("Enter your name : ");
    String name = scanner.nextLine();

    System.out.println("Welcome " + name);
    scanner.close();
}

///////////

public class Delay implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                Thread.sleep(1000);
                if (i == 5) {
                    System.out.println("Time's up");
                    System.exit(0);
                }
            }
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
*****************************************************************************************************************