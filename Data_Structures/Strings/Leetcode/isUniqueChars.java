
public class isUniqueChars {
	public static boolean isUniqueChars(String str) {
	    //check for length of string, if it over the amount of unique ascii codes than there is surely duplicate characters
	    if(str.length() > 128) return false;
	    
	    //created hash table boolean to flag duplicate characters
	    boolean [] check = new boolean [128];
	    
	    //run a for look in order to iterate through the string.
        for(int i = 0; i < str.length(); i++){
            //convert the characters of the string array into integers
            int val = str.charAt(i);
            //check the hash table for past characters seen, there are 128 ascii codes
	        if(check[val]) return false;
	        //turn on the true flag for characters you are seeing
	        check[val] = true;
	    }
	    
	    //pass the hash table therefore it is unique and true;
	    return true;

	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

}