/*
 * 20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
 */
public class A20 {
    public static void main(String[] args) {
        Long l1= 1254674L;
        String str1=Long.toString(l1);
        System.out.println("Long to String : "+str1);

        Long l2 = new Long (l1);
        Long l3 = l2.longValue();
        System.out.println("Long to Long Instance : "+l3);

        l3 =Long.parseLong(str1);
        System.out.println("String Instance to Long Instance : "+l3);
    }
}
