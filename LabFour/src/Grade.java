import java.util.ArrayList;
import java.util.Scanner;

public class Grade {

	private ArrayList<Double> totalPointList = new ArrayList();
	private ArrayList<Double> earnedPointList = new ArrayList();
	private ArrayList<Double> assignPercList = new ArrayList();

	private double pointTot;
	private double earnedPt;
	private double assignPerc;

	public void setPointTot(double pointTot) {
		totalPointList.add(pointTot);
	}

	public void setEarnedPt(double earnedPt) {
		earnedPointList.add(earnedPt);
	}

	public void setAssignPerc(double assignPerc) {
		assignPercList.add(assignPerc);
	}

	public double acceptInput() {

		Scanner sc = new Scanner(System.in);

		int size;
		System.out.println("Enter the size of the total subjects");
		size = sc.nextInt();

		System.out.println("Enter Point total of subject ");
		// Here we are taking input from user and calling a setter function to set the
		// value of Total Points and adding into the list.
		for (int i = 0; i <= size - 1; i++) {

			pointTot = sc.nextDouble();
			setPointTot(pointTot);

		}

		System.out.println("Enter Earned Point of subject ");
		// Here we are taking input from user and calling a setter function to set the
		// value of Earned Points and adding into the list.
		for (int i = 0; i <= size - 1; i++) {

			earnedPt = sc.nextDouble();
			setEarnedPt(earnedPt);

		}
		System.out.println("Enter Assigned Percentage of subject ");
		// Here we are taking input from user and calling a setter function to set the
		// value of Earned Percentage and adding into the list.
		for (int i = 0; i <= size - 1; i++) {

			assignPerc = sc.nextDouble();
			setAssignPerc(assignPerc);

		}

		double totalWeigh = calculateTotalgrade(totalPointList, earnedPointList, assignPercList);

		return totalWeigh;

	}

	// This method is calculating total grade and based on the grade it shows the
	// class which is achieved
	public double calculateTotalgrade(ArrayList<Double> pointTotalL, ArrayList<Double> earnedPointsL,
			ArrayList<Double> assignmentPercL) {
		double totalWeightGrade = 0;

		for (int i = 0; i <= pointTotalL.size() - 1; i++) {

			double total = 0;
			total = earnedPointsL.get(i) / pointTotalL.get(i) * (assignmentPercL.get(i) / 100) * 100;

			totalWeightGrade = totalWeightGrade + total;
		}

		System.out.println("Total of Grade: " + totalWeightGrade);

		return totalWeightGrade;

	}

	public void evaluateClass(double totalGrade) {

		if (totalGrade <= 100 && totalGrade >= 90) {
			System.out.println("Class A achieved");
		} else if (totalGrade <= 89.9999 && totalGrade >= 80) {
			System.out.println("Class B achieved");
		}

		else if (totalGrade < 80 && totalGrade >= 70) {
			System.out.println("Class C achieved");
		} else if (totalGrade < 70 && totalGrade >= 60) {
			System.out.println("Class D achieved");
		} else {
			System.out.println("Class F achieved");
		}

	}

}
