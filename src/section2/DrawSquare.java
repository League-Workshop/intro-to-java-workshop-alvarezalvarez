package section2;

import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {
public static void main(String[] args) {
	Robot c3p0 = new Robot();
	c3p0.penDown();
	c3p0.miniaturize();
	for(int i = 0; i<4; i++) {
		c3p0.move(100);
		c3p0.turn(90);
		c3p0.setRandomPenColor();
}
}
}
