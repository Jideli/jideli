// handle cases where user e.g. enters wrong input so that program doesn't shut down
// handle using try/catch
/*
An exception can occur for many different reasons. Some examples:
- A user has entered invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications.
- Insufficient memory and other issues related to physical resources.
As you can see, exceptions are caused by user error, programmer error, or physical resource issues. However, a well-written program should handle all possible exceptions.
 */

import java.util.*;


public class Tut82_exceptionHandling {
	  public static void main(String[ ] args) {
		  Scanner input = new Scanner(System.in);
		  
		  // add x = 1 and do while until user enters correct value, then set x to 2 to stop
		  int x = 1;
		  do {
		  
		  // user can't enter 0 for n2 because you can't divide by 0, so add try/catch
		  try {
		  System.out.println("Enter first num: ");
		  int n1 = input.nextInt();
		  System.out.println("Enter second num: ");
		  int n2 = input.nextInt();
		  int sum = n1/n2;
		  System.out.println(sum);
		  x=2;
		  }
		  catch(Exception e) { // broad exception class
			  System.out.println("You can't do that");
			  
		  }
		  }while (x==1);
	  }
}
