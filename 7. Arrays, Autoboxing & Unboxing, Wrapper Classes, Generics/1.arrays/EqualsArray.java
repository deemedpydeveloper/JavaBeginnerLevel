package arrays;

import java.util.Arrays;

public class EqualsArray
{
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        
        // equals(arrayRefVar1, arrayRefVar2) --> this method returns a boolean value by comparing both arrays.
        boolean result = Arrays.equals(arr1, arr2);
        
        System.out.println("Result: "+result+".");
        System.out.println("");
    }
}
