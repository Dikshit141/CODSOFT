package StudentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("No. of Subjects: ");
		int subjects = s.nextInt();
		int marksObtained = 0;
		int[] marks = new int[subjects];
		for(int i=0;i<subjects;i++) {
			System.out.println("marks Obtained in Subject" +(i+1)+ ": ");
			marks[i] = s.nextInt();
			marksObtained += marks[i];
		}
		
		double percentage = (double) marksObtained / subjects;
		
		String finalgrade = null ;
		
		if(percentage >= 90) {
			finalgrade = "O";
		}else if(percentage >= 80) {
			finalgrade = "A+";
		}else if(percentage >= 70) {
			finalgrade = "A";
		}else if(percentage >= 60) {
			finalgrade = "B+";
		}else if(percentage >= 50) {
			finalgrade = "B";
		}else if(percentage >= 40) {
			finalgrade = "C";
		}else if(percentage >= 30) {
			finalgrade = "F";
		}
		System.out.println("Marks Obtained: " + marksObtained);
		System.out.println("Percentage: " + percentage + "%");
		System.out.println("Grade: " + finalgrade);
		s.close();
	}

}
