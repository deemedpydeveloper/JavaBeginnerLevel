import java.util.Scanner;
public class Parameters_Arguments
{
    /*
    int num1 --> datatype parameter
    num1, num2, num3 are called as parameters.
    parameters are the information passed by function call.
    */
    public static int greatestNumber(int num1, int num2, int num3)
    {
        if(num1 > num2 && num1 > num3)
            return num1;
        else if (num2 > num1 && num2 > num3)
            return num2;
        else
            return num3;
    }
    public static void main(String[] args)
    {
        System.out.print("Enter number1: ");
        Scanner readNumber1 = new Scanner(System.in);
        int number1 = readNumber1.nextInt();
        
        System.out.print("Enter number2: ");
        Scanner readNumber2 = new Scanner(System.in);
        int number2 = readNumber2.nextInt();
        
        System.out.print("Enter number3: ");
        Scanner readNumber3 = new Scanner(System.in);
        int number3 = readNumber3.nextInt();
        // number1, number2, number3 ----> arguments.
        System.out.println("The Greatest number is: "+greatestNumber(number1, number2, number3)+"\n");
    }
}
