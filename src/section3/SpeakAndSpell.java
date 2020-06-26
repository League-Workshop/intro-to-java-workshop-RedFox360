package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
String word1 = JOptionPane.showInputDialog(null, "spell the longest word in English");
		// 2. Catch the user's answer in a String

		// 3. If the user spelled the word correctly, speak "correct"
if(word1.equalsIgnoreCase("pneumonoultramicroscopicsilicovolcanoconiosis"))	{
	JOptionPane.showMessageDialog(null, "Correct!");
}
		// 4. Otherwise say "wrong"
	else	{
		JOptionPane.showMessageDialog(null, "Wrong, the correct answer was pneumonoultramicroscopicsilicovolcanoconiosis");
		// 5. repeat the process for other words
}

	}

	static void speak(String words) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}


