
// Tutorial 4 and 5 
// collections hold references to objects, but unlike array it's dynamic (don't need numbers, can change)

package intermediate;
import java.util.*;

public class Tut4_IntroCollections {
	public static void main(String[] args) {
		String[] things = {"eggs","lasers","hats","pie"};
		List<String> list1 = new ArrayList<String>();
		
		// add array items to list
		for(String x: things)
			list1.add(x);
		
		String[] morethings = {"lasers","hats"};
		List<String> list2 = new ArrayList<String>();
		
		// add array items to list
		for(String y: things)
			list2.add(y);
		
		//print out list 1
		for(int i=0;i<list1.size();i++) {
			System.out.printf("%s ", list1.get(i)); // get(i) is the way to get objects with array lists
		}
		
		editlist(list1,list2);
		System.out.println();
		
		//print out list 1
		for(int i=0;i<list1.size();i++) {
			System.out.printf("%s ", list1.get(i)); // get(i) is the way to get objects with array lists
		}
	}
	
	// check if list 2 items are listed in list 1 and remove them
	public static void editlist(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator(); // goes through list item by item
		while(it.hasNext()) { // loop through until end of list
			if(l2.contains(it.next()))
				it.remove();
		}
	}
}






