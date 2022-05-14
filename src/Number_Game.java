import java.util.Random;

import javax.swing.JOptionPane;

public class Number_Game {
	public static void main(String[] args) {

		int a = 25;

		int r = new Random().nextInt(50);

		int c = 0;

		int m = 25;

		JOptionPane.showMessageDialog(null,
				"Welcom to the number game! You have 50 turns to either go up, or go down. You have to try and guess a number bewteen 0-50");

		JOptionPane.showMessageDialog(null, "Yes = +1           No = -1           Cancel = Submit Awnser");

		for (int i = 0; i < 25; i++) {

			int b = JOptionPane.showConfirmDialog(null, a + "                 Moves left: " + m);

			if (b == 0) {
				a += 1;
				m -= 1;
			}

			else if (b == 1) {
				a -= 1;
				m -= 1;
			}

			else if (b == 2) {
				JOptionPane.showMessageDialog(null, "The number you chose was " + a + ". The number was " + r);

				if (r == a) {
					JOptionPane.showMessageDialog(null, "Congratulations! You Win!");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "You were close! Try again?");
					break;
				}

			}

		}

	}
}
