/**
 * .Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
 */
class A8 {
    public static void main(String[] args) {
        byte b= 10;
        byte bs=20;
        String s = Byte.toString(b);
        System.out.println("Byte to String : "+s); 

        byte val = 100;
        Byte b1 = new Byte(val);
        byte b2 = b1.byteValue();
        System.out.println("Byte Value into Byte instance : "+b2);

        String str2="125";
        String str = new String(str2);
        Byte bt =Byte.parseByte(str);
        byte bt1 =bt.byteValue();
        System.out.println("String instance to Byte instance : "+bt1);
    }
    
}
