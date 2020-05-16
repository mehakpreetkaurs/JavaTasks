package Encapsulation;

public class Player {
	
	public String fullname;
	public int health;
	public String weapons;
	
	public void loseHealth(int damage) {
		this.health= this.health - damage;
		if(health<=0) {
			System.out.println("Player knocked out");
		}
	}
	public int healthRemaining() {
		return this.health= health;
	}

}
