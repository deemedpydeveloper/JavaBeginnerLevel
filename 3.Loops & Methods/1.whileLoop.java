import java.util.Scanner;
public class whileLoop
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner readNumber = new Scanner(System.in);
        int number = readNumber.nextInt();
        
        int i = 1;
        // while (condition)
        while (i <= number)
        {
            // block of statements.
            if (i % 2 == 0)
            {
                if (i == number)
                    System.out.print(i+".");
                else
                    System.out.print(i+", ");
            }
            i++; // condition to stop loop.
        }
        System.out.print("\n");
    }
}
