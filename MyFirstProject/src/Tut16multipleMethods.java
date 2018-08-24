// Tutorial 16: multiple methods and instance variables

public class Tut16multipleMethods {
	private String girlName; // private: only methods inside this class can use it
	// variable that is outside the methods (below) but inside the class --> instance variable
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
