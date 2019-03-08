package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot mark = new Robot();
		// 5. Set your robot's pen down 
		mark.setRandomPenColor();
		mark.penDown();
		// 3. Set the robot to go at max speed (100)
		mark.setSpeed(100);;
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 75; i++) {
			mark.setRandomPenColor();
			mark.move(i*5);
			mark.turn(360/7);
			mark.setPenWidth(i);
		}
			// 7. Change the pen color to random
		
			// 6. Move the robot 5 times the loop counter (5*i)
			
			// 2. Turn the robot 360/7 degrees to the right
		
			// 8. Set the pen width to i
			
	}
}
