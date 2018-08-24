// Tutorial 27: Introduction to arrays

// single variable that can store many values, variable with related information
// can only store values of same data type

class apples {
	public static void main (String[] args) {
		
		// array name is bucky, each index allows storing a different value, starts with 0
		// int bucky[] = new int [10]; 
		
		// define index values individually:
		// bucky[0]=87;
		// bucky[1]=543;
		// bucky[9]=65;
		
		// OR array initializer:
		
		int bucky[]= {2,4,5,7,9}; // automatically assigns these values and counts how many
		
		System.out.println(bucky[1]); // state index or subscript
	
	}
}