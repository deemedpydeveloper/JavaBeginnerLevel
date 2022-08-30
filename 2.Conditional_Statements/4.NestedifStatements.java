import java.util.Scanner;
public class NestedifStatements
{
    public static void main(String[] args)
    {
        System.out.print("Enter first number: ");
        Scanner readNumber1 = new Scanner(System.in);
        int number1 = readNumber1.nextInt();
        
        System.out.print("Enter second number: ");
        Scanner readNumber2 = new Scanner(System.in);
        int number2 = readNumber2.nextInt();
        
        System.out.print("Enter third number: ");
        Scanner readNumber3 = new Scanner(System.in);
        int number3 = readNumber3.nextInt();
        
        int largestNumber;
        // nested if structure.
        if (number1 > number2)
        {
            if (number1 > number3)
                largestNumber = number1;
            else 
                largestNumber = number3;
        }
        else
        {
            if (number2 > number3)
                largestNumber = number2;
            else
                largestNumber = number3;
        }
        System.out.println(largestNumber+" is largest number.\n");
    }
}
