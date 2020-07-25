//3) A number is prime or not ---A number that will be divisble by itself or 1
package pkg1;

import java.util.Scanner;

public class Class1ass3 
{	
	int flag=0;
	int b;
	
	public void prime()
	{
		System.out.println("Enter a number :");
		Scanner obj1 = new Scanner(System.in);
		int a = obj1.nextInt();
		for(b=2;b<=a/2;b++ ) 
		{
			if(a%b==0)
			{
			System.out.println("Entered number is not a Prime Number");
			flag=1;
			break;
			}
		}	
		if (flag==0)
		{
			System.out.println("Entered number is a Prime Number");
		}
		
	}
	public static void main(String[] args) 
	{
		
		Class1ass3 obj = new Class1ass3();
		obj.prime();
	}
}
