import java.util.Scanner;
class greatestnumber 
{
	public static void main (String args[])
	{
		System.out.println("Enter three numbers ");
		Scanner num = new Scanner(System.in);
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		int num3 = num.nextInt();
		if((num1 > num2)&&(num1 > num3))
		{
			System.out.println("Maximum number = "+num1);
		}
		else
		if((num2 > num1)&&(num2>num3))
			System.out.println("Maximum number = "+num2);
		else
			System.out.println("Maximum number = "+num3);
	}
}