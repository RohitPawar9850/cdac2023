import java.util.Scanner;
class evenodd 
{
public static void main (String args[])
{
System.out.println("Enter a number");
Scanner num =new Scanner(System.in);
int number = num.nextInt();
if ((number %2) == 0)
{
	System.out.println(number);
System.out.println("Number is Even");
}
else
{
	System.out.println(number);
System.out.println("Number is Odd");
}
}
}
