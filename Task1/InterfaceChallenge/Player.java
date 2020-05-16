package InterfaceChallenge;

import java.util.ArrayList;

public class Player implements ISavable {
	private String name;
	private int hitPoints;
	private int strengths;
	private String weapon;
	
	public Player(String name, int hitPoints, int strengths, String weapon) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.strengths = strengths;
		this.weapon = weapon;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrengths() {
		return strengths;
	}

	public void setStrengths(int strengths) {
		this.strengths = strengths;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", hitPoints=" + hitPoints + ", strengths=" + strengths + ", weapon=" + weapon
				+ "]";
	}
	@Override
	public ArrayList<String> write() {
		List<String>=new ArrayList<String>
		return null;
	}
	@Override
	public void read(ArrayList<String> savedValues) {
		// TODO Auto-generated method stub
		
	}
	
	
}
