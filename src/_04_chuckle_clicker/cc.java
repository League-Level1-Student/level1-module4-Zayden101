package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cc implements ActionListener {

	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	
	JButton joke;
	JButton punchline;
	
	public static void main(String[] args) {
		
		new cc().makeButtons();
		
	}
	
	void makeButtons() {

		joke = new JButton();
		punchline = new JButton();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		joke.setText("Joke");
		punchline.setText("Punchline");
		
		panel.add(joke);
		panel.add(punchline);
		frame.add(panel);
		frame.pack();
		
		joke.addActionListener(this);
		punchline.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//JButton buttonPressed = (JButton) e.getSource();
		
		if(e.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "What is red and you can't eat");
		}
		if(e.getSource() == punchline) {
			JOptionPane.showMessageDialog(null, "A brick");
		}
		
	}


}