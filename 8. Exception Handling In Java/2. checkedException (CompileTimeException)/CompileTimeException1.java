package checkedException;

import java.io.IOException;

public class CompileTimeException1
{
    public static void main(String[] args) throws IOException  // throws keyword is used instead of try catch, if an exception is probably going to occur.
    {
        throw new IOException();  // compile time exception are known to be checkedException.
    }
}
// this is not the right approach.
// try catch is only the best approach.