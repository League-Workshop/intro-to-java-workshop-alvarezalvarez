package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell friend");
		// 2. Catch the user's answer in a String
String answer =   JOptionPane.showInputDialog("Answer");
		// 3. If the user spelled the word correctly, speak "correct"
if(answer.equalsIgnoreCase("friend")) {
	speak("correct");
}
		// 4. Otherwise say "wrong"
else {
	speak("wrong");
}
		// 5. repeat the process for other words
		int score = 0;
				
		speak("spell hello");
		
String answerr =   JOptionPane.showInputDialog("Answer");
if(answer.equalsIgnoreCase("hello")) {
	speak("correct");
	score ++;
}
else {
	speak("wrong");
}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


