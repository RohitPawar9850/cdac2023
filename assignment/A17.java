/**
 * 17. Write a program to convert state of Integer instance into 
byte, short, int, long, float and double.
 */
public class A17 {
    public static void main(String[] args) {
        int num=78;
        Integer num1 = new Integer(num);
        Integer num2 = num1.intValue();
        int num3 = num2;
        System.out.println("INT instance to Int : "+num2);

        Byte b1 =num1.byteValue();
        System.out.println("Int Instance to Byte : "+b1);

        Short s1 = num1.shortValue();
        System.out.println("Int instance to Short : "+s1);

        float f1 = num1.floatValue();
        System.out.println("Int instance to Float : "+f1);

        double d1 = num1.doubleValue();
        System.out.println("Int Instance to Double : "+d1);
        }
}
