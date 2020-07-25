//3) A number is prime or not ---A number that will be divisble by itself or 1
package pkg1;

import java.util.Scanner;

public class Class1ass3 
{	
	public void prime(int a)
	{
		if ((a/a==1) && (a/1==a))
		{
		System.out.println("Entered number is a Prime Number");
		}	
		else
		{
			System.out.println("Entered number is not a Prime Number");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number to check its prime or not :");
		Scanner obj1 = new Scanner(System.in);
		int a = obj1.nextInt();
		Class1ass3 obj = new Class1ass3();
		obj.prime(a);
	}
}
