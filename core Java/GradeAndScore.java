package demo;

public class GradeAndScore {

	public static void main(String[] args) {
		int testscore=75;
		char grade;
		if(testscore>=90) {
			grade='A';
		}
		else if(testscore>=80) {
			grade='B';
		}
		if(testscore>=70) {
			grade='C';
		}
		else if(testscore>=60) {
			grade='D';
		}
		else {
			grade='f';
		}
		System.out.println("the grade of student="+grade);
	}

}
