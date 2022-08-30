public class AssignmentOperators
{
     public static void main(String[] args)
     {
        int a = 10;
        int b = a;
        
        System.out.println("Assignment: "+b);
        
        /*SHORT HAND NOTATION OF ARITHMETIC OPERATIONS.
        SYNTAX: OPERAND1 <OPERATOR>= OPERAND2
        OPERATOR CAN BE ANY ONE OF ARITHMETIC OPERATORS.
        */
        
        System.out.println("Addition Assignment: "+(a += b));
        
        System.out.println("Subtraction Assignment: "+(a -= b));
        
        System.out.println("Multiplication Assignment: "+(a *= b));
        
        System.out.println("Division Assignment: "+(a /= b));
        
        System.out.println("Modulus Assignment: "+(a %= b));
        
    }
}
