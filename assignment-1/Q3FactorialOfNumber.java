// Find the factorial of number using recursion in java.
import java.util.*;
class Q3FactorialOfNumber 
{
	public static int factorial (int num)
	{
		if (num >= 1)
		{
			//System.out.println(num+" ");
			return (num * factorial(num -1));
		}
		else 
		{
			return 1;
		}
	}
	
	public static void main (String args [])
	{
		int i,fact = 1,num;
	    fact =factorial(5);
		System.out.println("Factors are ="+fact);
	}
}
		