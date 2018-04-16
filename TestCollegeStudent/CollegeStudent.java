/*	Andrew Cox
CIS 402
Assignment 2.2
Bellevue University
CollegeStudent.java
Constructor to be used by TestCollegeStudent.java
*/
import java.util.Calendar;
import java.util.GregorianCalendar;

// CollegeStudent Class
public class CollegeStudent {

	// Variables
	String first;
	String last;
	GregorianCalendar enrollment;
	GregorianCalendar graduation;

	// Constructor
	public CollegeStudent(String first, String last, GregorianCalendar enrollment) {

		this.first = first;
		this.last = last;
		this.enrollment = enrollment;
		graduation = (GregorianCalendar) enrollment.clone();
		graduation.add(Calendar.YEAR, 4);
	}

	// Gets first name
	public String getFirst() {

		return first;
	}
	
	// Sets first name
	public void setFirst(String first) {

		this.first = first;
	}

	// Gets last name
	public String getLast() {

		return last;
	}

	// Sets last name
	public void setLast(String last) {

		this.last = last;
	}

	// Gregorian Calendar!!!
	public GregorianCalendar getEnrollment() {

		return enrollment;
	}

	// Sets enrollment date
	public void setEnrollment(GregorianCalendar enrollment) {

		this.enrollment = enrollment;
	}

	// Gets graduation date
	public GregorianCalendar getGraduation() {

		return graduation;
	}

	// Sets graduation date
	public void setGraduation(GregorianCalendar graduation) {

		this.graduation = graduation;
	}
}
