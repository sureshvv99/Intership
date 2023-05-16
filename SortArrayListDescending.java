package practice_interviewqa;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListDescending {
    
	public static void main(String[] args) {
        
		ArrayList<Integer> numbers = new ArrayList<Integer>();
        
		numbers.add(5);
        
		numbers.add(3);
        
		numbers.add(8);
        
		numbers.add(1);
        
		numbers.add(2);

        System.out.println("Original list: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("List sorted in descending order: " + numbers);
    }
}
