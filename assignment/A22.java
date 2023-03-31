/**
 * 22. Write a program to find minimum and maximum number as well as 
to add two long numbers using methods of Long.

 */
class A22 
{
    public static void main(String[] args) {
        long l1=123456L,l2=3214567L;
        System.out.println("min : "+Long.min(l1, l2));
        System.out.println("max : "+Long.max(l1, l2));
        System.out.println("Sum : "+Long.sum(l1, l2));
    }
}