package assignmentWeek3Day1;

public class AxisBank extends  BankInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank bankObj = new AxisBank();

		bankObj.saving();
		bankObj.fixed();
		bankObj.deposit();
		
		//overriding method
		bankObj.deposit(777);
		bankObj.saving("AAA");
	}
	public void deposit(int amount) {
		System.out.println("Amount deposited Axis bank account: "+ amount);
	}
	public void saving(String name) {
		System.out.println(" Account holder name is : "+ name);
	}
}