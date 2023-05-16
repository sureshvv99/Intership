package practice_interviewqa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatedChar {
	
    public static void main(String[] args) {
    
    	Scanner input = new Scanner(System.in);
        
    	System.out.print("Enter a string: ");
        
    	String str = input.nextLine();

        Set<Character> set = new HashSet<>();    // create a set to store unique characters in the string

        // loop through the string and check for repeated characters
        
        for(int i = 0; i < str.length(); i++) {
        
        	char ch = str.charAt(i);
            
        	if(set.contains(ch)) {    // if character is already in the set, it is a repeated character
            
        		System.out.println("The first repeated character in the string is: " + ch);
                
        		return;
            } 
        	else {    // if character is not in the set, add it to the set
            
        		set.add(ch);
            }
        }

        // if no repeated character is found, print a message
        
        System.out.println("There is no repeated character in the string.");
    }
}
