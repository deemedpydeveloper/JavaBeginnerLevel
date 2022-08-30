public class StringIndex
{
    public static void main(String[] args)
    {
        String name = "Tejendra";
        // string.indexOf(char) ---> this method gives the index of first occurrence of character in a given string.
        int T = name.indexOf("T");
        
        System.out.println("indexOf() char method: "+T);
        
        // string.indexOf(string) ---> this method gives the index of first occurrence of string in a given string.
        int je = name.indexOf("je");
        
        System.out.println("indexOf() string method: "+je);
    }
}
