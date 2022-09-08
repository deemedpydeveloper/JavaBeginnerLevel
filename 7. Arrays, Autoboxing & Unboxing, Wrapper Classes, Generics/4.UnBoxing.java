public class UnBoxing
{
    public static void main(String[] args)
    {
        /*Object created from wrapper class Integer ---> i1.
        Primitive data type i2 is assigned with i1.
        So, the object from wrapper class is converted to primitive data type.
        This is called as "AutoBoxing".*/
        Integer i1 = new Integer(20);
        int i2 = i1;
        
        System.out.println("The Integer is: "+i2+"\n");
    }
}
