// how to get a only a range of constants from the whole enum
public enum Tut45enumSetRange { 

	bucky("nice", "22"), 
	kesley("cutie", "10"),
	julia("bigmistake", "12"),
	// add some more variables
	nicole("italian","13"),
	candy("different","14"),
	erin("iwish","16");
	
	
	
	private final String desc; 
	private final String year;


	Tut45enumSetRange(String description, String birthday){
		desc = description;
		year = birthday;
	}

	public String getDesc() {
		return desc;
	}
	
	public String getYear() {
		return year;
	}
}
