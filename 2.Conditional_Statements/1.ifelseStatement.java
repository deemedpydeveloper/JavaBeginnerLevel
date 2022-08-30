import java.util.Scanner;
public class ifelseStatement
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner readNumber = new Scanner(System.in);
        int number = readNumber.nextInt();
        
        // if (condition)
        if (number % 2 == 0)
            System.out.println(number+" is an even number.");
        // else
        else
            System.out.println(number+" is an odd number.\n");
    }
}
