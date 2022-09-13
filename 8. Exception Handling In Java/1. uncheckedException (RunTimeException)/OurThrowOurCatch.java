package uncheckedException;

public class OurThrowOurCatch
{
    public static void main(String[] args)
    {
        int balance = 10000;
        int amountWithdrawl = 10001;
        
        /*Wherever Exception is likely to be occurred, there try block need to be used.
        Then, throw keyword is used to make our own exception message from exception class.
        Catch is used catch that exception and print a message.*/
        try
        {
            if(amountWithdrawl > balance)
                throw new ArithmeticException("This is our throw.");
            System.out.println("Doesn't execute these lines after an error occurred.");
            
            balance -= amountWithdrawl;
            System.out.println("Amount Withdwawl Successfully.");
            
        }
        
        catch(ArithmeticException a)
        {
            System.out.println("Our Catch is: "+a.getMessage());
        }
    }
}
