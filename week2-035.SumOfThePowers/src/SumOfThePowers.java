
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int sum, number;
        
        System.out.print("Type a number: ");
        number = Integer.parseInt(reader.nextLine());
        int i = 0;
        sum = 0;
        while(i <= number) {
            sum += (int)Math.pow(2, i);
            i++;
        }
        System.out.println("The result is: " + sum);
    }
}
