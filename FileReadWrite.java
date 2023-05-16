package practice_interviewqa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
   
	public static void main(String[] args) {
        
		String fileName = "example.txt";
        
		String newContents = "This is new content that will be written to the file.";

        try {
            // Read the contents of the file
        
        	BufferedReader reader = new BufferedReader(new FileReader(fileName));
            
        	String line = null;
            
        	StringBuilder stringBuilder = new StringBuilder();
            
        	while((line = reader.readLine()) != null) {
            
        		stringBuilder.append(line);
                
        		stringBuilder.append(System.lineSeparator());
            }
            
        	String oldContents = stringBuilder.toString();
            
        	reader.close();
            
            // Write new contents to the file
            
        	BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            
        	writer.write(newContents);
            
        	writer.close();
            
            System.out.println("The contents of the file have been updated.");
        } 
        catch(IOException e) {
        
        	System.out.println("An error occurred while reading or writing the file.");
            
        	e.printStackTrace();
        }
    }
}
