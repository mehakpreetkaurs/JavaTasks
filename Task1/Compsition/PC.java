package Compsition;

public class PC {
	
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public void powerOn(){
		theCase.pressPowerButton();
		drawLogo();
	}
	public void drawLogo(){
		monitor.drawPixelAt(1200, 50, "yellow");
	}
	
	private Case getTheCase() {
		return theCase;
	}
	private Monitor getMonitor() {
		return monitor;
	}
	private Motherboard getMotherboard() {
		return motherboard;
	}

}
