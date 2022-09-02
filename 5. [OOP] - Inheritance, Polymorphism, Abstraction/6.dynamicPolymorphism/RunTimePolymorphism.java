package dynamicPolymorphism;

/*Override method is used to use same method in diffrent classes as below.
This type of method is called as 'Method Overriding'.
This is also called as 'Run-Time Polymorphism'.
Also known as 'Dynamic Polymorphism'.*/
class Animal
{
    void eat()
    {
        System.out.println("Animal eats.");
    }
}
class Lion extends Animal
{
    @Override
    void eat()
    {
        System.out.println("Lion eats flesh.");
    }
}
class Cow extends Animal
{
    @Override
    void eat()
    {
        System.out.println("Cow eats grass.");
    }
    void milk()
    {
        System.out.println("Cow gives milk.");
    }
}


public class RunTimePolymorphism
{
    public static void main(String[] args)
    {
        Animal a;
        a = new Animal();
        a.eat();
        
        a = new Lion();
        a.eat();
        
        a = new Cow();
        a.eat();
        
        Cow c = new Cow();
        c.milk();
        
        System.out.println("");
    }
}
