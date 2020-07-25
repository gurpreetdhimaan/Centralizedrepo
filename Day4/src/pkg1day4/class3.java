package pkg1day4;

public class class3 {
	public class3()
	{
		this(1,2,3,4);
		System.out.println("Parent default constructor");
	}
	public class3(int a)
	{
		this();
		System.out.println("Parent 1 parameterized constructor");
	}
	public class3(int a, int b)
	{
		this(1,2,3);
		System.out.println("Parent 2 parameterized constructor");
	}
	public class3(int a, int b, int c)
	{
		this(1);
		System.out.println("Parent 3 parameterized constructor");
	}
	public class3(int a, int b, int c, int d)
	{
		System.out.println("Parent 4 parameterized constructor");
	}
}
