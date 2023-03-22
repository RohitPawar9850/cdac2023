import java.util.Scanner;
class smallestnumber 
{
	public static void main (String args[])
	{
		System.out.println("Enter three numbers ");
		Scanner num = new Scanner(System.in);
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		int num3 = num.nextInt();
		if((num1 > num2)&&(num2 > num3))
		{
			System.out.println("Smallest number = "+num3);
		}
		else
		if((num1 > num2)&&(num3>num2))
			System.out.println("Smallest number = "+num2);
		else
			System.out.println("Smallest number is "+num1);
	}
}