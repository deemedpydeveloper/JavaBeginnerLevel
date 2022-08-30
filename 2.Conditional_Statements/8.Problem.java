import java.util.Scanner;
public class Problem
{
    public static void main(String[] args)
    {
        /*10% discount for price of product between 100 and 120 units.
        15% discount for price of products greater than 120 units.
        0% discount for price of products less than 100 units.*/
        
        // price of product.
        System.out.println("Enter the price of product: ");
        Scanner readPrice = new Scanner(System.in);
        float price = readPrice.nextFloat();
        
        // number of units.
        System.out.println("Enter the number of units purchased: ");
        Scanner readUnits = new Scanner(System.in);
        int units = readUnits.nextInt();
        
        // total price calculation.
        float totalPrice;
        totalPrice = price * units;
        
        
        //final amount.
        float discount, revenue;
        
        if (units < 100)
        {
            discount = (float)0 / 100; 
            revenue = totalPrice - (discount * totalPrice);
        }
        else if (units >= 100 && units <= 120)
        {
            discount = (float)10 / 100;
            revenue = totalPrice - (discount * totalPrice);
        }
        else
        {
            discount = (float)15 / 100;
            revenue = totalPrice - (discount * totalPrice);
        }
        System.out.println("The Total Price is: "+"$"+totalPrice);
        System.out.println("The Discount is: "+discount+"%");
        System.out.println("Fianl Amount to be paid is: "+"$"+revenue);
    }
}
