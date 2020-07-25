//Factorial of a number---5---5*4*3*2*1----120
package pkg1;

import java.util.Scanner;

public class Class1ass6 
{
	int a,b;
	public void factorial()
	{
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter number to find its factorial : ");
		int d=obj1.nextInt();
		for (a=1; a>=d;a--)
		{
			b=a*d;
			System.out.println(b);
			d=d-1;
		}
	}
	public static void main(String[] args) 
	{
		Class1ass6 obj = new Class1ass6();
		obj.factorial();
	}
	
}
