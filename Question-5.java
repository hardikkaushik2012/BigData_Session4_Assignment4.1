import java.util.Scanner;

class Acad
{
	public static void main(String args[])
	{
		int number;
		System.out.println("Enter the Number=");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		
		multiples(number);
	}
	public static void multiples(int num1)
		{
			int answer;
			for(int i=1 ; i<= 10; i++)
				{
					answer=0;
					answer = num1 * i;
					System.out.println( +num1+ "X" +i+ "=" +answer);
				}
		}
}