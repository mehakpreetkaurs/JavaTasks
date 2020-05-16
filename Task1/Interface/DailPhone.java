package Interface;

public class DailPhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	
	public DailPhone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("No action taken");		
	}

	@Override
	public void dail(int phoneNumber) {
		System.out.println("New Ringing " + phoneNumber + "is ringing");                                                                                          
		
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering phone");
		isRinging=false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber) {
			isRinging=true;
			System.out.println("Tring Tring");
		}
		else {
			isRinging=false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return false;
	}
	

}
