// composition: instead of just variables and methods, it can also have references to other object for other classes

public class Tut43composition {
	private String name;
	private Tut42toString birthday; // reference to Tut42toString object
	
	// build constructor
	public Tut43composition(String theName, Tut42toString theDate) {
		name = theName;
		birthday = theDate;
	}
	public String toString() {
		return String.format("My name is %s, my birthday is %s", name, birthday);
		// first %s looks for 'name' which just passes a string
		// birthday here is not a reference to a string but an object and it will look
		// for the toString method in the other class and TURN THE OBJECT INTO A STRING
		
	}
}
