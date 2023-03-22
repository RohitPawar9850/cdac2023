// Write a java program to LCM of TWO given numbers using the Prime Factors method
import java.util.*;
class Q16LcmByPrimeFactorization 
{
	public static void main (String args [])
	{
		System.out.println("Enter Two Numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int lcm =1;
		for(int i=1;i<num1 && i <num2;i++)
		{
			if(num1 % i ==0 && num2 % i==0)
			{
				lcm = num1*i;
				System.out.println("LCM = "+lcm);
			}
		}
	}
}
		