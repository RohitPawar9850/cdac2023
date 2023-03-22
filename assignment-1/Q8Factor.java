//Digits in reverse order

import java.util.*;
class Q8Factor 
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; num!=0;i++)
		{
			int a = num % 10 ;
			num = num / 10;
			System.out.println(a);
		}
	}
}