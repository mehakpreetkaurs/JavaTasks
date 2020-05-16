package practise;

public class Dog extends Animal { // inherited class

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int size, int weight,int eyes,int legs,int tail,int teeth) {
		super(name, 1, 1, size, weight); // call a constructor for the extending class
		this.eyes=eyes;
		this.legs=legs;
		this.tail=tail;
		this.teeth=teeth;
	} // base characteristic initialzed for a Animal 
	private void chew() {
		System.out.println("Chewing");
	}
	
	public void walk() {
		System.out.println("Walking");
		move(5);
	}
	
	public void run() {
		System.out.println("runing");
		move(15);
	}
	
	
	public void eat() {
		super.eat();
		chew();
		System.out.println("Overidding done");
	}

}
