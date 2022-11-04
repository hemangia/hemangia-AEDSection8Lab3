import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DataFileGui extends JFrame implements ActionListener {
	JFrame frame;
	JLabel label1, label2, label3;
	JTextField tf1, tf2, tf3;
	JTextArea area1, area2;
	JButton button, button2, buttonRead, buttonWrite;

	DataFileGui() {

		frame = new JFrame("Data Files and GUI");

		button = new JButton("Click to choose File to Read");
		button.setBounds(50, 50, 200, 20);
		button.addActionListener(this);

		button2 = new JButton("Click to choose File to Write");
		button2.setBounds(800, 50, 200, 20);
		button2.addActionListener(this);

		label1 = new JLabel("Selected file to read is : ");
		label1.setBounds(50, 80, 200, 20);
		label1.setForeground(Color.BLUE);

		tf1 = new JTextField();
		tf1.setBounds(200, 80, 200, 20);
		tf1.setEditable(false);

		label2 = new JLabel("Enter New File Name or Select existing file from above:");
		label2.setBounds(800, 80, 400, 20);
		label2.setForeground(Color.BLUE);

		tf2 = new JTextField();
		tf2.setBounds(1200, 80, 200, 20);

		label3 = new JLabel("Please enter the input ");
		label3.setBounds(800, 120, 200, 20);
		label3.setForeground(Color.BLUE);

		tf3 = new JTextField();
		tf3.setBounds(1200, 120, 200, 20);

		buttonRead = new JButton("READ");
		buttonRead.setBounds(50, 150, 200, 20);
		buttonRead.addActionListener(this);

		buttonWrite = new JButton("WRITE");
		buttonWrite.setBounds(800, 150, 200, 20);
		buttonWrite.addActionListener(this);

		area1 = new JTextArea("First 5 lines are");
		area1.setBounds(50, 180, 700, 200);

		area2 = new JTextArea("First 5 lines are");
		area2.setBounds(800, 180, 200, 200);

		frame.add(button);
		frame.add(button2);
		frame.add(label1);
		frame.add(tf1);
		frame.add(label2);
		frame.add(tf2);
		frame.add(label3);
		frame.add(tf3);

		frame.add(buttonRead);
		frame.add(buttonWrite);
		frame.add(area1);
		frame.add(area2);

		// panel.setLayout(new FlowLayout());

		frame.setBounds(0, 0, 1500, 700);
		frame.setLayout(null);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

	}

	public void actionPerformed(ActionEvent e) {
		try {
			FileReadandWrite frw = new FileReadandWrite();
			
			// This is the method call for choosing a file for Read operations
			if (e.getSource() == button) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				int option = fileChooser.showOpenDialog(frame);
				if (option == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					tf1.setText(file.getPath());
				}
			}
			// This is the method call for choosing a file for Write operations
			if (e.getSource() == button2) {
				JFileChooser fileChooser2 = new JFileChooser();
				fileChooser2.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				int option2 = fileChooser2.showOpenDialog(frame);
				if (option2 == JFileChooser.APPROVE_OPTION) {
					File file2 = fileChooser2.getSelectedFile();
					tf2.setText(file2.getPath());
				}

			}
			// This is the method call for reading from file
			if (e.getSource() == buttonRead) {
				List<String> op1 = frw.readFirst(tf1.getText());
				area1.append("\n");

				for (Object o : op1) {
					area1.append(o + "\n");
				}

			}
			// This is the method call for writing into file
			if (e.getSource() == buttonWrite) {

				frw.writeFile(tf2.getText(), tf3.getText());

				List<String> op3 = frw.readFirst(tf2.getText());
				area2.append("\n");

				for (Object o : op3) {
					area2.append(o + "\n");
				}

			}
		} catch (IOException ex) {
			System.out.println("An error occurred.");
			ex.printStackTrace();

		}

	}
}
