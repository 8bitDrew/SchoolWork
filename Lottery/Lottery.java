/*	Andrew Cox
	CIS 402
	Bellevue University
	Lottery.java
*/

import java.util.Random;
import java.util.Scanner;

public class Lottery {
	
	public static void main(String[] args) {

		// Declaring variables and new Random object
		int[] randomNumber = new int[4];
		Random random = new Random();
		int[] userInput = new int[4];
		Scanner input = new Scanner(System.in);
		
		// for loop to gather user input
		for(int i =0; i<4;i++) {
				
			System.out.printf("Enter guess # %d: ",i+1);
			userInput[i] = input.nextInt();
		}
		
		// for loop to gather random numbers
		for(int i =0; i<4;i++) {
			randomNumber[i] = random.nextInt(10);
		}
	
		// Variable to hold number of correct guesses
		int correctCount=0;

		// Output users guesses
		System.out.println("Your guesses are:");
		for(int i=0;i<4;i++) {
			System.out.printf("%d\t",userInput[i]);
		}

		// Output random numbers
		System.out.println();
		System.out.println("Random numbers are:");

		for(int i=0;i<4;i++) {
			System.out.printf("%d\t",randomNumber[i]);
		}

		System.out.println();

		// Comparison time!
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(randomNumber[i] == userInput[j]) {
					correctCount++;
					userInput[j] = 11;
					break;
				}
			}
		}

		// Switch statement to display score
		System.out.println("Your Score is: ");

		switch(correctCount)
		{
			case 4:
				System.out.printf("1,000,0000");
				break;
			case 3:
				System.out.printf("2000");
				break;
			case 2:
				System.out.printf("100");
				break;
			case 1:
				System.out.printf("5");
				break;
			case 0:
			default:
			System.out.printf("0");

		}
	}
} 