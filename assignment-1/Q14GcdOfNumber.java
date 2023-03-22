import java.util.Scanner;
class Q14GcdOfNumber 
{
	public static void main (String args [])
	{
		System.out.println("Enter two numbers");
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n1=1;
		for(int i = 1; i<a;i++)
		{
			if(a % i == 0 && b % i == 0)
			{
				 n1=i;
			}
		}
		System.out.println("GCD= "+n1);
	}
}