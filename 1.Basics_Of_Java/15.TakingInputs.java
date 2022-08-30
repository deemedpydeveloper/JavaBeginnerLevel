import java.util.Scanner; // import method used to get classes from java libraryimport java.util.Scanner;.
public class TakingInputs
{
    public static void main(String[] args)
    {
        // println() --> used to move the cursor to new line after printing.
        System.out.print("Enter your name: "); // print() --> used to just print the line and cursor reamins at end of line.
        Scanner readName = new Scanner(System.in); // System.in --> used to read input from console.
        String name = readName.nextLine();  // . nextLine() ---> used to read string from console.
        System.out.println("nextLine() method: "+name);
        
        System.out.print("\nEnter your section: ");
        Scanner readSection = new Scanner(System.in);
        String section = readSection.next(); // next() ---> used to read one word of string from console.
        System.out.println("next() method: "+section);
        
        System.out.print("\nEnter your rollno.: ");
        Scanner readRollNo = new Scanner(System.in);
        int rollNo = readRollNo.nextInt(); // nextint() --> used to read the integer from console.
        System.out.print("nextInt() method: "+rollNo);
        
        System.out.print("\nOther methods also include: \nnextShort()\nnextLong()\nnextFloat()\nnextDouble()\nnextByte\nnextBoolean().");
    }
}
