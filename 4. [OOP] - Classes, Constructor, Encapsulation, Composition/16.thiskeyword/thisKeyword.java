package thiskeyword;

class Student
{
    String name;
    Student(String name)
    {
        // this keyword is used to differentiate between class variable and passed parameter when both are same.
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
}

public class thisKeyword
{
    public static void main(String[] args)
    {
        Student s = new Student("Tejendra");
        System.out.println(s.getName());
    }
}
