package superKeyword;

class A
{
    String name = "Tejendra";
}

class B extends A
{
    String name = "Peter";
    void display()
    {
        // super method used to access super class instance variables and functions by inheritance.
        System.out.println(super.name);
    }
}



public class superKeyword
{
    public static void main(String[] args)
    {
        B b = new B();
        b.display();
    }
}
