
public class Tut46static {
	private String first;
	private String last;
	private static int members = 0; // every object shares the same variable, when changing static variables they change with all objects
	// instead of updating it many times, update it only once
	// initalize with 0
			
	// create constructor
	// every time we call constructor we want member to increase
	// if we don't put static in front of it, first time we call it it will be 1 before printing
	// so it will say member=1, but when we create second object. Member will be again 0, 
	// then when it goes to constructor in it, it will increase to 1 again, so it doesn't count
	// how we want. It starts from zero, but we want number increase from where we left
	public Tut46static(String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
	
	}
	
}
