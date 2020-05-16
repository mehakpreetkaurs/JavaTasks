package Set;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody { // using maps to store the objects and then using 
	                        // sets to group the objects
	
	private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites; //set declaration

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();   // initializing constructor for set
    }

    public String getName() { //getters
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) { //option to add moon to pass
        return this.satellites.add(moon); //parameter heavenly body to call moon and add effectively to the hash set
    }

    public Set<HeavenlyBody> getSatellites() { // getter of current satellites
        return new HashSet<>(this.satellites); // this code doesnt have access to original hashset
    }
}

