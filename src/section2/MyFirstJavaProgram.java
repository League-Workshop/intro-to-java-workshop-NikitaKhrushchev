package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot mark = new Robot();
		mark.moveTo(200, 200);
		mark.setSpeed(100);
		mark.penDown();
		for (int i = 0; i < 360; i++) {
		mark.turn(1);
		mark.move(1);
		}
		
	}
}
