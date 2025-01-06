// Import required classes for the program
import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {

    public static void main(String[] args) {
        // Function Call
        guessingNumberGame();
    }

    public static void guessingNumberGame() {
        try (Scanner sc = new Scanner(System.in)) {
            // Generating the random number using random() function..
            int number = 1 + (int)(100 * Math.random());

            // Given number of trials
            int n = 5;

            int i, guess;

            System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");

            // Iterate over number of Trials
            for (i = 0; i < n; i++) {
                System.out.println("Guess the number:");

                // Take input for guessing the number 
                guess = sc.nextInt();

                // If the number is guess correct...s
                if (number == guess) {
                    System.out.println("Congratulations! You guessed the number.");
                    break;
                } else if (number > guess && i != n - 1) {
                    System.out.println("The number is greater than " + guess);
                } else if (number < guess && i != n - 1) {
                    System.out.println("The number is less than " + guess);
                }
            }

            if (i == n) {
                System.out.println("You have exhausted number trials.");
                System.out.println("The number was " + number);
            }

            sc.close();
        }
    }
}