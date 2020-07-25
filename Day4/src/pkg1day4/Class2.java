/*Parent 4 parameterized method
Parent default method
Parent 1 parameterized method
Parent 3 parameterized method
Parent 2 parameterized method
Child 3 parameterized  method
Child 1 parameterized  method
Child default method
Child 4 parameterized method*/
package pkg1day4;

public class Class2 extends Class1
{
	public void cm() 
		{
		this.cm(1);
	 		System.out.println("Child default method");
		}
		public void cm(int a) 
		{
			this.cm(1,2,3);
			System.out.println("Child 1 parameterized method");
		}
		public void cm(int a, int b) 
		{
			System.out.println("Child 2 parameterized method");
		}
		public void cm(int a, int b, int c) 
		{
			super.pm(1,2);
			System.out.println("Child 3 parameterized method");
		}
		public void cm(int a, int b, int c, int d) 
		{
			this.cm();
			System.out.println("Child 4 parameterized method");
		}
public static void main(String[] args) {
	Class2 obj1 = new Class2();
	obj1.cm(1,2,3,4);
}
}
