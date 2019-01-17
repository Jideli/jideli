// converting lists to arrays and arrays to lists

package intermediate;
import java.util.*;

public class Tut8_convertingListsToArrays {
	public static void main(String[] args) {

		String[] stuff = {"babies","watermelon","melons","fudge"};
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
		// change it to list in order to use list methods on it
	
		thelist.add("pumpkin"); // list method. adds it to the end of the list
		thelist.addFirst("firstthing"); // add to the beginning
		
		//convert back to array
		stuff = thelist.toArray(new String[thelist.size()]);
		
		for(String x : stuff) // looping through array
			System.out.printf("%s ", x);
	}
}
