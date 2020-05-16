package Set;

import java.util.HashSet;

public class HashSetequals {
	
	public static void main(String[] argv) 
    { 
  
        // Creating object of HashSet<String> 
        HashSet<String> 
            arrset1 = new HashSet<String>();
        
        arrset1.add("A");
        arrset1.add("B");
        arrset1.add("C");
        arrset1.add("D");
        arrset1.add("E");
        
        HashSet<String> 
        arrset2 = new HashSet<String>();
    
    arrset2.add("A");
    arrset2.add("B");
    arrset2.add("C");
    arrset2.add("D");
    arrset2.add("E");
    
    boolean value = arrset1.equals(arrset2);
    System.out.println(value);
        
    }
}
