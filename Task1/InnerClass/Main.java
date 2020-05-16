package InnerClass;

public class Main {

	public static void main(String[] args) {
		GearBox McLaren = new GearBox(6);
		GearBox.Gear first = McLaren.new Gear(1, 12.3);
		System.out.println(first.driveSpeed(1000));
		

	}

}
