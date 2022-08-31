import java.util.Scanner;
public class dowhileLoop
{
    public static void main(String[] args)
    {
        int i = 1;
        
        // do-while loop structure
        do
        {
            // irrespective of condition, this block is executed one time.
            System.out.print("Enter username: ");
            Scanner readUserName = new Scanner(System.in);
            String userName = readUserName.nextLine();

            System.out.print("Enter password: ");
            Scanner readPassword = new Scanner(System.in);
            String password = readPassword.nextLine();
            
            if (userName.contains("Java") && password.contains("Programming"))
            {
                System.out.print("Log in Successful.\n");
                break;
            }   
            System.out.print("Please enter correct username and password.\n");
            i++; // condition to break the loop.
        }while (i <= 3); // while condition is checked at last.
        System.out.println("Sorry, Try Again!");
    }
}
