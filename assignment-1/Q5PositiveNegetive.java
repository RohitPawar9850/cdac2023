//How to check whether the given number is Positive or Negative in Java? 
import java.util.*;
class Q5PositiveNegetive 
{
	public static void main (String args [])
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		if(num >0)
		{
			System.out.println("Number is Positive");
		}
		else
			System.out.println("Number is Negetive.");
	}
}