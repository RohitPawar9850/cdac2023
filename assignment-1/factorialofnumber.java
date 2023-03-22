import java.util.Scanner;
class factorialofnumber
{
	public static void main (String args [])
	{
		System.out.println("Enter a number :");
		Scanner num = new Scanner(System.in);
		int i,fact=1;
		int number = num.nextInt();
		for(i=1;i<=number;++i)
		{
			if (number%i==0)
			{
			fact =i;
			}
	    }
		System.out.println("Factorial of number is"+fact);
   }
}