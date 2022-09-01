class Student
{
    /* encapsulation provides facility of getters and setters method with in the same class by wrapping all member fields.*/
    private String name;
    private int rollno;
    private int fee;
    
    //setters.
    public void setName(String Name)
    {
        this.name = Name;
    }
    public void setRollno(int Rollno)
    {
        this.rollno = Rollno;
    }
    public void setFee(int Fee)
    {
        this.fee = Fee;
    }
    
    
    //getters.
    public String getName()
    {
        return name;
    }
    public int getRollno()
    {
        return rollno;
    }
    public int getFee()
    {
        return fee;
    }
}
public class Encapsulation
{
    public static void main(String[] args)
    {
        Student s; // creating a reference.
        s = new Student(); // creating an object.
        
        s.setName("Tejendra"); // creating an instance.
        s.setRollno(44);
        s.setFee(100000);
        
        System.out.println(s.getName());
        System.out.println(s.getRollno());
        System.out.println(s.getFee());
    }
}