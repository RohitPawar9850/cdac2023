//Q10.Write a Java Program to find the sum of the digits of a given number.
import java.util.*;
class Q10SumOfDigits
{
public static void main (String args [])
{
	System.out.println("Enter A Number");
	Scanner sc = new Scanner (System.in);
	int num = sc.nextInt();
	if (num != 0)
	{
		int n1 = num / 1000 %10;
		int n2 = num /100 % 10;
		int n3 = num / 10 % 10;
		int n4 = num % 10;
		int sum = n1+n2+n3+n4;
		System.out.println("Digits are"+n1+" "+n2+" "+n3+" "+n4+" ");
		System.out.println("Sum Of The Digits are :" + sum);
	}
}
}