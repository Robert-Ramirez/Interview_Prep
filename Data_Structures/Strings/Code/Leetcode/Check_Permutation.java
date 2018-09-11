
public class Check_Permutation {
        public static String sort(String s) {
		//because String are immutable you need to use a toCharArray to turn String into Char array.
		char[] temp = s.toCharArray();
		//use array library to sort O(n log n)
		java.util.Arrays.sort(temp);
		//return sorted String using String wrapper to convert char array to string
		return new String(temp);
	}
	
	public static boolean permutation(String s, String t) {
		return sort(s).equals(sort(t));
	}	
    
    	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}