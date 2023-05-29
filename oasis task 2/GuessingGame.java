import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
 public static void main(String[] args) {
 // Set the maximum number of attempts and rounds
 int maxAttempts = 5;
 int maxRounds = 3;
 // Initialize the score and points per round
 int score = 0;
 int pointsPerRound = 10;
 // Create a random number generator and a scanner for user input
 Random rand = new Random();
 Scanner scanner = new Scanner(System.in);
 // Loop through the rounds
 for (int round = 1; round <= maxRounds; round++) {
 // Initialize the number of attempts and generate a random number to guess
 int attempts = 0;
 int numberToGuess = rand.nextInt(100) + 1;
 System.out.println("Round " + round + ": Guess a number between 1 and 100");
 // Loop until the user runs out of attempts
 while (attempts < maxAttempts) {
 // Get the user's guess
 int guess = scanner.nextInt();
 // Increment the number of attempts
 attempts++;
 // Check if the guess is correct
 if (guess == numberToGuess) {
 System.out.println("You guessed the number in " + attempts + " attempts!");
 // Update the score based on the number of attempts
 score += pointsPerRound - attempts + 1;
 break;
 } else if (guess < numberToGuess) {
 System.out.println("The number is higher than your guess.");
 } else {
 System.out.println("The number is lower than your guess.");
 }
 }
 // Check if the user ran out of attempts
 if (attempts == maxAttempts) {
 System.out.println("You couldn't guess the number in " + maxAttempts + " attempts. The number was " + numberToGuess);
 }
 }
 // Print the final score
 System.out.println("Game over! Your score is: " + score);
 }
}
