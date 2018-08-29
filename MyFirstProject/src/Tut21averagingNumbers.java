import java.util.Scanner;

public class Tut21averagingNumbers {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade; // allows you to import number individually
		int average;
		int counter=0; // just for the while loop
		
		while (counter < 10) {
			grade = input.nextInt(); // store entered number in grade
			total = total + grade;
			counter++;
		}
		average = total/10;
		System.out.println("Your average is " + average);
	}
}
