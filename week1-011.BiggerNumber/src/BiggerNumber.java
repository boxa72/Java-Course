
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int second = Integer.parseInt(reader.nextLine());
        System.out.println("The bigger of the two numbers given was: " + (Math.max(first, second)));
    }
}
