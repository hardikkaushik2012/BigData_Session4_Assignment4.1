import java.util.Scanner;

class Acad
{
	public static void main(String args[])
	{
		int first,second,sum;
		
		System.out.println("Enter the First Number=");
		Scanner in = new Scanner(System.in);
		first = in.nextInt();
		
		System.out.println("Enter the Second Number=");
		second = in.nextInt();
		
		sum = first + second;
		
		System.out.println("The Sum of First and Second = " +sum);
	}
}