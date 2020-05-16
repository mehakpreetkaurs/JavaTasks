package Compsition;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions();
		Case theCase = new Case("2200","Dell","240", dimensions);
		
		Monitor theMonitor = new Monitor("27 inch beast","Acer",27, new Resolution(2500,1440));
		Motherboard theMotherboard = new Motherboard("83-200","Asus",4, 6,"v2");
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		thePC.powerOn();
		


	}

}
