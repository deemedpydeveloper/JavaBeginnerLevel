public class WrapperClasses
{
    public static void main(String[] args)
    {
        /*Difference between Wrapper Classes and Variables Initialization.*/
        int a = 10; // variable initialization.
        Integer b = new Integer(11); // Object Creation using Wrapper Class 'Integer'.
        System.out.println("Variable Initialization: "+a);
        System.out.println("Object Creation using Wrapper Class: "+b);
        
        System.out.println("");
        
        String s = "Tejendra";
        String t = new String("Yerra");
        System.out.println("First Name: "+s+".");
        System.out.println("Last Name: "+t+".");
        
        System.out.println("");
    }
}
