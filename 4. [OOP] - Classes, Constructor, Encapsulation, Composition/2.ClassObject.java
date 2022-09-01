public class ClassObject
{
    /*Class intance variables.*/
    String name = "Tejendra";
    char section = 'A';
    int Class = 10;
    /*Class instance functions.*/
    void studentName()
    {
        System.out.println("Student name is: "+name+".");
    }
    void studentClass()
    {
        System.out.println("Student Class is: "+Class+".");
    }
    void studentSection()
    {
        System.out.println("Student section is: "+section+".\n");
    }
    public static void main(String[] args)
    {
        ClassObject s = new ClassObject();  // Object Creation.
        /* Object Methods */
        s.studentName();
        s.studentClass();
        s.studentSection();
        /* Object Attributes */
        String Name = s.name;
        int ClassNo =s.Class;
        char Section = s.section;
        System.out.println("Student Details:-Name    : "+Name+".\n\t\t ClassNo.: "+ClassNo+".\n\t\t Section : "+Section+".\n");
    }
}
