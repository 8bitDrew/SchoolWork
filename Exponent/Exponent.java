/* 	Andrew Cox
	CIS 402
	Bellevue University
	Exponent.java
	Obtains a double input via dialog box
	Outputs the square value and cube value
*/

import javax.swing.*;
import java.lang.Math;

public class Exponent {

	public static void main(String[] args) {
		
		// Variables to hold user input(string) and hold the parsed value(double)
		double numDouble;
		String numInput;
		// Prompt user to enter a decimal value
		numInput = JOptionPane.showInputDialog(null, "Please enter a number with a decimal value (i.e., 1.25): ");
		// Parse the input to a Double
		numDouble = Double.parseDouble(numInput);
		// Create instances to allow the non-static methods to be called
		Exponent square = new Exponent();
		Exponent cube = new Exponent();
		// Call the non-static methods for square and cube
		square.getSquare(numDouble);
		cube.getCube(numDouble);		
	}
	
	public void getSquare(double numDub) {
		// Math operation to get the square value
		double square = Math.pow(numDub, 2);
		// Output the result
		JOptionPane.showMessageDialog(null, "The square value of " + numDub + " is " + square);	
	}
	
	public void getCube(double numDub) {
		// Math operation to get the cube value
		double cube = Math.pow(numDub, 3);
		// Output the result
		JOptionPane.showMessageDialog(null, "The cube value of " + numDub + " is " + cube);
	}
}