
import java.awt.FlowLayout; // import how things are placed, default layout managing
import javax.swing.JFrame; // gives you all Windows features
import javax.swing.JLabel; // text and simple images

public class Tut51GUIwithJFrame extends JFrame { // use inheritance to inherit from class JFrame
	
	private JLabel item1; // build a variable, our item
	
	public Tut51GUIwithJFrame() { // create constructor
		super("The title bar"); // add a title
		setLayout(new FlowLayout()); // gives us default layout
		
		// build actual item:
		item1 = new JLabel("This is a sentence");
		
		// add functionality: scrollbox (tooltip text)
		item1.setToolTipText("This is gonna show up on hover");
		
		// add the item to the window
		add(item1);
		
		
	}
	
}
