//Write a Java Program to Print 1 To 10 Without Using Loop(Recursive Function).
import java.util.*;
class Q7WithoutLoop 
{
	public static void main (String args [])
	{
		recursivefun(1);
	}
	public static void recursivefun(int n)
	{
		if(n <= 10)
		{
			System.out.println(n);
			recursivefun(n+1);
		}
	}
}