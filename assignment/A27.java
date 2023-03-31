/*
 * Write a program to perform below operations on Double type to 
get: 
a. The number of bits used to represent a double value
b. The number of bytes used to represent a double value
c. The minimum value a double
d. The maximum value a double

 */
public class A27 {
    public static void main(String[] args) {
        System.out.println("Size in Bits: "+Double.SIZE);
        System.out.println("size in Bytes : "+Double.BYTES);
        System.out.println("Min : "+Double.MIN_VALUE);
        System.out.println("Max : "+Double.MAX_VALUE);
    }
}
