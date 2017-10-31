import java.util.Scanner;

class Acad
{
	void sum(int a,int b)
	{
		System.out.println("sum of 2 intergers");
		System.out.println(a+b);
	}
	
	float sum(int a,int b)
	{
		System.out.println("sum of 2 intergers with return type float");
		return(a+b);
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
		float answer = cal.sum(2,3);
		cal.sum(2.3f,4.9f);
		cal.sum(2.4,3.7,6.1);
		
		System.out.println(answer);
   }
}
/**
In the above,sum function is called two times,one with 2 interger values and void return type and other with 2 interger values with float return type
if we now complile this code than complier will the following erros as 
method is already defined,void cannot be converted to float.
Therefore we can not overload a method on the basis of return type.
*/

