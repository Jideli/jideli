// list for GUI, when clicking on one of the options, make something happen

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Tut70_JList extends JFrame{

	private JList list;
	// 2 arrays, one for color name (we can recognize) and one for the actual colors that computer can recognize
	private static String[] colornames = {"black","blue","red","white"};
	private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};

	public Tut70_JList() {
		super("title");
		setLayout(new FlowLayout());
		
		list = new JList(colornames); // array of what we want person to see
		list.setVisibleRowCount(4); // set how many rows/height of list
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // only allow 1 thing at a time
		add(new JScrollPane(list)); // gives us a scroll window if necessary
		
		list.addListSelectionListener( 
			// create anonymous inner class
			new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent event) {
					getContentPane().setBackground(colors[list.getSelectedIndex()]); // content pane is on top of background, strange but: access background through content pane to change the background
					// index 1 is black, 2 is blue, 3 is red, 4 is white
				}
			}
		);
	}
}

