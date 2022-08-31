import java.util.Scanner;
public class MethodWithReturnType
{
    /*
    int ---> return data type
    return ---> keyword to return value.
    */
    public static int Addition()
    {
        System.out.print("Enter number 1: ");
        Scanner readNumber1 = new Scanner(System.in);
        int number1 = readNumber1.nextInt();
        
        System.out.print("Enter number 2: ");
        Scanner readNumber2 = new Scanner(System.in);
        int number2 = readNumber2.nextInt();
        
        return number1 + number2;
    }
    public static void main(String[] args)
    {
        // value is returned, when function is called.
        System.out.println("Addition: "+Addition()+"\n");
    }
}
