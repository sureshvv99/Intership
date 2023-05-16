package practice_interviewqa;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
   
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
        
		System.out.print("Enter the size of the array: ");
        
		int size = input.nextInt();

        int[] arr = new int[size];    // create an integer array of given size

        System.out.print("Enter the elements of the array: ");
        
        for(int i = 0; i < size; i++) {
        
        	arr[i] = input.nextInt();    // take input for each element of the array
        }

        Arrays.sort(arr);    // sort the array in ascending order

        int secondLargest = arr[size-2];    // second largest element will be the second last element in the sorted array

        System.out.println("The second largest number in the array is: " + secondLargest);    // print the second largest number
    }
}
