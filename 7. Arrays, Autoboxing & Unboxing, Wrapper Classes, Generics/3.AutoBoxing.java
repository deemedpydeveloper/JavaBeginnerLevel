public class AutoBoxing
{
    public static void main(String[] args)
    {
        /*Integer Initialization is done. ---> i1 = 10.
        An Object is created by using Integer Wrapper class. ---> i2.
        This i2 is initialized with value of i1.
        This type of conversion is called as "AutoBoxing".*/
        int i1 = 10;
        Integer i2 = new Integer(i1);
        
        System.out.println("The Integer is: "+i2+"\n");
    }
}
