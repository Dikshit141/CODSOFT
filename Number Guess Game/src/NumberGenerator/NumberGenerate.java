package NumberGenerator;

import java.util.Random;
import java.util.Scanner;

public class NumberGenerate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int minRange = 0;
		int maxRange = 100;
		int maxAttempts = 5;
		
		System.out.println("         Welcome to Number Guess Game             ");
		
		boolean playAgain = true;
		while(playAgain) {
			int generateNumber = random.nextInt(maxRange - minRange + 2) + minRange;
			System.out.println("Random No. between " + minRange + " and " + maxRange + " has been generated.");
			
			int attempts = 0;
			boolean correctGuess = false;
			while(attempts < maxAttempts && !correctGuess) {
				System.out.println("Enter your Guessed No. :");
				int playerGuess = scanner.nextInt();
				attempts++;
				
				if (playerGuess == generateNumber) {
					System.out.println("Congratulations, You Guessed the correct number!!");
					correctGuess = true;
				} else if (playerGuess < generateNumber) {
					System.out.println("Unfortunately, You guessed the number which is very low!!");
				} else {
					System.out.println("Unfortunately, You guessed the number whch is very high!!");
				}
			} 
			
			if(correctGuess) {
				System.out.println("You guessed the number in " + attempts + " attempts.");
			} else {
				System.out.println("Sorry, maximum guess limits.");
				System.out.println("Correct number was " + generateNumber);
			}
			
			System.out.println("Want to play again? (yes/no) ");
			String playAgainResponse = scanner.next();
			playAgain = playAgainResponse.equalsIgnoreCase("yes");
			
			System.out.println();
		}
		
		System.out.println("Thanks for playing!!");
		scanner.close();
		
	}

}
