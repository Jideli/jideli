
public class Tut47moreOnStatic {
	private String first;
	private String last;
	private static int members = 0; 
	
	
	public Tut47moreOnStatic(String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
	
	}
	
	// add this
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public static int getMembers () {
		return members;
	}
	
	
}