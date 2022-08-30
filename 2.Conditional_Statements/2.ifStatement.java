import java.util.Scanner;
public class ifStatement
{
    public static void main(String[] args)
    {
        System.out.print("Enter your age: ");
        Scanner readAge = new Scanner(System.in);
        int age = readAge.nextInt();
        // if (condition)
        if (age >= 18)
            System.out.println("You are eligible.");
        
        System.out.println("Statement outside if block.\n");
    }
}
