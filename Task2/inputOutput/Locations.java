package inputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author USER
 *
 */
public class Locations implements Map<Integer, Location> { // declaring new map
	private static Map<Integer, Location> Locations = new HashMap<>(); 
	//using a hashmap to store a location
	public static void main(String[] args) throws IOException {// main method is going to throw
		try(FileWriter locFile = new FileWriter("locations.txt");
			FileWriter dirFile = new FileWriter("Direction.txt");) { //After the initial write of the location
			
			for(Location location:Locations.values()) { // writing exits for each using a inner loop for the locations Putting two writer objects in the initial try resources
				locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
				for(String direction : location.getExits().keySet()) { // After the initial write of the location we are cycling through the direction or exits for this location
					dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
                }
            } }// Finally block is not needed as it closes on its own
		}

			
//        FileWriter locFile = null;
//        try {
//            locFile = new FileWriter("locations.txt");
//            for(Location location : Locations.values()) {
//                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//            }
//        } catch(IOException e) {
//            System.out.println("In catch block");
//            e.printStackTrace();
//        } finally {
//            System.out.println("in finally block");
//            try {
//                if(locFile != null) {
//                    System.out.println("Attempting to close locfile");
//                    locFile.close();
//                }
//            } catch(IOException e) {
//                e.printStackTrace();
//            }
//        }


    static { //initializing data once using the static initialization block
    	Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("locations.txt"));
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                Locations.put(loc, new Location(loc, description, tempExit));
            }

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }


    }
    	/*Map<String, Integer> tempExit = new HashMap<String, Integer>();
        Locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        Locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        Locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        Locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        Locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        Locations.put(5, new Location(5, "You are in the forest",tempExit));

    }*/        
    @Override
    public int size() {
        return Locations.size();
    }

    @Override
    public boolean isEmpty() {
        return Locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return Locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return Locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return Locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return Locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return Locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        Locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return Locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return Locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return Locations.entrySet();
    }

}
