import java.util.Scanner;

public class ConditionalOperators
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        
        String result = (age > 18)?"You are eligible to play this game.":"Yo are not eligible to play this game.";
        System.out.println(result);
    }
}
