package assignmentWeek3Day1;

public class Student extends Department {
	public void studentName() {
		System.out.println("StudentName : AAA");
	}
	public void studentDept() {
		System.out.println("StudentDept: MATHS");
	}
	public void studentId() {
		System.out.println("StudentId: 123 ");
	}
	public static void main(String[] args) {
		Student Std = new Student();

		Std.collegeCode();
		Std.collegeName();
		Std.collegeRank();
		Std.deptName();

		Std.studentName();
		Std.studentDept();
		Std.studentId();
	}
}

