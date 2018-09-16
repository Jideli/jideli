
// making buttons using JFrame

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Tut62JButton extends JFrame {

	private JButton reg; // regular
	private JButton custom; // button with own image
	
	// build constructor
	public Tut62JButton() {
		super("The title"); // how to call methods from the superclass JFrame
		setLayout(new FlowLayout()); // gives us default layout
		
		reg = new JButton("reg Button");
		add(reg);
		
		// LEFT OFF HERE
		// continue here
		
	}
	
}
