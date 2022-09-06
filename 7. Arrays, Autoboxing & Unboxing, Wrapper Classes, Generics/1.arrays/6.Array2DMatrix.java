package arrays;

public class Array2DMatrix
{
    public static void main(String[] args)
    {
        // Initialization of 2D Array.
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        /*To print 3 rows of matrix.*/
        for (int i = 0; i < 3; i ++)
        {
            for (int j = 0; j < 3; j ++)
                System.out.print(matrix[i][j]+" ");
            System.out.println("");
        }
        System.out.println("");
    }
}
