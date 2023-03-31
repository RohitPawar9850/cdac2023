/*
 * Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal 
 */
public class A28 {
    public static void main(String[] args) {
        double d =12;
        String s = String.valueOf(d);
        System.out.println("Double in String :"+s);

        Double d2= new Double(d);
        double d3 = d2.doubleValue();
        System.out.println("Double Value in Double Instance :"+d3);

        String str = new String(s);
        Double d5 = new Double(str);
        System.out.println("String instance to Double Instance :"+d5);

        double d6 = 40;
        //double value into binary, octal and hexadecimal 
        double d7 =Double.doubleToLongBits(d6);
        System.out.println(d7);
        double d8 = Double.doubleToRawLongBits(d6);
        System.out.println("Double to binary : "+d8);

        String s5 = Double.toHexString(d6);
        System.out.println("Double to hex String : "+s5);



    }
}
