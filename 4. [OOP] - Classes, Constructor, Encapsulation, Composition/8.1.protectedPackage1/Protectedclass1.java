package protectedPackage1;

public class Protectedclass1
{
    protected void print() //protected method.
    {  
        System.out.println("This class is protected.\nIt can be acccessed if, the class is within same package.\nAlso if, class is a sub-class and present outside the package.\n");
    }
}