import java.util.Scanner;


public class HiLo {

	public static void main(String[] args) {
		
		// get ready for user input
		Scanner scan = new Scanner(System.in);
		
		// play again string
		String playAgain = "";
		
		// game loop
		do {
		
			// new random number
			int randNum = (int)(Math.random()*100 + 1);
			
			int guess = 0;
			int attempts = 0;
			
			while ( guess != randNum ) {
				System.out.println("Guess a number between 1 and 100: ");
				guess = scan.nextInt();
				attempts++;
				
				if (guess < randNum)
					System.out.println(guess + " is too low.  Try again.");
				
				else if (guess > randNum)
					System.out.println(guess + " is too high.  Try again.");
				
				else
					System.out.println(guess + " is correct. You win nothing.");
			} // end of while loop
			
			System.out.println("You took " + attempts + " attempts.  Good job!");
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
			
		} while (playAgain.equalsIgnoreCase("y"));
		
		System.out.println("Thank you for playing. Deuces!");

	}

}