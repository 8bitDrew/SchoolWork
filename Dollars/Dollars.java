/* 	Andrew Cox
 	CIS402
	Bellevue University
	Assignment 1.1
	Dollars.java
	Calculates and displays the conversion of an entered number of dollars 
	into currency denominations - 100s, 50s, 20s, 10s, 5s, and 1s.  Obtains 
	all inputs and display all outputs using dialog boxes
*/

// Import to allow use of the JOptionPane
import javax.swing.*;

// Creating the Dollars class
public class Dollars {
	
	// Main method
	public static void main(String[] args) {
		
		// Declare variables to hold the input from the user
		int dollar;
		String dollarString;
		
		// Get input from the user
		dollarString = JOptionPane.showInputDialog(null, "Please enter a whole dollar amount.");
		
		//Convert the input to an Integer
		dollar = Integer.parseInt(dollarString);
		
		// Perform necessary math to calculate the bill denominations
		int numHundreds = dollar/100;
		int remHundreds = (dollar % 100);
		int numFifties = remHundreds / 50;
		int remFifties = (dollar % 50);
		int numTwenties = remFifties / 20;
		int remTwenties = (dollar % 20);
		int numTens = remTwenties / 10;
		int remTens = (dollar % 10);
		int numFives = remTens / 5;
		int remFives = (dollar % 5);
		int numOnes = remFives / 1;
		
		// Output the results to the user
		JOptionPane.showMessageDialog(null, "The dollar amount entered is $" + dollar);
		JOptionPane.showMessageDialog(null, "This breaks down to: \n" + numHundreds + " $100 dollar bills\n" + 
			numFifties + " $50 dollar bills\n" + numTwenties + " $20 dollar bills\n" + numTens + " $10 dollar bills\n" +
			numFives + " $5 dollar bills\n" + numOnes + " $1 dollar bills"); 
	}

}
