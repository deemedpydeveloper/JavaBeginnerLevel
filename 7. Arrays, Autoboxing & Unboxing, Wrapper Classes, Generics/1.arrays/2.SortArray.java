package arrays;

// To Use Array Methods.
import java.util.Arrays;

public class SortArray
{
    public static void main(String[] args)
    {
        /* Array Initialization */
        int[] arr = {12, 45, 1, 34};
        
        Arrays.sort(arr);
        
        for (int a : arr)
        {
            System.out.print(a+" ");
        }
        System.out.println("");
    }
}
