public class Palindromic {
    
    public static void main (String args []){
        Palindromic test = new Palindromic ();
        System.out.println(test.isPalindromic("Teset"));
    }

    public Palindromic() {}
    
    
    //Time complexity is O(n) and the space complexity is O(1), where n is the length of the string
    public static Boolean isPalindromic (String s){
        for (int i = 0, j = s.length () - 1; i < j; ++i, --j){
            if (s.charAt(i) != s.charAt(j)) {
            return false;
            }
        } 
        return true;
    }
}