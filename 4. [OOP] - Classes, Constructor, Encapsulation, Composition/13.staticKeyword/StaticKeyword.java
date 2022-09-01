package staticKeyword;

class Student
{
    // best practice to maintain details "private".
    private String name;
    private static String schoolName;  // static class variable.
    private int rollNo;
    
    /* constructor for initializing instance variables. */
    Student(String n, int r)
    {
        // this keyword refers to the instance of the class.
        this.name = n;
        this.rollNo = r;
    }
    
    /* initializing the static class variable. */
    static
    {
        schoolName = "Spark";
    }

    /* setters methods. */
    public void setName(String n)
    {
        this.name = n;
    }

    public void setRollNo(int r)
    {
        this.rollNo = r;
    }
    
    
    /* getters methods.*/

    public String getName()
    {
        return name;
    }

    public int getRollNo()
    {
        return rollNo;
    }
    
    /* Static getter method for static variable. */
    public static String getSchoolName()
    {
        return schoolName;
    }
    
    /* Static method */
    public static void information()
    {
        System.out.println("This is the best school.");
    }
    
    /* static inner class */
    static class tej
    {
        private char section;
        
        tej(char s)
        {
            this.section = s;
        }

        
        public void setSection(char s)
        {
            this.section = s;
        }

        public char getSection()
        {
            return section;
        }
    }
}


public class StaticKeyword
{
    public static void main(String[] args)
    {
        Student s = new Student("Tej", 20);
        
        /* directly use class for static methods and variables. */
        System.out.println("The Schhol name is: "+Student.getSchoolName());  
        Student.information();

        
        /* tapping into static inner class */
        Student.tej t = new Student.tej('A');
        
        System.out.println(t.getSection());
        
        t.setSection('B');
        
        System.out.println(t.getSection());
        
        
        /* normal accessing of instance variables and functions */
        System.out.println(s.getName());
        System.out.println(s.getRollNo());
        
        s.setName("Tejendra");
        s.setRollNo(26);
        
        System.out.println(s.getName());
        System.out.println(s.getRollNo());
        
    }
}
