package staticInnerClass;

class OuterClass
{
    static class InnerClass  // static member of Outerclass.
    {
        void print()
        {
            System.out.println("Static Inner Class.");
        }
    }
}


public class StaticInnerClass
{
    public static void main(String[] args)
    {
        OuterClass.InnerClass o1 = new OuterClass.InnerClass();  // Syntax for creating a object of InnerClass.
        o1.print();
        System.out.println("");
    }
}
