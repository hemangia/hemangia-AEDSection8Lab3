
public class Grade {
	
	public void setTotal( double[] pointTotal, int index,  double value) {
		pointTotal[index]=value;
	}
	
	public void setEarnedPoints( double[] earnedPoints, int index,  double value) {
		earnedPoints[index]=value;
	}
	
	public void setAssignmentPerc( double[] assignmentPerc, int index,  double value) {
		assignmentPerc[index]=value;
	}
	
	
	public void calculateTotalgrade(double[] pointTotal, double[] earnedPoints , double[] assignmentPerc)
	{
		double totalWeightGrade=0;
		
		for(int i=0; i<=pointTotal.length-1; i++) {
			
			double total=0;
			total= earnedPoints[i]/pointTotal[i]*(assignmentPerc[i]/100)*100;
			
			totalWeightGrade = totalWeightGrade + total;
		}
		
		System.out.println("Total of Grade: "+totalWeightGrade);
		
		
		if(totalWeightGrade <= 100 && totalWeightGrade >= 90) {
			 System.out.println("Class A achieved");
		}
		else if(totalWeightGrade <= 89.9999 && totalWeightGrade >= 80) {
			 System.out.println("Class B achieved");
		}
		
		else if(totalWeightGrade < 80 && totalWeightGrade >= 70) {
			 System.out.println("Class C achieved");
		}
		else if(totalWeightGrade < 70 && totalWeightGrade >= 60) {
			 System.out.println("Class D achieved");
		}
		else if(totalWeightGrade < 60) {
			 System.out.println("Class F achieved");
	}

}
}
