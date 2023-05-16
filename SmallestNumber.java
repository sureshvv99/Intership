package practice_interviewqa;


import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
        
		System.out.print("Enter the size of the array: ");
        
		int size = input.nextInt();

        int[] arr = new int[size];    // create an integer array of given size

        System.out.print("Enter the elements of the array: ");
        
        for(int i = 0; i < size; i++) {
        
        	arr[i] = input.nextInt();    // take input for each element of the array
        }

        int smallest = arr[0];    // initialize smallest variable to first element of the array

        // loop through the array to find the smallest element
        for(int i = 1; i < size; i++) {
        
        	if(arr[i] < smallest) {    // if current element is smaller than the current smallest element, update smallest variable
            
        		smallest = arr[i];
            }
        }

        System.out.println("The smallest number in the array is: " + smallest);    // print the smallest number
    }
}
