
import java.io.File;
import java.io.IOException;

public class DeleteMethod
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:/Users/ASUS/Desktop/TEJENDRA/JAVA Programming/BEGINNER LEVEL/9. File Handling in Java.pdf");
        
        file.createNewFile();
        
        System.out.println(file.delete());  // deletes the file created or existing file.
    }
}
