import javax.swing.JOptionPane;

public class Hacked {

	
	public static void main(String[] args) {
		
		
		String name = "";
		String q1a = "";
		String q1b = "";
		String q1c = "";

		
		
		
		
		int q1 = JOptionPane.showOptionDialog(null, "Hello how are you", "Option", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Cancel", "Bad", "Good" }, null);
		
		if (q1==2) {
q1a="Thats great to hear!";
		}
		if (q1==1){
q1b="Thats ok";
		}
		if (q1==0){
q1c="Sorry, but I can't let you go yet";
		}
		
		String q2 = JOptionPane.showInputDialog(null, q1a + q1b + q1c + " Whats your name?");

		
			
		name=q2;
		
		q1a="";
		q1b="";
		q1c="";

		
JOptionPane.showOptionDialog(null, "Hi " + name + ", I feel like were going to become great friends", "Message", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Conitue"}, null);



JOptionPane.showInputDialog(null, " Whats your favorit color?");



int error = JOptionPane.showOptionDialog(null, "THERE WAS AN ERROR WHILE RUNNING THIS PROGRAM, PLEASE RESTART", "Error Report", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Restart"}, null);



JOptionPane.showOptionDialog(null, "Restarting Program", "Restarting", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Conitue"}, null);



int q3 = JOptionPane.showOptionDialog(null, "Hello how are you", "help", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Cancel", "Bad", "Good" }, null);

if (q3==2) {
q1a="Thats great to hear!";
}
if (q3==1){
q1b="Thats ok";
}
if (q3==0){
q1c="Sorry, but I can't let you go yet";
}


String q4 = JOptionPane.showInputDialog(null, q1a + q1b + q1c + " Whats your name?", "help me");


int error2 = JOptionPane.showOptionDialog(null, "THERE WAS AN ERROR WHILE RUNNING THIS PROGRAM, PLEASE RESTART", "Error Report", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Restart"}, null);

JOptionPane.showOptionDialog(null, "Restarting Program", "Restarting", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Conitue"}, null);
		
JOptionPane.showOptionDialog(null, "Restarting Failed, Please Try Again", "Restarting Failed", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Restart"}, null);





	}


}
