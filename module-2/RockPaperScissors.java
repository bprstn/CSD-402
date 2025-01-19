// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment: Rock-Paper-Scissors

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Display a personalized welcome message
        System.out.println("Welcome to Brian's Rock-Paper-Scissors Game!");
        System.out.println("Let's see if you can beat the computer!");

        // Generate a random number between 1 and 3 for the computer's choice
        int computerChoice = (int) (Math.random() * 3) + 1;

        // Prompt the user to enter their choice
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors:");
        int userChoice = input.nextInt();

        // Display the computer's and user's choices
        System.out.println("The computer chose: " + choiceToString(computerChoice));
        System.out.println("You chose: " + choiceToString(userChoice));

        // Determine and display the result
        String result = determineWinner(computerChoice, userChoice);
        System.out.println(result);

        // Close the scanner
        input.close();
    }

    // Method to convert choice numbers to strings
    public static String choiceToString(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Invalid";
        };
    }

    // Method to determine the winner
    public static String determineWinner(int computer, int user) {
        if (computer == user) {
            return "It's a tie!";
        } else if ((computer == 1 && user == 3) || 
                   (computer == 2 && user == 1) || 
                   (computer == 3 && user == 2)) {
            return "The computer wins!";
        } else {
            return "You win!";
        }
    }
}

