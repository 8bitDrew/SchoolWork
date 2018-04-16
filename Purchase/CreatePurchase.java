/*	Andrew Cox
	CreatePurchase.java
*/

import java.text.DecimalFormat;

class CreatePurchase {

	// Declare class variables
	int invoiceNumber;
	double amountOfSales;
	double amountOfSalesTax;
	static double rate=7.5;
	
	// Method to set the invoice number
	public void setInvoiceNumber(int i) {
		invoiceNumber=i;
	}
	
	// Method to set the sales amount and sales tax
	public void setAmountOfSales(double a) {
		amountOfSales=a;
		amountOfSalesTax=(7.5*a)/100;
	}
	
	public void display() {
		
		// Instantiate new DecimalFormat object
		DecimalFormat df = new DecimalFormat();
		// Force the output to display exactly 2 decimal places
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		// Output the results
		System.out.println("The deatils are:");
		System.out.println("Invoice Number: "+invoiceNumber);
		System.out.println("Amount of Sales: $"+(df.format(amountOfSales)));
		System.out.printf("Amount of sales tax: $"+ (df.format(amountOfSalesTax)));
	}
}