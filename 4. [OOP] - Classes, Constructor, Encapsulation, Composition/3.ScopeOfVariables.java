public class ScopeOfVariables
{
    /*Not a best way to initialize class variables like this.
    We use the help of 'Constructor'.*/
    String name = "Tejendra";  // instance variable.
    int standard = 10;
    char section = 'A';
    // class variables always declared with 'static' keyword.
    static int a; // class variable.
    void studentName()
    { 
        int a; // local variable
        System.out.println("Name: "+name);
    }
    void studentStandard()
    {
        System.out.println("Standard: "+standard);
    }
    void studentSection()
    {
        System.out.println("Section: "+section);
    }
    public static void main(String[] args)
    {
        ScopeOfVariables s = new ScopeOfVariables();
        String name = s.name;
        int standard = s.standard;
        char section = s.section;
        System.out.println("Student Details:\nName - "+name+"\nStandard - "+standard+"\nSection - "+section+"\n");
        s.studentName();
        s.studentStandard();
        s.studentSection();
    }
}
