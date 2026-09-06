import java.util.Scanner;

// INSTEAD OF THIS
public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to the main program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}

// DO THIS

void main() {
    IO.println("welcome to the main program");
    var name = IO.readln("Enter your name: ");
    IO.println(name);
