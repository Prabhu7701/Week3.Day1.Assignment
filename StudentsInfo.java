package assignmentWeek3Day1;

public class StudentsInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsInfo Stdinfo = new StudentsInfo();
		Stdinfo.getStudentInfo(12345);
		Stdinfo.getStudentInfo(12345, "AAA");
		Stdinfo.getStudentInfo("TEST@Gmail.com",9962377701L);
		
	}
	public void getStudentInfo(int ID) {
		System.out.println("Student ID:" + ID);
	}
	public void getStudentInfo(int ID, String Name) {
		System.out.println("Student ID: "+ID);
		System.out.println("Student NAME: "+Name);
	}
	public void getStudentInfo(String Email, long  PhNumber) {
		System.out.println("Student EMAIL: "+Email);
		System.out.println("Student PH#: "+PhNumber);
	}
	


}
