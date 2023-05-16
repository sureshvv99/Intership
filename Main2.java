package practice_interviewqa;

class Parent {
    
	public void display() {
       
		System.out.println("This is the parent class.");
    }
    
    public void display(int num) {
        
    	System.out.println("This is the parent class with argument: " + num);
    }
}

class Child extends Parent {
    @Override
    public void display() {
        
    	System.out.println("This is the child class.");
    }
}

public class Main2 {
    
	public static void main(String[] args) {
    
		Parent myParent = new Parent();
        
		Child myChild = new Child();
        
        myParent.display();
        
        myParent.display(10);
        
        myChild.display();
        
        myChild.display(20);
    }
}
