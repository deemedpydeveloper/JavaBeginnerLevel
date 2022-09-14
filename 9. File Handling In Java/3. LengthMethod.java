
import java.io.File;
import java.io.IOException;

public class LengthMethod
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:/Users/ASUS/Desktop/TEJENDRA/JAVA Programming/BEGINNER LEVEL/9. File Handling in Java.txt");
        
        file.createNewFile();
        
        System.out.println(file.length());  // gives the length of the file in bytes.
    }
}
