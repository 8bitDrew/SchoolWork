// Andrew Cox
// CIS402
// Bellevue University
// Dollars.java
// calculates and displays the conversion of an entered number of dollars into currency denominations
// 100s, 50s, 20s, 10s, 5s, and 1s

import java.util.Scanner;
public class Dollars { //begin class
    public static void main(String[] args){



        //Create scanner object
        Scanner keyboard = new Scanner(System.in);


        //Prompt user for pay rate using data type int
        System.out.println("Please enter a dollar amount: ");
        int dollarAmount = keyboard.nextInt();


        //Integer data fields and calculations 
        int numTwenties = dollarAmount/20;
        int numTens = (dollarAmount - 20*numTwenties)/10;
        int numFives = (dollarAmount - (10*numTens + 20*numTwenties))/5;
        int numOnes = (dollarAmount - (10*numTens + 20*numTwenties + 5*numFives));

        
        //Echo input
        System.out.println("You have entered  $" + dollarAmount );

        //Print value denominations
        System.out.println("That is " + numTwenties + " twenties, " + numTens + " tens, " + numFives + " fives, and " + numOnes + " ones.");

    }//end main

}//end class 