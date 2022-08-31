import java.util.Scanner;
public class forLoop
{
    public static void main(String[] args)
    {
        System.out.print("Enter number of rows: ");
        Scanner readRows = new Scanner(System.in);
        int rows = readRows.nextInt();
        /*
        ex:-
             *
           * * *
         * * * * *
       * * * * * * *
     * * * * * * * * *
         
         
         spaces for 1st row = 8;
         6
         4
         2
         0
         for each row spaces = 2 * rowposition from below - 2;
         number of asterisks for each row = 2 * rownumber - 1 and a space;
        */
        
        /*
            
              * * * * * * * 
                * * * * *
                  * * *
                    *
            spaces for 1st row = 2
            spaces for 2nd row = 4
            6
            8
            for each row spaces = 2 * i;
            for each row number of asterisks = 2 * rowPosition - 1;
        
        */
        
        
        int i, j, rowPosition = rows;
        // for every row.
        for (i = 1; i <= rows; i++)
        {
            // spaces for each row.
            for (j = 1; j <= 2 * rowPosition - 2; j++)
                System.out.print(" ");
            rowPosition--;
            // asterisks for each row.
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("* ");
            // print in new line
            System.out.println("");
        }
        // duplicate row is eliminated.
        rowPosition = rows - 1;
        // for every row.
        for (i = 1; i <= rows - 1; i++)
        {
            //spaces for each row.
            for (j = 1; j <= 2 * i; j++)
                System.out.print(" ");
            // asterisks for each row.
            for (j = 1; j <= 2 * rowPosition - 1; j++)
                System.out.print("* ");
            rowPosition--;
            //print in new line
            System.out.println("");
        }
    }
}
