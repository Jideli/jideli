// more stuff: https://www.youtube.com/watch?v=d3QbptJRln4

import java.util.ArrayList;
import java.util.List;

public class Other_ArrayList {

	public static void main(String[] args) {
		
		List mylist = new ArrayList(); // create instance of array list and assign it to variable of type list
		
		mylist.add("Object 1"); // index 0
		mylist.add("Object 2"); // index 1
		mylist.add("Object 3"); // index 2
		
		mylist.remove(2); // remove index 2
		
		String firstObject = (String) mylist.get(0); // access object with index 0
		
		mylist.clear(); // clear list
	
	}
}
