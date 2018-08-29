// do while loop executes the body before checking the function -> guarantees 1 run
public class Tut24doWhileLoop {
	public static void main(String args[]) {
		int counter = 15;
		
		do {
			System.out.println(counter);
			counter++;
		}while(counter<=10); // only now does it check condition
		
	}
}
