 package Interface;

public class Mobile implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	private boolean isOn= false;
	
	public Mobile(int myNumber) {
		this.myNumber = myNumber;
	}
	@Override
	public void powerOn() {
		isOn=true;
		System.out.println("Power On");		
	}

	@Override
	public void dail(int phoneNumber) {
		if(isOn) {
		System.out.println("Now Ringing " + phoneNumber + "is ringing");                                                                                          
		}
		else {
			System.out.println("Switched off");
		}
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering mobile phone");
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
