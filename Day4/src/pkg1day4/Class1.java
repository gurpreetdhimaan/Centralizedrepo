package pkg1day4;

public class Class1 
{
	public void pm()
	{
		this.pm(1,2,3,4);
		System.out.println("Parent default method");
	}
	public void pm(int a)
	{
		this.pm();
		System.out.println("Parent 1 parameterized method");
	}
	public void pm(int a, int b)
	{
		this.pm(1,2,3);
		System.out.println("Parent 2 parameterized method");
	}
	public void pm(int a, int b, int c)
	{
		this.pm(1);
		System.out.println("Parent 3 parameterized method");
	}
	public void pm(int a, int b, int c, int d)
	{
		System.out.println("Parent 4 parameterized method");
	}
}
