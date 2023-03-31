/*
 * 19.Write a program to perform below operations on long type to 
get: 
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long
 */
public class A19 {
    public static void main(String[] args) {
        System.out.println(Long.BYTES); // 8Bytes
        System.out.println(Long.MIN_VALUE); //-(2^64)
        System.out.println(Long.MAX_VALUE); //(2^64-1)
        System.out.println(Long.SIZE); // 64 Bits
    }
}
