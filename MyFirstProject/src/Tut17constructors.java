
// Tutorial 17: Constructors
// constructors allow you to initalise variables as soon as you create an object

public class Tut17constructors {
	private String girlName; 
	
	// method/constructor name has to be the same as the class name with constructors
	// constructor must have no explicit return type
	public Tut17constructors(String name) { // only added this constructor for Tut17
		girlName=name;
	}
	// the above uses parameters, but can also leave method empty and define color by girlName = "Kelsey"
	//Java automatically provides a default constructor, so all classes have a constructor, whether one is specifically defined or not.
	
	
	
	public void setName (String name) {
		girlName = name;	
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("Your first gif was %s", getName()); // common print function in language C
	}
	
	
}
