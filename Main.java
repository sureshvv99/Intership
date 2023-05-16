package practice_interviewqa;

class MyClass {
   
	private int value;
    
    public MyClass(int value) {
        
    	this.value = value;
    }
    
    public void setValue(int value) {
        
    	this.value = value;
    }
    
    public int getValue() {
        
    	return value;
    }
}

public class Main {
    
	public static void main(String[] args) {
        
		MyClass myObj = new MyClass(10);
        
		System.out.println("Initial value: " + myObj.getValue());
        
        myObj.setValue(20);
        
        System.out.println("New value: " + myObj.getValue());
    }
}
