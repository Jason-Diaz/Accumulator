package testinggui;

import java.awt.*;
import java.awt.event.*;

public class Guiesomg extends Frame implements ActionListener {
	 private Label lblInput;     // Declare input Label   
	 private Label lblOutput;    // Declare output Label   
	 private TextField tfInput;  // Declare input TextField   
	 private TextField tfOutput; // Declare output TextField   
	 private int sum = 0; 
	 
	 public Guiesomg() {     
		 setLayout(new FlowLayout());
		 
		 lblInput = new Label("Enter an Integer: "); // Construct Label     
		 add(lblInput);
		 
		 tfInput = new TextField(10);
		 add(tfInput);
		 
		 tfInput.addActionListener(this);
		 
	     lblOutput = new Label("The Accumulated Sum is: ");  // allocate Label
	     add(lblOutput); 
	     
	     tfOutput = tfInput;
	     
	     tfOutput = new TextField(10); // allocate TextField
	     tfOutput.setEditable(false);  // read-only 
	     add(tfOutput);
		 
	     setTitle("AWT Accumulator");  // "super" Frame sets title
	     setSize(350, 120);  // "super" Frame sets initial window size
	     setVisible(true); 
	     
	 }
	 
	  public static void main(String[] args) {      // Invoke the constructor to setup the GUI, by allocating an anonymous instance
	  new Guiesomg();
	  }
	   public void actionPerformed(ActionEvent evt) {      // Get the String entered into the TextField tfInput, convert to int
		   int numberIn = Integer.parseInt(tfInput.getText());     
		   sum += numberIn;      // Accumulate numbers entered into sum 
		   tfInput.setText("");  // Clear input TextField
		   tfOutput.setText(sum + ""); // Display sum on the output TextField       
	   }
}
