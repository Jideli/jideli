// Tutorial 64: build constructor, variables, add textfield and checkboxes, add listener functionality
// Tutorial 65: new class to handle events when the checkboxes are checked

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Tut64JCheckBox extends JFrame {
	// build 3 variables
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	
	// build constructor
	public Tut64JCheckBox() {
		super("The title");
		setLayout(new FlowLayout());
		
		// add textfield
		tf = new JTextField("This is a sentence", 20); // size of 20
		// do stuff to text fied now
		tf.setFont(new Font("Serif", Font.PLAIN, 14)); // Serif always works on all platforms
		add(tf);
		
		// make 2 checkboxes
		boldbox = new JCheckBox("bold");
		italicbox = new JCheckBox("italic");
		add(boldbox);
		add(italicbox);
		
		// add functionality
		HandlerClass handler = new HandlerClass();
		// item listener
		boldbox.addItemListener(handler); // takes object as its parameter
		italicbox.addItemListener(handler); // waits for something to happen (be clicked)
	}
	
	private class HandlerClass implements ItemListener{ // makes this inner class so it can access all variables (boldbox, etc) and methods of outer class
		// use all methods from ItemListener, but all of the methods must be overwritten
		// only one method:
		public void itemStateChanged(ItemEvent event) {
			// when checkbox is clicked, event occurs. now add functionality for event:
			Font font = null; // store font which will change
			
			if(boldbox.isSelected() && italicbox.isSelected())
				font = new Font("Serif",Font.BOLD + Font.ITALIC, 14);
			else if (boldbox.isSelected())
				font = new Font("Serif",Font.BOLD, 14);
			else if (italicbox.isSelected())
				font = new Font("Serif", Font.ITALIC, 14);
			else 
				font = new Font("Serif", Font.PLAIN, 14);
			tf.setFont(font); // set font
		}
	}
}
