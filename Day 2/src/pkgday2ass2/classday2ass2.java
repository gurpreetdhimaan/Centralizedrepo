//Assignment2   ((((10-2)+2)+2)*2)/2) = 12
package pkgday2ass2;

public class classday2ass2 {
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		return(c);
	}
	public int sum(int a, int b)
	{
	int c;
	c= a+b;
	return(c);
	}
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		return(c);
	}
	public void div (int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("Final Result is "+c);
	 }
			public static void main(String[] args) {
				classday2ass2 result=new classday2ass2();
				int res_sub=result.sub(10, 2);
				int res_sum=result.sum(res_sub, 2);
				int res_sum1=result.sum(res_sum, 2);
				int res_mul=result.mul(res_sum1,2);
				result.div(res_mul,2);
			}

}
