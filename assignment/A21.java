/**
 * 21.Write a program to convert state of Long instance into byte, 
short, int, long, float and double.

 */
public class A21 {
    public static void main(String[] args) {
        long l=123;
        Long l1 = new Long(l);
        byte b =(byte)l1.longValue();
        System.out.println("Long Instance to Byte : "+b);

        short s =(short)l1.longValue();
        System.out.println("Long Instance to Short : "+s);

        int i = (int)l1.longValue();
        System.out.println("Long Instance to Int : "+i);

        float f =(float)l1.longValue();
        System.out.println("Long Instance to Float : "+f);

        long l3 = l1.longValue();
        System.out.println("Long instance in Long : "+l3);
    }
}
