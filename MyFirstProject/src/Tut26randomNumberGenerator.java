
// build a program to roll a dice

import java.util.Random;

public class Tut26randomNumberGenerator {
	public static void main(String args[]) {
		Random dice = new Random();
		int number;
		
		for(int counter=1; counter<10;counter++) {
			number = 1+dice.nextInt(6); // start with 1 by adding 1+
			System.out.println(number +" ");
			
		}
	}
}
