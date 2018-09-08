// if you need string representation of an object, Java has built in method toString
// see practical example in next tutorial

public class Tut42toString {
	private int month;
	private int day;
	private int year;
	
	public Tut42toString(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructor for this is %s\n", this); // %s means string
		// 'this' is a reference to THE CURRENT object we just built, 
		// --> implies that it needs a string so it uses below toString method
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
		
	}
}
