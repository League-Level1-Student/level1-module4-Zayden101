package _08_calculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class cal implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel result = new JPanel();
	JPanel imput = new JPanel();
	JLabel label = new JLabel();
	
	JTextField var1 = new JTextField(10);
	JTextField var2 = new JTextField(10);
	JButton add = new JButton("+");
	JButton subtract = new JButton("-");
	JButton multiply = new JButton("x");
	JButton divide = new JButton("/");

	int results;
	int varA;
	int varB;
	
	public void run() {
	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout layout = new GridLayout(3, 1);
		
		frame.setLayout(layout);

		
		panel.add(subtract);
		panel.add(add);
		panel.add(multiply);
		panel.add(divide);
		
		result.add(label);
		
		imput.add(var1);
		imput.add(var2);
		
		frame.add(imput);
		frame.add(panel);
		frame.add(result);
		frame.pack();
		
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		varA = Integer.parseInt(var1.getText());
		varB = Integer.parseInt(var2.getText());
		
		if(arg0.getSource() == add) {
			results = varA + varB;
		
		}else if(arg0.getSource() == subtract) {
			results = varA - varB;
		}else if(arg0.getSource() == multiply) {
			results = varA * varB;
		}else if(arg0.getSource() == divide) {
			results = varA / varB;
		}
		
		label.setText("" + results);

		
	}
}