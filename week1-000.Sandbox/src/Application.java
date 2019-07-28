
import java.util.Scanner;

// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

public class Application {
    private static void printStars(int amount) {
        int i = 0;
        while(i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
    
    private static void printWhitespace(int amount) {
         int i = 0;
         while(i < amount) {
             System.out.print(" ");
             i++;
         }
    }
    
    private static void printRightTriangle(int height) {
        int i = 0;
        while(i < height) {
            printWhitespace(height - 1);
            printStars(i + 1);
            i++;
        }
    }
    
    /*private static void printSquares(int sideSize) {
        int i = 0;
        while(i < sideSize) {
            printStars(sideSize);
            i++;
        }
    }
    
    private static void printRectangle(int width, int height) {
        int i = 0;
        
        while(i < height) {
            printStars(width);
            i++;
        }
    }
    
    private static void printTriangle(int height) {
        int i = 0;

        while(i < height) {
            printStars(i + 1);
            i++;
        }
    }*/

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Write the code here. You can run the code by 
        // selecting Run->Run File from the menu or by pressing Shift+F6
        printRightTriangle(4);
        /*printStars(4);
        System.out.println("");
        printSquares(4);
        System.out.println("");
        printRectangle(9, 4);
        System.out.println("");
        printTriangle(6);
        System.out.println("");*/
    }
}
