import java.util.Scanner;
public class Problem4
{   
    // check if a password is valid or not based on some rules.
    public static boolean is_valid_password(String pass)
    {
        if (pass.length() >= 10)
        {
            int i, letter_length = 0, digit_length = 0;
            for (i = 0; i < pass.length(); i++)
            {
                char ch = pass.charAt(i);
                if (are_letters_present(ch))
                    letter_length++;
                else if (are_digits_present(ch))
                    digit_length++;
                else 
                    return false;
            } 
            return (letter_length >= 2 && digit_length >= 2);
        }
        else 
            return false;    
    }
    public static boolean are_letters_present(char ch)
    {
        ch = Character.toUpperCase(ch); // Character class.
        return (ch >= 'A' && ch <= 'Z');
    }
    public static boolean are_digits_present(char ch)
    {
        return (ch >= '0' && ch <= '9');
    }
    public static void main(String[] args)
    {
        System.out.println("Password Rules: ");
        System.out.println("1) Password must have atleast 10 characters.");
        System.out.println("2) Password consists of only letters and digits.");
        System.out.println("3) Password must contain atleast two digits.");
        
        
        System.out.print("Enter Password: ");
        Scanner readPassword = new Scanner(System.in);
        String password = readPassword.nextLine();
        
        if (is_valid_password(password))
            System.out.println("Password - "+password+" is strong.\n");
        else
        System.out.println("Password - "+password+" is weak.\n");
    }
}
