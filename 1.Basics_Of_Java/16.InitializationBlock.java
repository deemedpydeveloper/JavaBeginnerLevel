public class InitializationBlock
{
    // parent class.
    static class Parent
    {
        static int a = 5;
        //static initialization block.
        static
        {
            System.out.println("Parent Initialization: This is Static Initialization Block.");
        }
        //constructor block.
        Parent()
        {
            System.out.println("Parent Constructor: This is a Constructor Block.");
        }
    
    }

// Inheritance.
    static class Child extends Parent
    {
        static int a = 4;
        //instance initialization block.
        {
            System.out.println("Child Initialization: This is Instance Initialization Block.");
        }
        //constructor block.
        Child()
        {
            super(); // optional, becomes handy, if there are more sub classes.
            System.out.println("Child Constructor: This is Constructor Block.");
        }
    }
    public static void main(String[] args) 
    {
        Child c = new Child();
    }
}

