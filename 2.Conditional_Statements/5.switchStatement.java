import java.util.Scanner;
public class switchStatement
{
    public static void main(String[] args)
    {
        System.out.print("Enter a alphabet: ");
        Scanner readAlpha = new Scanner(System.in);
        char alpha = readAlpha.next().charAt(0); // charAt() method is uesd to return character.
        
        // switch-case structure.
        switch (alpha)
        {
            case 'a':
                System.out.println("It is a vowel.\n");
                break;
            case 'e':
                System.out.println("It is a vowel.\n");
                break;
            case 'i':
                System.out.println("It is a vowel.\n");
                break;
            case 'o':
                System.out.println("It is a vowel.\n");
                break;
            case 'u':
                System.out.println("It is a vowel.\n");
                break;
            // optional block, if none of the above executed, it is executed.
            default:
                System.out.println("It is a consonant.\n");
                break;
        }
    }
}
