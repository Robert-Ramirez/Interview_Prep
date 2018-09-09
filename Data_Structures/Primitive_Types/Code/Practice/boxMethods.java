public class boxMethods {
    
    public static void main (String [] args){
        //converting integer to string
        int x = 100;
        String test = Integer.toString(x);
        System.out.println(test);
        
        //string to integer
        String y = "5";
        int z = Integer.parseInt(y);
        System.out.println(z);
        
        //character to integer
        char a = '1';
        int b = Character.getNumericValue(a);
        int c = Integer.valueOf("30");
        System.out.println(b);
        System.out.println(c);
        
        //integer to char
        int o = 5;
        String e = Integer.toString(o);
        char u = e.charAt(0);
        System.out.println(u);
    }
}