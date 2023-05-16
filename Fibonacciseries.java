package practice_interviewqa;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
        
		System.out.print("Enter a number: ");
        
		int num = input.nextInt();

        int a = 0, b = 1, c;
        
        System.out.print("Fibonacci series up to " + num + ": ");
        
        while(a <= num) {
        
        	System.out.print(a + " ");
            
        	c = a + b;
            
        	a = b;
            
        	b = c;
        }
    }
}
