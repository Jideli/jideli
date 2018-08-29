/* Tutorial 14
import java.util.Scanner;

public class utMainClass {
	public static void main (String[] args) { // main program
		
		Tut14multipleClasses myObject = new Tut14multipleClasses (); // create an object and use class Tut14multipleClasses
		myObject.simpleMessage(); // use method simpleMessage
		
		// each object has a unique identity, also has attributes and behavior
	}
} 

// -------------------------------------------------------------------------------

// Tutorial 15
import java.util.Scanner;

public class TutMainClass {
	public static void main (String[] args) { 
		
		Scanner input = new Scanner (System.in);
		Tut15methodsWithParameters myObject = new Tut15methodsWithParameters ();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine(); //anything user enters will be stored in variable name 'name'
		
		myObject.simpleMessage (name); // use object to call the method
	}
}
// -------------------------------------------------------------------------------

//Tutorial 16: multiple methods and instance variables
import java.util.Scanner;

public class TutMainClass {
	public static void main (String[] args) { 
		
		Scanner input = new Scanner (System.in);
		Tut16multipleMethods myObject = new Tut16multipleMethods ();
		
		System.out.println("Enter name of first gf here: ");
		String temp = input.nextLine(); // temporary variable
		myObject.setName(temp); // take entered name set to temp (and then it is set to girlName according to method)
		myObject.saying();
	}
}
// -------------------------------------------------------------------------------

//Tutorial17: Constructors
// can be used to provide initial values for object attributes
// to initialize a variable (e.g. Kelsey) as soon as you create your object, create a method Tut17constructors(String name)
// in the other class and when creating object in the main class below, enter argument "Kelsey" (instead of leaving empty)
// that will go to the constructor in the other class and initialize all variables for you
public class TutMainClass {
	public static void main (String[] args) { 
		Tut17constructors myObject = new Tut17constructors ("Kelsey");
		Tut17constructors myObject2 = new Tut17constructors ("Nicole"); 
		myObject.saying();
		myObject2.saying();
	}
}

//-------------------------------------------------------------------------------

//Tutorial36: Time Class
public class TutMainClass {
	public static void main (String[] args) { 
		Tut36timeClass myObject = new Tut36timeClass();
		System.out.println(myObject.toMilitary());
		myObject.setTime(13, 27, 6);
		System.out.println(myObject.toMilitary());
	}
}

//-------------------------------------------------------------------------------

//Tutorial37: Display Regular Time

public class TutMainClass {
	public static void main (String[] args) { 
		Tut37displayRegularTime myObject = new Tut37displayRegularTime();
		System.out.println(myObject.toMilitary());
		System.out.println(myObject.toString());
		
		myObject.setTime(13, 27, 6);
		System.out.println(myObject.toMilitary());
		System.out.println(myObject.toString());
		
	}
}*/

//-------------------------------------------------------------------------------

//Tutorial 41: Building Objects for Constructors
// uses class Tut40setAndGetMethods

public class TutMainClass {
	public static void main (String[] args) { 
		
		Tut40setAndGetMethods myObject = new Tut40setAndGetMethods();
		Tut40setAndGetMethods myObject2 = new Tut40setAndGetMethods(5);
		Tut40setAndGetMethods myObject3 = new Tut40setAndGetMethods(5,13);
		Tut40setAndGetMethods myObject4 = new Tut40setAndGetMethods(5,13,43);
		
		System.out.printf("%s\n", myObject.toMilitary()); // return myObject with no arguments
		System.out.printf("%s\n", myObject2.toMilitary());
		System.out.printf("%s\n", myObject3.toMilitary());
		System.out.printf("%s\n", myObject4.toMilitary());
	}
}









