package pkg1;

import java.util.Scanner;

public class Class1ass4 
{
	int a;
	public void table()
	{
		System.out.println("Please a number to print table");
		Scanner obj1= new Scanner(System.in);
		int x = obj1.nextInt();
		for(a=1;a<=10;a++)
		{
			int b=a*x;
			System.out.println(x+" X "+a+" = "+b);
		}
	}
	public static void main(String[] args) 
	{	
		Class1ass4 obj = new Class1ass4();
		obj.table();
	
	}
}
