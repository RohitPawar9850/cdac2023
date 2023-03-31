/*
 * 26.Write a program to find minimum and maximum number as well as 
to add two float numbers using methods of Float.
 */
public class A26 {
    public static void main(String[] args) {
        float f1=10.6f,f2=56.8f;
        System.out.println("min : "+Float.min(f1, f2));

        System.out.println("max : "+Float.max(f1, f2) );

        System.out.println("Sum : "+Float.sum(f1, f2));
    }
}
