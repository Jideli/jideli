/* Tutorial 14
import java.util.Scanner;

public class TutMainClass {
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
}

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

//-------------------------------------------------------------------------------

//Tutorial 42: toString
class TutMainClass {
	public static void main (String[] args) { 
		Tut42toString myObject = new Tut42toString(4,5,6);
		
	}
}

//-------------------------------------------------------------------------------

//Tutorial 43: composition

public class TutMainClass {
	public static void main (String[] args) { 
		Tut42toString myObject = new Tut42toString(4,5,6);
		Tut43composition compObject = new Tut43composition("Bucky", myObject); // constructor takes 2 parameters, a string and an object
		
		System.out.println(compObject);
	}
}
//-------------------------------------------------------------------------------

//Tutorial 44: enumeration

public class TutMainClass {
	public static void main (String[] args) { 
		// build an enhanced for loop using a made up variable 'people' (what you want to name variable when you loop through them)
		for (Tut44enumerations people: Tut44enumerations.values()) { // values is called a static method, cannot change this keyword
			// every time you make a enumeration, Java takes constants and makes an array with keyword .values
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
			
		}
	}
}

//-------------------------------------------------------------------------------

//Tutorial 45: EnumSet range

import java.util.EnumSet; // allows to use built in method called range

public class TutMainClass {
	public static void main (String[] args) { 
		for (Tut45enumSetRange people: Tut45enumSetRange.values()) 
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		
		// added this
		System.out.println("\nAnd now for the range of constants!!\n");	
		
		for (Tut45enumSetRange people: EnumSet.range(Tut45enumSetRange.kesley, Tut45enumSetRange.candy))
		// get only from kesley to candy
		System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		
	}
}

//-------------------------------------------------------------------------------

//Tutorial 46: static (using static to count up when calling a constructor

public class TutMainClass {
	public static void main (String[] args) { 
		Tut46static member1 = new Tut46static("first1","last1");
		Tut46static member2 = new Tut46static("first2","last2");
		Tut46static member3 = new Tut46static("first3","last3");
	
	}
}

//-------------------------------------------------------------------------------

//Tutorial 47: More on static
public class TutMainClass {
	public static void main (String[] args) { 
		Tut46static member1 = new Tut46static("first1","last1");
		Tut46static member2 = new Tut46static("first2","last2");
		Tut46static member3 = new Tut46static("first3","last3");
		
		// System.out.println(); // print an empty line
		// System.out.println(member1.getFirst()); // specific to member
		// System.out.println(member1.getLast());
		// System.out.println(member1.getMembers()); // this will be shared with all the others
		//
		// no matter which member above, member name will always be 3 because it's shared
		
		System.out.println(Tut47moreOnStatic.getMembers());
		//  tip: instead of calling a separate object, just put the name of the class then .staticmethod
		//  --> whenever you have static, you don't need to create object
		
	}
}

//-------------------------------------------------------------------------------

//Tutorial 48: final
public class TutMainClass {
	public static void main (String[] args) { 
		Tut48final myObject = new Tut48final(10);
		
		for (int i=0; i<5; i++) {
			myObject.add();
			System.out.printf("%s", myObject);
			
		}
	}
}

//-------------------------------------------------------------------------------

//Tutorial 49: inheritance

public class TutMainClass {
	public static void main (String[] args) { 
		Tut49inheritanceChild1 child1Object = new Tut49inheritanceChild1();
		Tut49inheritanceChild2 child2Object = new Tut49inheritanceChild2();
		
		child1Object.eat();
		child2Object.eat();
	
	}
}

//-------------------------------------------------------------------------------

//Tutorial 51GUIwithJFrame

import javax.swing.JFrame; // makes sure we can use windows

public class TutMainClass {
	public static void main (String[] args) { 
		Tut51GUIwithJFrame bucky = new Tut51GUIwithJFrame();
		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bucky.setSize(275,180);
		bucky.setVisible(true);
	
	}
}

//-------------------------------------------------------------------------------

//Tutorial 52 Event Handling, ActionListener
import javax.swing.JFrame;

public class TutMainClass {
	public static void main (String[] args) { 
		Tut52eventHandling bucky = new Tut52eventHandling();
		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bucky.setSize(350,100);
		bucky.setVisible(true);
	}
}
//-------------------------------------------------------------------------------

//Tutorial 55 Polymorphism

public class TutMainClass {
	public static void main (String[] args) { 
		
		// example: build polymorphic array -> stores objects of diff classes in the superclass type
		Tut55polymorphism bucky[] = new Tut55polymorphism[2]; // one reference variable of the superclass, instead of creating object for each
		bucky[0]=new Tut55subClass1(); // bucky 0 can hold objects of subClass1
		bucky[1]=new Tut55subClass2();
		
		// loop through array and call each method
		for(int x=0;x<2;++x) {
			bucky[x].eat();
		}
		
	}
}

//-------------------------------------------------------------------------------

//Tutorial 56 Polymorphic Arguments

public class TutMainClass {
	public static void main (String[] args) { 
		
		Tut56polymorphicArguments bucky = new Tut56polymorphicArguments();
		Tut55polymorphism fo = new Tut55polymorphism();
		// can add subclasses too
		Tut55polymorphism po = new Tut55subClass1();
		
			bucky.digest(fo);
			bucky.digest(po);
		
	}
}



//-------------------------------------------------------------------------------

//Tutorial 59 Class to Hold Objects

public class TutMainClass {
	public static void main (String[] args) { 
		
		Tut59child1List DLO = new Tut59child1List();
		Tut59child1 d = new Tut59child1();
		DLO.add(d);
		
	}
}

//-------------------------------------------------------------------------------

//Tutorial 60 Array Holding Many Objects
// only have to create one array for both child classes, better than array in Tut59

public class TutMainClass {
	public static void main (String[] args) { 
		
		Tut60childList ALO = new Tut60childList();
		Tut60child1 d = new Tut60child1();
		Tut60child2 f = new Tut60child2();
		ALO.add(d);
		ALO.add(f);
		
	}
}

//-------------------------------------------------------------------------------

//Tutorial 61 Simple Polymorphic Programm

public class TutMainClass {
	public static void main (String[] args) { 
		
		Tut61animal[] thelist = new Tut61animal[2];
		Tut61dog d = new Tut61dog();
		Tut61fish f = new Tut61fish();
		
		thelist[0]=d;
		thelist[1]=f;
		
		for(Tut61animal x: thelist) {
			x.noise();
			
		}
		
	}
}

//-------------------------------------------------------------------------------

//Tutorial 62/63 create JButton

import javax.swing.JFrame;

public class TutMainClass {
	public static void main (String[] args) { 
		
		Tut62JButton go = new Tut62JButton();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		go.setSize(300,200);
		go.setVisible(true);
		
	}
}

//-------------------------------------------------------------------------------

//Tutorial 64/65 Check Box Program

import javax.swing.JFrame;

public class TutMainClass {
	public static void main (String[] args) { 
		
		Tut64JCheckBox go = new Tut64JCheckBox();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		go.setSize(300,200);
		go.setVisible(true);
		
	}
}

//-------------------------------------------------------------------------------

//Tutorial 66/67 JRadio Button program

import javax.swing.JFrame;

public class TutMainClass {
	public static void main (String[] args) { 
		
		Tut66JRadioButton go = new Tut66JRadioButton();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		go.setSize(300,200);
		go.setVisible(true);
	}
}

}

//-------------------------------------------------------------------------------

//Tutorial 68/69 create drop down list using JComboBox

import javax.swing.JFrame;

public class TutMainClass {
	public static void main (String[] args) { 
		
		Tut68JComboBox go = new Tut68JComboBox();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		go.setSize(300,200);
		go.setVisible(true);
	}

}

*/

//-------------------------------------------------------------------------------

//Tutorial 70/71 create list using JList

import javax.swing.JFrame;

public class TutMainClass {
	public static void main (String[] args) { 
		
		Tut70_JList go = new Tut70_JList();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		go.setSize(300,200);
		go.setVisible(true);
	}
}











