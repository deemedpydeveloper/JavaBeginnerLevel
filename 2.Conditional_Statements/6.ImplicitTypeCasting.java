import java.util.Scanner;
public class ImplicitTypeCasting
{
    public static void main(String[] args)
    {
        System.out.print("Enter an integer: ");
        Scanner readInteger = new Scanner(System.in);
        int i = readInteger.nextInt();
        
        System.out.print("Enter a floating point number: ");
        Scanner readFloat = new Scanner(System.in);
        float f = readFloat.nextFloat();
        
        // before type casting.
        System.out.println("\n");
        System.out.println("The Integer before implicit type casting is: "+i);
        
        // implicit type casting - integer to float.
        f = i;
        System.out.println("The Integer after implicit type casting is: "+f);
        System.out.println("\n");  
    }
}
