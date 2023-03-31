/*
 * 25.Write a program to convert state of Float instance into byte, 
short, int, long, float and double.
 */
public class A25 {
    public static void main(String[] args) {
        float f1 = 10.545f;
        Float f2 = new Float(f1);
        Byte b = f2.byteValue();
        System.out.println("Float Instance Into Byte : "+b);

        short s1 = f2.shortValue();
        System.out.println("Float Instance to Short : "+s1);

        int i = f2.intValue();
        System.out.println("Float Instance to Int : "+i);

        long l = f2.longValue();
        System.out.println("Float to Long : "+l);


    }
}
