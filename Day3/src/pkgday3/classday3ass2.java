/*Assignment 2
3 parameterized method
default method
4 parameterized method
2 parameterized method
1 parameterized method*/
package pkgday3;

public class classday3ass2 {
	public void def_meth()
	{
	System.out.println("Default Method");
	this.four_meth(1,2,3,4);
	}
	public int one_meth(int a)
	{
	System.out.println("One Parameterized Method");
	return(a);
	}
	public int two_meth(int a, int b)
	{
	System.out.println("Two Parameterized Method");	
	this.one_meth(1);
	return(a);
	}
	public int three_meth(int a, int b, int c)
	{
	System.out.println("Three Parameterized Method");	
	this.def_meth();
	return(a);
	}
	public int four_meth(int a, int b, int c, int d)
	{
	System.out.println("Four Parameterized Method");
	this.two_meth(1,2);
	return(a);
	}
	public static void main(String[] args) {
		classday3ass2 obj1 = new classday3ass2();
	/*	classday3ass2 obj2 = new classday3ass2();
		classday3ass2 obj3 = new classday3ass2();
		classday3ass2 obj3 = new classday3ass2();
		classday3ass2 obj4 = new classday3ass2();*/
		obj1.three_meth(1,2,3);
		
	}
}
