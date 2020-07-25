package pkg1;

import java.util.Scanner;

public class Class1ass5 
{
	int a=0,b=1,c;
	public void fabonacci()
	{
		System.out.println("Printed in fabonacci series : ");
		Scanner obj1 = new Scanner(System.in);
		int c= obj1.nextInt();
		
		for (int i=0;i<=c;i++)
		{
			int d=a+b;
			a=b;
			b=d;
			System.out.println(a);
		}
	}
	public static void main(String[] args) 
	{
		Class1ass5 obj = new Class1ass5();
		obj.fabonacci();
	}
}
