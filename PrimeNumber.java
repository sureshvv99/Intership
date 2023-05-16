package practice_interviewqa;

import java.util.Scanner;

public class PrimeNumber {
    
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
        
		System.out.print("Enter a number: ");
        
		int num = input.nextInt();

        boolean isPrime = true;
        
        if(num <= 1) {
        
        	isPrime = false;    // 1 and numbers less than 1 are not prime
        }
        else {
            
        	for(int i = 2; i < num; i++) {
            
        		if(num % i == 0) {
                
        			isPrime = false;    // if the number is divisible by any number from 2 to num-1, then it is not prime
                    
        			break;
                }
            }
        }

        if(isPrime) {
           
        	System.out.println(num + " is a prime number");    // if isPrime is still true, then the number is prime
        }
        else {
            
        	System.out.println(num + " is not a prime number");    // if isPrime is false, then the number is not prime
        }
    }
}
