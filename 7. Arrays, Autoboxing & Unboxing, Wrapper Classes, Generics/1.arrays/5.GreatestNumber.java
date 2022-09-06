package arrays;

import java.util.Scanner;

public class GreatestNumber
{
    public static void main(String[] args)
    {
        // Creating an Array.
        int[] arr = new int[10];
        
        /*Inputting an Array.*/
        for (int i = 0; i < arr.length; i ++)
        {
            System.out.print("Enter "+(i+1)+" number: ");
            Scanner s = new Scanner(System.in);
            int number = s.nextInt();
            arr[i] = number;
        }
        
        /*Finding Greatest Number of an Array.*/
        int greatestNumber = arr[0];
        for (int i = 0; i < arr.length; i ++)
        {
            if (arr[i] > greatestNumber)
                greatestNumber = arr[i];
        }
        
        System.out.println("The Greatest Number in Array is: "+greatestNumber+".");
    }
}
