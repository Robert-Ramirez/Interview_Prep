import java.util.Scanner;

public class countBits {
    
    public static void main (String [] args){
        countBits test = new countBits();
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Please provide a integer: ");
        int n = input.nextInt();
        
        System.out.println(test.countBits(n));
    }
    
    //default constructor
    public countBits () {}
    
    //method
    public int countBits(int x){
        //intialized counter
        int count = 0;
        //iterate over the variable.
        while (x != 0){
            /*Binary AND Operator
            if variable last bit is 1 
            copies the bit to the result (stored to count).
            */
            count += (x & 1);
            
            //Shift right zero fill operator
            x >>>= 1;
        }
        
        return count;
        
    }
}