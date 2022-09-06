package arrays;

import java.util.Scanner;

public class JavaArrays
{
    public static void main(String[] args)
    {
        //(1) declaration of an array ---> Syntax  -  <datatype>[] <arrayrefVar>;
        int[] arr1;
        
        //(2) declaration of an array ---> Syntax  -  <datatype> <arrayRefVar>[];
        String arr2[];
        
        /* (1) creation of an array ---> Syntax  - <arrayRefVar> = new <datatype>[arraySize]; */
        arr1 = new int[10];
        arr2 = new String[10];
        
        /* Taking Inputs from console. */
        for (int i = 0; i < arr1.length; i ++) // For Loop.
        {
            System.out.print("Enter number "+(i + 1)+": ");
            Scanner s1 = new Scanner(System.in);
            int number = s1.nextInt();
            arr1[i] = number;
        }
        
        System.out.println("");
        
        System.out.print("My Contact Number is: ");
        /* Printing Inputs on Console. */
        for (int number : arr1)
        {
            System.out.print(+number);
        }
        System.out.println(".\n");
    }
}
