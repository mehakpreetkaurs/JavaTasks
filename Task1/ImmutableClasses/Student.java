package ImmutableClasses;

public final class Student {
	
	final String name;
	final int regNum;
	
	public Student(String name, int regNum) {
		this.name = name;
		this.regNum = regNum;
	}

	public String getName() {
		return name;
	}

	public int getRegNum() {
		return regNum;
	}
	
	
	
	

}
