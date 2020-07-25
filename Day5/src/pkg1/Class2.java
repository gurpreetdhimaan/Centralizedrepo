//Swapping of two number
package pkg1;

public class Class2 
{
	int a=10;
	int b=20;
	public void swapping()
	{
		System.out.println("Value of a before swapping = "+a);
		System.out.println("Value of b before swapping = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a after swapping = "+a);
		System.out.println("Value of b after swapping = "+b);
	}
	public static void main(String[] args) {
		Class2 obj = new Class2();
		obj.swapping();
	}
}
