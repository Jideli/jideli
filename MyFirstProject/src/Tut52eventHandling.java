// anything that user can do: events
// event handler: code that responds to the event
// build a window with text fields, after input, open another popup

import java.awt.FlowLayout;
import java.awt.event.ActionListener; // waits for user to do something
import java.awt.event.ActionEvent; // events
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Tut52eventHandling extends JFrame { // lets us use a window
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	// create constructor for window
	public Tut52eventHandling() {
		super("The title");
		setLayout(new FlowLayout());
		
		// add text fields
		item1 = new JTextField(10); // length is 10
		add(item1);
		
		item2 = new JTextField("Enter text here");
		add(item2);
		
		item3 = new JTextField("uneditable", 20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField ("mypass");
		add(passwordField);
		
		// add some functionality, first build action listener object
		// build an object for a class and then build the class
		
		thehandler handler = new thehandler(); // build an action listener object
		
		// add object to each of the items
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
	
	private class thehandler implements ActionListener{ // this class will handle the events
		// takes one method in this class which will be called when an event occurs
		public void actionPerformed(ActionEvent event) {
			
			String string = "";
			
			if(event.getSource()==item1)
				string=String.format("field 1: %s", event.getActionCommand()); // getActionCommand -> get text from that field
			else if(event.getSource()==item2)
				string=String.format("field 2: %s", event.getActionCommand());
			else if(event.getSource()==item3)
				string=String.format("field 3: %s", event.getActionCommand());
			else if(event.getSource()==passwordField)
				string=String.format("password field is: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
		}
		
	}
}
