package Day1;

public class Student 
{
	int age;
	int rollno;
	public void welcome()
	{
		System.out.println("Welcome all of you!");
	}
	public void automation()
	{
		System.out.println("Automation is very easy");
	}
		public static void main(String[] args) 
		{
			Student GS=new Student();
			GS.welcome();
			GS.automation();
			
			GS.age=37;
			GS.rollno=101020224;
						
			System.out.println("Student's age is : " +GS.age);
			System.out.println("Student's Roll no is : "+GS.rollno);
		}
	
}
