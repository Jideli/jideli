// Tutorial 6 and 7
// same as list, inherits interface list

package intermediate;
import java.util.*;

public class Tut6_LinkedList {
	public static void main(String[] args) {
		
		String[] things = {"apples","noobs","pwnge","bacon","goats"};
		List<String> list1 = new LinkedList<String>();
		for(String x : things)
			list1.add(x);
		
		String[] things2 = {"sausage","bacon","goats","harrypotter"};
		List<String> list2 = new LinkedList<String>();
		for(String y : things2)
			list2.add(y);
		
		list1.addAll(list2); // takes everything in list2 and adds it to list1
		list2 = null; // don't need it anymore, set it to null to free up memory
		
		printMe(list1); // print out
		removeStuff(list1, 2,5); // take stuff out
		printMe(list1); // print again to show what it did
		reverseMe(list1); // reverse everything and print it out
	}
	// printMe method (outside of main method)
	private static void printMe(List<String> l) {
		for(String b : l)
			System.out.printf("%s ", b);
		System.out.println();
	}
	// removeStuff method
	private static void removeStuff(List<String> l, int from, int to) {
		l.subList(from, to).clear(); // take a portion of the list and delete it
		
	}
	// reverseMe
	private static void reverseMe(List<String> l) {
		ListIterator<String> bobby = l.listIterator(l.size()); 
		// size --> last element
		while(bobby.hasPrevious()) // loop through and print out elements one by one
			System.out.printf("%s ", bobby.previous());
	}
}





