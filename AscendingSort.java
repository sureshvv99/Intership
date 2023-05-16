package practice_interviewqa;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {

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

        System.out.print("The sorted array in ascending order is: ");
        
        for(int i = 0; i < size; i++) {
        
        	System.out.print(arr[i] + " ");    // print each element of the sorted array
        }
    }
}
