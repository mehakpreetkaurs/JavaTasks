package practise;

public class Animal {
	
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	public Animal(String name, int brain, int body, int size, int weight) {
		this.body= body;
		this.brain= brain;
		this.size= size;
		this.weight=weight;
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Eating");
		
	}
	
	public void move(int speed) {
		System.out.print("Move() called.Animal move at speed" +speed);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setbrain(int brain) {
		this.brain=brain;
	}
	public int getbrain() {
		return brain;
	}
	
	public void setbody(int body) {
		this.body=body;
	}
	public int getbody() {
		return body;
	}
	
	public void setsize(int size) {
		this.size=size;
	}
	public int getsize() {
		return size;
	}
	
	public void setweight(int weight) {
		this.weight=weight;
	}
	public int getweight() {
		return weight;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		Dog dog = new Dog("Petu", 8, 20, 2, 4, 1, 20);
		
		dog.eat();
		dog.walk();
		dog.run();
		

	}
	

}
