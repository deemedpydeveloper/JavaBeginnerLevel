package constructorChaining;

// extends keyword used to create a child class of existing class.
public class B extends A
{
    B() 
    {
        // when called firstly, super() method is default which is set by compiler.
        this(5); // finds the constructor with one parameter and executes it  first when called.
        System.out.println("Constructor1 of class B.");
    }
    // constructor with one parameter.
    B(int a)
    {
//        super(); ---> optional.
        System.out.println("Constructor2 of class B.");
    }
    
}
