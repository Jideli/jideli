// like classes but use them to declare constants
public enum Tut44enumerations { // enum instead of class
	// declare constants (variables that never change) of the enum type
	bucky("nice", "22"), // in essence objects
	kesley("cutie", "10"),
	julia("bigmistake", "12");
	
	private final String desc; // each have a set of their own variables, one for desc and one for year
	private final String year;

	// create enumeration constructor
	Tut44enumerations(String description, String birthday){
		desc = description;
		year = birthday;
	}
	// create a way to get variables
	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}
}
