import java.util.Scanner;

class Acad
{
	void sum(int a,int b)
	{
		System.out.println("sum of 2 intergers");
		System.out.println(a+b);
	}
	
	void sum(int a,int b,int c)
	{
		System.out.println("sum of 3 intergers");
		System.out.println(a+b+c);
	}
	
	void sum(double a,double b,double c)
	{
		System.out.println("sum of 3 doubles");
		System.out.println(a+b+c);
	}
	
	void sum(float a,float b)
	{
		System.out.println("sum of 2 floats");
		System.out.println(a+b);
	}

	public static void main(String args[])
	{
		Acad cal = new Acad();
		cal.sum(2,3,6);
		cal.sum(2,2);
		cal.sum(2.3f,4.9f);
		cal.sum(2.4,3.7,6.1);
   }
}