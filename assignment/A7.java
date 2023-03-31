import javax.print.DocFlavor.BYTE_ARRAY;

/**
 Write a program to perform below operations on byte type to 
get:
a. The number of bits used to represent a byte value
b. The number of bytes used to represent a byte value
c. The minimum value a byte
d. The maximum value a byte
 */
public class A7 {
    public static void main1(String[] args) {
        // byte bit,byte,min_value,Max_value
        System.out.println(Byte.BYTES);// 1 Byte
        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Byte.MIN_VALUE); // -128
        System.out.println(Byte.SIZE); //  8*1=8
    }
    public static void main2(String[] args) {
        // Integer value of bit,byte,max_value,min_value
        System.out.println(Integer.BYTES); //4 Bytes
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.SIZE);  // 32=8*4
    }
    public static void main3(String[] args) {
        // short size,min,max
        System.out.println(Short.BYTES);  // 2
        System.out.println(Short.MIN_VALUE);  //-32768
        System.out.println(Short.MAX_VALUE);  //32767
        System.out.println(Short.SIZE);    // 16=8*2
    }
}
