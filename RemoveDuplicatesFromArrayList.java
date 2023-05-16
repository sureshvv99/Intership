package practice_interviewqa;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArrayList {
    
	public static void main(String[] args) {
    
		ArrayList<String> fruits = new ArrayList<String>();
        
		fruits.add("apple");
        
        fruits.add("banana");
        
        fruits.add("orange");
        
        fruits.add("apple");
        
        fruits.add("grape");
        
        fruits.add("banana");
        
        System.out.println("Original list: " + fruits);
        
        LinkedHashSet<String> set = new LinkedHashSet<String>(fruits);
        
        ArrayList<String> uniqueList = new ArrayList<String>(set);
        
        System.out.println("List with duplicates removed: " + uniqueList);
    }
}
