/*	Andrew Cox
	Week 3 debugged solution
*/

import java.util.Random;

public class IntArrayRandom {


	public static void main(String[] args) {

		System.out.println("This program generates random numbers and stops at the end of the array.");

		Random randomNumberGenerator = new Random();

		int counter;
		int[] numberArray = new int[10] ;


		for (counter = 0; counter < numberArray.length; counter++) {

			numberArray[counter] = randomNumberGenerator.nextInt(50);

		}
		//second for loop is checking the length of the array to avoid out of bounds exceptions
		for (counter = 0; counter < numberArray.length; ++counter) {

			System.out.println("\nRandom Number Generated : " + numberArray[counter]);


			if (counter == numberArray.length + 1) {
				System.out.println("\nWe have reached our array limit of integers");
				break;
			}
		
		}
	}
}