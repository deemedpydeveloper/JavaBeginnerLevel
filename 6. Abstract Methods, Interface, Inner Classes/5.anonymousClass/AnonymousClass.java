package anonymousClass;

class Animal
{
    /*Members of Animal Class.*/
    void eat()
    {
        System.out.println("Animal eats.");
    }
    
    void color()
    {
        System.out.println("Animal Color.");
    }
}

class Lion
{
    /*Anonymous Child Class.*/
    Animal a = new Animal()
    {
        @Override
        void eat()
        {
            System.out.println("Lion eats flesh.");
        }
    };
}



public class AnonymousClass
{
    public static void main(String[] args)
    {
        Lion l = new Lion();
        l.a.eat();
        l.a.color();
        
        System.out.println("");
    }
}
