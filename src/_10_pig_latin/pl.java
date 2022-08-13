package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pl implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton translate = new JButton("Translate");
	JTextField before = new JTextField(15);
	JTextField after = new JTextField(15);
	
	void run() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		panel.add(before);
		panel.add(translate);
		panel.add(after);
		frame.pack();
		
		translate.addActionListener(this);
	}


private static boolean isLetter(char c) {
return ( (c >= 'A' && c <= 'Z') || (c >='a' && c <= 'z') );
}
    

private static String pigWord(String word) {
int split = firstVowel(word);
return word.substring(split)+"-"+word.substring(0, split)+"ay";
}
	

public String translate(String s) {
String latin = "";
int i = 0;
while (i < s.length()) {
while (i < s.length() && !isLetter(s.charAt(i))) {
latin = latin + s.charAt(i);
i++;
}
if (i>=s.length()) break;
int begin = i;
while (i < s.length() && isLetter(s.charAt(i))) {
i++;
}
int end = i;
latin = latin + pigWord(s.substring(begin, end));
}
return latin;
}

	  private static int firstVowel(String word) {
word = word.toLowerCase();
for (int i=0; i < word.length(); i++)
if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
word.charAt(i)=='i' || word.charAt(i)=='o' ||
word.charAt(i)=='u')
return i;
return 0;
}

@Override
public void actionPerformed(ActionEvent arg0) {

	after.setText(translate(before.getText()));
	
}
}