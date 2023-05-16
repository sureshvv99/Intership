package practice_interviewqa;

import java.util.Iterator;
import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		System.out.println("the palindrome you want to check");
		
		String str = sr.nextLine();
		
		String rev = "";
		
		for(int i = str.length()-1; i >=0; i--) {
			
			rev = rev + str.charAt(i);
			
		}
		
		System.out.println(rev);	
		
		{
			if (str.equals(rev)) {
				
				System.out.println("given string is palindrome");
			}	
				else {
					System.out.println("given string is not palindrome");
			}
		}
			
	}
}
