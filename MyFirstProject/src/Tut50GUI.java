// all GUI are built from GUI components like menu, scrollbars...
// java has built in class that stores all components, created using different methods
// this will look the same on all operating systems, next tutorial will show interface e.g. on Windows

// program where you enter number in one box, click OK, then second box and show result
import javax.swing.JOptionPane; // import entire class

public class Tut50GUI {
	public static void main (String args[]) {
		
		String fn = JOptionPane.showInputDialog("Enter first number"); // prompt
		String sn = JOptionPane.showInputDialog("Enter second number"); // prompt
		
		// instead of showing input as string, convert to integer
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		// show sum
		JOptionPane.showMessageDialog(null, "The answer is " +sum, "the title", JOptionPane.PLAIN_MESSAGE);
		// null means show in the middle, then message, then title, icon selection (in this case none)
		
	}
}
