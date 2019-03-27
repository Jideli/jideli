// final means you can't modify it, can only set it equal to something once

public class Tut48final {
	private int sum; 
	private final int NUMBER; // put it in caps because they're constant
	
	// need to initalize it in the constructor or before
	public Tut48final(int x) {
		NUMBER = x;
	}
	
	// build a method
	public void add() {
		sum+=NUMBER;
	}
	public String toString() {
		return String.format("sum = %d\n", sum);
	}
}
