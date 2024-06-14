import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the range for the number (10 for 1 to 10): ");
        int numberRange = scanner.nextInt();

        int targetNumber = random.nextInt(numberRange) + 1;

        System.out.println("A number between 1 and " + numberRange + " has been generated.");

        int attempts = 0;
        while (true) {
            System.out.print("Guess a number: ");
            int guessedNumber = scanner.nextInt();
            attempts++;

            if (guessedNumber > targetNumber) {
                System.out.println("Your guess is too high! Try again.");
            } else if (guessedNumber < targetNumber) {
                System.out.println("Your guess is too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number!");
                System.out.println("Attempts: " + attempts);
                break;
            }
        }

        scanner.close();
    }
}