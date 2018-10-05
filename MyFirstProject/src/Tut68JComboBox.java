// create drop down list programm using JComboBox

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Tut68JComboBox extends JFrame {
	
	private JComboBox box;
	private JLabel picture;
	
	// create 2 array
	private static String[] filename = {"customButton1.png","customButton2.png"}; // stores file names
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0]))}; // stores pictures
	// file name index of 0, which is first image customButton1
	
	public Tut68JComboBox() {
		super("The title");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename); 
		
		// add functionality using ItemListener
		box.addItemListener( // usually takes handler, but you can put an anonymous inner class which implements item listener class
				new ItemListener() {
					public void itemStateChanged(ItemEvent event) {
						if(event.getStateChange()==ItemEvent.SELECTED)
						picture.setIcon(pics[box.getSelectedIndex()]);
					}
				}
		);
		
		add(box);
		picture=new JLabel(pics[0]);
		add(picture);
	}
}
