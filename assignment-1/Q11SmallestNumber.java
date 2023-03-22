//Write a Java Program to find the smallest of 3 numbers (a,b,c)
import java.util.*;
class Q11SmallestNumber 
{
	public static void main (String args [])
	{
		System.out.println("Enter three numbers ");
		Scanner sc = new Scanner (System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int min = ((n1<n2)?((n1<n3)?n1:n3):((n2<n3)?n2:n3));
        System.out.println("Smallest number is "+min);		
	}
}