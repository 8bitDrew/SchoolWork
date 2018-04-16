/*	Andrew Cox
	CIS 402
	Bellevue University
	Purchase.java
*/

import java.util.Scanner;

class Purchase {
	
	public static void main(String args[]) {
		
		// Instantiate new CreatePurchase object
		CreatePurchase purchase=new CreatePurchase();
		// Instantiate new Scanner object
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the details: ");
		
		while(true) {
			// Prompt for invoice number
			System.out.print("Enter invoice number [between 1000 and 8000]: ");
			// Grab user input
			int i=s.nextInt();
			// Validate invoice number
			if(i>=1000 && i<=8000) {
				purchase.setInvoiceNumber(i);
				break;
			}
			else System.out.println("Wrong entry,enter again");
		}
		while(true) {
			// Prompt for purchase price
			System.out.print("Enter amount of purchase[should be non-negative]: ");
			// Grab user input
			double i=s.nextDouble();
			// Validate purchase price
			if(i>=0) {
				purchase.setAmountOfSales(i);
				break;
			}
			else System.out.println("Wrong entry,enter again");
		}
		// Call method to display output
		purchase.display();
	}
}