//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _02_methods._1_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	public static void main(String[] args) {
			
		/* 1. Ask the user which animal they want, then play the sound of that animal. */			 
		String animal = JOptionPane.showInputDialog("what is your favorite animal");
		if (animal.equals("cow")) {
			playMoo();
		}
					String animal = JOptionPane.showInputDialog("what is your favorite animal");
					if (animal.equals("duck")) {
						playQuack();
					}
					String animal = JOptionPane.showInputDialog("what is your favorite animal");
					if (animal.equals("dog")) {
						playWoof();
					}
					String animal = JOptionPane.showInputDialog("what is your favorite animal");
						if (animal.equals("cat")) {
							playMeow();
						}

						String animal = JOptionPane.showInputDialog("what is your favorite animal");
							if (animal.equal)
		/* 2. Make it so that the user can keep entering new animals. */

	}

	static void playMoo() {
		JOptionPane.showMessageDialog(null, "Moo");
		//playNoise(mooFile);
	}

	static void playQuack() {
		JOptionPane.showMessageDialog(null, "Quack");
		//playNoise(quackFile);
	}

	static void playWoof() {
		JOptionPane.showMessageDialog(null, "Woof");
		//playNoise(woofFile);
	}
	
	static void playMeow() {
		JOptionPane.showMessageDialog(null, "Meow");
		//playNoise(meowFile);
	}
	
	static void playLlama() {
		JOptionPane.showMessageDialog(null, "Llama");
		//playNoise(llamaFile);
	}

	static String quackFile = "quack.wav";
	static String mooFile = "moo.wav";
	static String woofFile = "woof.wav";
	static String meowFile = "meow.wav";
	static String llamaFile = "llama.wav";

	/* Ignore this stuff */
	
	public static void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(AnimalFarm.class.getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}