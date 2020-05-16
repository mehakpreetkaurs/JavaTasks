package practise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car porsche = new car();
		car honda = new car();
		System.out.println("Model-"+ porsche.getModel());
		porsche.setModel("Panamera");
		System.out.println("Model-"+ porsche.getModel());

	}

}
