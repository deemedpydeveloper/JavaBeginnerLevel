public class Problem1
{
    public static void main(String[] args)
    {
        // sum of 1st 100 natural numbers.
        int i = 1, sum = 0;
        while(i <= 100)
        {
            sum += i;
            i++;
        }
        System.out.println("The Sum of 1st 100 natural numbers: "+sum+"\n");
    }
}
