package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare{
	
	// 2. Create a new Robot
	Robot Ajax3 = new Robot();
	void go() {
		
		
		// 4. Make the robot move as fast as possible
		Ajax3.setSpeed(100);
		// 5. Set the pen width to 5
Ajax3.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for (int i = 0; i < 200; i++)	{
			// 7. Set the pen color to random
	Ajax3.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
	Ajax3.turn(200/7);
}
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		Ajax3.penDown();
		
		for (int i = 0; i < 4; i++) {
			
			Ajax3.move(200);
			Ajax3.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



