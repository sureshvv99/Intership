package practice_interviewqa;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    
	public static void main(String[] args) {
    
		String str = "Hello, World!";
        
		Map<Character, Integer> freqMap = new HashMap<Character, Integer>();
        
        // Loop through each character in the string
        
		for(int i = 0; i < str.length(); i++) {
        
			char c = str.charAt(i);
            
            // If the character is not a space or punctuation mark
            
			if(Character.isLetter(c)) {
            
				// If the character is already in the map, increment its count
                
				if(freqMap.containsKey(c)) {
                
					freqMap.put(c, freqMap.get(c) + 1);
                }
                // Otherwise, add the character to the map with a count of 1
                
				else {
                
					freqMap.put(c, 1);
                }
            }
        }
        
        // Print the frequency map
        
		for(Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
        
			System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
