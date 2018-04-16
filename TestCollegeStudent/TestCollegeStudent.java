/*	Andrew Cox
CIS 402
Assignment 2.2
TestCollegeStudent.java
Prompts user for data for 2 college students
- First and Last name, and enrollment day/month/year
Outputs data to user
*/

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.*;

public class TestCollegeStudent {

	public static void main(String[] args) {

		// Variables to hold necessary values
		String first, last, sMonth, sDay, sYear;
		int month, day, year;
		// Prompt for name of student 1
		first = JOptionPane.showInputDialog(null, "Enter the first name of student 1: ");
		last = JOptionPane.showInputDialog(null, "Enter the last name of student 1: ");

		// Prompt for enrollment date of student 1, parse input to int data type
		sMonth = JOptionPane.showInputDialog(null, "Enter the enrollment month of student 1: ");
		month = Integer.parseInt(sMonth);

		sDay = JOptionPane.showInputDialog(null, "Enter the enrollment day of student 1: ");
		day = Integer.parseInt(sDay);

		sYear = JOptionPane.showInputDialog(null, "Enter the enrollment year of student 1: ");
		year = Integer.parseInt(sYear);

		// Create new instance of CollegeStudent, passing relevant values
		CollegeStudent one = new CollegeStudent(first, last , new GregorianCalendar(year, month - 1, day));

		// Prompt for name of student 2
		first = JOptionPane.showInputDialog(null, "Enter the first name of student 2: ");
		last = JOptionPane.showInputDialog(null, "Enter the last name of student 2: ");

		// Prompt for enrollment date of student 2, parse input to int data type
		sMonth = JOptionPane.showInputDialog(null, "Enter the enrollment month of student 2: ");
		month = Integer.parseInt(sMonth);

		sDay = JOptionPane.showInputDialog(null, "Enter the enrollment day of student 2: ");
		day = Integer.parseInt(sDay);

		sYear = JOptionPane.showInputDialog(null, "Enter the enrollment year of student 2: ");
		year = Integer.parseInt(sYear);

		// Create new instance of CollegeStudent, passing relevant values
		CollegeStudent two = new CollegeStudent(first, last , new GregorianCalendar(year, month - 1, day));

		// Output the data on both students
		JOptionPane.showMessageDialog(null, one.getFirst() + " " + one.getLast() + " enrolled "
				   + one.getEnrollment().getDisplayName(Calendar.MONTH,2,new Locale("English")) + " "
				   + one.getEnrollment().get(Calendar.DAY_OF_MONTH) + " "
				   + one.getEnrollment().get(Calendar.YEAR) + " and will be graduating "
				   + one.getGraduation().getDisplayName(Calendar.MONTH,2,new Locale("English")) + " "
				   + one.getGraduation().get(Calendar.DAY_OF_MONTH) + " "
				   + one.getGraduation().get(Calendar.YEAR));
		JOptionPane.showMessageDialog(null, two.getFirst() + " " + two.getLast() + " enrolled "
				   + two.getEnrollment().getDisplayName(Calendar.MONTH,2,new Locale("English")) + " "
				   + two.getEnrollment().get(Calendar.DAY_OF_MONTH) + " "
				   + two.getEnrollment().get(Calendar.YEAR) + " and will be graduating "
				   + two.getGraduation().getDisplayName(Calendar.MONTH,2,new Locale("English")) + " "
				   + two.getGraduation().get(Calendar.DAY_OF_MONTH) + " "
				   + two.getGraduation().get(Calendar.YEAR));
	}
}
