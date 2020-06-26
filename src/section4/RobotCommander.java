package section4;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotCommander {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot commando = new Robot("mini");
		// 2. Ask the user what shape to draw. Give them 3 choices (eg. triange, square,
		// pentagon)

		// 3. Make the robot draw that shape based on the user's input
		String color = JOptionPane.showInputDialog("What color would you like your shape to be: red, blue, or random?");
		commando.penDown();
		commando.setSpeed(35);
		if (color.equalsIgnoreCase("random")) {
			commando.setRandomPenColor();
		}
		if (color.equalsIgnoreCase("red")) {
			commando.setPenColor(Color.red);
		}
		if (color.equalsIgnoreCase("blue")) {
			commando.setPenColor(Color.blue);
		}
		String shape = JOptionPane
				.showInputDialog("Would you like to draw a triangle, square, pentagon, heptagon, or decagon?");
		if (shape.equalsIgnoreCase("triangle")) {
			for (int i = 0; i < 3; i++) {
				commando.move(200);
				commando.turn(360 / 3);
			}
		}
		if (shape.equalsIgnoreCase("square")) {
			for (int i = 0; i < 4; i++) {
				commando.move(200);
				commando.turn(360 / 4);
			}
		}
		if (shape.equalsIgnoreCase("pentagon")) {
			for (int i = 0; i < 5; i++) {
				commando.move(200);
				commando.turn(360 / 5);
			}
		}
		if (shape.equalsIgnoreCase("heptagon")) {
			for (int i = 0; i < 7; i++) {
				commando.move(100);
				commando.turn(360 / 7);
			}
		}
		if (shape.equalsIgnoreCase("decagon")) {
			for (int i = 0; i < 10; i++) {
				commando.move(75);
				commando.turn(36);
			}
		}
		// 4. Go back to before step #3 and ask the user what color to make the shape.
		// Give them 3 choices (eg. blue, red, green)

		// 5. Add code to set the Robot's pen color the chosen color
	}
}
