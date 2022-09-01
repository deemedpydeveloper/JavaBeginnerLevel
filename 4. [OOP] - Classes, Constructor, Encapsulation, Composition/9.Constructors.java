public class Constructors
{
    private String name;
    private int fee;
    private char section;
    // This is the way to initialize the instance variables of class.
    Constructors()
    {
        name = "Tejendra";
        fee = 10000;
        section = 'A';
    }
    // parameterized constructor.
    Constructors(String n, int f, char s)
    {
        name = n;
        fee = f;
        section = s;
    }
    // instance functions.
    String getName()
    {
        return name;
    }
    int getFee()
    {
        return fee;
    }
    char getSection()
    {
        return section;
    }
    public static void main(String[] args)
    {
        // Constructor with no parameters.
        Constructors s1 = new Constructors();
        System.out.println("NAME: "+s1.getName());
        System.out.println("FEE: "+s1.getFee());
        System.out.println("SECTION: "+s1.getSection()+"\n");
        
        // Constructor with parameters.
        Constructors s2 = new Constructors("Tej", 5000, 'B');  // compiler automatically chooses the best constructor suitable.
        System.out.println("NAME: "+s2.getName());
        System.out.println("FEE: "+s2.getFee());
        System.out.println("SECTION: "+s2.getSection()+"\n");
    }
}
