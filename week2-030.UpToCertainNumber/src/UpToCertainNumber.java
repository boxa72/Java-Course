
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int number = 0;
        int count = 1;
        
        System.out.print("Enter the upper limit: ");
        number = Integer.parseInt(reader.nextLine());
        
        while(count <= number) {
            System.out.println(count);
            count++;
        }
        
    }
}
