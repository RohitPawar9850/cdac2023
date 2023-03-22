//check wheather given three digit number is palindrome number or not.
import java.util.*;
class Q17PalindromeNumber 
{
	public static void main (String args [])
	{
		System.out.println("Enter a number.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1,num2,num3,num4;
		if(num != 0)
		{
			//num1 = num /1000 %10;
			num1 = num /100 % 10;
			num2 = num / 10 % 10;
			num3 = num % 10;
		
		if(num1 == num3)
		{
			System.out.println("Number "+num+"Is a Palindrome number");
		}
		else
			System.out.println("Number"+num+"Is Not A Palindrome Number");
		}
	}
}