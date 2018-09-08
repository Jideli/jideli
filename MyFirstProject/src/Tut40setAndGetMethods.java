/*There are 4 core concepts in OOP: encapsulation, inheritance, polymorphism, and abstraction.

The idea behind encapsulation is to ensure that implementation details are not visible to users. The variables of one class will be hidden from the other classes, accessible only through the methods of the current class. This is called data hiding.
To achieve encapsulation in Java, declare the class' variables as private and provide public setter and getter methods to modify and view the variables' values.
In summary, encapsulation provides the following benefits:
- Control of the way data is accessed or modified
- More flexible and easily changed code
- Ability to change one part of the code without affecting other parts*/

public class Tut40setAndGetMethods {
	private int hour;
	private int minute;
	private int second;
	
	public Tut40setAndGetMethods() {
		this(0,0,0); 
	}
	public Tut40setAndGetMethods(int h) {
		this(h,0,0); 
	}
	public Tut40setAndGetMethods(int h, int m) {
		this(h,m,0); // 
	}
	public Tut40setAndGetMethods(int h, int m, int s) {
		setTime(h,m,s); 
	}
	public void setTime(int h, int m, int s) {
		setHour(h); // need to define another method below
		setMinute(m);
		setSecond(s);
	}
	public void setHour(int h) { // set method to change date
		hour = ((h>=0 && h<24)? h:0); // check if hour is between 0 and 24. if yes use it, if not use 0
	}
	public void setMinute(int m) {
		minute = ((m>=0 && m<60)? m:0); 
	}
	public void setSecond(int s) {
		second = ((s>=0 && s<60)? s:0);
	}
	
	public int getHour() { // get method to return above
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
}