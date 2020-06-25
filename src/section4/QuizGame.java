package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
int score = 0;
		// 2.  Ask the user a question 
		String answer1 = JOptionPane.showInputDialog("When was Java created?");

		// 3.  Use an if statement to check if their answer is correct
		if(answer1.equals("1995"))	{
			score+=1;
			JOptionPane.showMessageDialog(null, "Your score is " + score + "");
		}
		else	{
			JOptionPane.showMessageDialog(null, "The correct answer is 1995");
			JOptionPane.showMessageDialog(null, "Your score is " + score + "");
		}
		String answer2 = JOptionPane.showInputDialog("What company owns Java?");
		
		if(answer2.equalsIgnoreCase("Oracle"))	{
			score+=1;
			JOptionPane.showMessageDialog(null, "Your score is " + score + "");
		}
		
		
		else	{
			JOptionPane.showMessageDialog(null, "The correct answer is Oracle");
			JOptionPane.showMessageDialog(null, "Your score is " + score + "");
		}
		
		String answer3 = JOptionPane.showInputDialog("What is Java's biggest rival?");
				if(answer3.equalsIgnoreCase("C"))	{
					score+=1;
		JOptionPane.showMessageDialog(null, "Your score is " + score + "");
				}
				else if(answer3.equalsIgnoreCase("C++"))	{
					score+=1;
				JOptionPane.showMessageDialog(null, "Your score is " + score + "");
				}
			
				else	{
					JOptionPane.showMessageDialog(null, "The correct answer is C/C++");
					JOptionPane.showMessageDialog(null, "Your score is " + score + "");
				}
			String answer4 = JOptionPane.showInputDialog("All Java commands must end in a ____");
			if(answer3.equalsIgnoreCase("semicolon"))	{
				score+=1;
				JOptionPane.showMessageDialog(null, "Your score is " + score + "");
			}
			else	{
				JOptionPane.showMessageDialog(null, "The correct answer is a semicolon");
				JOptionPane.showMessageDialog(null, "Your score is " + score + "");
			}
			JOptionPane.showMessageDialog(null, "Your final score is " + score + "");
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
