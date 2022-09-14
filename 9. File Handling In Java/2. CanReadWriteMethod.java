
import java.io.File;
import java.io.IOException;

public class CanReadWriteMethod
{
    public static void main(String[] args) throws IOException
    {
            File file = new File("C:/Users/ASUS/Desktop/TEJENDRA/JAVA Programming/BEGINNER LEVEL/9. File Handling in Java.doc");
            
            file.createNewFile();
            
            System.out.println(file.canRead()); // can file be read or not
            
            System.out.println(file.canWrite());  // can file be write or not
    }
}
