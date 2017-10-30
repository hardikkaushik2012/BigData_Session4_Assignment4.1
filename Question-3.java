import java.util.Scanner;

class Acad
{
	public static void main(String args[])
	{
		int first,second;
		System.out.println("Enter the First Number=");
		Scanner in = new Scanner(System.in);
		first = in.nextInt();
		
		System.out.println("Enter the Second Number=");
		second = in.nextInt();
		
		sum(first,second);
	}
	public static void sum(int num1 , int num2)
		{
			int add = num1 + num2;
			
			System.out.println("First Number is :" +num1);
			System.out.println("Second Number is :" +num2);
			System.out.println("The Sum of First and Second = " +add);
		}
}