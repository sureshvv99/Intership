package practice_interviewqa;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
	
    public static void main(String[] args) {
    
    	String str = "drink is danger to health";
        
    	Set<Character> duplicateSet = new HashSet<Character>();
        
    	Set<Character> charSet = new HashSet<Character>();

        // Loop through each character in the string
        for(int i = 0; i < str.length(); i++) {
        
        	char c = str.charAt(i);
            
            // If the character is a letter (i.e., not a space or punctuation mark)
            if(Character.isLetter(c)) {
            
            	// If the character is already in the charSet, add it to the duplicateSet
                if(charSet.contains(c)) {
                
                	duplicateSet.add(c);
                }
                // Otherwise, add the character to the charSet
                else {
                    
                	charSet.add(c);
                }
            }
        }
        
        // Print the duplicateSet
        System.out.println("Duplicate characters in the string: " + duplicateSet);
    }
}
