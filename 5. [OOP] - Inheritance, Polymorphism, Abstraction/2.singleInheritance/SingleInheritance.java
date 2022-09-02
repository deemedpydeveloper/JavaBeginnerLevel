package singleInheritance;

/*Parent Class*/
class Animal
{
    /*Instance Variables*/
    String name;
    String color;
    
    /*Constructor*/
    Animal(String name, String color)
    {
        /*If both parameters and instance variable names are same then, use this keyword.*/ 
        this.name = name;
        this.color = color;
    }
    
    /*setters/getters methods*/
    void getName()
    {
        System.out.println("Name of Dog goes here.");
    }
    void getColor()
    {
        System.out.println("Color of Dog goes here.");
    }
}

 /*Child Class*/
    class Dog extends Animal // Single Inheritance with 'extends' keyword.
    {
        Dog()
        {
            /*Optional method to invoke parent class.*/
            super("Puppy", "Brown");
        }
        void bark()
        {
            System.out.println("Dog Barks.");
        }
    }


public class SingleInheritance
{
    public static void main(String[] args)
    {
        /* Creating an object of child class.
        Obtaining the features of parent as well as child class.*/
        
        Dog d1 = new Dog();    // object creation with reference 'd1'.
        
        /* instance variables of Parent class. */
        String name = d1.name;
        String color = d1.color;
        System.out.println("The Intance Variable's values of Parent Class are: \n"+name+"\n"+color+"\n");
        
        /*Instance functions of parent Class. */
        d1.getName();
        d1.getColor();
         
        /* Instance function of Child Class. */
        System.out.println("");
        d1.bark();
    }
}
