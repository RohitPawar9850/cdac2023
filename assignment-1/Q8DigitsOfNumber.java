//Write a Java Program to print the digits of a Given Number.
import java.util.*;
class Q8DigitsOfNumber 
{
	public static void main (String args [])
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num != 0)
		{
			int n1= num /1000 % 10; 
			System.out.println(num);  
			int n2 = num / 100 % 10;
			int n3 = num / 10 % 10;
			int n4 = num % 10;
			System.out.println("Digits are "+n1+" and "+n2 +" and" + n3 +" and" +n4);
		}
	}
}