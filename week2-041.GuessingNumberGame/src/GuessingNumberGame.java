// Guessing Game by Craig Hinkley 28/7/2019
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess = 0;
        int guessesMade = 0;  // number of guesses made by user

        // program your solution here. Do not touch the above lines!
        while(true) {
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            guessesMade++;
            
            if(guess == numberDrawn) {
                break;
            } else if(numberDrawn > guess) {
                System.out.println("The number is greater, guesses made " + guessesMade);
            } else {
                System.out.println("The number is lesser, guesses made " + guessesMade);
            }
        }
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
