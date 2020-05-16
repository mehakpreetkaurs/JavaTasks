package ExceptionHand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
	//  int x = 98;
	//  int y = 0;
	//  System.out.println(divideLBYL(x, y));
	//  System.out.println(divideEAFP(x, y));
	//  System.out.println(divide(x, y));
		int x = getInt();
		System.out.println("Value of x" +x);
	}
	private static int getInt() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	
	private static int getIntEAFP() { // easy to ask for permission
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer");
		try {
			return s.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Enter valid input");
		}
		return 0;
	}
	
	private static int divideLBYL(int x, int y) { //look before you leap
		  if(y != 0) {
		      return x / y;
		  } else {
		      return 0;
		  }
		}

		private static int divideEAFP(int x, int y) {
		  try {
		      return x / y;
		  } catch(ArithmeticException e) {
		      return 0;
		  }
		}

		private static int divide(int x, int y) {
		  return x / y;
		}

}