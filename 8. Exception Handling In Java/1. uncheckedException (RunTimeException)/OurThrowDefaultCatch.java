package uncheckedException;

public class OurThrowDefaultCatch
{
    public static void main(String[] args)
    {
        int balance = 10000;
        int amountWithdrawl = 10001;
        
        // throw keyword is used to define our own exception message from exception class.
        if (amountWithdrawl > balance)
             throw new ArithmeticException("Withdrawl amount is greater than balance. Try Again!");
        
        balance -= amountWithdrawl;
        System.out.println("Your balance amount is: "+balance);
    }
}
