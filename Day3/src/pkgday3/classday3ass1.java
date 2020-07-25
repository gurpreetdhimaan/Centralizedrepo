//Assigment - 1
//4 parameterized constructor
//default constructor
//1 parameterized constructor
//3 parameterized constructor
//2 parameterized constructor
package pkgday3;

public class classday3ass1 {
	public classday3ass1()
	{
			this(1,2,3,4);
			System.out.println("Default constructor");
	}
	public classday3ass1(int a)
	{
			this();
			System.out.println("One parameter constructor");
	}
	public classday3ass1(int a, int b)
	{
		this(1,2,3);
		System.out.println("two parameter constructor");
	}
	public classday3ass1(int a, int b, int c)
	{
		this(1);
		System.out.println("Three parameter constructor");
	}
	public classday3ass1(int a, int b, int c, int d)
	{
			System.out.println("Four parameter constructor");
	}

	public static void main(String[] args) 
	{
		classday3ass1 obj1 = new classday3ass1(1,2);
	}
}
