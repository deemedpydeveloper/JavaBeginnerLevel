
/* if we create this test class final, then we cannot use extends keyword. ---> inheritance is not possible.*/
class test
{
    public final void method()
    {
        System.out.println("This mehod cannot be overriden.");
    }
}

class Student extends test
{
     /*final variable*/
    // initializing directly 
    private final int score = 100; 
    
    // intializing using constructor.
    private final char section;
    Student()
    {
        section = 'A';
    }
    
    // intializing using separate block..
    private final int fee;
    {
        fee = 20000;
    }
    
    // initializing static varaible using static initializing block.
    private static final String name;
    static
    {
        name = "Tejendra";
    }
    
    // final local variable ---> can only be initialized once.
    int Dummy(int x)
    {
        final int a = x;
        // a = 2; ---> gives an error.
        return a;
    }
    
    /*final method ---> cannot be overriden.*/
    //  public void method() ---> gives error.
    
}