//((	((x1+x2)-x3)+x4)*x5)/x6)
package pkg1day4;

import java.util.Scanner;

public class class5 
{
	public int mul(int a, int b)
	{
		int c=a*b;
		return (c);
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		return (c);
	}
	public int sum (int a, int b)
	{
		int c=a+b;
		return (c);
	}
	public void div(int a, int b)
	{
		int c=a/b;
		System.out.println("Final Result is "+c);
}
	public static void main(String[] args) 
	{
		System.out.println("Please enter value of x1");
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt();
		System.out.println("Please enter value of x2");
		int x2 = s.nextInt();
		System.out.println("Please enter value of x3");
		int x3 = s.nextInt();
		System.out.println("Please enter value of x4");
		int x4 = s.nextInt();
		System.out.println("Please enter value of x5");
		int x5 = s.nextInt();
		System.out.println("Please enter value of x6");
		int x6 = s.nextInt();
		
		class5 obj = new class5();
		int sum = obj.sum(x1,x2);
		int sub = obj.sub(sum, x3);
		int sum1 = obj.sum(sub, x4);
		int mul = obj.mul(sum1, x5);
		obj.div(mul,x6);
	}
}