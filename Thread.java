What is a Thread? A thread is the smallest unit of execution inside a program or process. It allows a single software application to perform multiple operations at the same time.

Multitasking vs. Multi-threading:

Multitasking runs multiple separate software applications on your OS using CPU time-sharing.

Multi-threading breaks down a single program into smaller parts so it can handle multiple things simultaneously (like rendering text, checking errors, and playing sound in an editor

******************************************************************************************************************************************************************************************************    

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
