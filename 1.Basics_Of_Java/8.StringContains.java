public class StringContains
{
    public static void main(String[] args)
    {
        String name = "Tejendra";
        String nickName = "Tej";
        // string.contains(givens tring) ----> this method is used to check whether the string contains the given string.
        boolean sequenceMatched = name.contains(nickName);
        
        System.out.println("contains() method: "+sequenceMatched);
    }
}
