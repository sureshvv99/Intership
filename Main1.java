package practice_interviewqa;

class Animal {
    
	public void eat() {
    
		System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    
	public void bark() {
    
		System.out.println("The dog is barking.");
    }
}

class Cat extends Animal {
    
	public void meow() {
    
		System.out.println("The cat is meowing.");
    }
}

public class Main1 {
    
	public static void main(String[] args) {
    
		Dog myDog = new Dog();
        
		Cat myCat = new Cat();
        
        myDog.eat();
        
        myDog.bark();
        
        myCat.eat();
     
        myCat.meow();
    }
}
