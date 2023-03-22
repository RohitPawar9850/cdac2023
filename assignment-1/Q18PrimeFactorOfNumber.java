//Write a Java Program to print all the Prime Factors of the Given Number.

import java.util.*;
class Q18PrimeFactorOfNumber 
{
	public static void main(String args [])
	{
		int number;
		Scanner sc= new Scanner (System.in);
		number =sc.nextInt();
		for(int i=2;i<number;i++)
		{
			while(number%i==0)
			{
				System.out.print(i+" ");
				number=number /i;
			}
		}
		if(number >2)
		{
			System.out.println("number= "+number);
		}
	}
}

