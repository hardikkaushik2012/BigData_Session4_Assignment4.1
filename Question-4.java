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
		
		oddeven(first,second);
	}
	public static void oddeven(int num1,int num2)
		{
			for(int i=num1 ; i<= num2; i++)
			{
				if(i % 2 == 0)
				{
					System.out.println("EVEN = " +i);
				}
			}
			
			for(int j=num1 ; j<= num2; j++)
			{
				if(j % 2 == 1)
				{
					System.out.println("ODD = " +j);
				}
			}
		}
}