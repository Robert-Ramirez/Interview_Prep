

public class URLify {
    
	// Assume string has sufficient free space at the end
	public static void replaceSpaces(char[] str, int trueLength) {
	    //counting empty spaces
		int spaceCount = 0;
		for (int i = 0; i < trueLength; i++) {
			if (str[i] == ' ') spaceCount++;
		}
		
		//create new index with future char array size
		int index = trueLength + spaceCount * 2;
		
		//in case future there is no empty 
		if (trueLength < str.length) str[trueLength] = '\0';
		
		//update the string at the back end
		//I predecremented due to new array 0-16 while index 1-17. 
		for (int i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[--index] = '0';
				str[--index] = '2';
				str[--index] = '%';
			} else {
				str[--index] = str[i];
			}
		}
	}
	
	public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		char[] arr = str.toCharArray();
		int trueLength = findLastCharacter(arr) + 1;
		replaceSpaces(arr, trueLength);	
		
		System.out.println("\"" + new String (arr) + "\"");
	}
	
}