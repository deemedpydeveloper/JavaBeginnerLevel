package uncheckedException;

public class DefaultThrowOurCatch
{
    public static void main(String[] args)
    {
        /*try block is used when there is a chance of ocurring errors during run time.
        If there are two errors, only first error handling is done.*/
        try
        {
            System.out.println("Start of the program.");
            String s = null;
            System.out.println(s.length());
            System.out.println(12 / 0);
        }
        
        /*catch bleck is used to handle the error during run time.
        multiple catch blocks can be written for handling errors.
        getMessage() is a method to diaplay the error instaed of classes.*/
        catch(ArithmeticException a)
        {
            System.out.println("Our Catch: "+a.getMessage());
        }
        
        catch(NullPointerException n)
        {
            System.out.println("Our Catch: "+n.getMessage());
        }
        
        /*If there is no exception occurred then, finally block is executed.*/
        finally
        {
            System.out.println("End of the program.");
        }
    }
}
