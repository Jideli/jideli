
public class Tut35variableLengthArguments {
	public static void main (String[] args) {
		System.out.println(average(43,56,76,8,65,76,2,31));
	
	}
	
	public static int average(int...numbers) { // use "..." (elipse) if you don't know how many numbers
		int total=0;
		for (int x:numbers)
			total+=x; // loop through all numbers and add them to total
		
		return total/numbers.length;
		
	}
}
