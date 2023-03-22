// How to add two numbers without using the arithmetic operators in Java?
import java.util.*;
class Q12WithoutArithmatic 
{
	public static void main (String args [])
	{
		String s1 = args[0];
		String s2 = args[1];
		int i =Integer.parseInt(s1);
		int j =Integer.parseInt(s2);
		System.out.println("Enter number ");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println("Sum= "+(i+j));
	}
}