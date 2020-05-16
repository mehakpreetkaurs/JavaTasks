package Interface;

public class Main {

	public static void main(String[] args) {
		  // instance of Tims phone possible with class also
		ITelephone timsPhone;
		timsPhone = new DailPhone(12222);
		timsPhone.powerOn();
		timsPhone.callPhone(12225);
		timsPhone.answer();
		
		timsPhone = new Mobile(13333);
		timsPhone.powerOn();
		timsPhone.callPhone(12223);
		timsPhone.answer();
	}

}
