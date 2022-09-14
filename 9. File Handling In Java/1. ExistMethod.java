
import java.io.File;
import java.io.IOException;

public class ExistMethod
{
    public static void main(String[] args) throws IOException
    {
        // File class.
        File file = new File("C:/Users/ASUS/Desktop/TEJENDRA/JAVA Programming/BEGINNER LEVEL/9. File Handling in Java");
        
        System.out.println(file.exists()); // gives false.
        
        file.createNewFile(); // creates file.
        
        System.out.println(file.exists()); // gives true.
    }
}
