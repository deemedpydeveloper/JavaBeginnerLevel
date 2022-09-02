package staticPolymorphism;

class Calculator
{
    /*same instance function name but, differ in theor parameter patterns.
    This is called as 'Compile-Time Polymorphism'.
    Also Known as 'Static Polymorphism'.
    This type of mention of same name to instance functions is called 'Method Overloading.'*/
    void add(int a, int b)
    {
        System.out.println("The Result of "+a+" & "+b+" is: "+(a + b));
    }
    void add(int a, double b)
    {
        System.out.println("The Result of "+a+" & "+b+" is: "+(a + b));
    }
    void add(int a, int b, float c)
    {
        System.out.println("The Result of "+a+" & "+b+" & "+c+" is: "+(a + b + c));
    }
}

public class CompileTimePolymorphism
{
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
        
        c.add(2, 3);
        c.add(5, 20.5);
        c.add(5, 10, 5.5f);
        
        System.out.println("");
    }
}
