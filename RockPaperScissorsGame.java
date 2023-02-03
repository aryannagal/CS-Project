import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerChoice, computerChoice;
        String playerMove, computerMove;

        System.out.println("Welcome to Rock-Paper-Scissors!");

        while (true) {
            System.out.print("Enter your choice (1 for Rock, 2 for Paper, 3 for Scissors): ");
            playerChoice = input.nextInt();

            computerChoice = (int) (Math.random() * 3) + 1;
            if (computerChoice == 1) {
                computerMove = "Rock";
            } else if (computerChoice == 2) {
                computerMove = "Paper";
            } else {
                computerMove = "Scissors";
            }

            if (playerChoice == 1) {
                playerMove = "Rock";
            } else if (playerChoice == 2) {
                playerMove = "Paper";
            } else if (playerChoice == 3) {
                playerMove = "Scissors";
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("You chose " + playerMove + " and the computer chose " + computerMove + ".");

            if (playerChoice == computerChoice) {
                System.out.println("It's a draw!");
            } else if (playerChoice == 1 && computerChoice == 3 ||
                    playerChoice == 2 && computerChoice == 1 ||
                    playerChoice == 3 && computerChoice == 2) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = input.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("Thanks for playing!");
        input.close();
    }
}
