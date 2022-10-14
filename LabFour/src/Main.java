
/*
 *  ASSIGNMENT 4
 *  NAME : Hemangi Ramesh Ahire
 *  STUDENT ID: 002747508
 *  SECTION NO: 8
 * 
 * 
 * This program asks user to enter the three inputs point total, Earned Points and Assignment Percentage  then add those respective attributes into the List and 
 * calculate Total Weighted Grade and based on the total weighted grade it displays the class which is achieved
 * In this program we have used ArrayList. During it accepts the size from the user for the total subjects and based on the size it adds other 3 inputs into the ArrayList
 */

public class Main {
	
	public static void main(String[] args) {

		Grade grade = new Grade();

		// This method is calculating total grade
		double totalGradeVal = grade.acceptInput();

		// the total grade is passed in this method and based on the grade it shows the
		// class which is achieved
		grade.evaluateClass(totalGradeVal);

	}

}
