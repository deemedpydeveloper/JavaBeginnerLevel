package hireiarchialInheritance;

/*Parent Class*/
class Person
{
    /*Instance variables*/
    private String name;
    private int age;
    
    /*setters & getters*/
    void setName(String name)
    {
        this.name = name;
    }
    void setAge(int age)
    {
        this.age = age;
        
    }
    String getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
}
/* Child Class */
class Teacher extends Person
{
    /*Instance Variables*/
    int salary;
    
    /*setters & getters*/
    void setSalary(int salary)
    {
        this.salary = salary;
    }
    int getSalary()
    {
        return salary;
    }
}
/*Another Child Class*/
class Student extends Person
{
    // instance variable.
    double cgpa;
    
    /*setter and getter*/
    void setCgpa(double cgpa)
    {
        this.cgpa = cgpa;
    }
    double getCgpa()
    {
        return cgpa;
    }
}
public class HieriarchialInheritance
{
    public static void main(String[] args)
    {
        // Object Creation of Child Class 1.
        Teacher t1 = new Teacher();
        
        t1.setName("Peter");
        t1.setAge(25);
        t1.setSalary(20000);
        
        System.out.println("Name: "+t1.getName());
        System.out.println("Age: "+t1.getAge());
        System.out.println("Salary: "+t1.getSalary());
        
        System.out.println("");
        
        // Object Creation of Child Class 2.
        Student s1 = new Student();
        
        s1.setName("Tejendra");
        s1.setAge(22);
        s1.setCgpa(92.78);
        
        System.out.println("Name: "+s1.getName());
        System.out.println("Age: "+s1.getAge());
        System.out.println("CGPA: "+s1.getCgpa());
        
        System.out.println("");
    }
}
