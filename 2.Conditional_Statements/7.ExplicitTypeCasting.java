import java.util.Scanner;
public class ExplicitTypeCasting
{
    public static void main(String[] args)
    {
        System.out.print("Enter an integer: ");
        Scanner readInteger = new Scanner(System.in);
        int i = readInteger.nextInt();
        
        System.out.print("Enter a floating point number: ");
        Scanner readFloat = new Scanner(System.in);
        float f = readFloat.nextFloat();
        
        System.out.println("\n");
        
        // explicit type conversion ---> converts float into int.
        System.out.println("Floating point number before explicit type conversion: "+f);
        i = (int)f;
        System.out.println("Floating point number after explicit type conversion: "+i);
        
        System.out.println("\n");
        
    }
}
