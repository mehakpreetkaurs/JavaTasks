package Arrays;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		int[] myIntegers = getNumbers(5);
		
		for(int i=0; i< myIntegers.length; i++) {
			System.out.println("Integer "+ i+ " has values "+ myIntegers[i]);
		}	
		System.out.println("The sum average is "+ getAverage(myIntegers));
	}
	public static int[] getNumbers(int number) {
		System.out.println("enter "+ number+ " integer values");
		int[] values = new int [number];
		
		for(int i=0; i< values.length; i++) {
			values[i] = scanner.nextInt();
		}
	return values;
}
	public static double getAverage(int[] array) {
		int sum=0;
		for(int i=0; i< array.length; i++) {
			sum += array[i];
		}
		return (double) sum/ (double) array.length ;
	}
}