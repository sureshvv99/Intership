package practice_interviewqa;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
        
		System.out.print("Enter a number: ");
        
		int num = input.nextInt();

        int fact = 1;
        
        for(int i = 1; i <= num; i++) {
        
        	fact *= i;    // multiply each number from 1 to num to get the factorial
        }

        System.out.println("The factorial of " + num + " is: " + fact);    // print the factorial
    }
}
