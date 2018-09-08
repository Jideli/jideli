/*You should always use Enums when a variable (especially a method parameter) can only take one out of a small set of possible values.
If you use Enums instead of integers (or String codes), you increase compile-time checking and avoid errors from passing in invalid constants, and you document which values are legal to use.
Some sample Enum uses include month names, days of the week, deck of cards, etc.*/

// like classes but use them to declare constants
public enum Tut44enumerations { // enum instead of class
	// declare constants (variables that never change) of the enum type with comma separators
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
