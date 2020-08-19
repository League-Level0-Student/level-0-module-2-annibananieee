package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		String lotteryNums = "";
		for (int i = 0; i < 6; i++) {
			Random randomMaker = new Random();
			int randomNumber = randomMaker.nextInt(6);
			// System.out.println(randomNumber);
			lotteryNums += randomNumber + ", ";
		}

		JOptionPane.showMessageDialog(null, lotteryNums);
	}
}
