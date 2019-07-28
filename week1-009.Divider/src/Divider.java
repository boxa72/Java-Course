
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Enter a qoutient: ");
        double first = Double.parseDouble(reader.nextLine());
        System.out.print("Enter adivisor: ");
        double second = Double.parseDouble(reader.nextLine());
        System.out.println("Division: " + first + " / " + second + " = " + (first / second));
    }
}
