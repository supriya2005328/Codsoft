import java.util.Random;
import java.util.Scanner;

class guessing_the_number_game {
    public static void main(String[] args) {
        Random rand = new Random();
        int Guess_num = rand.nextInt(100) + 1;
        int Total_attempts = 0;
        int max_Attempts = 8;
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO GUESSING GAME!!");
        System.out.println("YOU HAVE " + max_Attempts + " ATTEMPTS TO GUESS THE NUMBER.");

        while (Total_attempts < max_Attempts) {
            System.out.print("ENTER GUESS: ");
            int user_Guess = scanner.nextInt();
            Total_attempts++;

            if (user_Guess == Guess_num) {
                System.out.println("CONGRATULATIONS! YOU GUESSED THE NUMBER IN " + Total_attempts + " ATTEMPTS.");
                break;
            } else if (user_Guess < Guess_num) {
                System.out.println(" LOW! please Try again.");
            } else {
                System.out.println(" HIGH! please Try again.");
            }
        }

        if (Total_attempts == max_Attempts) {
            System.out.println("GAME OVER THE NUMBER WAS" + Guess_num + ".");
        }

        System.out.print("DO YOU WANT TO PLAY AGAIN?? (1.yes\n2.no): ");
        String playAgain = scanner.next();
        if (playAgain.equalsIgnoreCase("1")) {
            main(args);
        }
		else
		{
			System.out.println("OKAY!!! PLEASE EXIT THE GAME");
		}
    }
}

