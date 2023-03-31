/**
 * Write a program to perform below operations on int type to 
get:
a. The number of bits used to represent a integer value
b. The number of bytes used to represent a integer value
c. The minimum value a integer
d. The maximum value a integer
 */
public class A15 {
    public static void main(String[] args) {
        System.out.println(Integer.BYTES); //4 Bytes
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.SIZE);
    }
}
