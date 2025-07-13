import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int maxNumber = 100;
        int difficultyMultiplier = 10;

        // Choose difficulty
        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Choose Difficulty Level: ");
        System.out.println("1. Easy (1 - 50)");
        System.out.println("2. Medium (1 - 100)");
        System.out.println("3. Hard (1 - 200)");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                maxNumber = 50;
                difficultyMultiplier = 5;
                break;
            case 2:
                maxNumber = 100;
                difficultyMultiplier = 10;
                break;
            case 3:
                maxNumber = 200;
                difficultyMultiplier = 15;
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Medium.");
                maxNumber = 100;
                difficultyMultiplier = 10;
        }

        int numberToGuess = rand.nextInt(maxNumber) + 1;
        int guess;
        int attempts = 0;

        System.out.println("\nI'm thinking of a number between 1 and " + maxNumber + ". Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("🔼 Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("🔽 Too high!");
            } else {
                System.out.println("🎉 Correct! You got it in " + attempts + " attempts.");
                int score = Math.max(100 - (attempts * difficultyMultiplier), 0);
                System.out.println("🏆 Your score: " + score);
            }

        } while (guess != numberToGuess);

        sc.close();
    }
}
