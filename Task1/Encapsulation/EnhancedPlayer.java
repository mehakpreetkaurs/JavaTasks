package Encapsulation;

public class EnhancedPlayer {
	private String name;
	private int hitPoints = 100;
	private String weapons;
	public EnhancedPlayer(String name, int health, String weapons) {
		super();
		this.name = name;
		if(this.hitPoints >= 0 && health <= 100) {
		this.hitPoints = health;
		}
		this.weapons = weapons;
	}
	public void loseHealth(int damage) {
		this.hitPoints=this.hitPoints-damage;
		if (this.hitPoints<= 0) {
			System.out.println("Player knocked out");
		}
	}
	public int getHealth() {
		return hitPoints;
	}
	
	

}
