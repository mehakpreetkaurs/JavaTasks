package ExceptionHand;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		try {
        int result = divide();
        System.out.println(result);
		}
		catch(NoSuchElementException |ArithmeticException e){
			System.out.println("Unable to perform division");
		}
    }

    private static int divide() {
        int x, y;
  //      try {
            x = getInt();
            y = getInt();		//single try block can be used
            System.out.println("x is " + x + ", y is " + y);
            return x / y;
    //    } catch(NoSuchElementException e) {	// for asc key and ctrl D statements
    //        throw new ArithmeticException("no suitable input");
    //    }
    //    catch(ArithmeticException e) { // for detecting zero
    //        throw new ArithmeticException("attempt to divide by zero");
    //    }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        while(true) {
        	try {									
        		return s.nextInt();
        	}
        	catch(InputMismatchException e){	//we caught input mismatch exception here
        		s.nextLine();
        		System.out.println("Please enter an integer between 0-9");
        	}
        }
    }
}
