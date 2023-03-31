/** 6.Write a program to perform below operations on Boolean type to 
convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.

 */
class A4 {

    static boolean b=true;
    static String s;

    public static void main1(String[] args) {
        System.out.println("Boolean value to String");
        boolean b=true;
        String s =Boolean.toString(b);
        //Returns a String object representing this Boolean's value.
        System.out.println(s);
    }
    public static void main2(String[] args) {
        System.out.println("Boolean value into boolean instance.");
        boolean b2=	Boolean.valueOf(b);
        //Returns a Boolean instance representing the specified boolean value.
        System.out.println(b2);
    }
    public static void main3(String[] args) {
        System.out.println("String value into boolean value");
        String s="Cdac";
        boolean b = Boolean.valueOf(s);
        //Returns a Boolean with a value represented by the specified string
        System.out.println(b);
    }
   
    public static void main(String[] args) {
        System.out.println("String value into boolean instance.");
        boolean b=Boolean.valueOf(s);
        //Returns a Boolean with a value represented by the specified string
        System.out.println(b);   
    }   
}
