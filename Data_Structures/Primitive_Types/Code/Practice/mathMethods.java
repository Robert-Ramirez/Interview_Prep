import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class mathMethods {
    
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        Random rand = new Random ();
        double x, y;
        
        System.out.print("Please provide two numbers (x, y): ");
        x = input.nextDouble();
        y = input.nextDouble();
        System.out.println("Absolute Function: " + Math.abs(x) + " " + Math.abs(y));
        System.out.println("Ceiling Function: " + Math.ceil(x) + " " + Math.ceil(y));
        System.out.println("Floor Function: " + Math.floor (x) + " " + Math.floor(y));
        System.out.println("Min Function: " + Math.min (x, y));
        System.out.println("Max Function: " + Math.max(x, y));
        System.out.println("Power function (x^y): " + Math.pow (x, y));
        System.out.println("Square Root function: " + Math.sqrt(x) + " " + Math.sqrt(y));
    }
}