import java.util.*;
class Q20OddSeries 
{
	public static void main (String args [] )
	{
		System.out.println("Enter a range of series.");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		for(int i = 1; i < num ; i++)
		{
			if (i% 2== 1 )
			{
				System.out.print(i+" ");
			}
		}
	}
}
			