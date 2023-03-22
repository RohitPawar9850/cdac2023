// take input of 5 students marks and find total marks , average of marks and percentage.
import java.util.Scanner;
class marksofstudent {
	public static void main (String args[]){
		System.out.println("Enter marks of 5 students ");
	    Scanner marks = new Scanner (System.in);
System.out.println("Enter marks of 1st student out of 100");
int a = marks.nextInt();
System.out.println("Enter marks of 2nd student out of 100 ");
int b = marks.nextInt();
System.out.println("Enter marks of 3rd student out of 100 ");
int c = marks.nextInt();
System.out.println("Enter mrks of 4th student out of 100");
int d = marks.nextInt();
System.out.println("Enter marks of 5th student out of 100 ");
int e = marks.nextInt();
int total = a+b+c+d+e;
int avg = total/5;
double percentage = ((double)total/500)* 100;
System.out.println("Total marks of 5 students is "+total);
System.out.println("Average marks of 5 students is "+avg);
System.out.println("Percentage marks of 5 students is "+percentage);
	}
}	