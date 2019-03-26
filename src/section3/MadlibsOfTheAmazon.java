package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showInternalMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String adj= JOptionPane.showInputDialog(null, "Do you have an adjective for the story?");
		String tol =JOptionPane.showInputDialog(null, "Do you have an type of liquid for the story?");
		String bodypart = JOptionPane.showInputDialog(null, "Do you have an body part for the story?");
		String verb = JOptionPane.showInputDialog(null, "Do you have an verb for the story?");
		String place = JOptionPane.showInputDialog(null, "Do you have an place for the story?");
		
		// Get the user to enter a type of liquid
		// Get the user to enter a body part
		// Get the user to enter a verb
		// Get the user to enter a place
		JOptionPane.showInternalConfirmDialog(null, "Piranhas are more "+ adj +" during the day, so cross the river at night. Piranhas are attracted to fresh " + tol +" and will most likely take a bite out of your " +  bodypart+" if you " +verb+". \n Whatever you do, if you have an open wound, try to find another way to get back to the" +place+ ". Good luck!");
				
		// Fit the user's words into this sentence, and save it in a String:
		// 
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

