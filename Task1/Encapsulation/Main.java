package Encapsulation;

public class Main {

	public static void main(String[] args) {
//		Player player = new Player();
//		player.health=20;
//		player.fullname="Tim";
//		player.weapons="sword";
		
//		int damage=10;
//		player.loseHealth(damage);
//		System.out.println("Reamaining" + player.healthRemaining());
		
//		damage=11;
//		player.health=100;
//		player.loseHealth(damage);
//		System.out.println("Reamaining " + player.healthRemaining());
		
		EnhancedPlayer player = new EnhancedPlayer("Tim",200,"Sword");
		System.out.println("Initial health "+ player.getHealth());
		
	}

}
