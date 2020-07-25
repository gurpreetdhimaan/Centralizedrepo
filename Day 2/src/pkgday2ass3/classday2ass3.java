//Assignment3  ((((10*2)-2)+2)-2)/2) = 9
package pkgday2ass3;

public class classday2ass3 {
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		return (c);
	}
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		return (c);
	}
	public int sum (int a, int b)
	{
		int c;
		c=a+b;
		return (c);
	}
	public void div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("Final Result is "+c);
	}
	public static void main(String[] args) {
		classday2ass3 result = new classday2ass3();
		int res_mul = result.mul(10, 2);
		int res_sub = result.sub(res_mul, 2);
		int res_sum = result.sum(res_sub,2);
		int res_sub1 = result.sub(res_sum, 2);
		result.div(res_sub1,2);
	}
}
