package checkedException;

import java.io.IOException;

public class CompileTimeException2
{
    public static void main(String[] args)
    {
        try
        {
            throw new IOException();
        }
        
        catch(IOException e)
        {
            System.out.println("The Compile Time Error is: "+e.getMessage());
        }
    }
}