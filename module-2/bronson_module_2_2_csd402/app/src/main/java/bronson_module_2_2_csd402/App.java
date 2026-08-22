/*
 * Wendy Bronson
 * Bellevue University
 * CSD-402
 * Module 2.2 Programming Assignment
 * August 22, 2026
 *
 * Purpose:
 * Play Rock-Paper-Scissors between the user and the computer.
 * The program generates a random selection, asks the user for
 * a selection, and displays both choices and the game result.
 *
 * Course examples provided by Professor Darrell Payne were
 * used as a guide for the Java concepts in this program.
 */

package bronson_module_2_2_csd402;

import javax.swing.JOptionPane;

public class App {

    /*
     * This method was included in the Gradle project template.
     * It returns the name of the game.
     */
    public String getGreeting() {
        return "Rock-Paper-Scissors";
    }

    public static void main(String[] args) {

        String gameTitle = new App().getGreeting();

        // Generate a random number from 1 through 3.
        int computerChoice = (int) (Math.random() * 3) + 1;

        // Ask the user to select Rock, Paper, or Scissors.
        String userInput = JOptionPane.showInputDialog(
                null,
                "Enter 1 for Rock, 2 for Paper, or 3 for Scissors:",
                gameTitle,
                JOptionPane.QUESTION_MESSAGE
        );

        // End the program if the user cancels the game.
        if (userInput == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "The game was canceled.",
                    gameTitle,
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        int userChoice = Integer.parseInt(userInput);

        // Verify that the user entered 1, 2, or 3.
        if (userChoice < 1 || userChoice > 3) {
            JOptionPane.showMessageDialog(
                    null,
                    "Invalid selection. Please run the program again "
                            + "and enter 1, 2, or 3.",
                    gameTitle,
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        String computerSelection = "";
        String userSelection = "";

        // Convert the computer's number into its selection.
        switch (computerChoice) {
            case 1:
                computerSelection = "Rock";
                break;
            case 2:
                computerSelection = "Paper";
                break;
            case 3:
                computerSelection = "Scissors";
                break;
        }

        // Convert the user's number into the user's selection.
        switch (userChoice) {
            case 1:
                userSelection = "Rock";
                break;
            case 2:
                userSelection = "Paper";
                break;
            case 3:
                userSelection = "Scissors";
                break;
        }

        String gameResult;

        // Compare the selections and determine the result.
        if (userChoice == computerChoice) {
            gameResult = "The game is a tie!";
        }
        else if ((userChoice == 1 && computerChoice == 3)
                || (userChoice == 2 && computerChoice == 1)
                || (userChoice == 3 && computerChoice == 2)) {
            gameResult = "You win!";
        }
        else {
            gameResult = "The computer wins!";
        }

        // Display both selections and the final result.
        JOptionPane.showMessageDialog(
                null,
                "Computer selected: " + computerSelection
                        + "\nYou selected: " + userSelection
                        + "\n\n" + gameResult,
                gameTitle + " Results",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}