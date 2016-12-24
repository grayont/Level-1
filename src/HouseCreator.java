import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class HouseCreator {

	Robot bot;
	
	HouseCreator(){
		bot = new Robot();
		bot.penDown();
		bot.setSpeed(10);
		
		
		
	}
	
	void putInLeftCorner(){
		bot.setX(0);
		bot.setY(930);
	}
	
	void drawHouse(int Height, Color color){
		bot.setPenColor(color);
		bot.move(Height);
		bot.turn(90);
		bot.move(40);
		bot.turn(90);
		bot.move(Height);
		bot.turn(-90);
		bot.move(20);
		bot.turn(-90);
		
	}
	

}
