/**
 Write a program to perform below operations on char type to 
get:
a. The number of bits used to represent a char value
b. The number of bytes used to represent a char value
c. The minimum value a char
d. The maximum value a char
 */
public class A10 {
    public static void main(String[] args) {
        char ch ='C';
        System.out.println("Character is : "+ch);
        System.out.println("Size of Character in BITS : "+Character.SIZE);//8*2=16
        //System.out.println();
        System.out.println("Size of Character in BYTES : "+(int)Character.BYTES); // 2 Bytes
        System.out.println("Minimum value of Charcter : "+Character.MIN_VALUE); //0 
        //System.out.println();
        System.out.println("Maximum value of character : "+(int)Character.MAX_VALUE);  //65535
    }
}
