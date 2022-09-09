package genericMethod;

class Example
{
    public <E> void printArray(E[] s)
    {
        {
            for (E i : s)
            System.out.print(i+ " ");
        }
        System.out.println("");
    }
}

public class Generic
{
    public static void main(String[] args)
    {
        /*Always Overriding a method using Polymorphism will be a tedious task to accomplish.
        Instead, we use "Generic Method" which does use the wrapper class and obtains output with just one method.*/
        Integer[] numbers = {1, 2, 3, 4, 5};
        
        String[] languages = {"Java", "Python", "PHP", "Ruby", "C++"};
        
        /*Using the same method for different data types.*/
        Example e = new Example();
        e.printArray(numbers);
        e.printArray(languages);
        
        System.out.println("");
    }
}
