
public class GradeCalculate {

	public double calculateTotalgrade(double pointTot, double earnedPt, double assignPerc) {

		try {
			//This is the method to calculate the Total weighted Grade
			double totalWeightGrade;
			totalWeightGrade = earnedPt / pointTot * (assignPerc / 100) * 100;
			return totalWeightGrade;
		}

		catch (NumberFormatException ex) {
			System.out.println("Exception : Please enter valid Numeric Inputs");
			throw ex;
		}

	}

}
