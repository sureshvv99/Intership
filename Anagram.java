package practice_interviewqa;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        
        String str1 = input.nextLine().toLowerCase();   // take first string input from user and convert to lowercase
        
        System.out.print("Enter the second string: ");
        
        String str2 = input.nextLine().toLowerCase();   // take second string input from user and convert to lowercase

        // remove all white spaces from the strings
        
        str1 = str1.replaceAll("\\s", "");
        
        str2 = str2.replaceAll("\\s", "");

        if(str1.length() != str2.length()) {
        
        	System.out.println("The two strings are not anagram.");
            
        	return;
        }

        // convert both strings to char arrays, sort them and compare
        
        char[] charArray1 = str1.toCharArray();
        
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1, charArray2)) {
        
        	System.out.println("The two strings are anagram.");
        } 
        else {
        
        	System.out.println("The two strings are not anagram.");
        }
    }
}


