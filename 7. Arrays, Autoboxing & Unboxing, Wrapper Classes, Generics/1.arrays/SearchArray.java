package arrays;

import java.util.Arrays;

public class SearchArray
{
    public static void main(String[] args)
    {
        String[] arr = {"Tej", "Akhil", "Pradeep", "Soujanya"};
        
        Arrays.sort(arr);
        
        for (String a : arr)
        {
            System.out.print(a+" ");
        }
        
        System.out.println("");
        
        // binarySearch(arrayRefVar, data) ----> returns the index of data in array.
        int nameIndex = Arrays.binarySearch(arr, "Tej");
        
        System.out.println("The Index of String is: "+nameIndex);
        
        System.out.println("");
    }
}
