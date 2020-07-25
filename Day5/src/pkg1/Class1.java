//Swapping of two number using third variable
package pkg1;

public class Class1
{	
	int a=10;
	int b=20;
	public void swapping()
	{
		System.out.println("Value of a before swapping = "+a);
		System.out.println("Value of b before swapping = "+b);
		int temp;
		temp=a;
		a=b;		
		System.out.println("Value of a after swapping = "+a);
		b=temp;
		System.out.println("Value of b after swapping = "+b);
	}
	public static void main(String[] args) 
	{
		Class1 obj = new Class1();
		obj.swapping();
	}
}
