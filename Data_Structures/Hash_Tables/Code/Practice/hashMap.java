package Hash_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hashMap {
    
    
    public static void main (String [] args){
    
    	List <String> list_a = new  ArrayList<String>();
    	list_a.add("debitcard");
    	list_a.add("elvis");
    	list_a.add("silent");
    	list_a.add("badcredit");
    	list_a.add("lives");
    	list_a.add("freedom");
    	list_a.add("listen");
    	list_a.add("levis");
    	list_a.add("money");
    	
    	System.out.println(hashMap.findAnagrams(list_a));
    }
    
    public hashMap () {}
    
    public static List <List <String>> findAnagrams (List<String> dictionary){
        Map <String, List<String>> sortedStringToAnagrams = new HashMap <>();
        
        for (String s : dictionary){
            /*Sorts the string, uses it as a key, and then appends the original
              string as another as another value in the hash table. 
            */
            String sortedStr = 
                    Stream.of(s.split("")).sorted().collect(Collectors.joining());
            sortedStringToAnagrams.putIfAbsent(sortedStr, new ArrayList<String>());
            sortedStringToAnagrams.get(sortedStr).add(s);
        }
        
        return sortedStringToAnagrams.values().stream().filter(group -> group.size() >= 2).collect(Collectors.toList());
    }
}