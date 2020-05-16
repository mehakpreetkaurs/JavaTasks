package JavaCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollMethodList {
	public static void main(String[] args) {
		 
		List<String> CrunchifyList = new ArrayList<String>(); //create List<String> and using Collection framework perform all operations
 
		CrunchifyList.add("Google");
		CrunchifyList.add("Facebook");
		CrunchifyList.add("Twitter");
		CrunchifyList.add("Snap Inc");
		CrunchifyList.add("Crunchify LLC");
		CrunchifyList.add("TechCrunch");
		CrunchifyList.add("Verizon");
 
		List<String> newList = new ArrayList<String>(CrunchifyList); 
 
		// Print list before any operation.
		System.out.println("Printing result before any Operation: \t" + CrunchifyList);
 
		// Randomly permutes the specified list using a default source of randomness.
		Collections.shuffle(CrunchifyList);
		System.out.println("Printing result after shuffle(): \t" + CrunchifyList);
 
		// Reverses the order of the elements in the specified list.
		Collections.reverse(CrunchifyList);
		System.out.println("Printing result after reverse(): \t" + CrunchifyList);
 
		// Copies all of the elements from one list into another.
		Collections.copy(newList, CrunchifyList);
		System.out.println("Printing result after copy(): \t\t" + newList);
 
		// Rotates the elements in the specified list by the specified distance.
		Collections.rotate(newList, 2);
		System.out.println("Printing result after rotate(): \t" + newList);
 
		// Returns the number of elements in this list.
		System.out.println("Printing total count using size(): \t" + newList.size());
 
		// Swaps the elements at the specified positions in the specified list.
		Collections.swap(newList, 2, 4);
		System.out.println("Printing result after swap(): \t\t" + newList);
	}

}
