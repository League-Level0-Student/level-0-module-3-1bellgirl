package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot Bobby = new Robot();
public static void main(String[] args) {	

}
	
	static void drawSquare() {
	for (int i = 0; i < 4; i++) {
	Bobby.miniaturize();
	Bobby.setSpeed(60);
	Bobby.penDown();
	Bobby.move(20);
	Bobby.turn(360/4);
	
	}
	
	}
	
	static void drawTriangle() {
for (int i = 0; i < 3; i++) {
	

		Bobby.miniaturize();
		Bobby.setSpeed(60);
		Bobby.penDown();
		Bobby.move(20);
		Bobby.turn(360/3);
}
	}
	
	static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			Bobby.miniaturize();
			Bobby.setSpeed(60);
			Bobby.penDown();
			Bobby.move(20);
			Bobby.turn(360/360);
			
		}
	}
	
}
