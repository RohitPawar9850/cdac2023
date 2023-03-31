/*
 * 24.Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
 */
class A24 {
    public static void main(String[] args) {
        float f = 150.5f;
        String s =String.valueOf(f);
        System.out.println("Float to String :"+s);

        Float f1 = new Float(f);
        System.out.println("Float value to Float Instance : "+f1);

        String str = "1235";
        String s1 = new String(str);
        Float ft = new Float(s1);
        System.out.println("String Instance into Float Instance "+ft);

        float fl=22.75f;
         Float fo=new Float(fl);
        float fa = fo.floatValue();
         System.out.println(fa);
    }
}
