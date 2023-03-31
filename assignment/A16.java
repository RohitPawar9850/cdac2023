/**
 * Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.

 */
public class A16 {
    public static void main(String[] args) {
        int num= 100;
        String s1=Integer.toString(num);
        System.out.println("Integer to String : "+s1);
        int n= 50;
        Integer num2 = new Integer(n);
        Integer num3 = num2.intValue();
        System.out.println("Int value into Integer Instance : "+num3);
    }
}
