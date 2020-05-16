package Abstraction;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Steffy");
		dog.breathe();
		dog.eat();
		
		Parrot parrot = new Parrot("Ring neck");
		parrot.breathe();
		parrot.fly();
		
		Penguin penguin = new Penguin("Emp");
		penguin.fly();
	}

}
