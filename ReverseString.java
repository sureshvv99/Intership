package practice_interviewqa;

import java.util.Scanner;

public class ReverseString {
	
    public static void main(String[] args) {
        
    	Scanner input = new Scanner(System.in);
       
    	System.out.print("Enter a string: ");
       
    	String string = input.nextLine();    // take string input from user

        String reverseString = new StringBuilder(string).reverse().toString();    // reverse the string using StringBuilder class

        String uppercaseReverseString = reverseString.toUpperCase();    // convert reversed string to uppercase

        System.out.println("Reversed string in uppercase: " + uppercaseReverseString);    // print the reversed string in uppercase
    }
}
