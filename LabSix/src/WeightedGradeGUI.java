/*
 * This is the class which adds all the GUI components 
 */
import javax.swing.*;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.*;

public class WeightedGradeGUI extends Canvas implements ActionListener {
	JTextField tf1, tf2, tf3, tf4;
	JButton b1;
	JLabel l1, l2, l3, l4;

	WeightedGradeGUI() {
		JFrame f = new JFrame();
		//Below are the three inputs which accepts the values from USer.

		l1 = new JLabel("Total Assignment Points");
		l1.setBounds(50, 50, 200, 20);
		l1.setForeground(Color.BLUE);

		tf1 = new JTextField();
		tf1.setBounds(50, 80, 200, 20);

		l2 = new JLabel("Earned Points");
		l2.setBounds(300, 50, 200, 20);
		l2.setForeground(Color.BLUE);

		tf2 = new JTextField();

		tf2.setBounds(300, 80, 200, 20);

		l3 = new JLabel("Percentage of class");
		l3.setBounds(50, 120, 200, 20);
		l3.setForeground(Color.BLUE);

		tf3 = new JTextField();
		tf3.setBounds(50, 150, 200, 20);

		b1 = new JButton("Click to Calculate Score");

		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.BLUE);
		b1.setBounds(200, 200, 200, 20);
		b1.addActionListener(this);

		l4 = new JLabel("Weighted Score");
		l4.setBounds(200, 230, 200, 20);

		l4.setForeground(Color.BLUE);

		tf4 = new JTextField();
		tf4.setBounds(200, 260, 200, 20);
		tf4.setForeground(Color.BLUE);
		// This textbox is used to display the result of Weighted Grade
		tf4.setEditable(false);

		f.add(l1);
		f.add(tf1);
		f.add(l2);
		f.add(tf2);
		f.add(l3);
		f.add(tf3);

		f.add(b1);

		f.add(l4);
		f.add(tf4);

		f.setBounds(100, 100, 730, 489);
		f.setLayout(null);
		f.setVisible(true);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);

	}
//This method will be called whenever button is clicked
	public void actionPerformed(ActionEvent e) {
		try {
			String s1 = tf1.getText();
			String s2 = tf2.getText();
			String s3 = tf3.getText();

			double a = Double.parseDouble(s1);
			double b = Double.parseDouble(s2);
			double c = Double.parseDouble(s3);
			

			GradeCalculate gc = new GradeCalculate();

			//This method accept the values entered by user and returned the output by the method and set into the result textbox
			double d = 0;
			d = gc.calculateTotalgrade(a, b, c);

			String result = String.valueOf(d);
			tf4.setText(result);
		} catch (NumberFormatException ex) {
			System.out.println("Exception : Please enter valid Numeric Inputs");
			tf4.setText("Invalid Input");
			throw ex;
		}
	}
}
