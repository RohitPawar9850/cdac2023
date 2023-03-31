/**
 * 13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.
 */
public class A13 {
    public static void main(String[] args) {
        short s1 =121;
        String str1=String.valueOf(s1);
        System.out.println("Short value into String : "+str1);
        
        str1="111";
        Short s2 = new Short(s1);
        short s3=s2.shortValue();
        System.out.println("Short value into Short instance : "+s3);

        String str2 =new String(str1);
        Short sh1 =Short.parseShort(str2);
        short sh2 = sh1.shortValue();
        System.out.println("String instance into short instance : "+sh2);

    }
}
