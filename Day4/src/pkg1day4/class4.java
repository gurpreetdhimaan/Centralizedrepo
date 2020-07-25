/*Parent 4 parameterized constructor
Parent default constructor
Parent 1 parameterized constructor
Parent 3 parmaeterized constructor
Parent 2 parameterized constructor
Child 3 parameterized constructor
Child 1 parameterized constructor
Child default constructor
Child 4 parameterized constructor*/
package pkg1day4;

public class class4 extends class3
{
	public class4() 
	{
	this(1);
 		System.out.println("Child default method");
	}
	public class4(int a) 
	{
		this(1,2,3);
		System.out.println("Child 1 parameterized method");
	}
	public class4(int a, int b) 
	{
		System.out.println("Child 2 parameterized method");
	}
	public class4(int a, int b, int c) 
	{
		super(1,2);
		System.out.println("Child 3 parameterized method");
	}
	public class4(int a, int b, int c, int d) 
	{
		this();
		System.out.println("Child 4 parameterized method");
	}
public static void main(String[] args) 
{
class4 obj = new class4(1,2,3,4);

}
}