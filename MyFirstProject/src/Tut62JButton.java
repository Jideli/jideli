
// Tutorial 62: making buttons using JFrame
// further down: Tutorial 63 JButton Final Program

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Tut62JButton extends JFrame {

	// create 2 variables to store buttons
	private JButton reg; // regular
	private JButton custom; // button with own image
	
	// build constructor
	public Tut62JButton() {
		super("The title"); // how to call methods from the superclass JFrame, give window a title
		setLayout(new FlowLayout()); // gives us default window layout
		
		reg = new JButton("reg Button"); // create a regular button and add it
		add(reg);
		
		// make sure to save images as PNG
		Icon b = new ImageIcon(getClass().getResource("customButton1.png"));
		Icon x = new ImageIcon(getClass().getResource("customButton2.png")); // rollover image
		custom = new JButton("Custom", b); // second parameter is optional
		custom.setRolloverIcon(x);
		add(custom);
		
		// Tutorial 63 JButton Final Program: build handling event so button can be clicked
		// build object first, then handler class
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler); // first button, takes object as parameter
		custom.addActionListener(handler); // second button
	
	}
	// build another handler outside of constructor (class inside main class)
	
	private class HandlerClass implements ActionListener{ // needs to have same name as above
	// implements: inherit all classes in ActionListener but overwrite all methods
	// only one method in this case: actionPerformed
		
		public void actionPerformed(ActionEvent event) { // whenever reg or custom method above is called, this is executed
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
			
			// continue at 5.25: create main program in TutMainClass
			
		}
	}
	
}
