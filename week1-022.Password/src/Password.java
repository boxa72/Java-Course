import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        String userPass;
        
        // Get input until password is right
        while (true) {
            // Get input
            System.out.print("Type the password: ");
            userPass = reader.nextLine();

            // Check if right password
            if (userPass.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: 3 people can keep a secret, if 2 of them are dead!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}