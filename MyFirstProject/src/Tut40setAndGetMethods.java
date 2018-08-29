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