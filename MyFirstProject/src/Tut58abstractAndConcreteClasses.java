/*In Java, abstraction is achieved using abstract classes and interfaces.
An abstract class is defined using the abstract keyword.
- If a class is declared abstract it cannot be instantiated (you cannot create objects of that type).
- To use an abstract class, you have to inherit it from another class.
- Any class that contains an abstract method should be defined as abstract.
An abstract method is a method that is declared without an implementation (without braces, and followed
by a semicolon): abstract void walk();
Every Animal makes a sound, but each has a different way to do it. That's why we define an abstract class
Animal, and leave the implementation of how they make sounds to the subclasses. 
This is used when there is no meaningful definition for the method in the superclass.*/

abstract public class Tut58abstractAndConcreteClasses {
	
	Tut55polymorphism fo = new Tut55subClass1(); // this is possible because subClass is a concrete class
	
	// create an abstract method without a body. Body will be in the subclasses
	// if method is abstract, class must be abstract too
	public abstract void eat();
	
	
}
