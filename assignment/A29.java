/*
 * Write a program to convert state of Double instance into byte, 
short, int, long, float and double
 */
public class A29 {
    public static void main(String[] args) {
        double d = 15.69f;
        Double D1= new Double(d);
        System.out.println("Float Instance :"+D1);
        
        Byte b=D1.byteValue();
        System.out.println("Double to byte : "+b);

        short s = D1.shortValue();
        

        int i = D1.intValue();

        long l = D1.longValue();

        float f = D1.floatValue();
        System.out.println("Double to Float : "+f);
    }
}
