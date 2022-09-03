package abstraction;

/*Abstarction of a class makes the members of a class to be hidden from user.
Also makes possible the usage of Paarent class members using child class ---> Inheritance.*/
abstract class Person
{
    private String name;
    private int Age;

    public Person(String name, int Age)
    {
        this.name = name;
        this.Age = Age;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int Age)
    {
        this.Age = Age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return Age;
    }
}

class Student extends Person
{
    private int fee;
    Student(String name, int Age, int fee)
    {
        super(name, Age);
        this.fee = fee;
    }

    public void setFee(int fee)
    {
        this.fee = fee;
    }

    public int getFee()
    {
        return fee;
    }
}


public class Abstraction
{
    public static void main(String[] args)
    {
        // Person p = new Person();
        // Person is abstract, it cannot be instantiated.
        
        Student s1 = new Student("Tejendra", 22, 2000);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getFee());
        
        System.out.println("");
    }
}
