public class Tutorial1
// define a new class/program (blueprint) named Tutorial1
// public: can be used by any other class
//classes are blue prints used to design objects that contain attributes (variables) and methods (functions)

// In classes, methods, and other flow-control structures code is always enclosed in curly braces { }
// Remember: do not use semicolons after method and class declarations that follow with the body defined using the curly braces.

{
	static String randomString = "String to print"; // class variable

	// static: only a class can call for this function to execute, method can be run without creating an instance of the class containing the main method
	// class variables must start with static if you want to access them with any other methods in the class
	// String: storage area, 'randomString': variable name
			
	static final double PINUM = 3.141529; // double: decimal places
	// constant variables are defined with final
			
	public static void main (String[] args) // we need string objects called args
	{
	// void: doesn't return any values after done executing
	// main: required in every Java program, this function/method is always executed first, The method's parameters are declared inside the parentheses that follow the name of the method
	// String args: every main function must accept an array of string objects
	
		
	//  System.out.println(randomString); // call object System.out
	//	System.out.println(PINUM);
		
		int integerOne = 22, integerTwo = 33; // declaration statement
		 // integerOne is a local variable to the main function. It can only be accessed in main
		int integerThree = integerOne + 1; // expression statement
		
		System.out.println(integerThree);
		// The System class and its out stream are used to access the println method.
		
		// Variables must begin with a letter and contain numbers, _, or $
		// You must declare all variables before you can use them with a data type
		// you can use any variable name except for:
		/* abstract continue for new switch assert default goto package synchronized boolean 
		   do if private this break double implements protected throw byte else import public throws
		   case enum instanceof return transient catch extends int short try char final interface static
		   void class finally long strictfp volatile const float native super while */
		
		
// PRIMITIVE DATA TYPES, can only hold specific values
	    byte bigByte = 127; // 8-bit, min -128 max 127, used to save memory in large arrays, otherwise int can be used
		short bigShort = 32767; // 16-bit, min -32768 max 32767, used to save memory in large arrays
		int bitInt = 2100000000; // 32-bit
		long bigLong = 9220000000000000000L; // 64-bit
		float bigFloat = 3.14F; // You must end a float with an F
		double bigDouble = 3.14823794872734872347923748; // standard choice for decimal numbers
		
		System.out.println(Float.MAX_VALUE); // Float is precise to 6 decimal places
		System.out.println(Double.MAX_VALUE); // Double is precise to 15 decimal places
		
		boolean trueOrFalse = true; // Booleans are True or False, not 1 or 0
		
		// character codes:
		// A char will accept a number or a character surrounded by apostrophes

		char randomChar = 68;
		char anotherChar = 'A';
		// Character Code for A is 65 Minimum value 0 Maximum value 65535 ??
		System.out.println(randomChar); // change number randomChar and letter will change

		// char can contain escaped characters like \b backspace \f form feed \n line feed \r carriage return \t horizontal tab \" double quote \' single quote \\ backslash
		char escapedChars = '\n';
		
		
		// A string contains a series of characters
		String randomString = "I'm a random string";
		String anotherString = "Stuff";
		
		String andAnotherString = randomString + ' ' + anotherString;
		
		System.out.println(andAnotherString);
		
		// convert any of the primitive variables types into string types
		// String is actually an object
		String byteString = Byte.toString(bigByte); // function
		String shortString = Short.toString(bigByte);
		String intString = Integer.toString(bigByte);
		String longString = Long.toString(bigByte);
		String floatString = Float.toString(bigByte);
		String doubleString = Double.toString(bigByte);
		// creates error??: String booleanString = Boolean.toString(bigByte);
		
		// casting: convert from one primitive type to another
		double aDoubleValue = 3.14546466464;
				int doubleToInt = (int) aDoubleValue;
				// or (byte) (short) (long) (double)
		System.out.println(doubleToInt);
		
		// turn the string back into a primitive data type / integer
		int stringToInt = Integer.parseInt(intString);
		// or parseLong, parseByte, parseFloat, parseDouble, parseBoolean
		// There is no reason to parse a Character
		System.out.println(doubleToInt);
		
	}
}