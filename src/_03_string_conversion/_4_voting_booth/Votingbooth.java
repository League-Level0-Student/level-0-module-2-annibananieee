package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Votingbooth {
	public static void main(String[] args) {

		String ageToVote = JOptionPane.showInputDialog("how old are you?");
		int ageAsInt = Integer.parseInt(ageToVote);
		if(ageAsInt >= 18) {
			String input = JOptionPane.showInputDialog("who will you vote for?");
		}
		else {
			JOptionPane.showMessageDialog(null, "no one cares what you think");
			
		}
	}
}
