package assignmentWeek3Day1;

public class Automation  extends  MultipleLangauge implements Language, TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation Obj= new Automation();
		Obj.java();
		Obj.ruby();
		Obj.Selenium();
		Obj.python();
			}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("This is Selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("This is JAVA");
	}
	
	//Overrides
	public void ruby()
	{
		System.out.println("This is Ruby");
	}

}
