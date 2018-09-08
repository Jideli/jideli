/*For classes, there are two types of casting.

Upcasting
You can cast an instance of a subclass to its superclass.
Consider the following example, assuming that Cat is a subclass of Animal.
Animal a = new Cat();

Java automatically upcasted the Cat type variable to the Animal type.

Downcasting
Casting an object of a superclass to its subclass is called downcasting.
Example:
Animal a = new Animal();
((Cat)a).makeSound();

This will try to cast the variable a to the Cat type and call its makeSound() method*/


public class Basics5_TypeCasting {

}
