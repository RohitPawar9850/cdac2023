//To print the following series EVEN number Series 2 4 6 8 10 12 14 16 ....
import java.util.*;
class Q19EvenSeries 
{
	public static void main (String args [])
	{
		System.out.println("Enter range Where you want to print series.");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i = 1 ; i <= n ; i++)
		{
			if(i % 2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}