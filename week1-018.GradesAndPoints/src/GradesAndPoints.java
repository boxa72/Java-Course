
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points: ");
        int points = Integer.parseInt(reader.nextLine());
        if(points <= 29) {
            if(points >= 0) {
                System.out.println("failed");
            }
        }
        else if(points <= 34) {
            if(points == 30) {
                
            }
            System.out.println("1");
        }
        else if(points <= 39) {
            if(points == 35) {
                
            }
            System.out.println("2");
        }
        else if(points <= 44) {
            if(points == 40) {
                
            }
            System.out.println("3");
        }
        else if(points <= 49) {
            if(points == 45) {
                
            }
            System.out.println("4");
        }
        else if(points <= 60) {
            if(points == 50) {
                
            }
            System.out.println("5");
        }
        

    }
}
