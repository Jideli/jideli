
public class Tut31enhancedForLoop {
	public static void main (String args[]) {
		int bucky[]= {3,4,5,6,7};
		int total=0;
				
		for(int x: bucky) { // x will store the values in the array while it loops through
			total+=x; // add it all to total
		}
		System.out.println(total);
	}
}
