public class Tut10ifStatement {
	public static void main (String args[]) {
		int test = 6;
		
		if (test == 9) {
			System.out.println("yes");
		}else {
			System.out.println("This is else");
		}

		// else if statement
		if (test == 9) {
			System.out.println("yes");
		}else if (test == 8){
			System.out.println("Else if");
		}else {
			System.out.println("This is else");
		}
		
		// nested if statements
		int age = 60;
		if (age < 50) {
			System.out.println("You are young");
		}else {
			System.out.println("You are old");
			if (age > 75) {
				System.out.println("You are really old");
			}else {
				System.out.println("Don't worry you arent really that old");
			}
		}
	
		
// conditional operator
		int old = 21;
		System.out.println(old > 50 ? "You are old" : "You are young");
	}
}
