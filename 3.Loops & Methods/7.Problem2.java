public class Problem2
{
    public static void main(String[] args)
    {
        // sum of 1st 100 natural numbers.
        int i = 1, sum = 0;
        do 
        {
            sum += i;
            i ++;
        }while(i <= 100);
        System.out.println("The sum of 1st 100 natural numbers: "+sum+"\n");
    }
}
