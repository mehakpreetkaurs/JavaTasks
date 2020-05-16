package CompsitionChallenge;

public class Room {
	private String name;
	private int wall1;
	private int wall2;
	private int wall3;
	private int wall4;
	private int ceiling;
	private Bed bed;
	private Lamp lamp;
	public Room(String name, int wall1, int wall2, int wall3, int wall4, int ceiling, Bed bed, Lamp lamp) {
		super();
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.bed = bed;
		this.lamp = lamp;
	}
	public Lamp getLamp() {
		return lamp;
	}
	public void makeBed() {
		System.out.println("Bed in making");
		bed.make();
	}
	
	
	
	

}
