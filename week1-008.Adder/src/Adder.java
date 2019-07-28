
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Enter an integer to add: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Enter another integer to add: ");
        int second = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers: " + (first + second));
    }
}
