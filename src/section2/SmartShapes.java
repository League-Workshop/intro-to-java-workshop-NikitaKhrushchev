package section2;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
    	int sides = 0;
        // 1. Make a new Robot
    	Robot mark = new Robot();


        // 3. Put the robot's pen down

    	mark.penDown();
        // 6. Make the robot move as fast as possible
    	mark.setSpeed(15);
    	sides = 8;
        // 5. Use a for loop to repeat everything below 4 times. 
    	for (int i = 0; i < sides; i++) {
			mark.move(100/(sides/2));
			mark.turn(360/sides);
		}
    	mark.penUp();
    	mark.move(300);

        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right

    	
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
   
    }
}
