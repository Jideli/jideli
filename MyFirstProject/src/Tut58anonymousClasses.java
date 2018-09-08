/*Anonymous classes are a way to extend the existing classes on the fly.
For example, consider having a class Machine:

	class Machine {
	  public void start() {
	    System.out.println("Starting...");
	  }
	}

When creating the Machine object, we can change the start method on the fly.

	public static void main(String[ ] args) {
	  Machine m = new Machine() {
	    @Override public void start() {
	      System.out.println("Wooooo");
	    }
	  };
	  m.start();
	}
Outputs "Wooooo";

The modification is applicable only to the current object, and not the class itself. So if we create another object of that class, the start method's implementation will be the one defined in the class.
	class Machine {
	  public void start() {
	    System.out.println("Starting...");
	  }
	}  
	public static void main(String[ ] args) {
	  Machine m1 = new Machine() {
	    @Override public void start() {
	      System.out.println("Wooooo");
	    }
	  };
	  Machine m2 = new Machine();
	  m2.start();
	  }
Outputs "Starting..."*/



public class Tut58anonymousClasses {

}
