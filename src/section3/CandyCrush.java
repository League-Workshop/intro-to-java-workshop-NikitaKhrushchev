package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like

		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "bad");
		// 3. Ask the user for the name of their best friend
		String bad = JOptionPane.showInputDialog(null, "still bad");
		JOptionPane.showInternalMessageDialog(null, bad + ". That's bad");
		// 4. Tell them their best friend is as sweet as candy

	} 
}



