import java.util.Scanner;;
class A33 
{
    static int i1 , i2 ;
    static float f1 ,f2 ;
    static double d1 ,d2 ;
    void print(int num1,int num2)
    {

    }
    public static void main(String[] args) 
    {
        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner (System.in);
        int choice = 0;
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        if (sc.hasNextInt())
        {
            i1 = Integer.parseInt(args[0]);
            i2 = Integer.parseInt(args[1]);
            choice = sc.nextInt();
        }  
        else
        {
            if(sc.hasNextFloat())
            {
            f1 = Float.parseFloat(args[0]);
            f2 = Float.parseFloat(args[1]);
            choice = sc.nextInt();
            }
            else
            {
            d1 = Double.parseDouble(args[0]);
            d2 = Double.parseDouble(args[1]);
            choice = sc.nextInt();
            }
        }
        switch (choice)
        {
            case 1 :
            System.out.println("Addition of Two Number.");

            int result =i1+i2;
            System.out.println(result);
            break;

            case 2 :
            System.out.println("Substraction of Two Number.");
            int Substraction = i1 - i2 ;
            System.out.println(Substraction);
            break;

            case 3 :
            System.out.println("Multiplication of Two Number.");
            int Multiplication = i1 * i2 ;
            System.out.println(Multiplication);
            break;

            case 4 : 
            System.out.println("Division of Two Number.");
            int Division = i1 / i2 ;
            System.out.println(Division);
            break;
        }
        
        
    }   
    

}
