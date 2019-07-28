
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String user1 = "alex";
        String pw1 = "mightyducks";
        String user2 = "emily";
        String pw2 = "cat";

        System.out.print("Type your username: ");
        String username = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();

        if ((username.equals(user1) || username.equals(user2)) && (password.equals(pw1) || password.equals(pw2))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password are invalid!");
        }
    }
}
