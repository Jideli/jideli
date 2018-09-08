
import java.util.Scanner;
// add comment
class Exercise_returnAlphabetIndex {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String letter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.print("Enter a letter: ");
		String temp = 1+input.nextLine();
		
		System.out.println(letter.indexOf(temp));
	}
}

