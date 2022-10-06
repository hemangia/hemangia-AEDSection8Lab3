/*
 *  ASSIGNMENT 3
 *  NAME : Hemangi Ramesh Ahire
 *  STUDENT ID: 002747508
 *  SECTION NO: 8
 * 
 * 
 * This program asks user to enter the three inputs point total, Earned Points and Assignment Percentage and 
 * calculate Total Weighted Grade and based on the total weighted grade it displays the class which is achieved
 */

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		 double[] pointTotal = new double[8];
		 double[] earnedPoints = new double[8];
		 double[] assignmentPerc = new double[8];
		 double totalWeightedGrade;
		 
		 Grade grade = new Grade();
		 Scanner sc= new Scanner(System.in);
		 
                //Here we are taking input from user and calling a setter function to set the value of Total Points 
		 
				 System.out.println("Please enter total points of 8 subjects");
				 for(int i=0; i<=pointTotal.length-1;i++) {
					 
					 double value = sc.nextDouble();
					 grade.setTotal(pointTotal , i , value);
					  
				 }
				 

	                //Here we are taking input from user and calling a setter function to set the value of Earned Points
				 
				 System.out.println("Please enter earned points of 8 subjects");
				 for(int i=0; i<=earnedPoints.length-1;i++) {
					 double value = sc.nextDouble();
					 grade.setEarnedPoints(earnedPoints , i , value);
					  
				 }
				 
				  //Here we are taking input from user and calling a setter function to set the value of Earned Percentage
				 
				 System.out.println("Please enter total percentage of 8 subjects");
				 for(int i=0; i<=assignmentPerc.length-1;i++) {
					 double value = sc.nextDouble();
					 grade.setAssignmentPerc(assignmentPerc , i , value);
					  
				 }
				 
				 //This method is calculating total grade and based on the grade it shows the class which is achieved
				 grade.calculateTotalgrade(pointTotal, earnedPoints, assignmentPerc);
				 
		
	}
}
