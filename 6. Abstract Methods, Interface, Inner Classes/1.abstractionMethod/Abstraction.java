package abstractionMethod;

/*Abstraction also allows a class to have its methods and instance varibles to also be abstract.
A method declared n class is abstract can be used by child class by 'Overriding method'.*/
abstract class Account  // abstract class.
{
    public abstract void rateOfInterest();  // abstract method.
}
/*Hieriarchial Inheritance*/
class SavingAccount extends Account
{
    /*@Override Annotation need to be provided.
    This allows child class to override the abstract class mentioned in parent class.*/
    @Override
    public void rateOfInterest()
    {
        System.out.println("6%");
    }
}

class CurrentAccount extends Account
{
    @Override
    public void rateOfInterest()
    {
        System.out.println("5%");
    }
}




public class Abstraction
{
    public static void main(String[] args)
    {
        SavingAccount s1 = new SavingAccount();
        s1.rateOfInterest();
        
        CurrentAccount c1 = new CurrentAccount();
        c1.rateOfInterest();
        
        System.out.println("");
    }
}
