/*Q12
 * a. The number of bits used to represent a short value
b. The number of bytes used to represent a short value
c. The minimum value a short
d. The maximum value a short

 */
public class A12 {
    public static void main(String[] args) {
        short s = 120;
        System.out.println("Value of Short is : "+s);
        System.out.println("Size of Short in BITS : "+Short.SIZE);
        System.out.println("Size of Short in BYTES : "+Short.BYTES);
        System.out.println("Minimum range of Short : "+Short.MIN_VALUE);
        System.out.println("Maximum range of short : "+Short.MAX_VALUE);
    }
}
