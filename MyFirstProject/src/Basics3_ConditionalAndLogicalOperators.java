public class Basics3_ConditionalAndLogicalOperators {
	
	public static void main(String[] args)
	{
		int randomNumber = (int) (Math.random() * 50); // random number between 0 and 49
		
/* RELATIONAL OPERATORS in Java:
		 * > greater than
		 * < less than
		 * == equal to
		 * != not equal to
		 * >= greater than or equal to
		 * <= less than or equal to
		 */
		
		if (randomNumber < 25)
		{
			System.out.println("The random number is less than 25");
		}
		
		else if (randomNumber > 40)
		{
			System.out.println("The random number is greater than 40");
		}
		
		else if (randomNumber == 18)
		{
			System.out.println("The random number is equal to 18");
		}
		
		else if (randomNumber != 40)
		{
			System.out.println("The random number is not equal to 40");
		}
		
		else // if none of above 
		{
			System.out.println("Nothing Worked");
		}
		
		System.out.println("The random number is " + randomNumber);
		
/* LOGICAL OPERATORS:
* Java has 6 logical operators
* ! : Converts the boolean value to its right to its opposite form ie. true to false
* & : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values) > not used very often
* && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
* | : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
* || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
* ^ : Returns true if there is 1 true and 1 false boolean value on the right or left
*/
		if (!(false))
		{
			System.out.println("\nI turned false into true");
		}
		
		if ((false) && (true)) // both are no true though, so do not print line below
		{
			System.out.println("Both are true");
		}
		
		if ((false) | (true)) // if either or is true
		{
			System.out.println("One is true");
		}
		
		if ((false) ^ (true)) // if either or is true
		{
			System.out.println("One is true and one is false");
		}
		
// CONDITIONAL (or TERNARY) OPERATOR: assigns one or another value based off of a condition
		
		{
			int valueOne = 1;
			int valueTwo = 2;
			
			int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
			// if condition is true, assign valueOne as biggestValue, else assign valueTwo
			
// SWITCH STATEMENT, if only limited number of possible values which is being checked
			// you are not required to use break or default statements
			// expression must be an int, short, byte or char
			
			{
				char theGrade = 'B';
				switch (theGrade)
				{
				case 'A':
					System.out.println("Great job");
					break; // stop using switch statement and jump down
				case 'B':
				case 'b': // you can use multiple case statements in a row
					System.out.println("Good job");
					break;
				case 'C':
					System.out.println("OK");
					break;
				case 'D':
					System.out.println("Bad");
					break;
				default: // default used if there are no matches
					System.out.println("You failed");
					break;
				}
			}
			
			
		}
	
	}
}