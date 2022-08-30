import java.util.Scanner;
public class ifelseifStatements
{
    public static void main(String[] args)
    {
        System.out.println("Enter your age: ");
        Scanner readAge = new Scanner(System.in);
        int age = readAge.nextInt();
        
        // if (condition1)
        if (age < 13)
            System.out.println("You are a child.");
        // else if (condition2)
        else if (age >= 13 && age <= 18)
            System.out.println("You are a teenagaer");
        // else if (condition3)
        else if (age > 18 && age <= 25)
            System.out.println("You are a young adult.");
        // else if (condition4)
        else if (age > 25 && age <= 50)
            System.out.println("You are a true adult");
        // else
        else
            System.out.println("You are a senior citizen.");
    }
}
