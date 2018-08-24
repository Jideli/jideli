public class Tut36timeClass { // military time
	private int hour;
	private int minute;
	private int second;
	
	// give them value and let user input number:
	
	public void setTime(int h, int m, int s) {
		// check data before entering:
		hour = ((h>=0 && h<24) ? h : 0);
		minute = ((m>=0 && m<60) ? m : 0);
		second = ((s>=0 && s<60) ? s : 0);
	}
	
	public String toMilitary() { // define display method
		return String.format("%02d:%02d:%02d", hour, minute, second); //02d means 2 decimal places
		
	}
	
}
