package section4;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotCommander {
	public static void main(String[] args) {
		//1. Create a new Robot
Robot commando = new Robot("mini");
		//2. Ask the user what shape to draw. Give them 3 choices (eg. triange, square, pentagon)
String shape = JOptionPane.showInputDialog("Would you like to draw a triangle, square, or pentagon?");
		//3. Make the robot draw that shape based on the user's input
commando.penDown();		
	if(shape.equalsIgnoreCase("triangle"))	{
			for (int i = 0; i < 3; i++) {
			commando.move(500);
			commando.turn(360/3);
			}
}
	if(shape.equalsIgnoreCase("square"))
			for (int i = 0; i < 4; i++) {
				commando.move(500);
				commando.turn(360/4);
				}
}
	if(shape.equalsIgnoreCase("pentagon"))
			for (int i = 0; i < 5; i++) {
			commando.move(500);
			commando.turn(360/5);
			}
}
		//4. Go back to before step #3 and ask the user what color to make the shape. 
		//   Give them 3 choices (eg. blue, red, green)
		
		//5. Add code to set the Robot's pen color the chosen color
	}
}
