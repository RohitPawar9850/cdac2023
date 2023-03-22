import java.util.*;
class DigitsOFNumber
{
	public static void main (String args [])
	{
		System.out.println("Enter a number:");
		int n,temp,digits,count = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		temp = n;
        while(n > 0)
		{
        digits = n % 10;
		n = n / 10;
		System.out.println(digits);
        //count++;
		}
	}
}