package zebra.section1;

import org.jointheleague.graphical.robot.Robot;

public class RobotFreestyle {
	
	public static void main(String[] args) {
		
		// ▼ Write your code BELOW this line ▼
		
		
		// 1. Make a new Robot().  Remember to give it a name!
		Robot Ajax = new Robot("mini");
		Ajax.setSpeed(100);
		Ajax.penDown();
		for (int i = 0; i < 19; i++) {
			
		Ajax.setRandomPenColor();
		// 2. Make your robot move()
		Ajax.move(50);
		// 3. Make your robot turn()  
		Ajax.turn(360/19);
		// 4. Make your robot put its penDown()
		}
		// 5. Make your robot move() some more.  What do you see?
		
		// 6. Can you make your robot draw a square?  A triangle?  Something cool?
		
		
		
		
		
		
		
		
		
		// Bonus: Can you make your robot sparkle? miniaturize? draw with a different color?
		
		
		// ▲ Write your code ABOVE this line ▲
		
	}
	
}
