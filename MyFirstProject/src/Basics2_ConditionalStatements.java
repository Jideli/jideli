// import an external class

import java.util.Scanner; // use import to import external class
// import java.util.* // this is to install entire library 

public class Basics2_ConditionalStatements
{
	
	static Scanner userInput = new Scanner (System.in); 
	// creates a new scanner object named userInput
	// Scanner is a predefined Java class found in java.util package which needs to be included for user input
	// system.in is an InputStream which is connected to keyboard input of console programs
	
	public static void main(String[] args) 
	{
		
		System.out.print("Your favourite number: "); // print does not cause carriage return like println does
		
// CONDITIONAL STATEMENT
		//The if statement will only execute the code that lies between {} if the value inside () is true
		if (userInput.hasNextInt()) // if user types number which does not have decimal places
			// .hasNextDouble, .hasNextFloat, or Boolean Byte Long Short...
		{
			int numberEntered = userInput.nextInt(); // or nextDouble, nextFloat, nextLine...
			// nextInt is a method of the object userInput of Scanner class
			// here we are saying we expect user to enter an integer
			
			System.out.println("You entered " + numberEntered);
			
			// addition, subtraction, multiplication, division, modulus
			int numEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);

			int numEnteredMinus2 = numberEntered - 2;
			System.out.println(numberEntered + " - 2 = " + numEnteredMinus2);
			
		
			int numEnteredTimesSelf = numberEntered * numberEntered;
			System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimes2);

			int numEnteredDivide2 = numberEntered / 2;
			System.out.println(numberEntered + " / 2 = " + numEnteredDivide2);
			
			int numEnteredRemainder = numberEntered % 2;
			System.out.println(numberEntered + " % 2 = " + numEnteredRemainder);
			
		// SHORTHAND:
			numberEntered += 2;
			// same as numberEntered = numberEntered + 2;
			numberEntered -= 2;
			// same as numberEntered = numberEntered - 2;
			numberEntered--;
			// same as numberEntered = numberEntered - 1;
			numberEntered++;
			// same as numberEntered = numberEntered + 1;
			
			int numberABS = Math.abs(numberEntered); // java math library: find absolute value for a variable
			int whichIsBigger = Math.max(5, 7);
			int whichIsSmaller = Math.min(5, 7);
			
			double numSqrt = Math.sqrt(5.23); // square root, type must be a double
			
			int numCeiling = (int) Math.ceil(5.23); // force round a number up
			int numFloor = (int) Math.floor(5.23); // force round a number down
			int numRound = (int) Math.round(5.63); // round a number
			int randomNumber = (int) (Math.random() * 10); // number between 0 or n and 9
		
			System.out.println("Random Number" + randomNumber);
			
		} else {
			
			System.out.println("Enter an integer next time");
		}
		
	}
	
}