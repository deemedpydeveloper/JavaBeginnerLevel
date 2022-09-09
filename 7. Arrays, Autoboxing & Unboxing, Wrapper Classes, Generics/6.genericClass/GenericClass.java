package genericClass;

/*Generic Class.*/
class Example<E> // <Any_name> ---> It is a placeholder which is replaced by an object creation in main method.
{
    // Declaration of Variable i.
    E var; 
    public void setI(E enterInput)
    {
        var = enterInput;
    }
    public E getI()
    {
        return var;
    }
    
    
}

public class GenericClass
{
    public static void main(String[] args)
    {
        /*Creating Integer data type Object of class Example.
        Also, Creating String data type Object of class Example.
        This Avoids use of Polymorphism.
        So that, we can pass integer as well as string data type parameters to same method without 'Over-riding'.*/
        Example<Integer> i = new Example<>(); 
        Example<String> s = new Example<>();
        
        /*Creating reference variable for parametrs.*/
        Integer i1 = 10;  // int i1 = 10;
        String s1 = "Java";  // String s1 = "Java";
        
        /*Accessing methods of class Example.*/
        i.setI(i1);
        System.out.println(i.getI());
        
        System.out.println("");
        
        s.setI(s1);
        System.out.println(s.getI());
        
        System.out.println("");
    }
}
