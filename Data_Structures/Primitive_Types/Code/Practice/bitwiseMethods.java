import java.util.Scanner;

public class bitwiseMethods {
    
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int x, and = 0, or = 0, xor = 0, comp = 0, Lshift = 0, Rshift = 0, ZRshift = 0;
        
        System.out.print("Please provide an integer: ");
        x = input.nextInt();
        
        //Binary AND Operator copies a bit to the result if it exists in both operands.
        and += 0 & 1;
        //Binary OR Operator copies a bit if it exists in either operand.
        or += 1 | 1;
        //Binary XOR Operator copies the bit if it is set in one operand but not both.
        xor += 1 ^ 1;
        //Binary Ones Complement Operator is unary and has the effect of 'flipping' bits.
        comp = ~1;
        //Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.
        Lshift = x << 1;
        //Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
        Rshift = x >> 1;
        //Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.
        ZRshift = x >>> 1;
        
        System.out.println("Bit Representation: " + Integer.toBinaryString(x));
        System.out.println("<< (left shift): " + Integer.toBinaryString(Lshift));
        System.out.println(">> (right shift): " + Integer.toBinaryString(Rshift));
        System.out.println(">>> (zero fill right shift): " + Integer.toBinaryString(ZRshift));
                
        System.out.println();
        System.out.println("0 & 1 (bitwise and): " + Integer.toBinaryString(and));
        System.out.println("1 | 1 (bitwise or): " + Integer.toBinaryString(or));
        System.out.println("1 ^ 1 (bitwise XOR): " + Integer.toBinaryString(xor));
        System.out.println("~1 (bitwise compliment): " + Integer.toBinaryString(comp));
    }
}