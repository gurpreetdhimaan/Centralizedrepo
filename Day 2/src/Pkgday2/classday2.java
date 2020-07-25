//Assignment1   ((((10+2)-2)*2)+2)/2) =11
package Pkgday2;

public class classday2 {

	public int sum(int a, int b)
	{
	int c;
	c= a+b;
	return(c);
	}
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
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
		classday2 result=new classday2();
		int res_sum=result.sum(10,2);
		int res_sub=result.sub(res_sum,2);
	    int res_mul=result.mul(res_sub,2);
		int res_sum1=result.sum(res_mul,2);
		result.div(res_sum1,2);
		}
}
