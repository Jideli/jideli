
public class Tut28arraysTable {
	public static void main (String[] args) {
		System.out.println("Index\tValue"); // t is a tab, Index and Value are table headers
		int bucky[]= {32,12,18,54,2};
		
		for (int counter=0;counter<bucky.length;counter++) // counter is less than 5
			System.out.println(counter + "\t" + bucky[counter]); // reference subscript inside bucky
	}
}
