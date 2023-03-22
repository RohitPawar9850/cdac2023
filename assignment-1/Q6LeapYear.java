//Write a Java Program to find whether a given number is Leap year or NOT.
import java.util.*;
class Q6LeapYear 
{
	public static void main (String args[])
	{
		System.out.println("Enter Year.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year%400==0) || (year % 4 == 0) && (year%100 !=0))
		{
			System.out.println("Leap Year");
		}
		else
			System.out.println("Not Leap Year");
	}
}