package nonStaticInnerClass;

class OuterClass
{
    class InnerClass // Non - Static member.
    {
        void print()
        {
            System.out.println("Non - Static Inner Class.");
        }
    }
}

public class NonStaticInnerClass
{
    public static void main(String[] args)
    {
        /*Syntax for Creation of Object for Non-Static InnerClass from a OuterClass.*/
        OuterClass o1 = new OuterClass();
        OuterClass.InnerClass i1 = o1.new InnerClass(); 
        
        i1.print();
        System.out.println("");
    }
}
