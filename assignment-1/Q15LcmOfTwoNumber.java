//Write a java program to LCM of TWO given numbers.
import java.util.*;
class Q15LcmOfTwoNumber 
{
	public static void main (String args [])
	{
		System.out.println("Enter Two Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hcf=1;
		for (int i =1;i<a;i++)
		{
			if (a%i==0 && b%i==0)
			{
				hcf = i;
			}
		}
		int lcm = (a*b)/hcf;
		System.out.println("LCM = "+lcm);
	}
}