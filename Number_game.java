import java.util.Random;
import java.util.Scanner;

public class Number_game {
    public static void main(String[] args) {
        int score = 0;
        int roundsWon = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;

            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("Welcome to the guessing game! You have " + maxAttempts + " attempts to guess the number.");

            while (attempts < maxAttempts) {
                System.out.print("Guess a number between 1 and 100: ");
                int userGuess = scanner.nextInt();

                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += maxAttempts - attempts;
                    roundsWon++;
                    break;
                }
                else if (userGuess > randomNumber) {
                    System.out.println("Too high, try again.");
                }
                else {
                    System.out.println("Too low, try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you didn't guess the number in " + maxAttempts + " attempts. The correct answer was " + randomNumber + ".");
            }

            System.out.print("Do you want to play again? (y/n): ");
            String response = scanner.next();

            if (response.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Your final score is " + score + " and you won " + roundsWon + " rounds.");
    }
}