//. Write a Java Program to print all the Factors of the Given number.
import java.util.*;
class Q9FactorsOfNumber 
{
	public static void main (String args [])
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		for(int i = 1; i <= num;++i)
		{
			if (num % i == 0)
			{
				System.out.println("factors are: "+i+" ");
			}
		}
	}
}