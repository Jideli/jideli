import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Tut66JRadioButton extends JFrame {
	
	private JTextField tf; // field that stores a text
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group; // establish relationship so that only one button can be selected
	
	public Tut66JRadioButton() {
		super("The title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Bucky is...", 25);
		add(tf);
		
		pb = new JRadioButton("plain", true); // true is checked and false is unchecked
		bb = new JRadioButton("bold", false);
		ib = new JRadioButton("italic", false);
		bib = new JRadioButton("bold and italic", false);
		
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup(); // only one can be checked at a time logic is already built in
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		tf.setFont(pf);
		
		// wait for event to happen, pass in font object to constructor
		pb.addItemListener(new HandlerClass(pf)); 
		bb.addItemListener(new HandlerClass(bf)); 
		ib.addItemListener(new HandlerClass(itf)); 
		bib.addItemListener(new HandlerClass(bif)); 
	}
	
	private class HandlerClass implements ItemListener {
		private Font font;
		
		// the font object get variable font
		public HandlerClass(Font f) {
			font = f; 
		}
		// sets the font to the font object that was passed in
		public void itemStateChanged(ItemEvent event) {
			tf.setFont(font);
		}
		
	}
}





