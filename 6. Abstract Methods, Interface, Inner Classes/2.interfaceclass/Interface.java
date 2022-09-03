package interfaceclass;

interface Registration1
{
    /*By Interface class, there will be a default keywords for member fields ---> private final.*/
    void studentRollNo();
    void studentSection();
}
/*Inheritance also posiible in interface type classes.*/
interface Registration2 extends Registration1
{
    void studentCard();
}
/*Abstraction & Polymorphism*/
class BS implements Registration2  // implements keyword is used to implement methods of interface class.
{
    @Override
    public void studentRollNo()
    {
        System.out.println("BS-1");
    }
    
    @Override 
    public void studentCard()
    {
        System.out.println("BS Student Card");
    }
    
    @Override
    public void studentSection()
    {
        System.out.println("BS Section A");
    }
}

class MS implements Registration2
{
    @Override
    public void studentRollNo()
    {
        System.out.println("MS-1");
    }
    
    @Override 
    public void studentCard()
    {
        System.out.println("MS Student Card");
    }
    
    @Override
    public void studentSection()
    {
        System.out.println("MS Section A");
    }
}

class Phd implements Registration2
{
    @Override
    public void studentRollNo()
    {
        System.out.println("Phd-1");
    }
    
    @Override 
    public void studentCard()
    {
        System.out.println("Phd Student Card");
    }
    
    @Override
    public void studentSection()
    {
        System.out.println("Phd Section A");
    }
}

public class Interface 
{
    public static void main(String[] args)
    {
        BS bs = new BS();
        bs.studentRollNo();
        bs.studentCard();
        bs.studentSection();
        
        System.out.println("");
        
        MS ms = new MS();
        ms.studentRollNo();
        ms.studentCard();
        ms.studentSection();
        
        System.out.println("");
        
        Phd phd = new Phd();
        phd.studentRollNo();
        phd.studentCard();
        phd.studentSection();
        
        System.out.println("");
    }
}
