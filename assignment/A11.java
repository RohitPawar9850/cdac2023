/**
  Accept character from command line and perform below 
operations. Here you can use charAt() method to extract 
character:
a. Check whether entered character is letter or digit. If it 
is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? 
If it is in lowercase then convert it into upper case and 
print it well as its code point. If it is in uppercase
then convert it into lower case and print it well as its 
code point.
 */
//import java.util.*;
public class A11 {
    public static void main(String[] args) {
        char ch =args[0].charAt(0);
        char ch1 =args[1].charAt(1);
        //String s1=Character.toString(ch);
        if (Character.isDigit(ch))
        //Determines if the specified character is a digit.
        {
            System.out.println("Entered input is Digit.");
        }
        else
        {
            if(Character.isLetter(ch))
            // Determines if the given character is character.
            {
                System.out.println("Entered input is Character");
                if( ch < 123 && ch > 96)
                {
                    System.out.println("Lower case");
                    //Uppercase remaining
                }
                if( ch > 64 && ch < 91)
                {
                    System.out.println("Upper Case");
                    // lowercase remaining
                    System.out.println();
                }
            }
            else
            System.out.println("Entered input is Not Character Nor Digit");
        }
    }
    
}
